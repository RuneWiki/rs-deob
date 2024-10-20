package deob;

import java.util.Comparator;

@ObfuscatedName("ci")
public final class class95 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class95(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("ci.i(Lv;Lv;S)I")
    public int method1627(class15 arg0, class15 arg1) {
        if (arg0.field299 == arg1.field299) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field942 == arg0.field299) {
                return -1;
            }
            if (client.field942 == arg1.field299) {
                return 1;
            }
        }
        return arg0.field299 < arg1.field299 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1627((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
