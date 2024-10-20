package deob;

@ObfuscatedName("gm")
public final class class184 {

    @ObfuscatedName("gm.n")
    public class195 field2979 = new class195();

    @ObfuscatedName("gm.w")
    public int field2977;

    @ObfuscatedName("gm.i")
    public int field2978;

    @ObfuscatedName("gm.e")
    public class187 field2976;

    @ObfuscatedName("gm.h")
    public class194 field2980 = new class194();

    public class184(int arg0) {
        this.field2977 = arg0;
        this.field2978 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2976 = new class187(var2);
    }

    @ObfuscatedName("gm.n(J)Lgo;")
    public class195 method3315(long arg0) {
        class195 var3 = (class195) this.field2976.method3354(arg0);
        if (var3 != null) {
            this.field2980.method3436(var3);
        }
        return var3;
    }

    @ObfuscatedName("gm.w(J)V")
    public void method3316(long arg0) {
        class195 var3 = (class195) this.field2976.method3354(arg0);
        if (var3 != null) {
            var3.method3474();
            var3.method3450();
            this.field2978++;
        }
    }

    @ObfuscatedName("gm.i(Lgo;J)V")
    public void method3317(class195 arg0, long arg1) {
        if (this.field2978 == 0) {
            class195 var4 = this.field2980.method3438();
            var4.method3474();
            var4.method3450();
            if (this.field2979 == var4) {
                class195 var5 = this.field2980.method3438();
                var5.method3474();
                var5.method3450();
            }
        } else {
            this.field2978--;
        }
        this.field2976.method3346(arg0, arg1);
        this.field2980.method3436(arg0);
    }

    @ObfuscatedName("gm.e()V")
    public void method3319() {
        this.field2980.method3437();
        this.field2976.method3347();
        this.field2979 = new class195();
        this.field2978 = this.field2977;
    }
}
