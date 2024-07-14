package org.transactionscript.transactionscriptimp;

import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.util.Date;

@Value
@RequiredArgsConstructor
public class RecognizedRevenueTS extends TransactionScript {
    final Long contractNumber;
    final Date date;

    @Override
    public boolean run() {
        return true;
    }
}
