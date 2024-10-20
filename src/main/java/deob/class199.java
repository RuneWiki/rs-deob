package deob;

import java.util.Comparator;

@ObfuscatedName("gu")
public final class class199 implements Comparator {

    @ObfuscatedName("gu.a(Lgr;Lgr;I)I")
    public int method3386(class197 arg0, class197 arg1) {
        return arg0.field2938.field2962 < arg1.field2938.field2962 ? -1 : (arg0.field2938.field2962 == arg1.field2938.field2962 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3386((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
