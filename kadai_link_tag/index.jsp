<%@ page contentType="text/html; charset=UTF-8" %>

<html>
	<head>
		<meta charset = "UTF-8">
		<title>kadai_link_tag</title>
	</head>
	<body>
		<a href = "<%=request.getContextPath()%>/link?name=侍太郎">名前「侍太郎」をServletに送信<br></a>
		${message}
	</body>
</html>