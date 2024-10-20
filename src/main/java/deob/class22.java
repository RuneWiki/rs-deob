package deob;

import java.util.Comparator;

@ObfuscatedName("g")
public final class class22 implements Comparator {

    @ObfuscatedName("g.h(La;La;I)I")
    public int method191(class17 arg0, class17 arg1) {
        return arg0.field70 < arg1.field70 ? -1 : (arg0.field70 == arg1.field70 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method191((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
