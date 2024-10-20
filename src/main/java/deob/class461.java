package deob;

import java.util.Comparator;

@ObfuscatedName("rf")
public class class461 implements Comparator {

    // $FF: synthetic field
    public final class462 this$0;

    public class461(class462 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("rf.aq(Lre;Lre;I)I")
    public int method7724(class463 arg0, class463 arg1) {
        if (arg0.field4908 > arg1.field4908) {
            return 1;
        } else if (arg0.field4908 < arg1.field4908) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7724((class463) arg0, (class463) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
