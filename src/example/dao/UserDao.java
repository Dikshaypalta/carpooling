package example.dao;

import java.util.List;

import example.domain.Register;
import com.cloudant.client.api.Database;
import com.google.gson.JsonObject;

import example.nosql.CloudantClientMgr;
import example.nosql.Dbtest;
import example.nosql.ResourceServlet;

public class UserDao {

	public void registerNewUser(Register registerUser) {
		String name, value;
	//	new CloudantClientMgr();
	//	response.getWriter().append(new CloudantClientMgr().getDB().getDBUri().toString());
	/*	Database db= new CloudantClientMgr().getDB();
		
		try {
			String idString = registerUser.getUserId() == null ? null : registerUser.getUserId();
			JsonObject resultObject = new ResourceServlet().create(db, null, "name","Saurabh",null,null);

			List<Dbtest> d  = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(Dbtest.class);
			
			for(int i=0; i<d.size();i++){
				
				
			//response.getWriter().append((d.get(i).getName()));
			}


			} catch (Exception e) {
			// TODO Auto-generated catch block
				//response.getWriter().append(e.getMessage());
			}
		
		*/
	}

	
}
