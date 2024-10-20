package deob;

import java.util.Comparator;

@ObfuscatedName("k")
public final class class23 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class23(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("k.e(Lht;Lht;B)I")
    public int method548(class218 arg0, class218 arg1) {
        if (arg0.field3198 == arg1.field3198) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field469 == arg0.field3198) {
                return -1;
            }
            if (client.field469 == arg1.field3198) {
                return 1;
            }
        }
        return arg0.field3198 < arg1.field3198 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method548((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
