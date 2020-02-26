<html>
	<head>
		<title>Spring Web</title>
	</head>
	<body>
	<section style="padding:10px; min-height:400px;">
		<h1>${pageTitle }</h1>
		<h3>Developers</h3>
		<ol>
			<c:forEach var="d" items="${developers }">
				<li>&{d}</li>
				<li>meghana</li>
				<li>keerthi</li>
				<li>chandhu</li>
				<li>pooja</li>
			</c:forEach>
		</ol>
		</section>
	</body>
</html>	