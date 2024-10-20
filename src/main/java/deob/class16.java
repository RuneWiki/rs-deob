package deob;

import java.util.Comparator;

@ObfuscatedName("r")
public final class class16 implements Comparator {

    @ObfuscatedName("r.n(Ly;Ly;I)I")
    public int method95(class15 arg0, class15 arg1) {
        return arg0.field289.field310 < arg1.field289.field310 ? -1 : (arg0.field289.field310 == arg1.field289.field310 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method95((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
