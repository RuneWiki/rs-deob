package deob;

import java.util.Comparator;

@ObfuscatedName("p")
public final class class20 implements Comparator {

    @ObfuscatedName("p.b(Lj;Lj;I)I")
    public int method131(class15 arg0, class15 arg1) {
        return arg0.field271 < arg1.field271 ? -1 : (arg0.field271 == arg1.field271 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method131((class15) arg0, (class15) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
