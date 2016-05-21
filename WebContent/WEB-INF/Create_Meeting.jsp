<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create_Meeting</title>
</head>
<body bgcolor="#F3F781">

	<form action="/Project1/Create_Meeting_Submit.html" method="post">

	<div align="left">
			<div>
				<div>
					<h1>Create Conference Meeting</h1>
				</div>

				<table>

					<tr>
						<td><label>Provision: </label></td>
						<td align="Center"><select name="provision">
						        <option >Select Provision</option>
								<option value='BoardRoom'>Board Room</option>
								<option value='Meeting Room'>Meeting Room</option>
						</select></td>
					</tr>

					<tr>
						<td><label>M.Room Names: </label></td>
						<td align="Center"><select name="room_name">
								<option value='1'>Meeting Room 1</option>
								<option value='2'>Meeting Room 2</option>
								<option value='3'>Meeting Room 3</option>
								<option value='4'>Meeting Room 4</option>
								<option value='5'>Meeting Room 5</option>
								<option value='6'>Meeting Room 6</option>
								<option value='7'>Meeting Room 7</option>
								<option value='8'>Meeting Room 8</option>
								<option value='9'>Meeting Room 9</option>
								<option value='10'>Board Room</option>
						</select></td>
					</tr>
					<tr>
						<td><label>Capacity: </label></td>
						<td align="Center">
						<select name="capacity">
								<option value='3'>3</option>
								<option value='5'>5</option>
								<option value='8'>8</option>
								<option value='10'>10</option>
								
						</select>
					</td>
					</tr>
					<tr>
						<td><label>Floor: </label></td>
						<td align="Center">
						<select name="floor">
								<option value='1'>1</option>
								<option value='2'>2</option>
								<option value='3'>3</option>
								<option value='4'>4</option>
						</select>
				  </td>
					</tr>
					<tr>
						<td><label>Fecility Required: </label></td>
						<td align="Center">
						
						<select name="fecilityRequired" multiple>
								<option value='WhiteBoard'>White Board</option>
								<option value='Projector'>Projector</option>
								<option value='Internet_connectivity'>Internet connectivity</option>
								<option value='Wi_Fi'>Wi-Fi</option>
								<option value='Intercom_Facility'>Intercom Facility</option>
								<option value='Tele_Conferencing_facility'>Tele-Conferencing facility</option>
								<option value='Video_Conferencing_facility'>Video-Conferencing Facility</option>
												
						</select>
						</td>
					</tr>
					<tr>
						<td><label>Status of Meeting Room: </label></td>
						<td align="Center">
						<select name="status">
								<option value='true'>true</option>
								<option value='false'>false</option>
						</select>
						</td>
					</tr>
                   
        
                   
					<tr>
						<td><input type="submit" value="Submit" />
						</td>
						<td><input type="submit" value="Cancel" />
						</td>
					</tr>
				</table>
			</div>
		</div>



	</form>
</body>
</html>