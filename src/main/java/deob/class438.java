package deob;

import java.util.Comparator;

@ObfuscatedName("qp")
public class class438 implements Comparator {

    // $FF: synthetic field
    public final class439 this$0;

    public class438(class439 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("qp.ac(Lqd;Lqd;I)I")
    public int method7218(class440 arg0, class440 arg1) {
        if (arg0.field4666 > arg1.field4666) {
            return 1;
        } else if (arg0.field4666 < arg1.field4666) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7218((class440) arg0, (class440) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
