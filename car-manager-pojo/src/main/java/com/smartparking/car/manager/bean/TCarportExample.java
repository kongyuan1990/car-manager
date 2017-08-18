package com.smartparking.car.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TCarportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TCarportExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPicturepathIsNull() {
            addCriterion("picturepath is null");
            return (Criteria) this;
        }

        public Criteria andPicturepathIsNotNull() {
            addCriterion("picturepath is not null");
            return (Criteria) this;
        }

        public Criteria andPicturepathEqualTo(String value) {
            addCriterion("picturepath =", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotEqualTo(String value) {
            addCriterion("picturepath <>", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathGreaterThan(String value) {
            addCriterion("picturepath >", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathGreaterThanOrEqualTo(String value) {
            addCriterion("picturepath >=", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLessThan(String value) {
            addCriterion("picturepath <", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLessThanOrEqualTo(String value) {
            addCriterion("picturepath <=", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLike(String value) {
            addCriterion("picturepath like", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotLike(String value) {
            addCriterion("picturepath not like", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathIn(List<String> values) {
            addCriterion("picturepath in", values, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotIn(List<String> values) {
            addCriterion("picturepath not in", values, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathBetween(String value1, String value2) {
            addCriterion("picturepath between", value1, value2, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotBetween(String value1, String value2) {
            addCriterion("picturepath not between", value1, value2, "picturepath");
            return (Criteria) this;
        }

        public Criteria andTotalPlaceIsNull() {
            addCriterion("total_place is null");
            return (Criteria) this;
        }

        public Criteria andTotalPlaceIsNotNull() {
            addCriterion("total_place is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPlaceEqualTo(Integer value) {
            addCriterion("total_place =", value, "totalPlace");
            return (Criteria) this;
        }

        public Criteria andTotalPlaceNotEqualTo(Integer value) {
            addCriterion("total_place <>", value, "totalPlace");
            return (Criteria) this;
        }

        public Criteria andTotalPlaceGreaterThan(Integer value) {
            addCriterion("total_place >", value, "totalPlace");
            return (Criteria) this;
        }

        public Criteria andTotalPlaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_place >=", value, "totalPlace");
            return (Criteria) this;
        }

        public Criteria andTotalPlaceLessThan(Integer value) {
            addCriterion("total_place <", value, "totalPlace");
            return (Criteria) this;
        }

        public Criteria andTotalPlaceLessThanOrEqualTo(Integer value) {
            addCriterion("total_place <=", value, "totalPlace");
            return (Criteria) this;
        }

        public Criteria andTotalPlaceIn(List<Integer> values) {
            addCriterion("total_place in", values, "totalPlace");
            return (Criteria) this;
        }

        public Criteria andTotalPlaceNotIn(List<Integer> values) {
            addCriterion("total_place not in", values, "totalPlace");
            return (Criteria) this;
        }

        public Criteria andTotalPlaceBetween(Integer value1, Integer value2) {
            addCriterion("total_place between", value1, value2, "totalPlace");
            return (Criteria) this;
        }

        public Criteria andTotalPlaceNotBetween(Integer value1, Integer value2) {
            addCriterion("total_place not between", value1, value2, "totalPlace");
            return (Criteria) this;
        }

        public Criteria andRemainingPlaceIsNull() {
            addCriterion("remaining_place is null");
            return (Criteria) this;
        }

        public Criteria andRemainingPlaceIsNotNull() {
            addCriterion("remaining_place is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingPlaceEqualTo(Integer value) {
            addCriterion("remaining_place =", value, "remainingPlace");
            return (Criteria) this;
        }

        public Criteria andRemainingPlaceNotEqualTo(Integer value) {
            addCriterion("remaining_place <>", value, "remainingPlace");
            return (Criteria) this;
        }

        public Criteria andRemainingPlaceGreaterThan(Integer value) {
            addCriterion("remaining_place >", value, "remainingPlace");
            return (Criteria) this;
        }

        public Criteria andRemainingPlaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("remaining_place >=", value, "remainingPlace");
            return (Criteria) this;
        }

        public Criteria andRemainingPlaceLessThan(Integer value) {
            addCriterion("remaining_place <", value, "remainingPlace");
            return (Criteria) this;
        }

        public Criteria andRemainingPlaceLessThanOrEqualTo(Integer value) {
            addCriterion("remaining_place <=", value, "remainingPlace");
            return (Criteria) this;
        }

        public Criteria andRemainingPlaceIn(List<Integer> values) {
            addCriterion("remaining_place in", values, "remainingPlace");
            return (Criteria) this;
        }

        public Criteria andRemainingPlaceNotIn(List<Integer> values) {
            addCriterion("remaining_place not in", values, "remainingPlace");
            return (Criteria) this;
        }

        public Criteria andRemainingPlaceBetween(Integer value1, Integer value2) {
            addCriterion("remaining_place between", value1, value2, "remainingPlace");
            return (Criteria) this;
        }

        public Criteria andRemainingPlaceNotBetween(Integer value1, Integer value2) {
            addCriterion("remaining_place not between", value1, value2, "remainingPlace");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andReservetimeIsNull() {
            addCriterion("reservetime is null");
            return (Criteria) this;
        }

        public Criteria andReservetimeIsNotNull() {
            addCriterion("reservetime is not null");
            return (Criteria) this;
        }

        public Criteria andReservetimeEqualTo(Date value) {
            addCriterionForJDBCTime("reservetime =", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("reservetime <>", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeGreaterThan(Date value) {
            addCriterionForJDBCTime("reservetime >", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("reservetime >=", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeLessThan(Date value) {
            addCriterionForJDBCTime("reservetime <", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("reservetime <=", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeIn(List<Date> values) {
            addCriterionForJDBCTime("reservetime in", values, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("reservetime not in", values, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("reservetime between", value1, value2, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("reservetime not between", value1, value2, "reservetime");
            return (Criteria) this;
        }

        public Criteria andDayPriceIsNull() {
            addCriterion("day_price is null");
            return (Criteria) this;
        }

        public Criteria andDayPriceIsNotNull() {
            addCriterion("day_price is not null");
            return (Criteria) this;
        }

        public Criteria andDayPriceEqualTo(Double value) {
            addCriterion("day_price =", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceNotEqualTo(Double value) {
            addCriterion("day_price <>", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceGreaterThan(Double value) {
            addCriterion("day_price >", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("day_price >=", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceLessThan(Double value) {
            addCriterion("day_price <", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceLessThanOrEqualTo(Double value) {
            addCriterion("day_price <=", value, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceIn(List<Double> values) {
            addCriterion("day_price in", values, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceNotIn(List<Double> values) {
            addCriterion("day_price not in", values, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceBetween(Double value1, Double value2) {
            addCriterion("day_price between", value1, value2, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andDayPriceNotBetween(Double value1, Double value2) {
            addCriterion("day_price not between", value1, value2, "dayPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceIsNull() {
            addCriterion("month_price is null");
            return (Criteria) this;
        }

        public Criteria andMonthPriceIsNotNull() {
            addCriterion("month_price is not null");
            return (Criteria) this;
        }

        public Criteria andMonthPriceEqualTo(Double value) {
            addCriterion("month_price =", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceNotEqualTo(Double value) {
            addCriterion("month_price <>", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceGreaterThan(Double value) {
            addCriterion("month_price >", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("month_price >=", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceLessThan(Double value) {
            addCriterion("month_price <", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceLessThanOrEqualTo(Double value) {
            addCriterion("month_price <=", value, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceIn(List<Double> values) {
            addCriterion("month_price in", values, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceNotIn(List<Double> values) {
            addCriterion("month_price not in", values, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceBetween(Double value1, Double value2) {
            addCriterion("month_price between", value1, value2, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andMonthPriceNotBetween(Double value1, Double value2) {
            addCriterion("month_price not between", value1, value2, "monthPrice");
            return (Criteria) this;
        }

        public Criteria andAddressCityIsNull() {
            addCriterion("address_city is null");
            return (Criteria) this;
        }

        public Criteria andAddressCityIsNotNull() {
            addCriterion("address_city is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCityEqualTo(String value) {
            addCriterion("address_city =", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotEqualTo(String value) {
            addCriterion("address_city <>", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityGreaterThan(String value) {
            addCriterion("address_city >", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("address_city >=", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLessThan(String value) {
            addCriterion("address_city <", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLessThanOrEqualTo(String value) {
            addCriterion("address_city <=", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLike(String value) {
            addCriterion("address_city like", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotLike(String value) {
            addCriterion("address_city not like", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityIn(List<String> values) {
            addCriterion("address_city in", values, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotIn(List<String> values) {
            addCriterion("address_city not in", values, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityBetween(String value1, String value2) {
            addCriterion("address_city between", value1, value2, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotBetween(String value1, String value2) {
            addCriterion("address_city not between", value1, value2, "addressCity");
            return (Criteria) this;
        }

        public Criteria andPortownerIdIsNull() {
            addCriterion("portowner_id is null");
            return (Criteria) this;
        }

        public Criteria andPortownerIdIsNotNull() {
            addCriterion("portowner_id is not null");
            return (Criteria) this;
        }

        public Criteria andPortownerIdEqualTo(Integer value) {
            addCriterion("portowner_id =", value, "portownerId");
            return (Criteria) this;
        }

        public Criteria andPortownerIdNotEqualTo(Integer value) {
            addCriterion("portowner_id <>", value, "portownerId");
            return (Criteria) this;
        }

        public Criteria andPortownerIdGreaterThan(Integer value) {
            addCriterion("portowner_id >", value, "portownerId");
            return (Criteria) this;
        }

        public Criteria andPortownerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("portowner_id >=", value, "portownerId");
            return (Criteria) this;
        }

        public Criteria andPortownerIdLessThan(Integer value) {
            addCriterion("portowner_id <", value, "portownerId");
            return (Criteria) this;
        }

        public Criteria andPortownerIdLessThanOrEqualTo(Integer value) {
            addCriterion("portowner_id <=", value, "portownerId");
            return (Criteria) this;
        }

        public Criteria andPortownerIdIn(List<Integer> values) {
            addCriterion("portowner_id in", values, "portownerId");
            return (Criteria) this;
        }

        public Criteria andPortownerIdNotIn(List<Integer> values) {
            addCriterion("portowner_id not in", values, "portownerId");
            return (Criteria) this;
        }

        public Criteria andPortownerIdBetween(Integer value1, Integer value2) {
            addCriterion("portowner_id between", value1, value2, "portownerId");
            return (Criteria) this;
        }

        public Criteria andPortownerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("portowner_id not between", value1, value2, "portownerId");
            return (Criteria) this;
        }

        public Criteria andHourPriceIsNull() {
            addCriterion("hour_price is null");
            return (Criteria) this;
        }

        public Criteria andHourPriceIsNotNull() {
            addCriterion("hour_price is not null");
            return (Criteria) this;
        }

        public Criteria andHourPriceEqualTo(Double value) {
            addCriterion("hour_price =", value, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceNotEqualTo(Double value) {
            addCriterion("hour_price <>", value, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceGreaterThan(Double value) {
            addCriterion("hour_price >", value, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("hour_price >=", value, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceLessThan(Double value) {
            addCriterion("hour_price <", value, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceLessThanOrEqualTo(Double value) {
            addCriterion("hour_price <=", value, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceIn(List<Double> values) {
            addCriterion("hour_price in", values, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceNotIn(List<Double> values) {
            addCriterion("hour_price not in", values, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceBetween(Double value1, Double value2) {
            addCriterion("hour_price between", value1, value2, "hourPrice");
            return (Criteria) this;
        }

        public Criteria andHourPriceNotBetween(Double value1, Double value2) {
            addCriterion("hour_price not between", value1, value2, "hourPrice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}