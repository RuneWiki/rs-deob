package deob;

import java.util.Comparator;

@ObfuscatedName("hk")
public final class class216 implements Comparator {

    @ObfuscatedName("hk.v(Lhu;Lhu;I)I")
    public int method3691(class214 arg0, class214 arg1) {
        return arg0.field3143.field3164 < arg1.field3143.field3164 ? -1 : (arg0.field3143.field3164 == arg1.field3143.field3164 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3691((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
