package cn.com.dhc.nssol.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import cn.com.dhc.nssol.common.constants.BookSysConstants;

public class BookSysUtils {

	/**
	 * 系统时间获取
	 * 
	 * @param slashFlg
	 *            true:yyyy/MM/dd false : yyyyMMdd
	 * @return 系统时间
	 */
	public final static String getSystimeStr(boolean slashFlg) {
		Calendar sysdate = Calendar.getInstance();
		SimpleDateFormat format = null;
		if (slashFlg) {
			format = new SimpleDateFormat(BookSysConstants.FORMAT_PATTEN_YYYYMMDD);
		} else {
			format = new SimpleDateFormat(BookSysConstants.FORMAT_PATTEN_YYYYMMDD_SLASH);
		}
		return format.format(sysdate.getTime());
	}

	/**
	 * 判断对象是否是空
	 * 
	 * @return
	 */
	public final static boolean isBlank(Object obj) {
		if (BookSysConstants.EMPTY.equals(changObj2Str(obj))) {
			return true;
		}
		return false;
	}

	/**
	 * 把对象转化成字符串
	 * 
	 * @param obj
	 *            对象
	 * @return 字符串
	 */
	public final static String changObj2Str(Object obj) {
		if (obj == null) {
			return BookSysConstants.EMPTY;
		}
		return obj.toString();
	}
}
