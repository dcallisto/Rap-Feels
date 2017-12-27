<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rap Feels</title>
<link rel="stylesheet" href="style.css">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="fuzzy-autocomplete.js"></script>
	<% 	String artist = (String)session.getAttribute("artistPass");
		String lyric = (String)session.getAttribute("lyricPass");
		String song = (String)session.getAttribute("songPass");
		String embedCode = (String)session.getAttribute("embedPass");
		String followedBy = (String)session.getAttribute("followPass");

		//System.out.println("In jsp file " + artist) ;%>
</head>
<body>

<br><br><br>
<div class = "returnButton">
<a href = "index.html" style = "color: white;">FIND MORE LYRICS</a>
</div>
<br><br><br><br>
<div class = "horiz">
<img src = "becauseInternet.jpg" class="blur" id="childish" />
<img src = "cybersex.jpg" class="blur" id="blackbear" />
<img src = "colours2.jpg" class="blur" id="pnd" />
<img src = "wakingAtDawn.jpg" class="blur" id="roywoods" />
<img src = "moreLife.jpg" class="blur" id="drake" />
</div>

<div class = "horiz">
<img src = "hndrxx.jpg" class="blur" id="future" />
<img src = "bigFishTheory.jpg" class="blur" id="vincestaples" />
<img src = "catchTheseVibes.jpg" class="blur" id="pnb" />
<img src = "onGaz.jpg" class="blur" id="achal" />
<img src = "spaceBetween.jpg" class="blur" id="majidjordan" />
</div>


<div id="resultsDiv" class = "resultsDiv">
"<%=lyric %><br><%=followedBy %>" <br><br><b>- <%=artist%>, <%=song %></b>
</div>

<div id = "displaySpotify" class = "displaySpotify" onclick = "displaySpotify()">
<b>LISTEN ON SPOTIFY</b>
</div>

<iframe src=<%=embedCode %> id = "iframe" class = "iframe" width="350" height="440" frameborder="0" allowtransparency="true"></iframe>




</body>
<script>

function displaySpotify() {
	childish = document.getElementById("iframe");
	childish.setAttribute('class', 'iframeShow');
}

function blurFunc() {
	
	
	
	
}

function enlarge() {
	
	
}

function scroll1() {
	window.scrollTo({
	"behavior": "smooth",
	"top": 515
	});
}
function scroll2() {
	window.scrollTo({
	"behavior": "smooth",
	"top": 1030
	});
}

</script>

</html>