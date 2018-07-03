package com.great.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class TbpowerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbpowerExample() {
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

        public Criteria andPoweridIsNull() {
            addCriterion("POWERID is null");
            return (Criteria) this;
        }

        public Criteria andPoweridIsNotNull() {
            addCriterion("POWERID is not null");
            return (Criteria) this;
        }

        public Criteria andPoweridEqualTo(Integer value) {
            addCriterion("POWERID =", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridNotEqualTo(Integer value) {
            addCriterion("POWERID <>", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridGreaterThan(Integer value) {
            addCriterion("POWERID >", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridGreaterThanOrEqualTo(Integer value) {
            addCriterion("POWERID >=", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridLessThan(Integer value) {
            addCriterion("POWERID <", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridLessThanOrEqualTo(Integer value) {
            addCriterion("POWERID <=", value, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridIn(List<Integer> values) {
            addCriterion("POWERID in", values, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridNotIn(List<Integer> values) {
            addCriterion("POWERID not in", values, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridBetween(Integer value1, Integer value2) {
            addCriterion("POWERID between", value1, value2, "powerid");
            return (Criteria) this;
        }

        public Criteria andPoweridNotBetween(Integer value1, Integer value2) {
            addCriterion("POWERID not between", value1, value2, "powerid");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNull() {
            addCriterion("MENUID is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("MENUID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(Integer value) {
            addCriterion("MENUID =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(Integer value) {
            addCriterion("MENUID <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(Integer value) {
            addCriterion("MENUID >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENUID >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(Integer value) {
            addCriterion("MENUID <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("MENUID <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<Integer> values) {
            addCriterion("MENUID in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<Integer> values) {
            addCriterion("MENUID not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(Integer value1, Integer value2) {
            addCriterion("MENUID between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("MENUID not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andPowernameIsNull() {
            addCriterion("POWERNAME is null");
            return (Criteria) this;
        }

        public Criteria andPowernameIsNotNull() {
            addCriterion("POWERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPowernameEqualTo(Object value) {
            addCriterion("POWERNAME =", value, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameNotEqualTo(Object value) {
            addCriterion("POWERNAME <>", value, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameGreaterThan(Object value) {
            addCriterion("POWERNAME >", value, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameGreaterThanOrEqualTo(Object value) {
            addCriterion("POWERNAME >=", value, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameLessThan(Object value) {
            addCriterion("POWERNAME <", value, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameLessThanOrEqualTo(Object value) {
            addCriterion("POWERNAME <=", value, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameIn(List<Object> values) {
            addCriterion("POWERNAME in", values, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameNotIn(List<Object> values) {
            addCriterion("POWERNAME not in", values, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameBetween(Object value1, Object value2) {
            addCriterion("POWERNAME between", value1, value2, "powername");
            return (Criteria) this;
        }

        public Criteria andPowernameNotBetween(Object value1, Object value2) {
            addCriterion("POWERNAME not between", value1, value2, "powername");
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