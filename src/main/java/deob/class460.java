package deob;

import java.util.Comparator;

@ObfuscatedName("rm")
public class class460 implements Comparator {

    // $FF: synthetic field
    public final class461 this$0;

    public class460(class461 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("rm.ak(Lrp;Lrp;I)I")
    public int method7754(class462 arg0, class462 arg1) {
        if (arg0.field4892 > arg1.field4892) {
            return 1;
        } else if (arg0.field4892 < arg1.field4892) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7754((class462) arg0, (class462) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
