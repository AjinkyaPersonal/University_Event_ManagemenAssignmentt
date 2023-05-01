package com.geekster.University_Event._Management.repo;

import com.geekster.University_Event._Management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Integer> {

    @Modifying
    @Query(value = "update student_tbl set department = :department where student_Id = :id" , nativeQuery = true)
    public void updateStudentDepartment(Integer id , String department);
}
