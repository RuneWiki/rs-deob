package deob;

import java.util.Comparator;

@ObfuscatedName("hh")
public final class class222 implements Comparator {

    @ObfuscatedName("hh.m(Lht;Lht;I)I")
    public int method3787(class218 arg0, class218 arg1) {
        return arg0.field3198 < arg1.field3198 ? -1 : (arg0.field3198 == arg1.field3198 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3787((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
