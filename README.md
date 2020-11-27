# JavaPrograms

## For Begineers, How to run above java programs present in this repository(on windows)?

- Check if java is installed on your computer 
      ~ Open command prompt and enter “java –version”. If installed version number is displayed.
      ~ If not installed then visit the link (https://www.java.com/en/download/) and install it on your computer.
      
- Download any java file present in repository.

- Open command prompt and and navigate to this folder in which your java file is present.
     ~ cd (path where file is present)
     
- Type the following command in command prompt
     ~ javac filename.java (replace filename with actual filename)
     ~ If you get any error and command is not recognized then use the following command
     ~ set path="path to bin folder" 
     ~ Since generally it is installed in default location (and jdk 13.0.2 in this case ) then use command - set path=C:\Program Files\Java\jdk-13.0.2\bin;
    
- Once your java file is compiled successfully then type the following command in command prompt to run the program
     ~ java classname.class (classname is same as filename or the name of the file which is created in the folder with .class extension)
    
That's how you run a java program on Windows
