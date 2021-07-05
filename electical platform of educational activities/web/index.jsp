<!DOCTYPE html>
<html lang="en">
<head>
<title>home page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="epeaCSS.css">
</head>
<body >

 <div class="header"><%@include file="header.jsp"%><marquee width="700px" direction="left"  behavior="sliding" >
         <h3 style="color:red;"> List of Scholarships      &nbsp;&nbsp;&nbsp;
          INDIAN Idol junior Auditions   &nbsp;&nbsp;&nbsp;    
          DID super Moms &nbsp;&nbsp;&nbsp;
          CBSE Neet(AIPMT) 2019
         </h3> 
        </marquee>   


</div>

<section >
   
  <nav> <%@include file="navbar.jsp"%>
  </nav>
  
    <article class="bg-img2"> <img src="5.png" style="width:300px" height="100px" >
        <div class="slideshow-container">

<div class="mySlides fade">
  <div class="numbertext">1 / 3</div>
 <a href="Scholarship.jsp">
   <img src="scholarship_image.png" style="width:500px" height="250px">
 </a>
  <div class="text">Caption Text</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">2 / 3</div>
  <a href="auditions.jsp">
  <img src="audition_image.png" style="width:500px"height="250px"></a>
  <div class="text">Caption Two</div>
</div>

<div class="mySlides fade">
  <div class="numbertext">3 / 3</div>
  <a href="news.jsp">
      <img src="news_image.png" style="width:500px" height="250px"></a>
  <div class="text">Caption Three</div>
</div>

</div>
<br>

<div style="text-align:center">
  <span class="dot"></span> 
  <span class="dot"></span> 
  <span class="dot"></span> 
</div>

<script>
var slideIndex = 0;
showSlides();

function showSlides() {
  var i;
  var slides = document.getElementsByClassName("mySlides");
  var dots = document.getElementsByClassName("dot");
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";  
  }
  slideIndex++;
  if (slideIndex > slides.length) {slideIndex = 1;}    
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex-1].style.display = "block";  
  dots[slideIndex-1].className += " active";
  setTimeout(showSlides, 2000); // Change image every 2 seconds
}
</script>

     
        
    </article>
     </section>
  
<div class="footer">
<%@include file="footer.jsp"%>
</div>
</body>
</html>
