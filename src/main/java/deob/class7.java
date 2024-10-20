package deob;

import java.util.Comparator;

@ObfuscatedName("h")
public final class class7 implements Comparator {

    @ObfuscatedName("h.w(Lq;Lq;B)I")
    public int method71(class3 arg0, class3 arg1) {
        return arg0.method17().compareTo(arg1.method17());
    }

    public int compare(Object arg0, Object arg1) {
        return this.method71((class3) arg0, (class3) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
