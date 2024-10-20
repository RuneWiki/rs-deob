package deob;

import java.util.Comparator;

@ObfuscatedName("f")
public final class class8 implements Comparator {

    @ObfuscatedName("f.b(Li;Li;I)I")
    public int method108(class3 arg0, class3 arg1) {
        return arg0.field28 < arg1.field28 ? -1 : (arg0.field28 == arg1.field28 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method108((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
