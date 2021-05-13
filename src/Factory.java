

public class Factory <E,F>{

    public InterMaps<E,F> getStack(int resp){
        if(resp==1){
            return new RedBlackTree();

        }else if(resp==2){
            return new HashingMap();
        }
        return null;
    }
}