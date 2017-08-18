package com.smartparking.car.manager.bean;

import java.util.ArrayList;
import java.util.List;

public class TMapExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMapExample() {
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

        public Criteria andCurrentPointIsNull() {
            addCriterion("current_point is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPointIsNotNull() {
            addCriterion("current_point is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPointEqualTo(String value) {
            addCriterion("current_point =", value, "currentPoint");
            return (Criteria) this;
        }

        public Criteria andCurrentPointNotEqualTo(String value) {
            addCriterion("current_point <>", value, "currentPoint");
            return (Criteria) this;
        }

        public Criteria andCurrentPointGreaterThan(String value) {
            addCriterion("current_point >", value, "currentPoint");
            return (Criteria) this;
        }

        public Criteria andCurrentPointGreaterThanOrEqualTo(String value) {
            addCriterion("current_point >=", value, "currentPoint");
            return (Criteria) this;
        }

        public Criteria andCurrentPointLessThan(String value) {
            addCriterion("current_point <", value, "currentPoint");
            return (Criteria) this;
        }

        public Criteria andCurrentPointLessThanOrEqualTo(String value) {
            addCriterion("current_point <=", value, "currentPoint");
            return (Criteria) this;
        }

        public Criteria andCurrentPointLike(String value) {
            addCriterion("current_point like", value, "currentPoint");
            return (Criteria) this;
        }

        public Criteria andCurrentPointNotLike(String value) {
            addCriterion("current_point not like", value, "currentPoint");
            return (Criteria) this;
        }

        public Criteria andCurrentPointIn(List<String> values) {
            addCriterion("current_point in", values, "currentPoint");
            return (Criteria) this;
        }

        public Criteria andCurrentPointNotIn(List<String> values) {
            addCriterion("current_point not in", values, "currentPoint");
            return (Criteria) this;
        }

        public Criteria andCurrentPointBetween(String value1, String value2) {
            addCriterion("current_point between", value1, value2, "currentPoint");
            return (Criteria) this;
        }

        public Criteria andCurrentPointNotBetween(String value1, String value2) {
            addCriterion("current_point not between", value1, value2, "currentPoint");
            return (Criteria) this;
        }

        public Criteria andSearchPointIsNull() {
            addCriterion("search_point is null");
            return (Criteria) this;
        }

        public Criteria andSearchPointIsNotNull() {
            addCriterion("search_point is not null");
            return (Criteria) this;
        }

        public Criteria andSearchPointEqualTo(String value) {
            addCriterion("search_point =", value, "searchPoint");
            return (Criteria) this;
        }

        public Criteria andSearchPointNotEqualTo(String value) {
            addCriterion("search_point <>", value, "searchPoint");
            return (Criteria) this;
        }

        public Criteria andSearchPointGreaterThan(String value) {
            addCriterion("search_point >", value, "searchPoint");
            return (Criteria) this;
        }

        public Criteria andSearchPointGreaterThanOrEqualTo(String value) {
            addCriterion("search_point >=", value, "searchPoint");
            return (Criteria) this;
        }

        public Criteria andSearchPointLessThan(String value) {
            addCriterion("search_point <", value, "searchPoint");
            return (Criteria) this;
        }

        public Criteria andSearchPointLessThanOrEqualTo(String value) {
            addCriterion("search_point <=", value, "searchPoint");
            return (Criteria) this;
        }

        public Criteria andSearchPointLike(String value) {
            addCriterion("search_point like", value, "searchPoint");
            return (Criteria) this;
        }

        public Criteria andSearchPointNotLike(String value) {
            addCriterion("search_point not like", value, "searchPoint");
            return (Criteria) this;
        }

        public Criteria andSearchPointIn(List<String> values) {
            addCriterion("search_point in", values, "searchPoint");
            return (Criteria) this;
        }

        public Criteria andSearchPointNotIn(List<String> values) {
            addCriterion("search_point not in", values, "searchPoint");
            return (Criteria) this;
        }

        public Criteria andSearchPointBetween(String value1, String value2) {
            addCriterion("search_point between", value1, value2, "searchPoint");
            return (Criteria) this;
        }

        public Criteria andSearchPointNotBetween(String value1, String value2) {
            addCriterion("search_point not between", value1, value2, "searchPoint");
            return (Criteria) this;
        }

        public Criteria andAbsDistanceIsNull() {
            addCriterion("abs_distance is null");
            return (Criteria) this;
        }

        public Criteria andAbsDistanceIsNotNull() {
            addCriterion("abs_distance is not null");
            return (Criteria) this;
        }

        public Criteria andAbsDistanceEqualTo(String value) {
            addCriterion("abs_distance =", value, "absDistance");
            return (Criteria) this;
        }

        public Criteria andAbsDistanceNotEqualTo(String value) {
            addCriterion("abs_distance <>", value, "absDistance");
            return (Criteria) this;
        }

        public Criteria andAbsDistanceGreaterThan(String value) {
            addCriterion("abs_distance >", value, "absDistance");
            return (Criteria) this;
        }

        public Criteria andAbsDistanceGreaterThanOrEqualTo(String value) {
            addCriterion("abs_distance >=", value, "absDistance");
            return (Criteria) this;
        }

        public Criteria andAbsDistanceLessThan(String value) {
            addCriterion("abs_distance <", value, "absDistance");
            return (Criteria) this;
        }

        public Criteria andAbsDistanceLessThanOrEqualTo(String value) {
            addCriterion("abs_distance <=", value, "absDistance");
            return (Criteria) this;
        }

        public Criteria andAbsDistanceLike(String value) {
            addCriterion("abs_distance like", value, "absDistance");
            return (Criteria) this;
        }

        public Criteria andAbsDistanceNotLike(String value) {
            addCriterion("abs_distance not like", value, "absDistance");
            return (Criteria) this;
        }

        public Criteria andAbsDistanceIn(List<String> values) {
            addCriterion("abs_distance in", values, "absDistance");
            return (Criteria) this;
        }

        public Criteria andAbsDistanceNotIn(List<String> values) {
            addCriterion("abs_distance not in", values, "absDistance");
            return (Criteria) this;
        }

        public Criteria andAbsDistanceBetween(String value1, String value2) {
            addCriterion("abs_distance between", value1, value2, "absDistance");
            return (Criteria) this;
        }

        public Criteria andAbsDistanceNotBetween(String value1, String value2) {
            addCriterion("abs_distance not between", value1, value2, "absDistance");
            return (Criteria) this;
        }

        public Criteria andRelatDistanceIsNull() {
            addCriterion("relat_distance is null");
            return (Criteria) this;
        }

        public Criteria andRelatDistanceIsNotNull() {
            addCriterion("relat_distance is not null");
            return (Criteria) this;
        }

        public Criteria andRelatDistanceEqualTo(String value) {
            addCriterion("relat_distance =", value, "relatDistance");
            return (Criteria) this;
        }

        public Criteria andRelatDistanceNotEqualTo(String value) {
            addCriterion("relat_distance <>", value, "relatDistance");
            return (Criteria) this;
        }

        public Criteria andRelatDistanceGreaterThan(String value) {
            addCriterion("relat_distance >", value, "relatDistance");
            return (Criteria) this;
        }

        public Criteria andRelatDistanceGreaterThanOrEqualTo(String value) {
            addCriterion("relat_distance >=", value, "relatDistance");
            return (Criteria) this;
        }

        public Criteria andRelatDistanceLessThan(String value) {
            addCriterion("relat_distance <", value, "relatDistance");
            return (Criteria) this;
        }

        public Criteria andRelatDistanceLessThanOrEqualTo(String value) {
            addCriterion("relat_distance <=", value, "relatDistance");
            return (Criteria) this;
        }

        public Criteria andRelatDistanceLike(String value) {
            addCriterion("relat_distance like", value, "relatDistance");
            return (Criteria) this;
        }

        public Criteria andRelatDistanceNotLike(String value) {
            addCriterion("relat_distance not like", value, "relatDistance");
            return (Criteria) this;
        }

        public Criteria andRelatDistanceIn(List<String> values) {
            addCriterion("relat_distance in", values, "relatDistance");
            return (Criteria) this;
        }

        public Criteria andRelatDistanceNotIn(List<String> values) {
            addCriterion("relat_distance not in", values, "relatDistance");
            return (Criteria) this;
        }

        public Criteria andRelatDistanceBetween(String value1, String value2) {
            addCriterion("relat_distance between", value1, value2, "relatDistance");
            return (Criteria) this;
        }

        public Criteria andRelatDistanceNotBetween(String value1, String value2) {
            addCriterion("relat_distance not between", value1, value2, "relatDistance");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andCarportIdIsNull() {
            addCriterion("carport_id is null");
            return (Criteria) this;
        }

        public Criteria andCarportIdIsNotNull() {
            addCriterion("carport_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarportIdEqualTo(Integer value) {
            addCriterion("carport_id =", value, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdNotEqualTo(Integer value) {
            addCriterion("carport_id <>", value, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdGreaterThan(Integer value) {
            addCriterion("carport_id >", value, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("carport_id >=", value, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdLessThan(Integer value) {
            addCriterion("carport_id <", value, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdLessThanOrEqualTo(Integer value) {
            addCriterion("carport_id <=", value, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdIn(List<Integer> values) {
            addCriterion("carport_id in", values, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdNotIn(List<Integer> values) {
            addCriterion("carport_id not in", values, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdBetween(Integer value1, Integer value2) {
            addCriterion("carport_id between", value1, value2, "carportId");
            return (Criteria) this;
        }

        public Criteria andCarportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("carport_id not between", value1, value2, "carportId");
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