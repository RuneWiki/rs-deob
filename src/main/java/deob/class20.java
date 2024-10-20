package deob;

import java.util.Comparator;

@ObfuscatedName("w")
public final class class20 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class20(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("w.q(Lgd;Lgd;I)I")
    public int method482(class204 arg0, class204 arg1) {
        if (arg0.field2993 == arg1.field2993) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field493 == arg0.field2993) {
                return -1;
            }
            if (client.field493 == arg1.field2993) {
                return 1;
            }
        }
        return arg0.field2993 < arg1.field2993 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method482((class204) arg0, (class204) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
