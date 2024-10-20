package deob;

import java.util.Comparator;

@ObfuscatedName("nj")
public class class381 implements Comparator {

    // $FF: synthetic field
    public final class382 this$0;

    public class381(class382 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("nj.a(Lng;Lng;B)I")
    public int method6616(class383 arg0, class383 arg1) {
        if (arg0.field4452 > arg1.field4452) {
            return 1;
        } else if (arg0.field4452 < arg1.field4452) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6616((class383) arg0, (class383) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
