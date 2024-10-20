package deob;

@ObfuscatedName("gt")
public final class class184 {

    @ObfuscatedName("gt.b")
    public class195 field2973 = new class195();

    @ObfuscatedName("gt.e")
    public int field2970;

    @ObfuscatedName("gt.a")
    public int field2971;

    @ObfuscatedName("gt.k")
    public class187 field2969;

    @ObfuscatedName("gt.p")
    public class194 field2972 = new class194();

    public class184(int arg0) {
        this.field2970 = arg0;
        this.field2971 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2969 = new class187(var2);
    }

    @ObfuscatedName("gt.b(J)Lgr;")
    public class195 method3254(long arg0) {
        class195 var3 = (class195) this.field2969.method3297(arg0);
        if (var3 != null) {
            this.field2972.method3377(var3);
        }
        return var3;
    }

    @ObfuscatedName("gt.e(J)V")
    public void method3255(long arg0) {
        class195 var3 = (class195) this.field2969.method3297(arg0);
        if (var3 != null) {
            var3.method3414();
            var3.method3396();
            this.field2971++;
        }
    }

    @ObfuscatedName("gt.a(Lgr;J)V")
    public void method3256(class195 arg0, long arg1) {
        if (this.field2971 == 0) {
            class195 var4 = this.field2972.method3388();
            var4.method3414();
            var4.method3396();
            if (this.field2973 == var4) {
                class195 var5 = this.field2972.method3388();
                var5.method3414();
                var5.method3396();
            }
        } else {
            this.field2971--;
        }
        this.field2969.method3288(arg0, arg1);
        this.field2972.method3377(arg0);
    }

    @ObfuscatedName("gt.k()V")
    public void method3258() {
        this.field2972.method3379();
        this.field2969.method3289();
        this.field2973 = new class195();
        this.field2971 = this.field2970;
    }
}
