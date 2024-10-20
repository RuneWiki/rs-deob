package deob;

import java.util.Comparator;

@ObfuscatedName("ph")
public final class class396 implements Comparator {

    @ObfuscatedName("ph.ac(Lpv;Lpv;I)I")
    public int method6915(class399 arg0, class399 arg1) {
        return arg0.field4615 < arg1.field4615 ? -1 : (arg0.field4615 == arg1.field4615 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6915((class399) arg0, (class399) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
