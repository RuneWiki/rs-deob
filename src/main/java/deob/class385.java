package deob;

import java.util.Comparator;

@ObfuscatedName("ok")
public final class class385 implements Comparator {

    @ObfuscatedName("ok.aq(Loj;Loj;B)I")
    public int method6584(class386 arg0, class386 arg1) {
        return arg0.field4453 < arg1.field4453 ? -1 : (arg0.field4453 == arg1.field4453 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6584((class386) arg0, (class386) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
