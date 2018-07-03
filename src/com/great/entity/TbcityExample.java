package com.great.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class TbcityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbcityExample() {
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

        public Criteria andCityidIsNull() {
            addCriterion("CITYID is null");
            return (Criteria) this;
        }

        public Criteria andCityidIsNotNull() {
            addCriterion("CITYID is not null");
            return (Criteria) this;
        }

        public Criteria andCityidEqualTo(Integer value) {
            addCriterion("CITYID =", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotEqualTo(Integer value) {
            addCriterion("CITYID <>", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThan(Integer value) {
            addCriterion("CITYID >", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CITYID >=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThan(Integer value) {
            addCriterion("CITYID <", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidLessThanOrEqualTo(Integer value) {
            addCriterion("CITYID <=", value, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidIn(List<Integer> values) {
            addCriterion("CITYID in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotIn(List<Integer> values) {
            addCriterion("CITYID not in", values, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidBetween(Integer value1, Integer value2) {
            addCriterion("CITYID between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andCityidNotBetween(Integer value1, Integer value2) {
            addCriterion("CITYID not between", value1, value2, "cityid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNull() {
            addCriterion("PROVINCEID is null");
            return (Criteria) this;
        }

        public Criteria andProvinceidIsNotNull() {
            addCriterion("PROVINCEID is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceidEqualTo(Integer value) {
            addCriterion("PROVINCEID =", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotEqualTo(Integer value) {
            addCriterion("PROVINCEID <>", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThan(Integer value) {
            addCriterion("PROVINCEID >", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROVINCEID >=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThan(Integer value) {
            addCriterion("PROVINCEID <", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidLessThanOrEqualTo(Integer value) {
            addCriterion("PROVINCEID <=", value, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidIn(List<Integer> values) {
            addCriterion("PROVINCEID in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotIn(List<Integer> values) {
            addCriterion("PROVINCEID not in", values, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidBetween(Integer value1, Integer value2) {
            addCriterion("PROVINCEID between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andProvinceidNotBetween(Integer value1, Integer value2) {
            addCriterion("PROVINCEID not between", value1, value2, "provinceid");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("CITYNAME is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("CITYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(Object value) {
            addCriterion("CITYNAME =", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(Object value) {
            addCriterion("CITYNAME <>", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(Object value) {
            addCriterion("CITYNAME >", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(Object value) {
            addCriterion("CITYNAME >=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(Object value) {
            addCriterion("CITYNAME <", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(Object value) {
            addCriterion("CITYNAME <=", value, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<Object> values) {
            addCriterion("CITYNAME in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<Object> values) {
            addCriterion("CITYNAME not in", values, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(Object value1, Object value2) {
            addCriterion("CITYNAME between", value1, value2, "cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(Object value1, Object value2) {
            addCriterion("CITYNAME not between", value1, value2, "cityname");
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