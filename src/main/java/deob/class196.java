package deob;

@ObfuscatedName("go")
public final class class196 {

    @ObfuscatedName("go.a")
    public int field3086;

    @ObfuscatedName("go.r")
    public class208[] field3085;

    @ObfuscatedName("go.f")
    public class208 field3087;

    @ObfuscatedName("go.s")
    public class208 field3088;

    @ObfuscatedName("go.y")
    public int field3089 = 0;

    public class196(int arg0) {
        this.field3086 = arg0;
        this.field3085 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3085[var2] = new class208();
            var3.field3111 = var3;
            var3.field3110 = var3;
        }
    }

    @ObfuscatedName("go.a(J)Lgs;")
    public class208 method3539(long arg0) {
        class208 var3 = this.field3085[(int) (arg0 & (long) (this.field3086 - 1))];
        for (this.field3087 = var3.field3111; this.field3087 != var3; this.field3087 = this.field3087.field3111) {
            if (this.field3087.field3112 == arg0) {
                class208 var4 = this.field3087;
                this.field3087 = this.field3087.field3111;
                return var4;
            }
        }
        this.field3087 = null;
        return null;
    }

    @ObfuscatedName("go.r(Lgs;J)V")
    public void method3546(class208 arg0, long arg1) {
        if (arg0.field3110 != null) {
            arg0.method3661();
        }
        class208 var4 = this.field3085[(int) (arg1 & (long) (this.field3086 - 1))];
        arg0.field3110 = var4.field3110;
        arg0.field3111 = var4;
        arg0.field3110.field3111 = arg0;
        arg0.field3111.field3110 = arg0;
        arg0.field3112 = arg1;
    }

    @ObfuscatedName("go.f()V")
    public void method3538() {
        for (int var1 = 0; var1 < this.field3086; var1++) {
            class208 var2 = this.field3085[var1];
            while (true) {
                class208 var3 = var2.field3111;
                if (var2 == var3) {
                    break;
                }
                var3.method3661();
            }
        }
        this.field3087 = null;
        this.field3088 = null;
    }

    @ObfuscatedName("go.s()Lgs;")
    public class208 method3551() {
        this.field3089 = 0;
        return this.method3542();
    }

    @ObfuscatedName("go.y()Lgs;")
    public class208 method3542() {
        if (this.field3089 > 0 && this.field3085[this.field3089 - 1] != this.field3088) {
            class208 var1 = this.field3088;
            this.field3088 = var1.field3111;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3089 >= this.field3086) {
                return null;
            }
            var2 = this.field3085[this.field3089++].field3111;
        } while (this.field3085[this.field3089 - 1] == var2);
        this.field3088 = var2.field3111;
        return var2;
    }
}
