package backend.reponsitory;

import java.sql.SQLException;

public interface ICandidateReponsitory {
	void dangKyExperienceCandidate(String firstName, String lastName, String pass, String phone, String email,
			int expInYear, String proSkill) throws SQLException;

	void dangKyFresherCandidate(String firstName, String lastName, String pass, String phone, String email,
			String graduationRank) throws SQLException;

	boolean errorLogin(String email, String pass) throws SQLException;
}
