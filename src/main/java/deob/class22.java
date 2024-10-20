package deob;

import java.util.Comparator;

@ObfuscatedName("q")
public final class class22 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class22(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("q.b(Lhn;Lhn;I)I")
    public int method553(class215 arg0, class215 arg1) {
        if (arg0.field3148 == arg1.field3148) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field287 == arg0.field3148) {
                return -1;
            }
            if (client.field287 == arg1.field3148) {
                return 1;
            }
        }
        return arg0.field3148 < arg1.field3148 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method553((class215) arg0, (class215) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
