package deob;

import java.util.Comparator;

@ObfuscatedName("co")
public final class class96 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class96(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("co.w(Lq;Lq;I)I")
    public int method1604(class15 arg0, class15 arg1) {
        if (arg0.field309 == arg1.field309) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field1106 == arg0.field309) {
                return -1;
            }
            if (client.field1106 == arg1.field309) {
                return 1;
            }
        }
        return arg0.field309 < arg1.field309 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1604((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
