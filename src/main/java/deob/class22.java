package deob;

import java.util.Comparator;

@ObfuscatedName("q")
public final class class22 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class22(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("q.m(Lhv;Lhv;I)I")
    public int method596(class214 arg0, class214 arg1) {
        if (arg0.field3126 == arg1.field3126) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field260 == arg0.field3126) {
                return -1;
            }
            if (client.field260 == arg1.field3126) {
                return 1;
            }
        }
        return arg0.field3126 < arg1.field3126 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method596((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
