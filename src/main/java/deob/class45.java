package deob;

import java.util.Comparator;

@ObfuscatedName("at")
public final class class45 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class45(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("at.i(Lf;Lf;B)I")
    public int method766(class3 arg0, class3 arg1) {
        if (arg0.field24 == arg1.field24) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field500 == arg0.field24) {
                return -1;
            }
            if (client.field500 == arg1.field24) {
                return 1;
            }
        }
        return arg0.field24 < arg1.field24 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method766((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
