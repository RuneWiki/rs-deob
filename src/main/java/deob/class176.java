package deob;

import java.util.Iterator;

@ObfuscatedName("fh")
public final class class176 implements Iterable {

    @ObfuscatedName("fh.b")
    public int field2846;

    @ObfuscatedName("fh.u")
    public class184[] field2845;

    @ObfuscatedName("fh.x")
    public class184 field2847;

    public class176(int arg0) {
        this.field2846 = arg0;
        this.field2845 = new class184[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class184 var3 = this.field2845[var2] = new class184();
            var3.field2860 = var3;
            var3.field2862 = var3;
        }
    }

    @ObfuscatedName("fh.b(J)Lge;")
    public class184 method3167(long arg0) {
        class184 var3 = this.field2845[(int) (arg0 & (long) (this.field2846 - 1))];
        for (this.field2847 = var3.field2860; this.field2847 != var3; this.field2847 = this.field2847.field2860) {
            if (this.field2847.field2861 == arg0) {
                class184 var4 = this.field2847;
                this.field2847 = this.field2847.field2860;
                return var4;
            }
        }
        this.field2847 = null;
        return null;
    }

    @ObfuscatedName("fh.u(Lge;J)V")
    public void method3170(class184 arg0, long arg1) {
        if (arg0.field2862 != null) {
            arg0.method3260();
        }
        class184 var4 = this.field2845[(int) (arg1 & (long) (this.field2846 - 1))];
        arg0.field2862 = var4.field2862;
        arg0.field2860 = var4;
        arg0.field2862.field2860 = arg0;
        arg0.field2860.field2862 = arg0;
        arg0.field2861 = arg1;
    }

    @ObfuscatedName("fh.x()V")
    public void method3169() {
        for (int var1 = 0; var1 < this.field2846; var1++) {
            class184 var2 = this.field2845[var1];
            while (true) {
                class184 var3 = var2.field2860;
                if (var2 == var3) {
                    break;
                }
                var3.method3260();
            }
        }
        this.field2847 = null;
    }

    public Iterator iterator() {
        return new class172(this);
    }
}
