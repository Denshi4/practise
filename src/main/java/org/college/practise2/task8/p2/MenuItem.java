package org.college.practise2.task8.p2;

import java.time.LocalDateTime;

interface MenuItem {
    long getId();
    LocalDateTime getCreationDate();
    String accept(RestaurantVisitor visitor);
}
