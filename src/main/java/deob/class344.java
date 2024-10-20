package deob;

import java.util.Comparator;

@ObfuscatedName("ml")
public final class class344 implements Comparator {

    @ObfuscatedName("ml.f(Lmv;Lmv;I)I")
    public int method6129(class345 arg0, class345 arg1) {
        return arg0.field4289 < arg1.field4289 ? -1 : (arg0.field4289 == arg1.field4289 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6129((class345) arg0, (class345) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
