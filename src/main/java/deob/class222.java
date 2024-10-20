package deob;

import java.util.Comparator;

@ObfuscatedName("hw")
public final class class222 implements Comparator {

    @ObfuscatedName("hw.f(Lhn;Lhn;B)I")
    public int method3801(class218 arg0, class218 arg1) {
        return arg0.field3193 < arg1.field3193 ? -1 : (arg0.field3193 == arg1.field3193 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3801((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
