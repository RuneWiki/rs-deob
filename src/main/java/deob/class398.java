package deob;

import java.util.Comparator;

@ObfuscatedName("pg")
public class class398 implements Comparator {

    // $FF: synthetic field
    public final class399 this$0;

    public class398(class399 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("pg.af(Lpj;Lpj;I)I")
    public int method7033(class400 arg0, class400 arg1) {
        if (arg0.field4545 > arg1.field4545) {
            return 1;
        } else if (arg0.field4545 < arg1.field4545) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7033((class400) arg0, (class400) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
