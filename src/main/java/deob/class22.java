package deob;

import java.util.Comparator;

@ObfuscatedName("h")
public final class class22 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class22(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("h.l(Lhk;Lhk;I)I")
    public int method573(class214 arg0, class214 arg1) {
        if (arg0.field3137 == arg1.field3137) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field544 == arg0.field3137) {
                return -1;
            }
            if (client.field544 == arg1.field3137) {
                return 1;
            }
        }
        return arg0.field3137 < arg1.field3137 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method573((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
