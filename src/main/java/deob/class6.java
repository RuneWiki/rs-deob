package deob;

import java.util.Comparator;

@ObfuscatedName("o")
public final class class6 implements Comparator {

    @ObfuscatedName("o.f(Lu;Lu;I)I")
    public int method68(class3 arg0, class3 arg1) {
        return arg0.field20.field36 < arg1.field20.field36 ? -1 : (arg0.field20.field36 == arg1.field20.field36 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method68((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
