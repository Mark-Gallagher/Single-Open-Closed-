package ie.gmit.single;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class UserController extends ValidateUser{

    //Create a new user
        public String createUser(String userJson) throws IOException {
            ObjectMapper mapper = new ObjectMapper();

            User user = mapper.readValue(userJson, User.class);

            ValidateUser validUser = new ValidateUser();

            if(!validUser.checkUser(user)) {
                return "ERROR";
            }



            return "SUCCESS";
        }


 }

