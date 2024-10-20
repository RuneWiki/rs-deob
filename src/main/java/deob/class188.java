package deob;

import java.util.Iterator;

@ObfuscatedName("gn")
public final class class188 implements Iterable {

    @ObfuscatedName("gn.e")
    public int field2943;

    @ObfuscatedName("gn.a")
    public class198[] field2944;

    @ObfuscatedName("gn.l")
    public class198 field2945;

    public class188(int arg0) {
        this.field2943 = arg0;
        this.field2944 = new class198[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class198 var3 = this.field2944[var2] = new class198();
            var3.field2962 = var3;
            var3.field2964 = var3;
        }
    }

    @ObfuscatedName("gn.e(J)Lgm;")
    public class198 method3361(long arg0) {
        class198 var3 = this.field2944[(int) (arg0 & (long) (this.field2943 - 1))];
        for (this.field2945 = var3.field2962; this.field2945 != var3; this.field2945 = this.field2945.field2962) {
            if (this.field2945.field2963 == arg0) {
                class198 var4 = this.field2945;
                this.field2945 = this.field2945.field2962;
                return var4;
            }
        }
        this.field2945 = null;
        return null;
    }

    @ObfuscatedName("gn.a(Lgm;J)V")
    public void method3364(class198 arg0, long arg1) {
        if (arg0.field2964 != null) {
            arg0.method3463();
        }
        class198 var4 = this.field2944[(int) (arg1 & (long) (this.field2943 - 1))];
        arg0.field2964 = var4.field2964;
        arg0.field2962 = var4;
        arg0.field2964.field2962 = arg0;
        arg0.field2962.field2964 = arg0;
        arg0.field2963 = arg1;
    }

    @ObfuscatedName("gn.l()V")
    public void method3368() {
        for (int var1 = 0; var1 < this.field2943; var1++) {
            class198 var2 = this.field2944[var1];
            while (true) {
                class198 var3 = var2.field2962;
                if (var2 == var3) {
                    break;
                }
                var3.method3463();
            }
        }
        this.field2945 = null;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
