package org.transactionscript.domain;

import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.util.Date;
import java.util.List;

@Value
@RequiredArgsConstructor
public class Contract {
    Date dateSigned;
    double revenue;
    Product product;
    List<RevenueRecognition> revenueRecognitions;
}
