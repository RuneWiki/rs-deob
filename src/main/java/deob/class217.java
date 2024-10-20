package deob;

import java.util.Comparator;

@ObfuscatedName("hw")
public final class class217 implements Comparator {

    @ObfuscatedName("hw.n(Lhn;Lhn;I)I")
    public int method3704(class214 arg0, class214 arg1) {
        return arg0.field3132.field3147 < arg1.field3132.field3147 ? -1 : (arg0.field3132.field3147 == arg1.field3132.field3147 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3704((class214) arg0, (class214) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
