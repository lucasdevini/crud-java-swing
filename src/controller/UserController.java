package controller;

import javax.swing.JOptionPane;

import dao.UserDAO;
import model.User;

public class UserController {
    public static boolean createUser(String email, String password, String repeatPassword) {
            if((email == null || email.trim().isEmpty()) || (password == null || password.trim().isEmpty()) 
            || (repeatPassword == null || repeatPassword.trim().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                return false;
            } else {
                if(repeatPassword.equals(password)) {
                    User user = new User();

                    user.setEmail(email);
                    user.setPassword(repeatPassword);

                    UserDAO connection = new UserDAO();

                    if(connection.findByEmail(email)) {
                        JOptionPane.showMessageDialog(null, "O usuário já existe!");
                        return false;
                    } else {
                        connection.insertUser(user);

                        JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
                        return true;
                    }		
                } else {
                    JOptionPane.showMessageDialog(null, "As senhas não correspondem!");
                    return false;
                }
            }		
    }

    public static User signIn(String email, String password) {
        if((email == null || email.trim().isEmpty()) || (password == null || password.trim().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            return null;
        } else {
            UserDAO connection = new UserDAO();

            if(connection.authUser(email, password)) {
                User user = new User();
                user.setEmail(email);
                user.setPassword(password);

                return user;
            } else {
                JOptionPane.showMessageDialog(null, "Credenciais inválidas!");
                return null;
            } 
        }
    }    

    public static void changeUserPassword(String email, String currentPassword, String newPassword, String repeatNewPassword) {
        if((currentPassword == null || currentPassword.trim().isEmpty())
          || (newPassword == null || newPassword.trim().isEmpty())
          || (repeatNewPassword == null || repeatNewPassword.trim().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Prencha todos campos!");
        } else {
            UserDAO connection = new UserDAO();
                        
            if(connection.authUser(email, currentPassword)) {
                if(repeatNewPassword.equals(newPassword)) {
                    connection.updateUserPassword(email, newPassword);
                    JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "As senhas não correspondem!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Senha atual errada!");
            }   
        }
    }

    public static boolean deleteAccount(String email, String password) {
        if(password == null || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo senha!");
            return false;
        } else {
            UserDAO connection = new UserDAO();
                
            if(connection.authUser(email, password)) {
                JOptionPane.showMessageDialog(null, "Conta excluída!");
                return connection.deleteUser(email);
            } else {
                JOptionPane.showMessageDialog(null, "Senha errada!");
                return false;
            } 
        } 
    }    
}
