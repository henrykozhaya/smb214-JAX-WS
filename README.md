smb214-JAX-WS
==============
I. Introduction:

C'est une petite application Java Wev Service qui a le role de répondre aux requêtes d'un site web dévloppé en PHP.
L'exemple pris est le livret scolaire. 

II. L'architecture
C'est une application Java qui est deployée dans un serveur Glassfish 4.0 qui à son tour est connecté à la base de données de l'école qui est installée sur un MySQL Server.

III. La base de données
La base de donnée contient tous les tables et les relations nécessaires pour un système de management d'une école. Cette base de données va être utilisé dans un projet à réaliser pour l'Ecole Sainte-Louise où je travaille.
Les tables que nous allons utilisé dans notre exemple sont:
  1. school_year //C'est la table qui contient la liste des années scolaires
  2. exam //C'est la table qui contient la liste des examens de chaque année scolaire
  3. course //C'est la table des matières
  4. class_course //C'est la table qui relie les matières enseignées et leur coefficient à leurs classes correspondates
  5. student_class //C'est la table qui reli les éleves à leurs classe pour chaque année scolaire
  6. grade //C'est la table des notes pour chaque année scolaire, examen, élève et note

IV. L'application
L'application contient une ensemble de classe:
  1. La classe SchoolYear.java, c'est une classe d'implementation de l'object SchoolYear
  2. La classe Examen.java, c'est une classe d'implementation de l'object Examen
  3. La classe lib.java, c'est une librairie de fonctions pour la connexion à la base de données et l'exécution des            requêtes SQL.
  4. La classe smbws.java. c'est la classe la plus importante qui répond aux requêtes SOAP. Elle contient:
      i.   Une fonction getSchoolYear() qui retourne une liste d'objects SchoolYear existants dans la base de données.
      ii.  Une fonction getExamList(school_year_id) qui prend en parametre l'année et retourne une liste d'objet examen              appartenants à cette année scolaire.
      iii. Une fonction getStudentClassCourse(student_id) qui prends en parametre la l'id de l'élève et retourne une liste            de chaine de caractère (String) des maitètres correspondantes à cette élèves
      iv.  Une fonction getStudentExamGrades(student_id, exam_id) qui prend en parametre l'id de l'élève et de l'examen et            retourne une liste String de notes correspondantes déjà multipliées par le coefficient.
