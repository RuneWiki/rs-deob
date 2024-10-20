package deob;

import java.util.Comparator;

@ObfuscatedName("gr")
public final class class201 implements Comparator {

    @ObfuscatedName("gr.p(Lgp;Lgp;I)I")
    public int method3405(class197 arg0, class197 arg1) {
        return arg0.field2939 < arg1.field2939 ? -1 : (arg0.field2939 == arg1.field2939 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3405((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
