package deob;

import java.util.Comparator;

@ObfuscatedName("cj")
public final class class96 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class96(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("cj.i(Lo;Lo;I)I")
    public int method1650(class15 arg0, class15 arg1) {
        if (arg0.field286 == arg1.field286) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field1079 == arg0.field286) {
                return -1;
            }
            if (client.field1079 == arg1.field286) {
                return 1;
            }
        }
        return arg0.field286 < arg1.field286 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1650((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
