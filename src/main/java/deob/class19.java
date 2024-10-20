package deob;

import java.util.Comparator;

@ObfuscatedName("f")
public final class class19 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class19(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("f.x(Lgr;Lgr;I)I")
    public int method473(class195 arg0, class195 arg1) {
        if (arg0.field2908 == arg1.field2908) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field238 == arg0.field2908) {
                return -1;
            }
            if (client.field238 == arg1.field2908) {
                return 1;
            }
        }
        return arg0.field2908 < arg1.field2908 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method473((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
