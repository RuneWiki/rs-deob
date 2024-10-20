package deob;

import java.util.Iterator;

@ObfuscatedName("gu")
public final class class188 implements Iterable {

    @ObfuscatedName("gu.q")
    public int field2939;

    @ObfuscatedName("gu.s")
    public class198[] field2940;

    @ObfuscatedName("gu.h")
    public class198 field2938;

    public class188(int arg0) {
        this.field2939 = arg0;
        this.field2940 = new class198[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class198 var3 = this.field2940[var2] = new class198();
            var3.field2959 = var3;
            var3.field2957 = var3;
        }
    }

    @ObfuscatedName("gu.q(J)Lgw;")
    public class198 method3297(long arg0) {
        class198 var3 = this.field2940[(int) (arg0 & (long) (this.field2939 - 1))];
        for (this.field2938 = var3.field2959; this.field2938 != var3; this.field2938 = this.field2938.field2959) {
            if (this.field2938.field2958 == arg0) {
                class198 var4 = this.field2938;
                this.field2938 = this.field2938.field2959;
                return var4;
            }
        }
        this.field2938 = null;
        return null;
    }

    @ObfuscatedName("gu.s(Lgw;J)V")
    public void method3291(class198 arg0, long arg1) {
        if (arg0.field2957 != null) {
            arg0.method3404();
        }
        class198 var4 = this.field2940[(int) (arg1 & (long) (this.field2939 - 1))];
        arg0.field2957 = var4.field2957;
        arg0.field2959 = var4;
        arg0.field2957.field2959 = arg0;
        arg0.field2959.field2957 = arg0;
        arg0.field2958 = arg1;
    }

    @ObfuscatedName("gu.h()V")
    public void method3295() {
        for (int var1 = 0; var1 < this.field2939; var1++) {
            class198 var2 = this.field2940[var1];
            while (true) {
                class198 var3 = var2.field2959;
                if (var2 == var3) {
                    break;
                }
                var3.method3404();
            }
        }
        this.field2938 = null;
    }

    public Iterator iterator() {
        return new class184(this);
    }
}
