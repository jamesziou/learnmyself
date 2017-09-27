package cn.com.dhc.nssol.web.from.validator;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import cn.com.dhc.nssol.common.constants.MessageIdConstants;
import cn.com.dhc.nssol.web.from.UserLoginForm;

public class UserLoginFormValidator implements Validator {

	private static final String FIELD_NAME_USER_ID = "用户名称";

	private static final String FIELD_PROP_USER_ID = "userId";

	private static final String FIELD_NAME_PASSWORD = "密 码";

	private static final String FIELD_PROP_PASSWORD = "password";

	@Override
	public boolean supports(Class<?> clazz) {
		return UserLoginForm.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors error) {
		UserLoginForm loginFirm = (UserLoginForm) obj;
		if (StringUtils.isEmpty(loginFirm.getUserId())) {
			error.rejectValue(FIELD_PROP_USER_ID, MessageIdConstants.MESSAGE_NOT_EMPTY,
					new String[] { FIELD_NAME_USER_ID }, null);
		}
		if (StringUtils.isEmpty(loginFirm.getPassword())) {
			error.rejectValue(FIELD_PROP_PASSWORD, MessageIdConstants.MESSAGE_NOT_EMPTY,
					new String[] { FIELD_NAME_PASSWORD }, null);
		}
	}

}
