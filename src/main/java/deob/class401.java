package deob;

import java.util.Comparator;

@ObfuscatedName("pm")
public final class class401 implements Comparator {

    @ObfuscatedName("pm.ac(Lpv;Lpv;I)I")
    public int method6958(class399 arg0, class399 arg1) {
        return arg0.field4616.field4625 < arg1.field4616.field4625 ? -1 : (arg0.field4616.field4625 == arg1.field4616.field4625 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6958((class399) arg0, (class399) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
