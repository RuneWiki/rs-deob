package deob;

import java.util.Comparator;

@ObfuscatedName("qn")
public class class439 implements Comparator {

    // $FF: synthetic field
    public final class440 this$0;

    public class439(class440 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("qn.am(Lqm;Lqm;B)I")
    public int method7431(class441 arg0, class441 arg1) {
        if (arg0.field4695 > arg1.field4695) {
            return 1;
        } else if (arg0.field4695 < arg1.field4695) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7431((class441) arg0, (class441) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
