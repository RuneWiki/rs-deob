package deob;

import java.util.Comparator;

@ObfuscatedName("m")
public final class class20 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class20(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("m.b(Lgy;Lgy;I)I")
    public int method475(class197 arg0, class197 arg1) {
        if (arg0.field2935 == arg1.field2935) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field443 == arg0.field2935) {
                return -1;
            }
            if (client.field443 == arg1.field2935) {
                return 1;
            }
        }
        return arg0.field2935 < arg1.field2935 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method475((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
