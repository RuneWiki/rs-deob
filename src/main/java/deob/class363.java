package deob;

import java.util.Comparator;

@ObfuscatedName("mn")
public class class363 implements Comparator {

    // $FF: synthetic field
    public final class364 this$0;

    public class363(class364 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("mn.c(Lns;Lns;B)I")
    public int method6120(class365 arg0, class365 arg1) {
        if (arg0.field4318 > arg1.field4318) {
            return 1;
        } else if (arg0.field4318 < arg1.field4318) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6120((class365) arg0, (class365) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
