package deob;

import java.util.Comparator;

@ObfuscatedName("mg")
public class class361 implements Comparator {

    // $FF: synthetic field
    public final class362 this$0;

    public class361(class362 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("mg.c(Lmv;Lmv;I)I")
    public int method5961(class363 arg0, class363 arg1) {
        if (arg0.field4278 > arg1.field4278) {
            return 1;
        } else if (arg0.field4278 < arg1.field4278) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5961((class363) arg0, (class363) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
