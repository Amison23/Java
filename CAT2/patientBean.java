import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class patientBean {
    private String firstName;
    private String lastName;

    public void fetchDetails(int id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet result = null;

        try {
            conn = ConnectionManager.getConnection();
            String sql = "SELECT * FROM treatment WHERE id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            result = pstmt.executeQuery();

            if (result.next()) {
                firstName = result.getString("first_name");
                lastName = result.getString("last_name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (result != null)
                    result.close();
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void saveDetails() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = ConnectionManager.getConnection();
            String sql = "INSERT INTO treatment (first_name, last_name) VALUES (?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.executeUpdate();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        } 
        finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
