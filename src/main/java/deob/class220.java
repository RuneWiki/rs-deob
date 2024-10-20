package deob;

import java.util.Comparator;

@ObfuscatedName("hc")
public final class class220 implements Comparator {

    @ObfuscatedName("hc.i(Lhl;Lhl;B)I")
    public int method3742(class218 arg0, class218 arg1) {
        return arg0.field3206.field3225 < arg1.field3206.field3225 ? -1 : (arg0.field3206.field3225 == arg1.field3206.field3225 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3742((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
