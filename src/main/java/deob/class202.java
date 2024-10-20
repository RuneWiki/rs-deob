package deob;

import java.util.Comparator;

@ObfuscatedName("gp")
public final class class202 implements Comparator {

    @ObfuscatedName("gp.b(Lgy;Lgy;I)I")
    public int method3462(class197 arg0, class197 arg1) {
        return arg0.field2935 < arg1.field2935 ? -1 : (arg0.field2935 == arg1.field2935 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3462((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
