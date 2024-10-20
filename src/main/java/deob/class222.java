package deob;

import java.util.Comparator;

@ObfuscatedName("ho")
public final class class222 implements Comparator {

    @ObfuscatedName("ho.l(Lha;Lha;I)I")
    public int method3874(class218 arg0, class218 arg1) {
        return arg0.field3210 < arg1.field3210 ? -1 : (arg0.field3210 == arg1.field3210 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3874((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
