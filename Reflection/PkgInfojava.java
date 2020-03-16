class pkgTest{
      public static void main(String argv[]){
            Package pkgs[];
            pkgs = Package.getPackages();     
            System.out.println(pkgs[0].getName()+ " " + pkgs[0].getImplementationTitle() + " "+pkgs[0].getImplementationVendor()+" "+pkgs[0].getImplementationVersion());
      }
}