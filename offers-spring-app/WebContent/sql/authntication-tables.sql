-- users table for usernames and passwords
CREATE TABLE `users` (
  `username` varchar(100) NOT NULL,
  `password` varchar(90) NOT NULL,
  `enabled` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`username`)
);

-- user roles table
CREATE TABLE `authorities` (
  `username` varchar(100) NOT NULL,
  `authority` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`)
);