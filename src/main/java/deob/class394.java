package deob;

import java.util.Comparator;

@ObfuscatedName("ps")
public class class394 implements Comparator {

    // $FF: synthetic field
    public final class395 this$0;

    public class394(class395 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("ps.aj(Lpn;Lpn;I)I")
    public int method6807(class396 arg0, class396 arg1) {
        if (arg0.field4489 > arg1.field4489) {
            return 1;
        } else if (arg0.field4489 < arg1.field4489) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6807((class396) arg0, (class396) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
