package deob;

import java.util.Comparator;

@ObfuscatedName("hr")
public final class class218 implements Comparator {

    @ObfuscatedName("hr.v(Lhu;Lhu;B)I")
    public int method3710(class214 arg0, class214 arg1) {
        return arg0.field3141 < arg1.field3141 ? -1 : (arg0.field3141 == arg1.field3141 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3710((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
