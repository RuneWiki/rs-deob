package deob;

@ObfuscatedName("gz")
public final class class196 {

    @ObfuscatedName("gz.h")
    public int field3079;

    @ObfuscatedName("gz.m")
    public class208[] field3076;

    @ObfuscatedName("gz.i")
    public class208 field3077;

    @ObfuscatedName("gz.q")
    public class208 field3078;

    @ObfuscatedName("gz.p")
    public int field3075 = 0;

    public class196(int arg0) {
        this.field3079 = arg0;
        this.field3076 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3076[var2] = new class208();
            var3.field3101 = var3;
            var3.field3102 = var3;
        }
    }

    @ObfuscatedName("gz.h(J)Lgr;")
    public class208 method3519(long arg0) {
        class208 var3 = this.field3076[(int) (arg0 & (long) (this.field3079 - 1))];
        for (this.field3077 = var3.field3101; this.field3077 != var3; this.field3077 = this.field3077.field3101) {
            if (this.field3077.field3100 == arg0) {
                class208 var4 = this.field3077;
                this.field3077 = this.field3077.field3101;
                return var4;
            }
        }
        this.field3077 = null;
        return null;
    }

    @ObfuscatedName("gz.m(Lgr;J)V")
    public void method3513(class208 arg0, long arg1) {
        if (arg0.field3102 != null) {
            arg0.method3625();
        }
        class208 var4 = this.field3076[(int) (arg1 & (long) (this.field3079 - 1))];
        arg0.field3102 = var4.field3102;
        arg0.field3101 = var4;
        arg0.field3102.field3101 = arg0;
        arg0.field3101.field3102 = arg0;
        arg0.field3100 = arg1;
    }

    @ObfuscatedName("gz.i()V")
    public void method3514() {
        for (int var1 = 0; var1 < this.field3079; var1++) {
            class208 var2 = this.field3076[var1];
            while (true) {
                class208 var3 = var2.field3101;
                if (var2 == var3) {
                    break;
                }
                var3.method3625();
            }
        }
        this.field3077 = null;
        this.field3078 = null;
    }

    @ObfuscatedName("gz.q()Lgr;")
    public class208 method3515() {
        this.field3075 = 0;
        return this.method3516();
    }

    @ObfuscatedName("gz.p()Lgr;")
    public class208 method3516() {
        if (this.field3075 > 0 && this.field3076[this.field3075 - 1] != this.field3078) {
            class208 var1 = this.field3078;
            this.field3078 = var1.field3101;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3075 >= this.field3079) {
                return null;
            }
            var2 = this.field3076[this.field3075++].field3101;
        } while (this.field3076[this.field3075 - 1] == var2);
        this.field3078 = var2.field3101;
        return var2;
    }
}
