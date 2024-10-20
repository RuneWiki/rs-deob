package deob;

import java.util.Comparator;

@ObfuscatedName("hr")
public final class class219 implements Comparator {

    @ObfuscatedName("hr.o(Lhh;Lhh;I)I")
    public int method3682(class214 arg0, class214 arg1) {
        return arg0.field3135 < arg1.field3135 ? -1 : (arg0.field3135 == arg1.field3135 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3682((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
