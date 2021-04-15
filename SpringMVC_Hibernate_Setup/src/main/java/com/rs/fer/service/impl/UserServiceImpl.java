package com.rs.fer.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.rs.fer.entity.Address;
import com.rs.fer.entity.User;
import com.rs.fer.repository.UserRepository;
import com.rs.fer.service.UserService;
import com.rs.fer.util.DateUtil;
import com.rs.fer.util.FERUtil;
import com.rs.fer.util.UserUtil;
import com.rs.fer.vo.LoginVo;
import com.rs.fer.vo.RegistrationVo;
import com.rs.fer.vo.ResetPasswordVo;
import com.rs.fer.vo.UpdateProfileVo;

@Service
public class UserServiceImpl implements UserService {

	
}
