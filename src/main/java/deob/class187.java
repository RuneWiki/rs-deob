package deob;

@ObfuscatedName("gj")
public final class class187 {

    @ObfuscatedName("gj.n")
    public int field2982;

    @ObfuscatedName("gj.d")
    public class199[] field2985;

    @ObfuscatedName("gj.z")
    public class199 field2984;

    @ObfuscatedName("gj.y")
    public class199 field2983;

    @ObfuscatedName("gj.e")
    public int field2986 = 0;

    public class187(int arg0) {
        this.field2982 = arg0;
        this.field2985 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2985[var2] = new class199();
            var3.field3008 = var3;
            var3.field3009 = var3;
        }
    }

    @ObfuscatedName("gj.n(J)Lga;")
    public class199 method3445(long arg0) {
        class199 var3 = this.field2985[(int) (arg0 & (long) (this.field2982 - 1))];
        for (this.field2984 = var3.field3008; this.field2984 != var3; this.field2984 = this.field2984.field3008) {
            if (this.field2984.field3007 == arg0) {
                class199 var4 = this.field2984;
                this.field2984 = this.field2984.field3008;
                return var4;
            }
        }
        this.field2984 = null;
        return null;
    }

    @ObfuscatedName("gj.d(Lga;J)V")
    public void method3446(class199 arg0, long arg1) {
        if (arg0.field3009 != null) {
            arg0.method3562();
        }
        class199 var4 = this.field2985[(int) (arg1 & (long) (this.field2982 - 1))];
        arg0.field3009 = var4.field3009;
        arg0.field3008 = var4;
        arg0.field3009.field3008 = arg0;
        arg0.field3008.field3009 = arg0;
        arg0.field3007 = arg1;
    }

    @ObfuscatedName("gj.z()V")
    public void method3447() {
        for (int var1 = 0; var1 < this.field2982; var1++) {
            class199 var2 = this.field2985[var1];
            while (true) {
                class199 var3 = var2.field3008;
                if (var2 == var3) {
                    break;
                }
                var3.method3562();
            }
        }
        this.field2984 = null;
        this.field2983 = null;
    }

    @ObfuscatedName("gj.y()Lga;")
    public class199 method3448() {
        this.field2986 = 0;
        return this.method3449();
    }

    @ObfuscatedName("gj.e()Lga;")
    public class199 method3449() {
        if (this.field2986 > 0 && this.field2985[this.field2986 - 1] != this.field2983) {
            class199 var1 = this.field2983;
            this.field2983 = var1.field3008;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2986 >= this.field2982) {
                return null;
            }
            var2 = this.field2985[this.field2986++].field3008;
        } while (this.field2985[this.field2986 - 1] == var2);
        this.field2983 = var2.field3008;
        return var2;
    }
}
