%@page import="java.util.ArrayList"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html> 
<html> 
  <head> 
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-9"> 
   <title>Elev listor</title> 
  </head> 
  <body> 
      <h1>Visa studentlistan</h1> 
      <table border ="1" width="450" align="center"> 
         <tr bgcolor="D35C42"> 
          <th><b>Elev namn</b></th> 
          <th><b>Elev ålder</b></th>  
         </tr> 
     
            <tr> 
                <td><%=s.getnamn()%></td> 
                <td><%=s.getålder()%></td>           
            </tr> 
        
        </table>  
        <hr/> 
    </body> 
</html> 