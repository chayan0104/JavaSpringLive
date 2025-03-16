package com.demoApi.javaTrainee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JavaTraineeRepoImpl implements JavaTraineeRepo {

    private final JdbcTemplate jdbcTemplate;

    // Inject the JdbcTemplate dependency (configured in Spring)
    public JavaTraineeRepoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Save a single trainee
    @Override
    public void save(JavaTraineeEntity trainee) {
        String sql = "INSERT INTO trainee_data (name, email, mobile) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, trainee.getName(), trainee.getEmail(), trainee.getMobile());
    }

    // Save multiple trainees
    @Override
    public void saveAll(List<JavaTraineeEntity> trainees) {
        String sql = "INSERT INTO trainee_data (name, email, mobile) VALUES (?, ?, ?)";
        for (JavaTraineeEntity trainee : trainees) {
            jdbcTemplate.update(sql, trainee.getName(), trainee.getEmail(), trainee.getMobile());
        }
    }

    // Find a trainee by ID
    @SuppressWarnings("deprecation")
	@Override
    public JavaTraineeEntity findById(int id) {
        String sql = "SELECT * FROM trainee_data WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new RowMapper<JavaTraineeEntity>() {
            @Override
            public JavaTraineeEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
                JavaTraineeEntity trainee = new JavaTraineeEntity();
                trainee.setId(rs.getInt("id"));
                trainee.setName(rs.getString("name"));
                trainee.setEmail(rs.getString("email"));
                trainee.setMobile(rs.getLong("mobile"));
                return trainee;
            }
        });
    }

    // Find all trainees
    @Override
    public List<JavaTraineeEntity> findAll() {
        String sql = "SELECT * FROM trainee_data";
        return jdbcTemplate.query(sql, new RowMapper<JavaTraineeEntity>() {
            @Override
            public JavaTraineeEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
                JavaTraineeEntity trainee = new JavaTraineeEntity();
                trainee.setId(rs.getInt("id"));
                trainee.setName(rs.getString("name"));
                trainee.setEmail(rs.getString("email"));
                trainee.setMobile(rs.getLong("mobile"));
                return trainee;
            }
        });
    }

    // Update a trainee
    @Override
    public void update(JavaTraineeEntity trainee) {
        String sql = "UPDATE trainee_data SET name = ?, email = ?, mobile = ? WHERE id = ?";
        jdbcTemplate.update(sql, trainee.getName(), trainee.getEmail(), trainee.getMobile(), trainee.getId());
    }

    // Delete a trainee by ID
    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM trainee_data WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    // Check if a trainee exists by ID
    @Override
    public boolean existsById(int id) {
        String sql = "SELECT COUNT(*) FROM trainee_data WHERE id = ?";
        Integer count = jdbcTemplate.queryForObject(sql, new Object[]{id}, Integer.class);
        return count != null && count > 0;
    }
}
