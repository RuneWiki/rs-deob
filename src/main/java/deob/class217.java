package deob;

import java.util.Comparator;

@ObfuscatedName("hw")
public final class class217 implements Comparator {

    @ObfuscatedName("hw.v(Lhu;Lhu;I)I")
    public int method3702(class214 arg0, class214 arg1) {
        return arg0.field3143.field3162 < arg1.field3143.field3162 ? -1 : (arg0.field3143.field3162 == arg1.field3143.field3162 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3702((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
