package deob;

import java.util.Iterator;

@ObfuscatedName("gf")
public final class class198 implements Iterable {

    @ObfuscatedName("gf.j")
    public int field3085;

    @ObfuscatedName("gf.m")
    public class208[] field3084;

    @ObfuscatedName("gf.f")
    public class208 field3086;

    public class198(int arg0) {
        this.field3085 = arg0;
        this.field3084 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3084[var2] = new class208();
            var3.field3103 = var3;
            var3.field3104 = var3;
        }
    }

    @ObfuscatedName("gf.j(J)Lgt;")
    public class208 method3586(long arg0) {
        class208 var3 = this.field3084[(int) (arg0 & (long) (this.field3085 - 1))];
        for (this.field3086 = var3.field3103; this.field3086 != var3; this.field3086 = this.field3086.field3103) {
            if (this.field3086.field3105 == arg0) {
                class208 var4 = this.field3086;
                this.field3086 = this.field3086.field3103;
                return var4;
            }
        }
        this.field3086 = null;
        return null;
    }

    @ObfuscatedName("gf.m(Lgt;J)V")
    public void method3585(class208 arg0, long arg1) {
        if (arg0.field3104 != null) {
            arg0.method3700();
        }
        class208 var4 = this.field3084[(int) (arg1 & (long) (this.field3085 - 1))];
        arg0.field3104 = var4.field3104;
        arg0.field3103 = var4;
        arg0.field3104.field3103 = arg0;
        arg0.field3103.field3104 = arg0;
        arg0.field3105 = arg1;
    }

    @ObfuscatedName("gf.f()V")
    public void method3588() {
        for (int var1 = 0; var1 < this.field3085; var1++) {
            class208 var2 = this.field3084[var1];
            while (true) {
                class208 var3 = var2.field3103;
                if (var2 == var3) {
                    break;
                }
                var3.method3700();
            }
        }
        this.field3086 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
