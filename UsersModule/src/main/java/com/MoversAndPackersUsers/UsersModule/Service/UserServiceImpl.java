package com.MoversAndPackersUsers.UsersModule.Service;

import com.MoversAndPackersUsers.UsersModule.Dao.UsersDao;
import com.MoversAndPackersUsers.UsersModule.ExternalServices.ServiceProviderInterface;
import com.MoversAndPackersUsers.UsersModule.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UsersDao userDao;

    @Override
    public String addUser(Users user) {

        userDao.save(user);
        return "Saved!!";
    }

    @Override
    public List<Users> selectAll() {


        return userDao.findAll();
    }

    @Autowired
    private ServiceProviderInterface serviceProviderInterface;
    @Override
    public ResponseEntity<?> getAllProviders() {
        return serviceProviderInterface.getAllServProvider();
    }

    @Override
    public ResponseEntity<?> findNearby(String city) {
        return serviceProviderInterface.getProvByCity(city);
    }
}
