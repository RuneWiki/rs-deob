package deob;

import java.util.Comparator;

@ObfuscatedName("hx")
public final class class221 implements Comparator {

    @ObfuscatedName("hx.m(Lht;Lht;I)I")
    public int method3779(class218 arg0, class218 arg1) {
        return arg0.field3199.field3218 < arg1.field3199.field3218 ? -1 : (arg0.field3199.field3218 == arg1.field3199.field3218 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3779((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
