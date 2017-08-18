package com.smartparking.car.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOrderExample() {
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

        public Criteria andPreorderIdIsNull() {
            addCriterion("preorder_id is null");
            return (Criteria) this;
        }

        public Criteria andPreorderIdIsNotNull() {
            addCriterion("preorder_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreorderIdEqualTo(Integer value) {
            addCriterion("preorder_id =", value, "preorderId");
            return (Criteria) this;
        }

        public Criteria andPreorderIdNotEqualTo(Integer value) {
            addCriterion("preorder_id <>", value, "preorderId");
            return (Criteria) this;
        }

        public Criteria andPreorderIdGreaterThan(Integer value) {
            addCriterion("preorder_id >", value, "preorderId");
            return (Criteria) this;
        }

        public Criteria andPreorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("preorder_id >=", value, "preorderId");
            return (Criteria) this;
        }

        public Criteria andPreorderIdLessThan(Integer value) {
            addCriterion("preorder_id <", value, "preorderId");
            return (Criteria) this;
        }

        public Criteria andPreorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("preorder_id <=", value, "preorderId");
            return (Criteria) this;
        }

        public Criteria andPreorderIdIn(List<Integer> values) {
            addCriterion("preorder_id in", values, "preorderId");
            return (Criteria) this;
        }

        public Criteria andPreorderIdNotIn(List<Integer> values) {
            addCriterion("preorder_id not in", values, "preorderId");
            return (Criteria) this;
        }

        public Criteria andPreorderIdBetween(Integer value1, Integer value2) {
            addCriterion("preorder_id between", value1, value2, "preorderId");
            return (Criteria) this;
        }

        public Criteria andPreorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("preorder_id not between", value1, value2, "preorderId");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Double value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Double value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Double value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Double value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Double value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Double> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Double> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Double value1, Double value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Double value1, Double value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
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

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andParkingTimeIsNull() {
            addCriterion("parking_time is null");
            return (Criteria) this;
        }

        public Criteria andParkingTimeIsNotNull() {
            addCriterion("parking_time is not null");
            return (Criteria) this;
        }

        public Criteria andParkingTimeEqualTo(Date value) {
            addCriterion("parking_time =", value, "parkingTime");
            return (Criteria) this;
        }

        public Criteria andParkingTimeNotEqualTo(Date value) {
            addCriterion("parking_time <>", value, "parkingTime");
            return (Criteria) this;
        }

        public Criteria andParkingTimeGreaterThan(Date value) {
            addCriterion("parking_time >", value, "parkingTime");
            return (Criteria) this;
        }

        public Criteria andParkingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("parking_time >=", value, "parkingTime");
            return (Criteria) this;
        }

        public Criteria andParkingTimeLessThan(Date value) {
            addCriterion("parking_time <", value, "parkingTime");
            return (Criteria) this;
        }

        public Criteria andParkingTimeLessThanOrEqualTo(Date value) {
            addCriterion("parking_time <=", value, "parkingTime");
            return (Criteria) this;
        }

        public Criteria andParkingTimeIn(List<Date> values) {
            addCriterion("parking_time in", values, "parkingTime");
            return (Criteria) this;
        }

        public Criteria andParkingTimeNotIn(List<Date> values) {
            addCriterion("parking_time not in", values, "parkingTime");
            return (Criteria) this;
        }

        public Criteria andParkingTimeBetween(Date value1, Date value2) {
            addCriterion("parking_time between", value1, value2, "parkingTime");
            return (Criteria) this;
        }

        public Criteria andParkingTimeNotBetween(Date value1, Date value2) {
            addCriterion("parking_time not between", value1, value2, "parkingTime");
            return (Criteria) this;
        }

        public Criteria andLeavingTimeIsNull() {
            addCriterion("leaving_time is null");
            return (Criteria) this;
        }

        public Criteria andLeavingTimeIsNotNull() {
            addCriterion("leaving_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeavingTimeEqualTo(Date value) {
            addCriterion("leaving_time =", value, "leavingTime");
            return (Criteria) this;
        }

        public Criteria andLeavingTimeNotEqualTo(Date value) {
            addCriterion("leaving_time <>", value, "leavingTime");
            return (Criteria) this;
        }

        public Criteria andLeavingTimeGreaterThan(Date value) {
            addCriterion("leaving_time >", value, "leavingTime");
            return (Criteria) this;
        }

        public Criteria andLeavingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leaving_time >=", value, "leavingTime");
            return (Criteria) this;
        }

        public Criteria andLeavingTimeLessThan(Date value) {
            addCriterion("leaving_time <", value, "leavingTime");
            return (Criteria) this;
        }

        public Criteria andLeavingTimeLessThanOrEqualTo(Date value) {
            addCriterion("leaving_time <=", value, "leavingTime");
            return (Criteria) this;
        }

        public Criteria andLeavingTimeIn(List<Date> values) {
            addCriterion("leaving_time in", values, "leavingTime");
            return (Criteria) this;
        }

        public Criteria andLeavingTimeNotIn(List<Date> values) {
            addCriterion("leaving_time not in", values, "leavingTime");
            return (Criteria) this;
        }

        public Criteria andLeavingTimeBetween(Date value1, Date value2) {
            addCriterion("leaving_time between", value1, value2, "leavingTime");
            return (Criteria) this;
        }

        public Criteria andLeavingTimeNotBetween(Date value1, Date value2) {
            addCriterion("leaving_time not between", value1, value2, "leavingTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIsNull() {
            addCriterion("total_time is null");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIsNotNull() {
            addCriterion("total_time is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTimeEqualTo(Date value) {
            addCriterion("total_time =", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotEqualTo(Date value) {
            addCriterion("total_time <>", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeGreaterThan(Date value) {
            addCriterion("total_time >", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("total_time >=", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeLessThan(Date value) {
            addCriterion("total_time <", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeLessThanOrEqualTo(Date value) {
            addCriterion("total_time <=", value, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeIn(List<Date> values) {
            addCriterion("total_time in", values, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotIn(List<Date> values) {
            addCriterion("total_time not in", values, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeBetween(Date value1, Date value2) {
            addCriterion("total_time between", value1, value2, "totalTime");
            return (Criteria) this;
        }

        public Criteria andTotalTimeNotBetween(Date value1, Date value2) {
            addCriterion("total_time not between", value1, value2, "totalTime");
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andCarportNameIsNull() {
            addCriterion("carport_name is null");
            return (Criteria) this;
        }

        public Criteria andCarportNameIsNotNull() {
            addCriterion("carport_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarportNameEqualTo(String value) {
            addCriterion("carport_name =", value, "carportName");
            return (Criteria) this;
        }

        public Criteria andCarportNameNotEqualTo(String value) {
            addCriterion("carport_name <>", value, "carportName");
            return (Criteria) this;
        }

        public Criteria andCarportNameGreaterThan(String value) {
            addCriterion("carport_name >", value, "carportName");
            return (Criteria) this;
        }

        public Criteria andCarportNameGreaterThanOrEqualTo(String value) {
            addCriterion("carport_name >=", value, "carportName");
            return (Criteria) this;
        }

        public Criteria andCarportNameLessThan(String value) {
            addCriterion("carport_name <", value, "carportName");
            return (Criteria) this;
        }

        public Criteria andCarportNameLessThanOrEqualTo(String value) {
            addCriterion("carport_name <=", value, "carportName");
            return (Criteria) this;
        }

        public Criteria andCarportNameLike(String value) {
            addCriterion("carport_name like", value, "carportName");
            return (Criteria) this;
        }

        public Criteria andCarportNameNotLike(String value) {
            addCriterion("carport_name not like", value, "carportName");
            return (Criteria) this;
        }

        public Criteria andCarportNameIn(List<String> values) {
            addCriterion("carport_name in", values, "carportName");
            return (Criteria) this;
        }

        public Criteria andCarportNameNotIn(List<String> values) {
            addCriterion("carport_name not in", values, "carportName");
            return (Criteria) this;
        }

        public Criteria andCarportNameBetween(String value1, String value2) {
            addCriterion("carport_name between", value1, value2, "carportName");
            return (Criteria) this;
        }

        public Criteria andCarportNameNotBetween(String value1, String value2) {
            addCriterion("carport_name not between", value1, value2, "carportName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCartportIdIsNull() {
            addCriterion("cartport_id is null");
            return (Criteria) this;
        }

        public Criteria andCartportIdIsNotNull() {
            addCriterion("cartport_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartportIdEqualTo(Integer value) {
            addCriterion("cartport_id =", value, "cartportId");
            return (Criteria) this;
        }

        public Criteria andCartportIdNotEqualTo(Integer value) {
            addCriterion("cartport_id <>", value, "cartportId");
            return (Criteria) this;
        }

        public Criteria andCartportIdGreaterThan(Integer value) {
            addCriterion("cartport_id >", value, "cartportId");
            return (Criteria) this;
        }

        public Criteria andCartportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartport_id >=", value, "cartportId");
            return (Criteria) this;
        }

        public Criteria andCartportIdLessThan(Integer value) {
            addCriterion("cartport_id <", value, "cartportId");
            return (Criteria) this;
        }

        public Criteria andCartportIdLessThanOrEqualTo(Integer value) {
            addCriterion("cartport_id <=", value, "cartportId");
            return (Criteria) this;
        }

        public Criteria andCartportIdIn(List<Integer> values) {
            addCriterion("cartport_id in", values, "cartportId");
            return (Criteria) this;
        }

        public Criteria andCartportIdNotIn(List<Integer> values) {
            addCriterion("cartport_id not in", values, "cartportId");
            return (Criteria) this;
        }

        public Criteria andCartportIdBetween(Integer value1, Integer value2) {
            addCriterion("cartport_id between", value1, value2, "cartportId");
            return (Criteria) this;
        }

        public Criteria andCartportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cartport_id not between", value1, value2, "cartportId");
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