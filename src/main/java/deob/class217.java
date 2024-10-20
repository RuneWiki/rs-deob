package deob;

import java.util.Comparator;

@ObfuscatedName("hy")
public final class class217 implements Comparator {

    @ObfuscatedName("hy.m(Lhv;Lhv;S)I")
    public int method3757(class214 arg0, class214 arg1) {
        return arg0.field3122.field3149 < arg1.field3122.field3149 ? -1 : (arg0.field3122.field3149 == arg1.field3122.field3149 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3757((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
