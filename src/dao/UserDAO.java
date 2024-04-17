package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;

public class UserDAO {
	private Connection connection;
	private final String URLDB = "jdbc:mysql://localhost:3306/java_crud";
	private final String dbUser = "root";
	private final String dbPassword = "";
	
	public UserDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URLDB, dbUser, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean insertUser(User user) {
		try {
			PreparedStatement psInsert = connection.prepareStatement("INSERT INTO users (email, password) VALUES (?, ?)");
			psInsert.setString(1, user.getEmail());
			psInsert.setString(2, user.getPassword());
			return psInsert.execute();
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean findByEmail(String email) {
		try {
                    PreparedStatement psFind = connection.prepareStatement("SELECT * FROM users WHERE email = ?");
                    psFind.setString(1, email);
                    ResultSet result = psFind.executeQuery();

                    return result.next();
		} catch(Exception e) {
                    e.printStackTrace();
                    return false;
		}
	}

        public boolean authUser(String email, String password) {
            try {
                PreparedStatement psAuth = connection.prepareStatement("SELECT * FROM users WHERE email = ? AND password = ?");
                psAuth.setString(1, email);
                psAuth.setString(2, password);
                ResultSet result = psAuth.executeQuery();

                return result.next();
            } catch(Exception e) {
                e.printStackTrace();
                return false;
            }
        }

        public void updateUserPassword(String email, String newPassword) {
            try {
                PreparedStatement psUpdate = connection.prepareStatement("UPDATE users SET password = ? WHERE email = ?");
                psUpdate.setString(1, newPassword);
                psUpdate.setString(2, email);
                psUpdate.executeUpdate();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        
        public void deleteUser(String email) {
            try {
                PreparedStatement psDelete = connection.prepareStatement("DELETE FROM users WHERE email = ?");
                psDelete.setString(1, email);
                psDelete.executeUpdate();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }    
}
