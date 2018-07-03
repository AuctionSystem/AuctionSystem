package com.great.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class TblikegoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblikegoodsExample() {
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

        public Criteria andUserlikeidIsNull() {
            addCriterion("USERLIKEID is null");
            return (Criteria) this;
        }

        public Criteria andUserlikeidIsNotNull() {
            addCriterion("USERLIKEID is not null");
            return (Criteria) this;
        }

        public Criteria andUserlikeidEqualTo(Integer value) {
            addCriterion("USERLIKEID =", value, "userlikeid");
            return (Criteria) this;
        }

        public Criteria andUserlikeidNotEqualTo(Integer value) {
            addCriterion("USERLIKEID <>", value, "userlikeid");
            return (Criteria) this;
        }

        public Criteria andUserlikeidGreaterThan(Integer value) {
            addCriterion("USERLIKEID >", value, "userlikeid");
            return (Criteria) this;
        }

        public Criteria andUserlikeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("USERLIKEID >=", value, "userlikeid");
            return (Criteria) this;
        }

        public Criteria andUserlikeidLessThan(Integer value) {
            addCriterion("USERLIKEID <", value, "userlikeid");
            return (Criteria) this;
        }

        public Criteria andUserlikeidLessThanOrEqualTo(Integer value) {
            addCriterion("USERLIKEID <=", value, "userlikeid");
            return (Criteria) this;
        }

        public Criteria andUserlikeidIn(List<Integer> values) {
            addCriterion("USERLIKEID in", values, "userlikeid");
            return (Criteria) this;
        }

        public Criteria andUserlikeidNotIn(List<Integer> values) {
            addCriterion("USERLIKEID not in", values, "userlikeid");
            return (Criteria) this;
        }

        public Criteria andUserlikeidBetween(Integer value1, Integer value2) {
            addCriterion("USERLIKEID between", value1, value2, "userlikeid");
            return (Criteria) this;
        }

        public Criteria andUserlikeidNotBetween(Integer value1, Integer value2) {
            addCriterion("USERLIKEID not between", value1, value2, "userlikeid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Short value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Short value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Short value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Short value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Short value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Short value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Short> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Short> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Short value1, Short value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Short value1, Short value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andFristidIsNull() {
            addCriterion("FRISTID is null");
            return (Criteria) this;
        }

        public Criteria andFristidIsNotNull() {
            addCriterion("FRISTID is not null");
            return (Criteria) this;
        }

        public Criteria andFristidEqualTo(Short value) {
            addCriterion("FRISTID =", value, "fristid");
            return (Criteria) this;
        }

        public Criteria andFristidNotEqualTo(Short value) {
            addCriterion("FRISTID <>", value, "fristid");
            return (Criteria) this;
        }

        public Criteria andFristidGreaterThan(Short value) {
            addCriterion("FRISTID >", value, "fristid");
            return (Criteria) this;
        }

        public Criteria andFristidGreaterThanOrEqualTo(Short value) {
            addCriterion("FRISTID >=", value, "fristid");
            return (Criteria) this;
        }

        public Criteria andFristidLessThan(Short value) {
            addCriterion("FRISTID <", value, "fristid");
            return (Criteria) this;
        }

        public Criteria andFristidLessThanOrEqualTo(Short value) {
            addCriterion("FRISTID <=", value, "fristid");
            return (Criteria) this;
        }

        public Criteria andFristidIn(List<Short> values) {
            addCriterion("FRISTID in", values, "fristid");
            return (Criteria) this;
        }

        public Criteria andFristidNotIn(List<Short> values) {
            addCriterion("FRISTID not in", values, "fristid");
            return (Criteria) this;
        }

        public Criteria andFristidBetween(Short value1, Short value2) {
            addCriterion("FRISTID between", value1, value2, "fristid");
            return (Criteria) this;
        }

        public Criteria andFristidNotBetween(Short value1, Short value2) {
            addCriterion("FRISTID not between", value1, value2, "fristid");
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