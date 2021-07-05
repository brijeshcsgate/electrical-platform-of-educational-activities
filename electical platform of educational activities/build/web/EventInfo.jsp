
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Event information</title><link rel="stylesheet" href="epeaCSS.css">

    </head>
    <body>
<div class="header"><%@include file="header_admin.jsp"%>
</div>

<section >
   
   

  <nav> <%@include file="navbar_admin.jsp"%>
  </nav>
  
    <article class="bg-img">       
        <%@include file="navbar_admin.jsp"%></nav><article>
            <fieldset><legend>Events Entry form</legend><br/><br/>
         <form action="#" method="post">
          Event Title<input type="text" name="E_title" value="" size="130" /><br/><br/>
       
           Event type<input type="text" name="E_type" value="" size="130" /><br/><br/>
           Event date <input type="text" name="E_date" value="" size="130"/><br/><br/>
            
           Event Eligibility <input type="text" name="E_eligibility" value="" size="130"/><br/><br/>
           Event Detail <input type="text" name="E_detail" value="" size="130"/><br/><br/>
          
            
            <input type="submit" name="submit" value="Submit" />
            <input type="reset" name="reset" value="Reset" />
        </form></article>>
     </section>

<div class="footer">
<%@include file="footer.jsp"%>
</div>

    </body>
</html>
