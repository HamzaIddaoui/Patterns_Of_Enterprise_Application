package org.transactionscript.domain;

import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class CalculateRevenueRecognitionsTS extends TransactionScript{
    final Long conctractNumber;
    @Override
    public boolean run() {
        return true;
    }
}
