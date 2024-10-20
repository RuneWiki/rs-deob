package deob;

import java.util.Comparator;

@ObfuscatedName("r")
public final class class20 implements Comparator {

    @ObfuscatedName("r.h(La;La;I)I")
    public int method170(class17 arg0, class17 arg1) {
        return arg0.field73.field80 < arg1.field73.field80 ? -1 : (arg0.field73.field80 == arg1.field73.field80 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method170((class17) arg0, (class17) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
