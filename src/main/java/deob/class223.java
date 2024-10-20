package deob;

import java.util.Comparator;

@ObfuscatedName("hn")
public final class class223 implements Comparator {

    @ObfuscatedName("hn.m(Lht;Lht;B)I")
    public int method3798(class218 arg0, class218 arg1) {
        return arg0.field3202 < arg1.field3202 ? -1 : (arg0.field3202 == arg1.field3202 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3798((class218) arg0, (class218) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
