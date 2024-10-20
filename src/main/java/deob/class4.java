package deob;

import java.util.Comparator;

@ObfuscatedName("h")
public final class class4 implements Comparator {

    @ObfuscatedName("h.f(Lu;Lu;S)I")
    public int method29(class3 arg0, class3 arg1) {
        return arg0.field20.field38 < arg1.field20.field38 ? -1 : (arg0.field20.field38 == arg1.field20.field38 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method29((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
