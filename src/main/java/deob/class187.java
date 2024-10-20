package deob;

@ObfuscatedName("gn")
public final class class187 {

    @ObfuscatedName("gn.n")
    public int field2993;

    @ObfuscatedName("gn.g")
    public class199[] field2995;

    @ObfuscatedName("gn.a")
    public class199 field2994;

    @ObfuscatedName("gn.m")
    public class199 field2992;

    @ObfuscatedName("gn.s")
    public int field2996 = 0;

    public class187(int arg0) {
        this.field2993 = arg0;
        this.field2995 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2995[var2] = new class199();
            var3.field3017 = var3;
            var3.field3019 = var3;
        }
    }

    @ObfuscatedName("gn.n(J)Lgg;")
    public class199 method3425(long arg0) {
        class199 var3 = this.field2995[(int) (arg0 & (long) (this.field2993 - 1))];
        for (this.field2994 = var3.field3017; this.field2994 != var3; this.field2994 = this.field2994.field3017) {
            if (this.field2994.field3018 == arg0) {
                class199 var4 = this.field2994;
                this.field2994 = this.field2994.field3017;
                return var4;
            }
        }
        this.field2994 = null;
        return null;
    }

    @ObfuscatedName("gn.g(Lgg;J)V")
    public void method3426(class199 arg0, long arg1) {
        if (arg0.field3019 != null) {
            arg0.method3554();
        }
        class199 var4 = this.field2995[(int) (arg1 & (long) (this.field2993 - 1))];
        arg0.field3019 = var4.field3019;
        arg0.field3017 = var4;
        arg0.field3019.field3017 = arg0;
        arg0.field3017.field3019 = arg0;
        arg0.field3018 = arg1;
    }

    @ObfuscatedName("gn.a()V")
    public void method3430() {
        for (int var1 = 0; var1 < this.field2993; var1++) {
            class199 var2 = this.field2995[var1];
            while (true) {
                class199 var3 = var2.field3017;
                if (var2 == var3) {
                    break;
                }
                var3.method3554();
            }
        }
        this.field2994 = null;
        this.field2992 = null;
    }

    @ObfuscatedName("gn.m()Lgg;")
    public class199 method3428() {
        this.field2996 = 0;
        return this.method3432();
    }

    @ObfuscatedName("gn.s()Lgg;")
    public class199 method3432() {
        if (this.field2996 > 0 && this.field2995[this.field2996 - 1] != this.field2992) {
            class199 var1 = this.field2992;
            this.field2992 = var1.field3017;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2996 >= this.field2993) {
                return null;
            }
            var2 = this.field2995[this.field2996++].field3017;
        } while (this.field2995[this.field2996 - 1] == var2);
        this.field2992 = var2.field3017;
        return var2;
    }
}
