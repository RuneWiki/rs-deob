package deob;

import java.util.Comparator;

@ObfuscatedName("nt")
public class class384 implements Comparator {

    // $FF: synthetic field
    public final class385 this$0;

    public class384(class385 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("nt.h(Lnz;Lnz;B)I")
    public int method6722(class386 arg0, class386 arg1) {
        if (arg0.field4497 > arg1.field4497) {
            return 1;
        } else if (arg0.field4497 < arg1.field4497) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6722((class386) arg0, (class386) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
