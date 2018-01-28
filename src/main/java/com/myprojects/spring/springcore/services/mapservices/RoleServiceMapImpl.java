package com.myprojects.spring.springcore.services.mapservices;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("map")
public class RoleServiceMapImpl extends AbstractMapService {
}
