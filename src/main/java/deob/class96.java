package deob;

import java.util.Comparator;

@ObfuscatedName("cm")
public final class class96 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class96(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("cm.n(Ly;Ly;I)I")
    public int method1615(class15 arg0, class15 arg1) {
        if (arg0.field293 == arg1.field293) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field914 == arg0.field293) {
                return -1;
            }
            if (client.field914 == arg1.field293) {
                return 1;
            }
        }
        return arg0.field293 < arg1.field293 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1615((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
