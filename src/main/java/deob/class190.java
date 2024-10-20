package deob;

@ObfuscatedName("gq")
public final class class190 {

    @ObfuscatedName("gq.e")
    public class195 field2441 = new class195();

    @ObfuscatedName("gq.o")
    public int field2442;

    @ObfuscatedName("gq.m")
    public int field2443;

    @ObfuscatedName("gq.g")
    public class191 field2440;

    @ObfuscatedName("gq.d")
    public class185 field2444 = new class185();

    public class190(int arg0) {
        this.field2442 = arg0;
        this.field2443 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2440 = new class191(var2);
    }

    @ObfuscatedName("gq.e(J)Lgt;")
    public class195 method3248(long arg0) {
        class195 var3 = (class195) this.field2440.method3268(arg0);
        if (var3 != null) {
            this.field2444.method3199(var3);
        }
        return var3;
    }

    @ObfuscatedName("gq.o(J)V")
    public void method3249(long arg0) {
        class195 var3 = (class195) this.field2440.method3268(arg0);
        if (var3 != null) {
            var3.method3304();
            var3.method3351();
            this.field2443++;
        }
    }

    @ObfuscatedName("gq.m(Lgt;J)V")
    public void method3250(class195 arg0, long arg1) {
        if (this.field2443 == 0) {
            class195 var4 = this.field2444.method3198();
            var4.method3304();
            var4.method3351();
            if (this.field2441 == var4) {
                class195 var5 = this.field2444.method3198();
                var5.method3304();
                var5.method3351();
            }
        } else {
            this.field2443--;
        }
        this.field2440.method3259(arg0, arg1);
        this.field2444.method3199(arg0);
    }

    @ObfuscatedName("gq.g()V")
    public void method3247() {
        this.field2444.method3203();
        this.field2440.method3272();
        this.field2441 = new class195();
        this.field2443 = this.field2442;
    }
}
