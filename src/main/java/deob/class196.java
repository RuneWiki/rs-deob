package deob;

@ObfuscatedName("ga")
public final class class196 {

    @ObfuscatedName("ga.l")
    public int field3081;

    @ObfuscatedName("ga.e")
    public class208[] field3080;

    @ObfuscatedName("ga.q")
    public class208 field3082;

    @ObfuscatedName("ga.o")
    public class208 field3083;

    @ObfuscatedName("ga.g")
    public int field3084 = 0;

    public class196(int arg0) {
        this.field3081 = arg0;
        this.field3080 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3080[var2] = new class208();
            var3.field3106 = var3;
            var3.field3105 = var3;
        }
    }

    @ObfuscatedName("ga.l(J)Lgj;")
    public class208 method3509(long arg0) {
        class208 var3 = this.field3080[(int) (arg0 & (long) (this.field3081 - 1))];
        for (this.field3082 = var3.field3106; this.field3082 != var3; this.field3082 = this.field3082.field3106) {
            if (this.field3082.field3107 == arg0) {
                class208 var4 = this.field3082;
                this.field3082 = this.field3082.field3106;
                return var4;
            }
        }
        this.field3082 = null;
        return null;
    }

    @ObfuscatedName("ga.e(Lgj;J)V")
    public void method3518(class208 arg0, long arg1) {
        if (arg0.field3105 != null) {
            arg0.method3620();
        }
        class208 var4 = this.field3080[(int) (arg1 & (long) (this.field3081 - 1))];
        arg0.field3105 = var4.field3105;
        arg0.field3106 = var4;
        arg0.field3105.field3106 = arg0;
        arg0.field3106.field3105 = arg0;
        arg0.field3107 = arg1;
    }

    @ObfuscatedName("ga.q()V")
    public void method3511() {
        for (int var1 = 0; var1 < this.field3081; var1++) {
            class208 var2 = this.field3080[var1];
            while (true) {
                class208 var3 = var2.field3106;
                if (var2 == var3) {
                    break;
                }
                var3.method3620();
            }
        }
        this.field3082 = null;
        this.field3083 = null;
    }

    @ObfuscatedName("ga.o()Lgj;")
    public class208 method3512() {
        this.field3084 = 0;
        return this.method3513();
    }

    @ObfuscatedName("ga.g()Lgj;")
    public class208 method3513() {
        if (this.field3084 > 0 && this.field3080[this.field3084 - 1] != this.field3083) {
            class208 var1 = this.field3083;
            this.field3083 = var1.field3106;
            return var1;
        }
        class208 var2;
        do {
            if (this.field3084 >= this.field3081) {
                return null;
            }
            var2 = this.field3080[this.field3084++].field3106;
        } while (this.field3080[this.field3084 - 1] == var2);
        this.field3083 = var2.field3106;
        return var2;
    }
}
