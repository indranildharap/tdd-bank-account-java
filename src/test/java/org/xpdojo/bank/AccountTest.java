package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.xpdojo.bank.Account;
import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test

    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        assertThat(account.checkBalance(10)).isEqualTo(0);
    }
}
