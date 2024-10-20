package deob;

@ObfuscatedName("gj")
public final class class196 {

    @ObfuscatedName("gj.k")
    public int field3085;

    @ObfuscatedName("gj.h")
    public class208[] field3084;

    @ObfuscatedName("gj.o")
    public class208 field3086;

    @ObfuscatedName("gj.z")
    public class208 field3087;

    @ObfuscatedName("gj.c")
    public int field3088 = 0;

    public class196(int arg0) {
        this.field3085 = arg0;
        this.field3084 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3084[var2] = new class208();
            var3.field3110 = var3;
            var3.field3109 = var3;
        }
    }

    @ObfuscatedName("gj.k(J)Lgp;")
    public class208 method3559(long arg0) {
        class208 var3 = this.field3084[(int) (arg0 & (long) (this.field3085 - 1))];
        for (this.field3086 = var3.field3110; this.field3086 != var3; this.field3086 = this.field3086.field3110) {
            if (this.field3086.field3111 == arg0) {
                class208 var4 = this.field3086;
                this.field3086 = this.field3086.field3110;
                return var4;
            }
        }
        this.field3086 = null;
        return null;
    }

    @ObfuscatedName("gj.h(Lgp;J)V")
    public void method3560(class208 arg0, long arg1) {
        if (arg0.field3109 != null) {
            arg0.method3679();
        }
        class208 var4 = this.field3084[(int) (arg1 & (long) (this.field3085 - 1))];
        arg0.field3109 = var4.field3109;
        arg0.field3110 = var4;
        arg0.field3109.field3110 = arg0;
        arg0.field3110.field3109 = arg0;
        arg0.field3111 = arg1;
    }

    @ObfuscatedName("gj.o()V")
    public void method3547() {
        for (int var1 = 0; var1 < this.field3085; var1++) {
            class208 var2 = this.field3084[var1];
            while (true) {
                class208 var3 = var2.field3110;
                if (var2 == var3) {
                    break;
                }
                var3.method3679();
            }
        }
        this.field3086 = null;
        this.field3087 = null;
    }

    @ObfuscatedName("gj.z()Lgp;")
    public class208 method3550() {
        this.field3088 = 0;
        return this.method3551();
    }

    @ObfuscatedName("gj.c()Lgp;")
    public class208 method3551() {
        if (this.field3088 > 0 && this.field3084[this.field3088 - 1] != this.field3087) {
            class208 var1 = this.field3087;
            this.field3087 = var1.field3110;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3088 >= this.field3085) {
                return null;
            }
            var2 = this.field3084[this.field3088++].field3110;
        } while (this.field3084[this.field3088 - 1] == var2);
        this.field3087 = var2.field3110;
        return var2;
    }
}
