package dao.inter;

import bean.Skill;

import java.util.List;

public interface SkillDaoInter {
    List<Skill> getAll();
    Skill getById(int skillId);
    boolean addSkill(Skill skill);
    boolean deleteSkill(int SkillId);
    boolean update(Skill skill);
}
