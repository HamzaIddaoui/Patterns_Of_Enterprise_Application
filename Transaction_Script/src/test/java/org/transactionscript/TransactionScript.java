package org.transactionscript;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;
import org.transactionscript.domain.RecognizedRevenueTS;

import java.util.Date;

public class TransactionScript {

    @Test
    void should_run_recognized_revenue_ts(){
        RecognizedRevenueTS recognizedRevenueTS = new RecognizedRevenueTS(12L, new Date());

        assertThat(recognizedRevenueTS.run()).isEqualTo(true);
    }
}
