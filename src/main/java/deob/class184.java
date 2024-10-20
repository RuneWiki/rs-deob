package deob;

@ObfuscatedName("ga")
public final class class184 {

    @ObfuscatedName("ga.o")
    public class195 field2980 = new class195();

    @ObfuscatedName("ga.l")
    public int field2978;

    @ObfuscatedName("ga.g")
    public int field2979;

    @ObfuscatedName("ga.u")
    public class187 field2977;

    @ObfuscatedName("ga.q")
    public class194 field2981 = new class194();

    public class184(int arg0) {
        this.field2978 = arg0;
        this.field2979 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2977 = new class187(var2);
    }

    @ObfuscatedName("ga.o(J)Lgg;")
    public class195 method3401(long arg0) {
        class195 var3 = (class195) this.field2977.method3435(arg0);
        if (var3 != null) {
            this.field2981.method3526(var3);
        }
        return var3;
    }

    @ObfuscatedName("ga.l(J)V")
    public void method3400(long arg0) {
        class195 var3 = (class195) this.field2977.method3435(arg0);
        if (var3 != null) {
            var3.method3564();
            var3.method3545();
            this.field2979++;
        }
    }

    @ObfuscatedName("ga.g(Lgg;J)V")
    public void method3403(class195 arg0, long arg1) {
        if (this.field2979 == 0) {
            class195 var4 = this.field2981.method3533();
            var4.method3564();
            var4.method3545();
            if (this.field2980 == var4) {
                class195 var5 = this.field2981.method3533();
                var5.method3564();
                var5.method3545();
            }
        } else {
            this.field2979--;
        }
        this.field2977.method3436(arg0, arg1);
        this.field2981.method3526(arg0);
    }

    @ObfuscatedName("ga.u()V")
    public void method3404() {
        this.field2981.method3530();
        this.field2977.method3437();
        this.field2980 = new class195();
        this.field2979 = this.field2978;
    }
}
