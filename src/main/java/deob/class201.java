package deob;

import java.util.Comparator;

@ObfuscatedName("gl")
public final class class201 implements Comparator {

    @ObfuscatedName("gl.a(Lgr;Lgr;B)I")
    public int method3406(class197 arg0, class197 arg1) {
        return arg0.field2937 < arg1.field2937 ? -1 : (arg0.field2937 == arg1.field2937 ? 0 : 1);
    }

    public int compare(Object arg0, Object arg1) {
        return this.method3406((class197) arg0, (class197) arg1);
    }

    public boolean equals(Object arg0) {
        return super.equals(arg0);
    }
}
