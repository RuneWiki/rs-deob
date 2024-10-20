package deob;

@ObfuscatedName("fx")
public final class class170 {

    @ObfuscatedName("fx.y")
    public class180 field2799 = new class180();

    @ObfuscatedName("fx.u")
    public int field2798;

    @ObfuscatedName("fx.k")
    public int field2797;

    @ObfuscatedName("fx.v")
    public class173 field2800;

    @ObfuscatedName("fx.l")
    public class179 field2801 = new class179();

    public class170(int arg0) {
        this.field2798 = arg0;
        this.field2797 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2800 = new class173(var2);
    }

    @ObfuscatedName("fx.y(J)Lft;")
    public class180 method3145(long arg0) {
        class180 var3 = (class180) this.field2800.method3171(arg0);
        if (var3 != null) {
            this.field2801.method3248(var3);
        }
        return var3;
    }

    @ObfuscatedName("fx.u(J)V")
    public void method3139(long arg0) {
        class180 var3 = (class180) this.field2800.method3171(arg0);
        if (var3 != null) {
            var3.method3268();
            var3.method3260();
            this.field2797++;
        }
    }

    @ObfuscatedName("fx.k(Lft;J)V")
    public void method3147(class180 arg0, long arg1) {
        if (this.field2797 == 0) {
            class180 var4 = this.field2801.method3250();
            var4.method3268();
            var4.method3260();
            if (this.field2799 == var4) {
                class180 var5 = this.field2801.method3250();
                var5.method3268();
                var5.method3260();
            }
        } else {
            this.field2797--;
        }
        this.field2800.method3172(arg0, arg1);
        this.field2801.method3248(arg0);
    }

    @ObfuscatedName("fx.v()V")
    public void method3141() {
        this.field2801.method3251();
        this.field2800.method3173();
        this.field2799 = new class180();
        this.field2797 = this.field2798;
    }
}
