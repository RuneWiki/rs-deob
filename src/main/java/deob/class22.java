package deob;

import java.util.Comparator;

@ObfuscatedName("t")
public final class class22 implements Comparator {

    // $FF: synthetic field
    public final boolean val$preferOwnWorld;

    public class22(boolean arg0) {
        this.val$preferOwnWorld = arg0;
    }

    @ObfuscatedName("t.h(Lhh;Lhh;B)I")
    public int method559(class214 arg0, class214 arg1) {
        if (arg0.field3129 == arg1.field3129) {
            return 0;
        }
        if (this.val$preferOwnWorld) {
            if (client.field296 == arg0.field3129) {
                return -1;
            }
            if (client.field296 == arg1.field3129) {
                return 1;
            }
        }
        return arg0.field3129 < arg1.field3129 ? -1 : 1;
    }

    public int compare(Object arg0, Object arg1) {
        return this.method559((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
