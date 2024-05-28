package main;

import dao.impl.*;
import dao.inter.*;

public class Context {
    public static UserDaoInter instanceUserDao() {
        return new UserDaoImpl();
    }

    public static UserSkillDaoInter instanceUserSkillDao() {
        return new UserSkillDaoImpl();
    }

    public static UserEmpHistoryDaoInter instanceUserEmpHistoryDao() {
        return new UserEmpHistoryDaoImpl();
    }

    public static EmpHistoryDaoInter instanceEmpHistoryDao() {
        return new EmpHistoryDaoImpl();
    }

    public static SkillDaoInter instanceSkillDao() {
        return new SkillDaoImpl();
    }

    public static CountryDaoInter instanceCountryDao() {
        return new CountryDaoImpl();
    }
}
