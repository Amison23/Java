package SmartGas;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.annotation.Resource;
import javax.sql.DataSource;

@ManagedBean
@RequestScoped
public class userRegistrationBean {
    DBConnect db = new DBConnect();
    Connection myconn = db.myConnect();
    HasherSha1 myencrypt = new HasherSha1();
    
    private String username;
    private String name;
    private String email;
    private String password;

    @Resource(name = "jdbc/YourDataSourceName")
    private DataSource dataSource;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String register() throws SQLException {
        Statement s = null;
        if (myconn != null) {
            System.out.println(myconn);
            s = myconn.createStatement();
            String sql = "INSERT INTO `users`(`username`, `fullname`, `email`, `password`, `role_id`)" + 
                         "VALUES ('"+getUsername()+"','"+getName()+"','"+getEmail()+"','"+getPassword()+"','"+3+"')";            
            s.execute(sql);
        }
        else{
            return "Signup";
        }
        return "Login";
    }
}
