package com.ideaco.dia.backendproject.service;
import com.ideaco.dia.backendproject.model.UserModel;
import com.ideaco.dia.backendproject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserModel> getAllUser(){ return userRepository.findAll();
    }

    public UserModel getUser(int userId){
        //validation
        Optional<UserModel> userOpt = userRepository.findById(userId);
        if(userOpt.isEmpty()){
            return null;
        }else {
            return userOpt.get();
        }
    }

    public Boolean loginVal(String email, String password){
        UserModel user = userRepository.getUser(email, password);
        if (user != null){
            return true;
        }else {
            return false;
        }
    }

    public Boolean registration(String name,String email, String phone, String address,
                                String password, Boolean status){
        UserModel user = userRepository.findByEmail(email);
        if (user != null){
            return false;
        }else {
            UserModel userModel = new UserModel();
            userModel.setName(name);
            userModel.setEmail(email);
            userModel.setPhone(phone);
            userModel.setAddress(address);
            userModel.setPassword(password);
            userModel.setStatus(status);
            userRepository.save(userModel);
            return true;
        }
    }


}
