package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Skill;
import com.example.demo.repository.ISkillRepository;

@Service
public class SkillServiceImpl implements ISkillService {

	@Autowired
	ISkillRepository skillRepo;
	
	@Override
	public List<Skill> getAllSkills() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skill getSkillById(int skillId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skill addSkill(Skill skill) {
		
		return skillRepo.save(skill);
	}

	@Override
	public Skill deleteSkillById(int skillId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skill updateSkill(Skill skill) {
		// TODO Auto-generated method stub
		return null;
	}

}
