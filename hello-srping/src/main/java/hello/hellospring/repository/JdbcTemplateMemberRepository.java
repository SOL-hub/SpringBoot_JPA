package hello.hellospring.repository;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;

import hello.hellospring.domain.Member;

public class JdbcTemplateMemberRepository implements MemberRepository{
	
	private final JdbcTemplate jdbcTemplate;
	
	public JdbcTemplateMemberRepository(DataSource dataSource) {
	jdbcTemplate= new JdbcTemplate(dataSource);
	
	}

	@Override
	public Member save(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Member> findById(Long id) {
		
		return jdbcTemplate.query(sql:"select*from member where id=?", memberRowMapper );
	}

	@Override
	public Optional<Member> findByName(String name) {
		return Optional.empty();
	}

	@Override
	public List<Member> findAll() {
		return null;
	}
	
	private RowMapper<Member> memberRowMapper(){
		return new RowMapper<Member>() {
			@Override
			public Member mapRow(ResultSet rs,int rowNum)throws SQLException{
				
				Member member = new Member();
				member.setId(rs.getLong(columnLabel:"id"));
				member.setName(rs.get)
			}
		}
	}

}
