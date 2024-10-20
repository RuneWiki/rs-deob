package deob;

import java.util.Comparator;

@ObfuscatedName("qo")
public class class424 implements Comparator {

    // $FF: synthetic field
    public final class425 this$0;

    public class424(class425 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("qo.aw(Lqr;Lqr;I)I")
    public int method7116(class426 arg0, class426 arg1) {
        if (arg0.field4626 > arg1.field4626) {
            return 1;
        } else if (arg0.field4626 < arg1.field4626) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7116((class426) arg0, (class426) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
