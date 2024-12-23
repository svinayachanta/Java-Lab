import java.sql.*;

class JDBC_ODBC
{
    public static void main(String args[]) throws Exception
    {
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
        Statement stm = con.createStatement();
        
        stm.executeUpdate("create table Temp(a interger, b float)"); // CREATE DDL

        stm.executeUpdate("drop table Temp"); // DROP DDL

        stm.executeUpdate("insert into dept values(60, 'vinay')"); // INSERT - DML
        
        stm.executeUpdate("delete from dept where deptno > 60)"); // DELETE - DML
        
        ResultSet rs = stm.executeQuery("select * from dept"); // SELECT
        int dno;
        String dname;
        while(rs.next())
        {
            dno = rs.getInt("deptno");
            dname = rs.getString("dename");
            System.out.println(dno + dname);
        }
        
        stm.close();
        con.close();
    }
}