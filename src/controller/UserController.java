package controller;

import dao.UserDAO;
import model.User;

public class UserController {
    public static boolean createUser(String email, String password, String repeatPassword) {
            if((email == null || email.trim().isEmpty()) || (password == null || password.trim().isEmpty()) 
            || (repeatPassword == null || repeatPassword.trim().isEmpty())) {
                            System.out.println("Dados de entrada inválidos!");
                            return false;
            } else {
                    if(repeatPassword.equals(password)) {
                            User user = new User();

                            user.setEmail(email);
                            user.setPassword(repeatPassword);

                            UserDAO connection = new UserDAO();

                            if(connection.findByEmail(email)) {
                                    System.out.println("O usuário já está cadastrado!");
                                    return false;
                            } else {
                                    connection.insertUser(user);

                                    System.out.println("Usuário criado com sucesso!");
                                    return true;
                            }		
                    } else {
                            System.out.println("As senhas não batem!");
                            return false;
                    }
            }		
    }

    public static User signIn(String email, String password) {
        if((email == null || email.trim().isEmpty()) || (password == null || password.trim().isEmpty())) {
            return null;
        } else {
            UserDAO connection = new UserDAO();

            if(connection.authUser(email, password)) {
                User user = new User();
                user.setEmail(email);
                user.setPassword(password);

                return user;
            } else {
                System.out.println("Credenciais inválidas!");
                return null;
            } 
        }
    }    

    public static void changeUserPassword(String email, String currentPassword, String newPassword, String repeatNewPassword) {
        if((currentPassword == null || currentPassword.trim().isEmpty())
          || (newPassword == null || newPassword.trim().isEmpty())
          || (repeatNewPassword == null || repeatNewPassword.trim().isEmpty())) {
            System.out.println("Prencha todos campos!");
        } else {
            UserDAO connection = new UserDAO();
            
            System.out.println(email);
            
            if(connection.authUser(email, currentPassword)) {
                if(repeatNewPassword.equals(newPassword)) {
                    connection.updateUserPassword(email, newPassword);
                } else {
                    System.out.println("As senhas não coincidem!");
                }
            } else {
                System.out.println("Senha errada!");
            }   
        }
    }
}
