package dizertatie.internal.account;

import java.util.List;
import java.util.UUID;

public interface AccountManager {
	public Account getAccountById(UUID accountUuid);
	public List<Account> getAccounts();
	public Account save(Account account);
	public void udpate(Account account);
}
