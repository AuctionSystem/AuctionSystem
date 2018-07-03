package com.great.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class TbgoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbgoodExample() {
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

        public Criteria andGoodidIsNull() {
            addCriterion("GOODID is null");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNotNull() {
            addCriterion("GOODID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodidEqualTo(Integer value) {
            addCriterion("GOODID =", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotEqualTo(Integer value) {
            addCriterion("GOODID <>", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThan(Integer value) {
            addCriterion("GOODID >", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODID >=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThan(Integer value) {
            addCriterion("GOODID <", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThanOrEqualTo(Integer value) {
            addCriterion("GOODID <=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidIn(List<Integer> values) {
            addCriterion("GOODID in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotIn(List<Integer> values) {
            addCriterion("GOODID not in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidBetween(Integer value1, Integer value2) {
            addCriterion("GOODID between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODID not between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andSecondidIsNull() {
            addCriterion("SECONDID is null");
            return (Criteria) this;
        }

        public Criteria andSecondidIsNotNull() {
            addCriterion("SECONDID is not null");
            return (Criteria) this;
        }

        public Criteria andSecondidEqualTo(Short value) {
            addCriterion("SECONDID =", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidNotEqualTo(Short value) {
            addCriterion("SECONDID <>", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidGreaterThan(Short value) {
            addCriterion("SECONDID >", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidGreaterThanOrEqualTo(Short value) {
            addCriterion("SECONDID >=", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidLessThan(Short value) {
            addCriterion("SECONDID <", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidLessThanOrEqualTo(Short value) {
            addCriterion("SECONDID <=", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidIn(List<Short> values) {
            addCriterion("SECONDID in", values, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidNotIn(List<Short> values) {
            addCriterion("SECONDID not in", values, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidBetween(Short value1, Short value2) {
            addCriterion("SECONDID between", value1, value2, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidNotBetween(Short value1, Short value2) {
            addCriterion("SECONDID not between", value1, value2, "secondid");
            return (Criteria) this;
        }

        public Criteria andGoodstateidIsNull() {
            addCriterion("GOODSTATEID is null");
            return (Criteria) this;
        }

        public Criteria andGoodstateidIsNotNull() {
            addCriterion("GOODSTATEID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstateidEqualTo(Integer value) {
            addCriterion("GOODSTATEID =", value, "goodstateid");
            return (Criteria) this;
        }

        public Criteria andGoodstateidNotEqualTo(Integer value) {
            addCriterion("GOODSTATEID <>", value, "goodstateid");
            return (Criteria) this;
        }

        public Criteria andGoodstateidGreaterThan(Integer value) {
            addCriterion("GOODSTATEID >", value, "goodstateid");
            return (Criteria) this;
        }

        public Criteria andGoodstateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODSTATEID >=", value, "goodstateid");
            return (Criteria) this;
        }

        public Criteria andGoodstateidLessThan(Integer value) {
            addCriterion("GOODSTATEID <", value, "goodstateid");
            return (Criteria) this;
        }

        public Criteria andGoodstateidLessThanOrEqualTo(Integer value) {
            addCriterion("GOODSTATEID <=", value, "goodstateid");
            return (Criteria) this;
        }

        public Criteria andGoodstateidIn(List<Integer> values) {
            addCriterion("GOODSTATEID in", values, "goodstateid");
            return (Criteria) this;
        }

        public Criteria andGoodstateidNotIn(List<Integer> values) {
            addCriterion("GOODSTATEID not in", values, "goodstateid");
            return (Criteria) this;
        }

        public Criteria andGoodstateidBetween(Integer value1, Integer value2) {
            addCriterion("GOODSTATEID between", value1, value2, "goodstateid");
            return (Criteria) this;
        }

        public Criteria andGoodstateidNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODSTATEID not between", value1, value2, "goodstateid");
            return (Criteria) this;
        }

        public Criteria andGoodpictureIsNull() {
            addCriterion("GOODPICTURE is null");
            return (Criteria) this;
        }

        public Criteria andGoodpictureIsNotNull() {
            addCriterion("GOODPICTURE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodpictureEqualTo(Object value) {
            addCriterion("GOODPICTURE =", value, "goodpicture");
            return (Criteria) this;
        }

        public Criteria andGoodpictureNotEqualTo(Object value) {
            addCriterion("GOODPICTURE <>", value, "goodpicture");
            return (Criteria) this;
        }

        public Criteria andGoodpictureGreaterThan(Object value) {
            addCriterion("GOODPICTURE >", value, "goodpicture");
            return (Criteria) this;
        }

        public Criteria andGoodpictureGreaterThanOrEqualTo(Object value) {
            addCriterion("GOODPICTURE >=", value, "goodpicture");
            return (Criteria) this;
        }

        public Criteria andGoodpictureLessThan(Object value) {
            addCriterion("GOODPICTURE <", value, "goodpicture");
            return (Criteria) this;
        }

        public Criteria andGoodpictureLessThanOrEqualTo(Object value) {
            addCriterion("GOODPICTURE <=", value, "goodpicture");
            return (Criteria) this;
        }

        public Criteria andGoodpictureIn(List<Object> values) {
            addCriterion("GOODPICTURE in", values, "goodpicture");
            return (Criteria) this;
        }

        public Criteria andGoodpictureNotIn(List<Object> values) {
            addCriterion("GOODPICTURE not in", values, "goodpicture");
            return (Criteria) this;
        }

        public Criteria andGoodpictureBetween(Object value1, Object value2) {
            addCriterion("GOODPICTURE between", value1, value2, "goodpicture");
            return (Criteria) this;
        }

        public Criteria andGoodpictureNotBetween(Object value1, Object value2) {
            addCriterion("GOODPICTURE not between", value1, value2, "goodpicture");
            return (Criteria) this;
        }

        public Criteria andGooddescribeIsNull() {
            addCriterion("GOODDESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andGooddescribeIsNotNull() {
            addCriterion("GOODDESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andGooddescribeEqualTo(Object value) {
            addCriterion("GOODDESCRIBE =", value, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeNotEqualTo(Object value) {
            addCriterion("GOODDESCRIBE <>", value, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeGreaterThan(Object value) {
            addCriterion("GOODDESCRIBE >", value, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeGreaterThanOrEqualTo(Object value) {
            addCriterion("GOODDESCRIBE >=", value, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeLessThan(Object value) {
            addCriterion("GOODDESCRIBE <", value, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeLessThanOrEqualTo(Object value) {
            addCriterion("GOODDESCRIBE <=", value, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeIn(List<Object> values) {
            addCriterion("GOODDESCRIBE in", values, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeNotIn(List<Object> values) {
            addCriterion("GOODDESCRIBE not in", values, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeBetween(Object value1, Object value2) {
            addCriterion("GOODDESCRIBE between", value1, value2, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGooddescribeNotBetween(Object value1, Object value2) {
            addCriterion("GOODDESCRIBE not between", value1, value2, "gooddescribe");
            return (Criteria) this;
        }

        public Criteria andGoodstatrpriceIsNull() {
            addCriterion("GOODSTATRPRICE is null");
            return (Criteria) this;
        }

        public Criteria andGoodstatrpriceIsNotNull() {
            addCriterion("GOODSTATRPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstatrpriceEqualTo(Integer value) {
            addCriterion("GOODSTATRPRICE =", value, "goodstatrprice");
            return (Criteria) this;
        }

        public Criteria andGoodstatrpriceNotEqualTo(Integer value) {
            addCriterion("GOODSTATRPRICE <>", value, "goodstatrprice");
            return (Criteria) this;
        }

        public Criteria andGoodstatrpriceGreaterThan(Integer value) {
            addCriterion("GOODSTATRPRICE >", value, "goodstatrprice");
            return (Criteria) this;
        }

        public Criteria andGoodstatrpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODSTATRPRICE >=", value, "goodstatrprice");
            return (Criteria) this;
        }

        public Criteria andGoodstatrpriceLessThan(Integer value) {
            addCriterion("GOODSTATRPRICE <", value, "goodstatrprice");
            return (Criteria) this;
        }

        public Criteria andGoodstatrpriceLessThanOrEqualTo(Integer value) {
            addCriterion("GOODSTATRPRICE <=", value, "goodstatrprice");
            return (Criteria) this;
        }

        public Criteria andGoodstatrpriceIn(List<Integer> values) {
            addCriterion("GOODSTATRPRICE in", values, "goodstatrprice");
            return (Criteria) this;
        }

        public Criteria andGoodstatrpriceNotIn(List<Integer> values) {
            addCriterion("GOODSTATRPRICE not in", values, "goodstatrprice");
            return (Criteria) this;
        }

        public Criteria andGoodstatrpriceBetween(Integer value1, Integer value2) {
            addCriterion("GOODSTATRPRICE between", value1, value2, "goodstatrprice");
            return (Criteria) this;
        }

        public Criteria andGoodstatrpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODSTATRPRICE not between", value1, value2, "goodstatrprice");
            return (Criteria) this;
        }

        public Criteria andGoodlarstIsNull() {
            addCriterion("GOODLARST is null");
            return (Criteria) this;
        }

        public Criteria andGoodlarstIsNotNull() {
            addCriterion("GOODLARST is not null");
            return (Criteria) this;
        }

        public Criteria andGoodlarstEqualTo(Integer value) {
            addCriterion("GOODLARST =", value, "goodlarst");
            return (Criteria) this;
        }

        public Criteria andGoodlarstNotEqualTo(Integer value) {
            addCriterion("GOODLARST <>", value, "goodlarst");
            return (Criteria) this;
        }

        public Criteria andGoodlarstGreaterThan(Integer value) {
            addCriterion("GOODLARST >", value, "goodlarst");
            return (Criteria) this;
        }

        public Criteria andGoodlarstGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODLARST >=", value, "goodlarst");
            return (Criteria) this;
        }

        public Criteria andGoodlarstLessThan(Integer value) {
            addCriterion("GOODLARST <", value, "goodlarst");
            return (Criteria) this;
        }

        public Criteria andGoodlarstLessThanOrEqualTo(Integer value) {
            addCriterion("GOODLARST <=", value, "goodlarst");
            return (Criteria) this;
        }

        public Criteria andGoodlarstIn(List<Integer> values) {
            addCriterion("GOODLARST in", values, "goodlarst");
            return (Criteria) this;
        }

        public Criteria andGoodlarstNotIn(List<Integer> values) {
            addCriterion("GOODLARST not in", values, "goodlarst");
            return (Criteria) this;
        }

        public Criteria andGoodlarstBetween(Integer value1, Integer value2) {
            addCriterion("GOODLARST between", value1, value2, "goodlarst");
            return (Criteria) this;
        }

        public Criteria andGoodlarstNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODLARST not between", value1, value2, "goodlarst");
            return (Criteria) this;
        }

        public Criteria andGoodnewIsNull() {
            addCriterion("GOODNEW is null");
            return (Criteria) this;
        }

        public Criteria andGoodnewIsNotNull() {
            addCriterion("GOODNEW is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnewEqualTo(Integer value) {
            addCriterion("GOODNEW =", value, "goodnew");
            return (Criteria) this;
        }

        public Criteria andGoodnewNotEqualTo(Integer value) {
            addCriterion("GOODNEW <>", value, "goodnew");
            return (Criteria) this;
        }

        public Criteria andGoodnewGreaterThan(Integer value) {
            addCriterion("GOODNEW >", value, "goodnew");
            return (Criteria) this;
        }

        public Criteria andGoodnewGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODNEW >=", value, "goodnew");
            return (Criteria) this;
        }

        public Criteria andGoodnewLessThan(Integer value) {
            addCriterion("GOODNEW <", value, "goodnew");
            return (Criteria) this;
        }

        public Criteria andGoodnewLessThanOrEqualTo(Integer value) {
            addCriterion("GOODNEW <=", value, "goodnew");
            return (Criteria) this;
        }

        public Criteria andGoodnewIn(List<Integer> values) {
            addCriterion("GOODNEW in", values, "goodnew");
            return (Criteria) this;
        }

        public Criteria andGoodnewNotIn(List<Integer> values) {
            addCriterion("GOODNEW not in", values, "goodnew");
            return (Criteria) this;
        }

        public Criteria andGoodnewBetween(Integer value1, Integer value2) {
            addCriterion("GOODNEW between", value1, value2, "goodnew");
            return (Criteria) this;
        }

        public Criteria andGoodnewNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODNEW not between", value1, value2, "goodnew");
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