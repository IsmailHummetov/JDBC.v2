package dao.inter;

import bean.Country;

import java.util.List;

public interface CountryDaoInter {
    List<Country> getAll();

    Country getById(int CountryId);

    boolean addCountry(Country country);

    boolean updateCountry(Country country);

    boolean deleteCountry(int CountryId);
}
