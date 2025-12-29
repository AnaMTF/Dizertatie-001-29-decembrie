package dizertatie.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.spring6.view.ThymeleafView;

import dizertatie.internal.account.AccountManager;

@RestController
public class AccountController {
	private final Logger logger = LoggerFactory.getLogger(getClass());
//	private AccountManager accountManager;
//	
//	@Autowired
//	public AccountController(AccountManager accountManager) {
//		super();
//		this.accountManager = accountManager;
//	}

	@ResponseStatus(code = HttpStatus.NOT_IMPLEMENTED)
	@ExceptionHandler({ UnsupportedOperationException.class })
	public void handleUnabletoReallocate(Exception ex) {
		logger.error("Exception is: ", ex);
	}

	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(IllegalArgumentException.class)
	public void handleNotFound(Exception ex) {
		logger.error("Exception is: ", ex);
	}
}
