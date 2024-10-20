package deob;

@ObfuscatedName("gv")
public final class class196 {

    @ObfuscatedName("gv.o")
    public int field3088;

    @ObfuscatedName("gv.e")
    public class208[] field3087;

    @ObfuscatedName("gv.u")
    public class208 field3086;

    @ObfuscatedName("gv.b")
    public class208 field3089;

    @ObfuscatedName("gv.p")
    public int field3090 = 0;

    public class196(int arg0) {
        this.field3088 = arg0;
        this.field3087 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3087[var2] = new class208();
            var3.field3112 = var3;
            var3.field3111 = var3;
        }
    }

    @ObfuscatedName("gv.o(J)Lgn;")
    public class208 method3545(long arg0) {
        class208 var3 = this.field3087[(int) (arg0 & (long) (this.field3088 - 1))];
        for (this.field3086 = var3.field3112; this.field3086 != var3; this.field3086 = this.field3086.field3112) {
            if (this.field3086.field3113 == arg0) {
                class208 var4 = this.field3086;
                this.field3086 = this.field3086.field3112;
                return var4;
            }
        }
        this.field3086 = null;
        return null;
    }

    @ObfuscatedName("gv.e(Lgn;J)V")
    public void method3544(class208 arg0, long arg1) {
        if (arg0.field3111 != null) {
            arg0.method3670();
        }
        class208 var4 = this.field3087[(int) (arg1 & (long) (this.field3088 - 1))];
        arg0.field3111 = var4.field3111;
        arg0.field3112 = var4;
        arg0.field3111.field3112 = arg0;
        arg0.field3112.field3111 = arg0;
        arg0.field3113 = arg1;
    }

    @ObfuscatedName("gv.u()V")
    public void method3552() {
        for (int var1 = 0; var1 < this.field3088; var1++) {
            class208 var2 = this.field3087[var1];
            while (true) {
                class208 var3 = var2.field3112;
                if (var2 == var3) {
                    break;
                }
                var3.method3670();
            }
        }
        this.field3086 = null;
        this.field3089 = null;
    }

    @ObfuscatedName("gv.b()Lgn;")
    public class208 method3548() {
        this.field3090 = 0;
        return this.method3546();
    }

    @ObfuscatedName("gv.p()Lgn;")
    public class208 method3546() {
        if (this.field3090 > 0 && this.field3087[this.field3090 - 1] != this.field3089) {
            class208 var1 = this.field3089;
            this.field3089 = var1.field3112;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3090 >= this.field3088) {
                return null;
            }
            var2 = this.field3087[this.field3090++].field3112;
        } while (this.field3087[this.field3090 - 1] == var2);
        this.field3089 = var2.field3112;
        return var2;
    }
}
