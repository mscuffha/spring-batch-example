# spring-batch-xml-example

This project is to provide an xml example of a basic setup for spring batch.

To get set up with the defaults:
  1. You need to have a mysql database created. (I called mine "springbatch").
  2. In that DB, you need to create a users table with the columns "id", "user_login", "password", and "age".
  3. In that table, you can use this script to populate it:
  
      INSERT INTO `users`(`id`, `user_login`, `password`, `age`) VALUES (1,"mkyong","password",30);

      INSERT INTO `users`(`id`, `user_login`, `password`, `age`) VALUES (2,"user_a","password",25);

      INSERT INTO `users`(`id`, `user_login`, `password`, `age`) VALUES (3,"user_b","password",10);

      INSERT INTO `users`(`id`, `user_login`, `password`, `age`) VALUES (4,"user_c","password",25);

      INSERT INTO `users`(`id`, `user_login`, `password`, `age`) VALUES (5,"user_d","password",40);
  4. As long as you named everything as mentioned here and are running your db on localhost:3306, then running App.java should work successfully.
     Otherwise, you may need to modify some configs in database.xml and jobs-extract-users.xml.
