package deob;

import java.util.Comparator;

@ObfuscatedName("gu")
public final class class199 implements Comparator {

    @ObfuscatedName("gu.f(Lgg;Lgg;I)I")
    public int method3423(class195 arg0, class195 arg1) {
        return arg0.field2911 < arg1.field2911 ? -1 : (arg0.field2911 == arg1.field2911 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3423((class195) arg0, (class195) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
