package deob;

import java.util.Comparator;

@ObfuscatedName("gr")
public final class class202 implements Comparator {

    @ObfuscatedName("gr.v(Lgj;Lgj;I)I")
    public int method3453(class197 arg0, class197 arg1) {
        return arg0.field2941 < arg1.field2941 ? -1 : (arg0.field2941 == arg1.field2941 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3453((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
