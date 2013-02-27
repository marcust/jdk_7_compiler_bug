public enum SomeEnum  {

    VALUE( SomeEnumImplementation.class ) {
        
        public Object doSomething() {
            return null;
        }

    };


    private <C extends Enum<?> & SomeInterface> SomeEnum( 
             final Class<C> aClass ) {
    }

}
