package deob;

@ObfuscatedName("gd")
public final class class196 {

    @ObfuscatedName("gd.j")
    public int field3086;

    @ObfuscatedName("gd.l")
    public class208[] field3087;

    @ObfuscatedName("gd.a")
    public class208 field3090;

    @ObfuscatedName("gd.i")
    public class208 field3089;

    @ObfuscatedName("gd.f")
    public int field3088 = 0;

    public class196(int arg0) {
        this.field3086 = arg0;
        this.field3087 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3087[var2] = new class208();
            var3.field3112 = var3;
            var3.field3111 = var3;
        }
    }

    @ObfuscatedName("gd.j(J)Lgu;")
    public class208 method3499(long arg0) {
        class208 var3 = this.field3087[(int) (arg0 & (long) (this.field3086 - 1))];
        for (this.field3090 = var3.field3112; this.field3090 != var3; this.field3090 = this.field3090.field3112) {
            if (this.field3090.field3113 == arg0) {
                class208 var4 = this.field3090;
                this.field3090 = this.field3090.field3112;
                return var4;
            }
        }
        this.field3090 = null;
        return null;
    }

    @ObfuscatedName("gd.l(Lgu;J)V")
    public void method3501(class208 arg0, long arg1) {
        if (arg0.field3111 != null) {
            arg0.method3608();
        }
        class208 var4 = this.field3087[(int) (arg1 & (long) (this.field3086 - 1))];
        arg0.field3111 = var4.field3111;
        arg0.field3112 = var4;
        arg0.field3111.field3112 = arg0;
        arg0.field3112.field3111 = arg0;
        arg0.field3113 = arg1;
    }

    @ObfuscatedName("gd.a()V")
    public void method3498() {
        for (int var1 = 0; var1 < this.field3086; var1++) {
            class208 var2 = this.field3087[var1];
            while (true) {
                class208 var3 = var2.field3112;
                if (var2 == var3) {
                    break;
                }
                var3.method3608();
            }
        }
        this.field3090 = null;
        this.field3089 = null;
    }

    @ObfuscatedName("gd.i()Lgu;")
    public class208 method3503() {
        this.field3088 = 0;
        return this.method3502();
    }

    @ObfuscatedName("gd.f()Lgu;")
    public class208 method3502() {
        if (this.field3088 > 0 && this.field3087[this.field3088 - 1] != this.field3089) {
            class208 var1 = this.field3089;
            this.field3089 = var1.field3112;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3088 >= this.field3086) {
                return null;
            }
            var2 = this.field3087[this.field3088++].field3112;
        } while (this.field3087[this.field3088 - 1] == var2);
        this.field3089 = var2.field3112;
        return var2;
    }
}
