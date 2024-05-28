package dao.inter;

import bean.EmpHistory;

import java.util.List;

public interface UserEmpHistoryDaoInter {
    public List<EmpHistory> getAll();

    public EmpHistory getEmpHistoryByUserId(int userId);
}
