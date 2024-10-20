package deob;

import java.util.Comparator;

@ObfuscatedName("v")
public final class class22 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class22(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("v.y(Lhr;Lhr;I)I")
    public int method562(class214 arg0, class214 arg1) {
        if (arg0.field3124 == arg1.field3124) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field293 == arg0.field3124) {
                return -1;
            }
            if (client.field293 == arg1.field3124) {
                return 1;
            }
        }
        return arg0.field3124 < arg1.field3124 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method562((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
