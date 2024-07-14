package org.transactionscript.domain;

import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.util.List;

@Value
@RequiredArgsConstructor
public class Product {
    String type;
    List<Contract> contracts;
}
