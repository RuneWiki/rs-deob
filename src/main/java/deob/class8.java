package deob;

import java.util.Comparator;

@ObfuscatedName("n")
public final class class8 implements Comparator {

    @ObfuscatedName("n.f(Lu;Lu;B)I")
    public int method84(class3 arg0, class3 arg1) {
        return arg0.field19 < arg1.field19 ? -1 : (arg0.field19 == arg1.field19 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method84((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
