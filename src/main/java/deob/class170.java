package deob;

@ObfuscatedName("fb")
public final class class170 {

    @ObfuscatedName("fb.e")
    public class180 field2815 = new class180();

    @ObfuscatedName("fb.p")
    public int field2812;

    @ObfuscatedName("fb.a")
    public int field2811;

    @ObfuscatedName("fb.g")
    public class173 field2814;

    @ObfuscatedName("fb.u")
    public class179 field2813 = new class179();

    public class170(int arg0) {
        this.field2812 = arg0;
        this.field2811 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2814 = new class173(var2);
    }

    @ObfuscatedName("fb.e(J)Lfi;")
    public class180 method3166(long arg0) {
        class180 var3 = (class180) this.field2814.method3192(arg0);
        if (var3 != null) {
            this.field2813.method3273(var3);
        }
        return var3;
    }

    @ObfuscatedName("fb.p(J)V")
    public void method3160(long arg0) {
        class180 var3 = (class180) this.field2814.method3192(arg0);
        if (var3 != null) {
            var3.method3307();
            var3.method3287();
            this.field2811++;
        }
    }

    @ObfuscatedName("fb.a(Lfi;J)V")
    public void method3161(class180 arg0, long arg1) {
        if (this.field2811 == 0) {
            class180 var4 = this.field2813.method3270();
            var4.method3307();
            var4.method3287();
            if (this.field2815 == var4) {
                class180 var5 = this.field2813.method3270();
                var5.method3307();
                var5.method3287();
            }
        } else {
            this.field2811--;
        }
        this.field2814.method3191(arg0, arg1);
        this.field2813.method3273(arg0);
    }

    @ObfuscatedName("fb.g()V")
    public void method3162() {
        this.field2813.method3275();
        this.field2814.method3194();
        this.field2815 = new class180();
        this.field2811 = this.field2812;
    }
}
