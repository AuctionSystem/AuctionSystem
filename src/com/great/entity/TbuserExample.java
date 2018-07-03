package com.great.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class TbuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbuserExample() {
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

        public Criteria andStateidIsNull() {
            addCriterion("STATEID is null");
            return (Criteria) this;
        }

        public Criteria andStateidIsNotNull() {
            addCriterion("STATEID is not null");
            return (Criteria) this;
        }

        public Criteria andStateidEqualTo(Short value) {
            addCriterion("STATEID =", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotEqualTo(Short value) {
            addCriterion("STATEID <>", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThan(Short value) {
            addCriterion("STATEID >", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThanOrEqualTo(Short value) {
            addCriterion("STATEID >=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThan(Short value) {
            addCriterion("STATEID <", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThanOrEqualTo(Short value) {
            addCriterion("STATEID <=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidIn(List<Short> values) {
            addCriterion("STATEID in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotIn(List<Short> values) {
            addCriterion("STATEID not in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidBetween(Short value1, Short value2) {
            addCriterion("STATEID between", value1, value2, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotBetween(Short value1, Short value2) {
            addCriterion("STATEID not between", value1, value2, "stateid");
            return (Criteria) this;
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

        public Criteria andRoleidIsNull() {
            addCriterion("ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("ROLEID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("ROLEID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("ROLEID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROLEID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("ROLEID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("ROLEID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("ROLEID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("ROLEID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("ROLEID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("ROLEID not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(Object value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(Object value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(Object value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(Object value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(Object value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(Object value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<Object> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<Object> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(Object value1, Object value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(Object value1, Object value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNull() {
            addCriterion("USERPWD is null");
            return (Criteria) this;
        }

        public Criteria andUserpwdIsNotNull() {
            addCriterion("USERPWD is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwdEqualTo(String value) {
            addCriterion("USERPWD =", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotEqualTo(String value) {
            addCriterion("USERPWD <>", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThan(String value) {
            addCriterion("USERPWD >", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdGreaterThanOrEqualTo(String value) {
            addCriterion("USERPWD >=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThan(String value) {
            addCriterion("USERPWD <", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLessThanOrEqualTo(String value) {
            addCriterion("USERPWD <=", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdLike(String value) {
            addCriterion("USERPWD like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotLike(String value) {
            addCriterion("USERPWD not like", value, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdIn(List<String> values) {
            addCriterion("USERPWD in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotIn(List<String> values) {
            addCriterion("USERPWD not in", values, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdBetween(String value1, String value2) {
            addCriterion("USERPWD between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andUserpwdNotBetween(String value1, String value2) {
            addCriterion("USERPWD not between", value1, value2, "userpwd");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Object value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Object value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Object value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Object value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Object value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Object value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Object> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Object> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Object value1, Object value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Object value1, Object value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(Long value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(Long value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(Long value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(Long value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(Long value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<Long> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<Long> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(Long value1, Long value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(Long value1, Long value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(Object value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(Object value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(Object value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(Object value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(Object value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(Object value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<Object> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<Object> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(Object value1, Object value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(Object value1, Object value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
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