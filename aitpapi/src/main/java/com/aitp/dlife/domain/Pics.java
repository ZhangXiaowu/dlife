package com.aitp.dlife.domain;

import io.swagger.annotations.ApiModel;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * 健身图片信息
 */
@ApiModel(description = "健身图片信息")
@Entity
@Table(name = "pics")
@Cache(usage = CacheConcurrencyStrategy.NONE)
public class Pics implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 255)
    @Column(name = "oss_path", length = 255)
    private String ossPath;

    @Column(name = "create_time")
    private Instant createTime;

    @ManyToOne
    private FitnessActivity fitnessActivity;

    @ManyToOne
    private ClockIn clockIn;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOssPath() {
        return ossPath;
    }

    public Pics ossPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }

    public void setOssPath(String ossPath) {
        this.ossPath = ossPath;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public Pics createTime(Instant createTime) {
        this.createTime = createTime;
        return this;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public FitnessActivity getFitnessActivity() {
        return fitnessActivity;
    }

    public Pics fitnessActivity(FitnessActivity fitnessActivity) {
        this.fitnessActivity = fitnessActivity;
        return this;
    }

    public void setFitnessActivity(FitnessActivity fitnessActivity) {
        this.fitnessActivity = fitnessActivity;
    }

    public ClockIn getClockIn() {
        return clockIn;
    }

    public Pics clockIn(ClockIn clockIn) {
        this.clockIn = clockIn;
        return this;
    }

    public void setClockIn(ClockIn clockIn) {
        this.clockIn = clockIn;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pics pics = (Pics) o;
        if (pics.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), pics.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Pics{" +
            "id=" + getId() +
            ", ossPath='" + getOssPath() + "'" +
            ", createTime='" + getCreateTime() + "'" +
            "}";
    }
}
