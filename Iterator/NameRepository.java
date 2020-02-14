
public class NameRepository implements Container {
	
   public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

   @Override
   public Iterator getIterator() {
	// return new NameIterator();
       return new NameIteratorReverse();
   }

   private class NameIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {
      
         if(index < names.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }		
   }
   
   private class NameIteratorReverse implements Iterator {

      int index;
      
      public NameIteratorReverse() {
    	  index = names.length;    	  
      }

      @Override
      public boolean hasNext() {
      
         if(index > 0 ){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){        	 
            return names[--index];
         }
         return null;
      }		
   }
   
}
