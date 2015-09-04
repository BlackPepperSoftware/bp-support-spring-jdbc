package uk.co.blackpepper.support.spring.jdbc;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;

public final class JdbcUtils {
	
	private JdbcUtils() {
		throw new AssertionError();
	}
	
	public static PreparedStatementCreator newPreparedStatementCreator(String sql, int[] types, Object[] params) {
		PreparedStatementCreatorFactory factory = new PreparedStatementCreatorFactory(sql, types);
		factory.setReturnGeneratedKeys(true);
		return factory.newPreparedStatementCreator(params);
	}
}
