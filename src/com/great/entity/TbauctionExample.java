package com.great.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class TbauctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbauctionExample() {
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

        public Criteria andAuctionidIsNull() {
            addCriterion("AUCTIONID is null");
            return (Criteria) this;
        }

        public Criteria andAuctionidIsNotNull() {
            addCriterion("AUCTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andAuctionidEqualTo(Long value) {
            addCriterion("AUCTIONID =", value, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidNotEqualTo(Long value) {
            addCriterion("AUCTIONID <>", value, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidGreaterThan(Long value) {
            addCriterion("AUCTIONID >", value, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidGreaterThanOrEqualTo(Long value) {
            addCriterion("AUCTIONID >=", value, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidLessThan(Long value) {
            addCriterion("AUCTIONID <", value, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidLessThanOrEqualTo(Long value) {
            addCriterion("AUCTIONID <=", value, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidIn(List<Long> values) {
            addCriterion("AUCTIONID in", values, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidNotIn(List<Long> values) {
            addCriterion("AUCTIONID not in", values, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidBetween(Long value1, Long value2) {
            addCriterion("AUCTIONID between", value1, value2, "auctionid");
            return (Criteria) this;
        }

        public Criteria andAuctionidNotBetween(Long value1, Long value2) {
            addCriterion("AUCTIONID not between", value1, value2, "auctionid");
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

        public Criteria andGoodsidIsNull() {
            addCriterion("GOODSID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("GOODSID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("GOODSID =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("GOODSID <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("GOODSID >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODSID >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("GOODSID <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("GOODSID <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("GOODSID in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("GOODSID not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("GOODSID between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODSID not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andAutiondateIsNull() {
            addCriterion("AUTIONDATE is null");
            return (Criteria) this;
        }

        public Criteria andAutiondateIsNotNull() {
            addCriterion("AUTIONDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAutiondateEqualTo(Object value) {
            addCriterion("AUTIONDATE =", value, "autiondate");
            return (Criteria) this;
        }

        public Criteria andAutiondateNotEqualTo(Object value) {
            addCriterion("AUTIONDATE <>", value, "autiondate");
            return (Criteria) this;
        }

        public Criteria andAutiondateGreaterThan(Object value) {
            addCriterion("AUTIONDATE >", value, "autiondate");
            return (Criteria) this;
        }

        public Criteria andAutiondateGreaterThanOrEqualTo(Object value) {
            addCriterion("AUTIONDATE >=", value, "autiondate");
            return (Criteria) this;
        }

        public Criteria andAutiondateLessThan(Object value) {
            addCriterion("AUTIONDATE <", value, "autiondate");
            return (Criteria) this;
        }

        public Criteria andAutiondateLessThanOrEqualTo(Object value) {
            addCriterion("AUTIONDATE <=", value, "autiondate");
            return (Criteria) this;
        }

        public Criteria andAutiondateIn(List<Object> values) {
            addCriterion("AUTIONDATE in", values, "autiondate");
            return (Criteria) this;
        }

        public Criteria andAutiondateNotIn(List<Object> values) {
            addCriterion("AUTIONDATE not in", values, "autiondate");
            return (Criteria) this;
        }

        public Criteria andAutiondateBetween(Object value1, Object value2) {
            addCriterion("AUTIONDATE between", value1, value2, "autiondate");
            return (Criteria) this;
        }

        public Criteria andAutiondateNotBetween(Object value1, Object value2) {
            addCriterion("AUTIONDATE not between", value1, value2, "autiondate");
            return (Criteria) this;
        }

        public Criteria andUserpriceIsNull() {
            addCriterion("USERPRICE is null");
            return (Criteria) this;
        }

        public Criteria andUserpriceIsNotNull() {
            addCriterion("USERPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andUserpriceEqualTo(Long value) {
            addCriterion("USERPRICE =", value, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceNotEqualTo(Long value) {
            addCriterion("USERPRICE <>", value, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceGreaterThan(Long value) {
            addCriterion("USERPRICE >", value, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("USERPRICE >=", value, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceLessThan(Long value) {
            addCriterion("USERPRICE <", value, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceLessThanOrEqualTo(Long value) {
            addCriterion("USERPRICE <=", value, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceIn(List<Long> values) {
            addCriterion("USERPRICE in", values, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceNotIn(List<Long> values) {
            addCriterion("USERPRICE not in", values, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceBetween(Long value1, Long value2) {
            addCriterion("USERPRICE between", value1, value2, "userprice");
            return (Criteria) this;
        }

        public Criteria andUserpriceNotBetween(Long value1, Long value2) {
            addCriterion("USERPRICE not between", value1, value2, "userprice");
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