import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {
    public static void Delete(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("drop table ");
        App ap = new App();
        try {
            System.out.print("Which Table did u want to delete??  " );
            String a = sc.nextLine();
            sb.append("'").append(a).append("'");
            Connection con = DriverManager.getConnection(ap.URL,ap.USER,ap.PASS);
            PreparedStatement pst = con.prepareStatement(sb.toString());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
