package deob;

@ObfuscatedName("gb")
public final class class196 {

    @ObfuscatedName("gb.n")
    public int field3085;

    @ObfuscatedName("gb.q")
    public class208[] field3086;

    @ObfuscatedName("gb.c")
    public class208 field3087;

    @ObfuscatedName("gb.l")
    public class208 field3088;

    @ObfuscatedName("gb.r")
    public int field3089 = 0;

    public class196(int arg0) {
        this.field3085 = arg0;
        this.field3086 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3086[var2] = new class208();
            var3.field3110 = var3;
            var3.field3111 = var3;
        }
    }

    @ObfuscatedName("gb.n(J)Lga;")
    public class208 method3518(long arg0) {
        class208 var3 = this.field3086[(int) (arg0 & (long) (this.field3085 - 1))];
        for (this.field3087 = var3.field3110; this.field3087 != var3; this.field3087 = this.field3087.field3110) {
            if (this.field3087.field3112 == arg0) {
                class208 var4 = this.field3087;
                this.field3087 = this.field3087.field3110;
                return var4;
            }
        }
        this.field3087 = null;
        return null;
    }

    @ObfuscatedName("gb.q(Lga;J)V")
    public void method3524(class208 arg0, long arg1) {
        if (arg0.field3111 != null) {
            arg0.method3651();
        }
        class208 var4 = this.field3086[(int) (arg1 & (long) (this.field3085 - 1))];
        arg0.field3111 = var4.field3111;
        arg0.field3110 = var4;
        arg0.field3111.field3110 = arg0;
        arg0.field3110.field3111 = arg0;
        arg0.field3112 = arg1;
    }

    @ObfuscatedName("gb.c()V")
    public void method3519() {
        for (int var1 = 0; var1 < this.field3085; var1++) {
            class208 var2 = this.field3086[var1];
            while (true) {
                class208 var3 = var2.field3110;
                if (var2 == var3) {
                    break;
                }
                var3.method3651();
            }
        }
        this.field3087 = null;
        this.field3088 = null;
    }

    @ObfuscatedName("gb.l()Lga;")
    public class208 method3517() {
        this.field3089 = 0;
        return this.method3520();
    }

    @ObfuscatedName("gb.r()Lga;")
    public class208 method3520() {
        if (this.field3089 > 0 && this.field3086[this.field3089 - 1] != this.field3088) {
            class208 var1 = this.field3088;
            this.field3088 = var1.field3110;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3089 >= this.field3085) {
                return null;
            }
            var2 = this.field3086[this.field3089++].field3110;
        } while (this.field3086[this.field3089 - 1] == var2);
        this.field3088 = var2.field3110;
        return var2;
    }
}
