package com.great.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class TbuserstateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbuserstateExample() {
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

        public Criteria andUserstateidIsNull() {
            addCriterion("USERSTATEID is null");
            return (Criteria) this;
        }

        public Criteria andUserstateidIsNotNull() {
            addCriterion("USERSTATEID is not null");
            return (Criteria) this;
        }

        public Criteria andUserstateidEqualTo(Short value) {
            addCriterion("USERSTATEID =", value, "userstateid");
            return (Criteria) this;
        }

        public Criteria andUserstateidNotEqualTo(Short value) {
            addCriterion("USERSTATEID <>", value, "userstateid");
            return (Criteria) this;
        }

        public Criteria andUserstateidGreaterThan(Short value) {
            addCriterion("USERSTATEID >", value, "userstateid");
            return (Criteria) this;
        }

        public Criteria andUserstateidGreaterThanOrEqualTo(Short value) {
            addCriterion("USERSTATEID >=", value, "userstateid");
            return (Criteria) this;
        }

        public Criteria andUserstateidLessThan(Short value) {
            addCriterion("USERSTATEID <", value, "userstateid");
            return (Criteria) this;
        }

        public Criteria andUserstateidLessThanOrEqualTo(Short value) {
            addCriterion("USERSTATEID <=", value, "userstateid");
            return (Criteria) this;
        }

        public Criteria andUserstateidIn(List<Short> values) {
            addCriterion("USERSTATEID in", values, "userstateid");
            return (Criteria) this;
        }

        public Criteria andUserstateidNotIn(List<Short> values) {
            addCriterion("USERSTATEID not in", values, "userstateid");
            return (Criteria) this;
        }

        public Criteria andUserstateidBetween(Short value1, Short value2) {
            addCriterion("USERSTATEID between", value1, value2, "userstateid");
            return (Criteria) this;
        }

        public Criteria andUserstateidNotBetween(Short value1, Short value2) {
            addCriterion("USERSTATEID not between", value1, value2, "userstateid");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNull() {
            addCriterion("USERSTATE is null");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNotNull() {
            addCriterion("USERSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserstateEqualTo(Object value) {
            addCriterion("USERSTATE =", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotEqualTo(Object value) {
            addCriterion("USERSTATE <>", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThan(Object value) {
            addCriterion("USERSTATE >", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThanOrEqualTo(Object value) {
            addCriterion("USERSTATE >=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThan(Object value) {
            addCriterion("USERSTATE <", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThanOrEqualTo(Object value) {
            addCriterion("USERSTATE <=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateIn(List<Object> values) {
            addCriterion("USERSTATE in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotIn(List<Object> values) {
            addCriterion("USERSTATE not in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateBetween(Object value1, Object value2) {
            addCriterion("USERSTATE between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotBetween(Object value1, Object value2) {
            addCriterion("USERSTATE not between", value1, value2, "userstate");
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