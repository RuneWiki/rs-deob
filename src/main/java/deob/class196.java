package deob;

@ObfuscatedName("go")
public final class class196 {

    @ObfuscatedName("go.z")
    public int field3077;

    @ObfuscatedName("go.q")
    public class208[] field3078;

    @ObfuscatedName("go.k")
    public class208 field3080;

    @ObfuscatedName("go.f")
    public class208 field3079;

    @ObfuscatedName("go.d")
    public int field3076 = 0;

    public class196(int arg0) {
        this.field3077 = arg0;
        this.field3078 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3078[var2] = new class208();
            var3.field3101 = var3;
            var3.field3103 = var3;
        }
    }

    @ObfuscatedName("go.z(J)Lgk;")
    public class208 method3462(long arg0) {
        class208 var3 = this.field3078[(int) (arg0 & (long) (this.field3077 - 1))];
        for (this.field3080 = var3.field3101; this.field3080 != var3; this.field3080 = this.field3080.field3101) {
            if (this.field3080.field3102 == arg0) {
                class208 var4 = this.field3080;
                this.field3080 = this.field3080.field3101;
                return var4;
            }
        }
        this.field3080 = null;
        return null;
    }

    @ObfuscatedName("go.q(Lgk;J)V")
    public void method3470(class208 arg0, long arg1) {
        if (arg0.field3103 != null) {
            arg0.method3583();
        }
        class208 var4 = this.field3078[(int) (arg1 & (long) (this.field3077 - 1))];
        arg0.field3103 = var4.field3103;
        arg0.field3101 = var4;
        arg0.field3103.field3101 = arg0;
        arg0.field3101.field3103 = arg0;
        arg0.field3102 = arg1;
    }

    @ObfuscatedName("go.k()V")
    public void method3476() {
        for (int var1 = 0; var1 < this.field3077; var1++) {
            class208 var2 = this.field3078[var1];
            while (true) {
                class208 var3 = var2.field3101;
                if (var2 == var3) {
                    break;
                }
                var3.method3583();
            }
        }
        this.field3080 = null;
        this.field3079 = null;
    }

    @ObfuscatedName("go.f()Lgk;")
    public class208 method3464() {
        this.field3076 = 0;
        return this.method3465();
    }

    @ObfuscatedName("go.d()Lgk;")
    public class208 method3465() {
        if (this.field3076 > 0 && this.field3078[this.field3076 - 1] != this.field3079) {
            class208 var1 = this.field3079;
            this.field3079 = var1.field3101;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3076 >= this.field3077) {
                return null;
            }
            var2 = this.field3078[this.field3076++].field3101;
        } while (this.field3078[this.field3076 - 1] == var2);
        this.field3079 = var2.field3101;
        return var2;
    }
}
