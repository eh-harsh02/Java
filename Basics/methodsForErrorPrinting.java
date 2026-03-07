class methodsForErrorPrinting{
    public static void main(String[] args) {
        try{
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int z=x/y;
        System.out.println(z);
        }catch(Exception e){
            // System.out.println(e);
            e.printStackTrace();
            // System.out.println(e.getMessage());
            // System.out.println(e.toString());
        }
    }
}
