package deob;

import java.util.Comparator;

@ObfuscatedName("mz")
public class class362 implements Comparator {

    // $FF: synthetic field
    public final class363 this$0;

    public class362(class363 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("mz.o(Lmw;Lmw;I)I")
    public int method5899(class364 arg0, class364 arg1) {
        if (arg0.field4291 > arg1.field4291) {
            return 1;
        } else if (arg0.field4291 < arg1.field4291) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5899((class364) arg0, (class364) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
