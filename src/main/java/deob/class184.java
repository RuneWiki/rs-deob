package deob;

@ObfuscatedName("gu")
public final class class184 {

    @ObfuscatedName("gu.p")
    public class195 field2979 = new class195();

    @ObfuscatedName("gu.k")
    public int field2978;

    @ObfuscatedName("gu.e")
    public int field2980;

    @ObfuscatedName("gu.f")
    public class187 field2981;

    @ObfuscatedName("gu.w")
    public class194 field2982 = new class194();

    public class184(int arg0) {
        this.field2978 = arg0;
        this.field2980 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2981 = new class187(var2);
    }

    @ObfuscatedName("gu.p(J)Lgk;")
    public class195 method3371(long arg0) {
        class195 var3 = (class195) this.field2981.method3405(arg0);
        if (var3 != null) {
            this.field2982.method3498(var3);
        }
        return var3;
    }

    @ObfuscatedName("gu.k(J)V")
    public void method3372(long arg0) {
        class195 var3 = (class195) this.field2981.method3405(arg0);
        if (var3 != null) {
            var3.method3533();
            var3.method3519();
            this.field2980++;
        }
    }

    @ObfuscatedName("gu.e(Lgk;J)V")
    public void method3370(class195 arg0, long arg1) {
        if (this.field2980 == 0) {
            class195 var4 = this.field2982.method3514();
            var4.method3533();
            var4.method3519();
            if (this.field2979 == var4) {
                class195 var5 = this.field2982.method3514();
                var5.method3533();
                var5.method3519();
            }
        } else {
            this.field2980--;
        }
        this.field2981.method3406(arg0, arg1);
        this.field2982.method3498(arg0);
    }

    @ObfuscatedName("gu.f()V")
    public void method3374() {
        this.field2982.method3512();
        this.field2981.method3418();
        this.field2979 = new class195();
        this.field2980 = this.field2978;
    }
}
