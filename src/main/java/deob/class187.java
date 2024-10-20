package deob;

@ObfuscatedName("ge")
public final class class187 {

    @ObfuscatedName("ge.b")
    public int field2984;

    @ObfuscatedName("ge.e")
    public class199[] field2981;

    @ObfuscatedName("ge.a")
    public class199 field2982;

    @ObfuscatedName("ge.k")
    public class199 field2980;

    @ObfuscatedName("ge.p")
    public int field2983 = 0;

    public class187(int arg0) {
        this.field2984 = arg0;
        this.field2981 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2981[var2] = new class199();
            var3.field3005 = var3;
            var3.field3007 = var3;
        }
    }

    @ObfuscatedName("ge.b(J)Lgv;")
    public class199 method3297(long arg0) {
        class199 var3 = this.field2981[(int) (arg0 & (long) (this.field2984 - 1))];
        for (this.field2982 = var3.field3005; this.field2982 != var3; this.field2982 = this.field2982.field3005) {
            if (this.field2982.field3006 == arg0) {
                class199 var4 = this.field2982;
                this.field2982 = this.field2982.field3005;
                return var4;
            }
        }
        this.field2982 = null;
        return null;
    }

    @ObfuscatedName("ge.e(Lgv;J)V")
    public void method3288(class199 arg0, long arg1) {
        if (arg0.field3007 != null) {
            arg0.method3414();
        }
        class199 var4 = this.field2981[(int) (arg1 & (long) (this.field2984 - 1))];
        arg0.field3007 = var4.field3007;
        arg0.field3005 = var4;
        arg0.field3007.field3005 = arg0;
        arg0.field3005.field3007 = arg0;
        arg0.field3006 = arg1;
    }

    @ObfuscatedName("ge.a()V")
    public void method3289() {
        for (int var1 = 0; var1 < this.field2984; var1++) {
            class199 var2 = this.field2981[var1];
            while (true) {
                class199 var3 = var2.field3005;
                if (var2 == var3) {
                    break;
                }
                var3.method3414();
            }
        }
        this.field2982 = null;
        this.field2980 = null;
    }

    @ObfuscatedName("ge.k()Lgv;")
    public class199 method3286() {
        this.field2983 = 0;
        return this.method3291();
    }

    @ObfuscatedName("ge.p()Lgv;")
    public class199 method3291() {
        if (this.field2983 > 0 && this.field2981[this.field2983 - 1] != this.field2980) {
            class199 var1 = this.field2980;
            this.field2980 = var1.field3005;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2983 >= this.field2984) {
                return null;
            }
            var2 = this.field2981[this.field2983++].field3005;
        } while (this.field2981[this.field2983 - 1] == var2);
        this.field2980 = var2.field3005;
        return var2;
    }
}
