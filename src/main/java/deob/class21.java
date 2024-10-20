package deob;

import java.util.Comparator;

@ObfuscatedName("b")
public final class class21 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class21(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("b.e(Lgv;Lgv;B)I")
    public int method514(class204 arg0, class204 arg1) {
        if (arg0.field2998 == arg1.field2998) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field244 == arg0.field2998) {
                return -1;
            }
            if (client.field244 == arg1.field2998) {
                return 1;
            }
        }
        return arg0.field2998 < arg1.field2998 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method514((class204) arg0, (class204) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
