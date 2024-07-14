package org.transactionscript.domain;

import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.util.Date;

@Value
@RequiredArgsConstructor
public class RevenueRecognition {
    double amount;
    Date date;
    Contract contract;
}
