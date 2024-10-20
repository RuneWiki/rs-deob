package deob;

import java.util.Comparator;

@ObfuscatedName("mk")
public class class362 implements Comparator {

    // $FF: synthetic field
    public final class363 this$0;

    public class362(class363 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("mk.s(Lmi;Lmi;I)I")
    public int method5892(class364 arg0, class364 arg1) {
        if (arg0.field4271 > arg1.field4271) {
            return 1;
        } else if (arg0.field4271 < arg1.field4271) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5892((class364) arg0, (class364) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
