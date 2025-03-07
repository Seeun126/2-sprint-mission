package com.sprint.mission.discodeit.entity;

import java.util.UUID;
public class BaseEntity {
    protected UUID id;
    protected long createdAt;
    protected long updatedAt;

    public BaseEntity() {
        this.id = UUID.randomUUID();
        this.createdAt = System.currentTimeMillis();
        this.updatedAt = System.currentTimeMillis();
    }

    public UUID getId() {
        return id;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public long updateUpdatedDate(){
        return updatedAt;
    }

    public void updateUpdatedAt(){
        this.updatedAt = System.currentTimeMillis();
    }
}
