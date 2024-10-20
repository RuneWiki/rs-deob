package deob;

import java.util.Comparator;

@ObfuscatedName("ac")
public final class class45 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class45(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("ac.s(Lf;Lf;B)I")
    public int method762(class3 arg0, class3 arg1) {
        if (arg0.field33 == arg1.field33) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field512 == arg0.field33) {
                return -1;
            }
            if (client.field512 == arg1.field33) {
                return 1;
            }
        }
        return arg0.field33 < arg1.field33 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method762((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
