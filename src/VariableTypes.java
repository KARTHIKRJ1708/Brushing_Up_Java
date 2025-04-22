public class VariableTypes {

    public static String staticVar = "staticVar1";
    private String instanceVariable = "";

    //initializer block
    {
        int var2=100;
        System.out.println("it is from Initializer Block:"+var2);
    }
    //static block
    static {
        System.out.println("This is static block and automatically and execute without call");
        String staticVar2 = "staticVar2";
        System.out.println("static variable: "+staticVar2);
    }

    public VariableTypes(){
        System.out.println("Default Constructor call.");
    }

    public VariableTypes(String instanceVariable){
        this.instanceVariable ="instanvar1";
        System.out.println("Instance Variable: "+instanceVariable);
    }

    public static void main(String args[]){

        int localvar = 145;

        System.out.println("Local Variable: "+localvar);

        VariableTypes var = new VariableTypes();
        VariableTypes var2 = new VariableTypes("instanceVar");


        System.out.println("static variable: "+staticVar);

    }
}
