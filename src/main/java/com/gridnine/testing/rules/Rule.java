package com.gridnine.testing.rules;

import com.gridnine.testing.models.Flight;

public interface Rule {
    /*
    Methods must identify the flight we need only.
     */
    boolean test(Flight flight);
}
