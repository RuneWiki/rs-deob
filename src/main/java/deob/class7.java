package deob;

import java.util.Comparator;

@ObfuscatedName("j")
public final class class7 implements Comparator {

    @ObfuscatedName("j.p(Lx;Lx;B)I")
    public int method83(class3 arg0, class3 arg1) {
        return arg0.method30().compareTo(arg1.method30());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method83((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
