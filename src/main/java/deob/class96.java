package deob;

import java.util.Comparator;

@ObfuscatedName("cj")
public final class class96 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class96(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("cj.a(Lt;Lt;I)I")
    public int method1590(class15 arg0, class15 arg1) {
        if (arg0.field302 == arg1.field302) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field1012 == arg0.field302) {
                return -1;
            }
            if (client.field1012 == arg1.field302) {
                return 1;
            }
        }
        return arg0.field302 < arg1.field302 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1590((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
