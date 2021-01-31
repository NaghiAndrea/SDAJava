package fundamentals;

public class Dog {
    private String name;

    public Dog (String name){   // am creat un constructor care are parametru
        this.name = name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Dog dog){     //suprascriere metoda equals din Java
      //  return (this.name == dog.name); -acelasi lucru
        return (this.name == dog.getName());

    }
}
