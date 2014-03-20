smb214-JAX-WS
==============
<h3>I. Introduction:</h3>

Les Services Web sont un moyen de communication qui permet une bonne fonctionnalité entre les différentes applications sur différentes plates-formes, par exemple, une application Java sur Windows peut communiquer avec un .Net basé sur un Linux. La communication peut se faire par un ensemble de messages XML via le protocole HTTP. Alors le développeur d'une application, sur le même LAN oubien sur internet, qui a besoin de nos informations, peut y accéder à travers nos fonctions de service web sans atteindre directement notre base de données.

Alors les services web sont indépendants des browsers et des systèmes d'opération. 
Le Consortium World Wide Web ( W3C ) a défini les services Web. Selon le W3C, « Les services Web sont la conception basée sur les messages fréquemment trouvés sur le Web et des logiciels d'entreprise. Le service web est basé sur des technologies telles que HTTP, XML , SOAP , WSDL , SPARQL , et d'autres".

Il existe deux grandes familles de services web :
  1. Les services web de type SOAP
  2. Les services web de type REST

Dans notre exemple, nous allons travailler les services web de type SOAP. Les services web serveur en Java (JAX-WS) et ceux du client en PHP.
Les services web de type Soap font un usage intensif de XML, des namespaces XML et des schémas XML. Ces technologies font la force des services web pour permettre leur utilisation par des clients et des serveurs hétérogènes. XML est notamment utilisé pour stocker et organiser les informations de la requête et de la réponse mais aussi pour décrire le service web. L'utilisation de XML pour le format des messages rend les échanges indépendants du système d'exploitation, de la plate-forme et du langage.

Il est ainsi possible de développer des services web avec une plate-forme (par exemple Java) et d'utiliser ces services web avec une autre plate-forme (par exemple .Net ou PHP) : c'est une des grandes forces des services web même si cela reste parfois quelque peu théorique, essentiellement à cause des implémentations des moteurs utilisés pour mettre en oeuvre les services web.

En Netbeans, il suffit d'ajouter un fichier Java Web Service et de créer les fonctions (on peut les faires avec un wizard) une fois compiler les fichier wsdl et xsd seront automatiquement créer. Ces fichiers seront transmis au développeur de l'application cliente.Ils servent à identifier la liste des fonctions et de leurs paramètres avec leur type.

<h3>II. L'exemple</h3>
C'est une petite application Java Wev Service qui a le role de répondre aux requêtes d'un site web dévloppé en PHP.
L'exemple pris est le livret scolaire. 
C'est une application Java qui est deployée dans un serveur Glassfish 4.0 qui à son tour est connecté à la base de données de l'école qui est installée sur un MySQL Server.

<h3>III. La base de données</h3>
La base de donnée contient tous les tables et les relations nécessaires pour un système de management d'une école. Cette base de données va être utilisé dans un projet à réaliser pour l'Ecole Sainte-Louise où je travaille.
Les tables que nous allons utilisé dans notre exemple sont:
  1. school_year //C'est la table qui contient la liste des années scolaires
  2. exam //C'est la table qui contient la liste des examens de chaque année scolaire
  3. course //C'est la table des matières
  4. class_course //C'est la table qui relie les matières enseignées et leur coefficient à leurs classes correspondates
  5. student_class //C'est la table qui reli les éleves à leurs classe pour chaque année scolaire
  6. grade //C'est la table des notes pour chaque année scolaire, examen, élève et note

<h3>IV. L'application</h3>
L'application contient une ensemble de classe:
  1. La classe SchoolYear.java, c'est une classe d'implementation de l'object SchoolYear
  2. La classe Examen.java, c'est une classe d'implementation de l'object Examen
  3. La classe lib.java, c'est une librairie de fonctions pour la connexion à la base de données et l'exécution des            requêtes SQL.
  4. La classe smbws.java. c'est la classe la plus importante qui répond aux requêtes SOAP. Elle contient:
      i.   Une fonction getSchoolYear() qui retourne une liste d'objects SchoolYear existants dans la base de données.
      ii.  Une fonction getExamList(school_year_id) qui prend en parametre l'année et retourne une liste d'objet examen              appartenants à cette année scolaire.
      iii. Une fonction getStudentClassCourse(student_id) qui prends en parametre la l'id de l'élève et retourne une liste            de chaine de caractère (String) des maitètres correspondantes à cette élèves
      iv.  Une fonction getStudentExamGrades(student_id, exam_id) qui prend en parametre l'id de l'élève et de l'examen et            retourne une liste String de notes correspondantes déjà multipliées par le coefficient.
