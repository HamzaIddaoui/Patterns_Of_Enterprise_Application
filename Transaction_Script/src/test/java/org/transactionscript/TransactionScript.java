package org.transactionscript;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;
import org.transactionscript.transactionscriptimp.CalculateRevenueRecognitionsTS;
import org.transactionscript.transactionscriptimp.RecognizedRevenueTS;

import java.util.Date;

public class TransactionScript {

    @Test
    void should_run_recognized_revenue_ts(){
        RecognizedRevenueTS recognizedRevenueTS = new RecognizedRevenueTS(12L, new Date());

        assertThat(recognizedRevenueTS.run()).isEqualTo(true);
    }

    @Test
    void should_run_calculate_revenue_recognitions_ts(){
        CalculateRevenueRecognitionsTS calculateRevenueRecognitionsTS = new CalculateRevenueRecognitionsTS(12L);

        assertThat(calculateRevenueRecognitionsTS.run()).isEqualTo(true);
    }
}
