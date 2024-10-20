package deob;

import java.util.Comparator;

@ObfuscatedName("qv")
public class class435 implements Comparator {

    // $FF: synthetic field
    public final class436 this$0;

    public class435(class436 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("qv.at(Lqe;Lqe;I)I")
    public int method7294(class437 arg0, class437 arg1) {
        if (arg0.field4658 > arg1.field4658) {
            return 1;
        } else if (arg0.field4658 < arg1.field4658) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7294((class437) arg0, (class437) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
