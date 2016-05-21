package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DAO.Dbutil;

@Controller
public class Main_Controller1 {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	@RequestMapping(value = "/Login.html", method = RequestMethod.GET)
	public ModelAndView getLoginForm() {
		ModelAndView mvc1 = new ModelAndView("LoginForm.jsp");
		System.out.println("Manjunath.R");
		return mvc1;
	}

	@RequestMapping(value = "/User_Details.html", method = RequestMethod.POST)
	public ModelAndView getUserForm(
			@ModelAttribute("user_auth") UserAuth user_auth) {
		ModelAndView mvc1 = null;
		int count = 0;
		try {
			con = Dbutil.getConnection();
			pstmt = con
					.prepareStatement("Select * from login where username= ? and password =? ");
			pstmt.setString(1, user_auth.userName);
			pstmt.setString(2, user_auth.password);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getRow() + " Rows selected ");
				count = rs.getRow();
			}

		} catch (SQLException ex) {
			ex.printStackTrace();

		} finally {
			Dbutil.closeAll(null, pstmt, con);
		}

		if (count > 0) {
			System.out.println("Completed");
			mvc1 = new ModelAndView("Create_Meeting.jsp");
			 
		} else {
       System.out.println("Completed");
			mvc1 = new ModelAndView("UserAuth.jsp");
		}

		return mvc1;
	}
	
	
	@RequestMapping(value = "/Create_Meeting_Submit.html", method = RequestMethod.POST)
	public ModelAndView getCreateMeetingSubmit(
			@ModelAttribute("Create_Meeting_Submit") CreateMeetingDetails create_meeting_submit) {
		ModelAndView mvc1 = null;
		System.out.println("In the Create_Meeting_Submit");
		System.out.println(1);
		try {
			con = Dbutil.getConnection();
			pstmt = con
					.prepareStatement("insert into Meeting_Details   ");
			pstmt.setString(1, );
			pstmt.setString(2, );
			pstmt.setString(1, );
			pstmt.setString(2, );
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getRow() + " Rows selected ");
				count = rs.getRow();
			}

		} catch (SQLException ex) {
			ex.printStackTrace();

		} finally {
			Dbutil.closeAll(null, pstmt, con);
		}
		
//		Meeting_Details
		for(String s : create_meeting_submit.getFecilityRequired()){
			
			
			
		}
		
		return mvc1;
	}

}
