package deob;

import java.util.Comparator;

@ObfuscatedName("ap")
public final class class45 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class45(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("ap.x(Lg;Lg;I)I")
    public int method870(class3 arg0, class3 arg1) {
        if (arg0.field17 == arg1.field17) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field562 == arg0.field17) {
                return -1;
            }
            if (client.field562 == arg1.field17) {
                return 1;
            }
        }
        return arg0.field17 < arg1.field17 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method870((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
