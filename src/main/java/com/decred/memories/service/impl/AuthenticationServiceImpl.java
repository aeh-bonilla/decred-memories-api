package com.decred.memories.service.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.decred.memories.dto.UserTokenDto;
import com.decred.memories.exception.BadRequestException;
import com.decred.memories.exception.NotFoundException;
import com.decred.memories.exception.UnauthorizedException;
import com.decred.memories.service.AuthenticationService;

public class AuthenticationServiceImpl implements AuthenticationService{}
