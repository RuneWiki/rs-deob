package deob;

import java.util.Comparator;

@ObfuscatedName("kk")
public final class class293 implements Comparator {

    @ObfuscatedName("kk.l(Lkd;Lkd;B)I")
    public int method4875(class298 arg0, class298 arg1) {
        return arg0.field3758.field3763 < arg1.field3758.field3763 ? -1 : (arg0.field3758.field3763 == arg1.field3758.field3763 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method4875((class298) arg0, (class298) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
