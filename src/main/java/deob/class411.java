package deob;

import java.util.Comparator;

@ObfuscatedName("pi")
public class class411 implements Comparator {

    // $FF: synthetic field
    public final class412 this$0;

    public class411(class412 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("pi.at(Lpl;Lpl;I)I")
    public int method7033(class413 arg0, class413 arg1) {
        if (arg0.field4567 > arg1.field4567) {
            return 1;
        } else if (arg0.field4567 < arg1.field4567) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7033((class413) arg0, (class413) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
