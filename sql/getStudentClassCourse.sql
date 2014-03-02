SELECT `smb`.`course`.`course_name`, `smb`.`class_course`.`class_course_coefficient`
FROM `smb`.`course`, `smb`.`class_course`, `smb`.`student_class`
WHERE `course`.`course_id` = `class_course_course_id`
AND `class_course`.`class_course_class_id` = `student_class`.`student_class_id`
AND `student_class`.`student_class_student_id` = {1}
ORDER BY `class_course`.`class_course_order`