package deob;

import java.util.Comparator;

@ObfuscatedName("rg")
public class class465 implements Comparator {

    // $FF: synthetic field
    public final class466 this$0;

    public class465(class466 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("rg.ap(Lrw;Lrw;I)I")
    public int method8214(class467 arg0, class467 arg1) {
        if (arg0.field4975 > arg1.field4975) {
            return 1;
        } else if (arg0.field4975 < arg1.field4975) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method8214((class467) arg0, (class467) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
