package deob;

import java.util.Comparator;

@ObfuscatedName("rl")
public class class443 implements Comparator {

    // $FF: synthetic field
    public final class444 this$0;

    public class443(class444 arg0) {
        this.this$0 = arg0;
    }

    @ObfuscatedName("rl.az(Lrv;Lrv;I)I")
    public int method7321(class445 arg0, class445 arg1) {
        if (arg0.field4761 > arg1.field4761) {
            return 1;
        } else if (arg0.field4761 < arg1.field4761) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(Object arg0, Object arg1) {
        return this.method7321((class445) arg0, (class445) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
