package deob;

import java.util.Comparator;

@ObfuscatedName("cd")
public final class class96 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class96(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("cd.c(Lt;Lt;B)I")
    public int method1577(class15 arg0, class15 arg1) {
        if (arg0.field279 == arg1.field279) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field915 == arg0.field279) {
                return -1;
            }
            if (client.field915 == arg1.field279) {
                return 1;
            }
        }
        return arg0.field279 < arg1.field279 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method1577((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
