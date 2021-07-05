<!DOCTYPE html>
<html lang="en">
<head>
<title>administration</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="epeaCSS.css">
</head>
<body >

 <div class="header"><%@include file="header_admin.jsp"%>
</div>

<section >
   
   

  <nav> <%@include file="navbar_admin.jsp"%>
  </nav>
  
    <article class="bg-img">
        <img src="8.jpg" style="width:900px" height="500px">
         <a href="userEntry.jsp">
                <button class="btn1 user" >New user</button>
                </a>
                <a href="event_entry.jsp">
                <button class="btn1 event">New Event</button>
                </a>
    </article>
     </section>

<div class="footer">
<%@include file="footer.jsp"%>
</div>

</body>
</html>
