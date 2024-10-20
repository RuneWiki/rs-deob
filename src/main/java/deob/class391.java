package deob;

import java.util.Comparator;

@ObfuscatedName("oq")
public class class391 implements Comparator {

    // $FF: synthetic field
    public final class392 this$0;

    public class391(class392 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("oq.f(Loh;Loh;I)I")
    public int method6909(class393 arg0, class393 arg1) {
        if (arg0.field4531 > arg1.field4531) {
            return 1;
        } else if (arg0.field4531 < arg1.field4531) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6909((class393) arg0, (class393) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
