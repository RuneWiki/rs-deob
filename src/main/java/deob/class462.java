package deob;

import java.util.Comparator;

@ObfuscatedName("rh")
public class class462 implements Comparator {

    // $FF: synthetic field
    public final class463 this$0;

    public class462(class463 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("rh.ab(Lrc;Lrc;I)I")
    public int method7826(class464 arg0, class464 arg1) {
        if (arg0.field4889 > arg1.field4889) {
            return 1;
        } else if (arg0.field4889 < arg1.field4889) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7826((class464) arg0, (class464) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
