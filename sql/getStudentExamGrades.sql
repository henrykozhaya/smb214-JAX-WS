SELECT `smb`.`grade`.`grade_value`, `smb`.`class_course`.`class_course_coefficient`
FROM `smb`.`class_course`, `smb`.`exam`, `smb`.`grade`
WHERE `smb`.`class_course`.`class_course_id` = `smb`.`grade`.`grade_class_course_id`
AND `smb`.`grade`.`grade_exam_id` = {2}
AND `smb`.`grade`.`grade_student_id` = {1}
ORDER BY `smb`.`grade`.`grade_order`