package com.great.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class TbmenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbmenuExample() {
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

        public Criteria andMenupidIsNull() {
            addCriterion("MENUPID is null");
            return (Criteria) this;
        }

        public Criteria andMenupidIsNotNull() {
            addCriterion("MENUPID is not null");
            return (Criteria) this;
        }

        public Criteria andMenupidEqualTo(Integer value) {
            addCriterion("MENUPID =", value, "menupid");
            return (Criteria) this;
        }

        public Criteria andMenupidNotEqualTo(Integer value) {
            addCriterion("MENUPID <>", value, "menupid");
            return (Criteria) this;
        }

        public Criteria andMenupidGreaterThan(Integer value) {
            addCriterion("MENUPID >", value, "menupid");
            return (Criteria) this;
        }

        public Criteria andMenupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENUPID >=", value, "menupid");
            return (Criteria) this;
        }

        public Criteria andMenupidLessThan(Integer value) {
            addCriterion("MENUPID <", value, "menupid");
            return (Criteria) this;
        }

        public Criteria andMenupidLessThanOrEqualTo(Integer value) {
            addCriterion("MENUPID <=", value, "menupid");
            return (Criteria) this;
        }

        public Criteria andMenupidIn(List<Integer> values) {
            addCriterion("MENUPID in", values, "menupid");
            return (Criteria) this;
        }

        public Criteria andMenupidNotIn(List<Integer> values) {
            addCriterion("MENUPID not in", values, "menupid");
            return (Criteria) this;
        }

        public Criteria andMenupidBetween(Integer value1, Integer value2) {
            addCriterion("MENUPID between", value1, value2, "menupid");
            return (Criteria) this;
        }

        public Criteria andMenupidNotBetween(Integer value1, Integer value2) {
            addCriterion("MENUPID not between", value1, value2, "menupid");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("MENUNAME is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("MENUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(Object value) {
            addCriterion("MENUNAME =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(Object value) {
            addCriterion("MENUNAME <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(Object value) {
            addCriterion("MENUNAME >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(Object value) {
            addCriterion("MENUNAME >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(Object value) {
            addCriterion("MENUNAME <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(Object value) {
            addCriterion("MENUNAME <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<Object> values) {
            addCriterion("MENUNAME in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<Object> values) {
            addCriterion("MENUNAME not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(Object value1, Object value2) {
            addCriterion("MENUNAME between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(Object value1, Object value2) {
            addCriterion("MENUNAME not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenupathIsNull() {
            addCriterion("MENUPATH is null");
            return (Criteria) this;
        }

        public Criteria andMenupathIsNotNull() {
            addCriterion("MENUPATH is not null");
            return (Criteria) this;
        }

        public Criteria andMenupathEqualTo(Object value) {
            addCriterion("MENUPATH =", value, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathNotEqualTo(Object value) {
            addCriterion("MENUPATH <>", value, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathGreaterThan(Object value) {
            addCriterion("MENUPATH >", value, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathGreaterThanOrEqualTo(Object value) {
            addCriterion("MENUPATH >=", value, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathLessThan(Object value) {
            addCriterion("MENUPATH <", value, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathLessThanOrEqualTo(Object value) {
            addCriterion("MENUPATH <=", value, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathIn(List<Object> values) {
            addCriterion("MENUPATH in", values, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathNotIn(List<Object> values) {
            addCriterion("MENUPATH not in", values, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathBetween(Object value1, Object value2) {
            addCriterion("MENUPATH between", value1, value2, "menupath");
            return (Criteria) this;
        }

        public Criteria andMenupathNotBetween(Object value1, Object value2) {
            addCriterion("MENUPATH not between", value1, value2, "menupath");
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