package deob;

@ObfuscatedName("gy")
public final class class196 {

    @ObfuscatedName("gy.d")
    public int field3082;

    @ObfuscatedName("gy.p")
    public class208[] field3081;

    @ObfuscatedName("gy.v")
    public class208 field3080;

    @ObfuscatedName("gy.l")
    public class208 field3083;

    @ObfuscatedName("gy.y")
    public int field3084 = 0;

    public class196(int arg0) {
        this.field3082 = arg0;
        this.field3081 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3081[var2] = new class208();
            var3.field3105 = var3;
            var3.field3106 = var3;
        }
    }

    @ObfuscatedName("gy.d(J)Lgj;")
    public class208 method3588(long arg0) {
        class208 var3 = this.field3081[(int) (arg0 & (long) (this.field3082 - 1))];
        for (this.field3080 = var3.field3105; this.field3080 != var3; this.field3080 = this.field3080.field3105) {
            if (this.field3080.field3107 == arg0) {
                class208 var4 = this.field3080;
                this.field3080 = this.field3080.field3105;
                return var4;
            }
        }
        this.field3080 = null;
        return null;
    }

    @ObfuscatedName("gy.p(Lgj;J)V")
    public void method3596(class208 arg0, long arg1) {
        if (arg0.field3106 != null) {
            arg0.method3715();
        }
        class208 var4 = this.field3081[(int) (arg1 & (long) (this.field3082 - 1))];
        arg0.field3106 = var4.field3106;
        arg0.field3105 = var4;
        arg0.field3106.field3105 = arg0;
        arg0.field3105.field3106 = arg0;
        arg0.field3107 = arg1;
    }

    @ObfuscatedName("gy.v()V")
    public void method3589() {
        for (int var1 = 0; var1 < this.field3082; var1++) {
            class208 var2 = this.field3081[var1];
            while (true) {
                class208 var3 = var2.field3105;
                if (var2 == var3) {
                    break;
                }
                var3.method3715();
            }
        }
        this.field3080 = null;
        this.field3083 = null;
    }

    @ObfuscatedName("gy.l()Lgj;")
    public class208 method3591() {
        this.field3084 = 0;
        return this.method3592();
    }

    @ObfuscatedName("gy.y()Lgj;")
    public class208 method3592() {
        if (this.field3084 > 0 && this.field3081[this.field3084 - 1] != this.field3083) {
            class208 var1 = this.field3083;
            this.field3083 = var1.field3105;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3084 >= this.field3082) {
                return null;
            }
            var2 = this.field3081[this.field3084++].field3105;
        } while (this.field3081[this.field3084 - 1] == var2);
        this.field3083 = var2.field3105;
        return var2;
    }
}
