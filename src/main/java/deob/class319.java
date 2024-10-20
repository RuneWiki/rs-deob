package deob;

import java.util.Comparator;

@ObfuscatedName("ll")
public final class class319 implements Comparator {

    @ObfuscatedName("ll.s(Llh;Llh;I)I")
    public int method5296(class324 arg0, class324 arg1) {
        return arg0.field4069.field4075 < arg1.field4069.field4075 ? -1 : (arg0.field4069.field4075 == arg1.field4069.field4075 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method5296((class324) arg0, (class324) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
