package deob;

import java.util.Comparator;

@ObfuscatedName("qt")
public class class442 implements Comparator {

    // $FF: synthetic field
    public final class443 this$0;

    public class442(class443 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("qt.aq(Lrq;Lrq;I)I")
    public int method7446(class444 arg0, class444 arg1) {
        if (arg0.field4724 > arg1.field4724) {
            return 1;
        } else if (arg0.field4724 < arg1.field4724) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7446((class444) arg0, (class444) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
