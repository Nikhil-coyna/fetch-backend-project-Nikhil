/*
 * This file is generated by jOOQ.
 */
package com.fetch.backendproject.tables.pojos;


import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.17.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String payer;
    private Integer points;
    private LocalDateTime timestamp;

    public User() {}

    public User(User value) {
        this.payer = value.payer;
        this.points = value.points;
        this.timestamp = value.timestamp;
    }

    @ConstructorProperties({ "payer", "points", "timestamp" })
    public User(
        String payer,
        Integer points,
        LocalDateTime timestamp
    ) {
        this.payer = payer;
        this.points = points;
        this.timestamp = timestamp;
    }

    /**
     * Getter for <code>user.payer</code>.
     */
    public String getPayer() {
        return this.payer;
    }

    /**
     * Setter for <code>user.payer</code>.
     */
    public User setPayer(String payer) {
        this.payer = payer;
        return this;
    }

    /**
     * Getter for <code>user.points</code>.
     */
    public Integer getPoints() {
        return this.points;
    }

    /**
     * Setter for <code>user.points</code>.
     */
    public User setPoints(Integer points) {
        this.points = points;
        return this;
    }

    /**
     * Getter for <code>user.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Setter for <code>user.timestamp</code>.
     */
    public User setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        if (this.payer == null) {
            if (other.payer != null)
                return false;
        }
        else if (!this.payer.equals(other.payer))
            return false;
        if (this.points == null) {
            if (other.points != null)
                return false;
        }
        else if (!this.points.equals(other.points))
            return false;
        if (this.timestamp == null) {
            if (other.timestamp != null)
                return false;
        }
        else if (!this.timestamp.equals(other.timestamp))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.payer == null) ? 0 : this.payer.hashCode());
        result = prime * result + ((this.points == null) ? 0 : this.points.hashCode());
        result = prime * result + ((this.timestamp == null) ? 0 : this.timestamp.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(payer);
        sb.append(", ").append(points);
        sb.append(", ").append(timestamp);

        sb.append(")");
        return sb.toString();
    }
}
