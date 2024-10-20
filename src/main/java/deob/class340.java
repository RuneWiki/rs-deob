package deob;

import java.util.Comparator;

@ObfuscatedName("mw")
public final class class340 implements Comparator {

    @ObfuscatedName("mw.f(Lmv;Lmv;I)I")
    public int method6092(class345 arg0, class345 arg1) {
        return arg0.field4290.field4294 < arg1.field4290.field4294 ? -1 : (arg0.field4290.field4294 == arg1.field4290.field4294 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method6092((class345) arg0, (class345) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
