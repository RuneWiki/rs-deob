package deob;

@ObfuscatedName("gq")
public final class class190 {

    @ObfuscatedName("gq.i")
    public class195 field2462 = new class195();

    @ObfuscatedName("gq.w")
    public int field2461;

    @ObfuscatedName("gq.a")
    public int field2463;

    @ObfuscatedName("gq.t")
    public class191 field2464;

    @ObfuscatedName("gq.s")
    public class185 field2465 = new class185();

    public class190(int arg0) {
        this.field2461 = arg0;
        this.field2463 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2464 = new class191(var2);
    }

    @ObfuscatedName("gq.i(J)Lgc;")
    public class195 method3235(long arg0) {
        class195 var3 = (class195) this.field2464.method3249(arg0);
        if (var3 != null) {
            this.field2465.method3179(var3);
        }
        return var3;
    }

    @ObfuscatedName("gq.w(J)V")
    public void method3233(long arg0) {
        class195 var3 = (class195) this.field2464.method3249(arg0);
        if (var3 != null) {
            var3.method3290();
            var3.method3323();
            this.field2463++;
        }
    }

    @ObfuscatedName("gq.a(Lgc;J)V")
    public void method3234(class195 arg0, long arg1) {
        if (this.field2463 == 0) {
            class195 var4 = this.field2465.method3181();
            var4.method3290();
            var4.method3323();
            if (this.field2462 == var4) {
                class195 var5 = this.field2465.method3181();
                var5.method3290();
                var5.method3323();
            }
        } else {
            this.field2463--;
        }
        this.field2464.method3248(arg0, arg1);
        this.field2465.method3179(arg0);
    }

    @ObfuscatedName("gq.t()V")
    public void method3232() {
        this.field2465.method3183();
        this.field2464.method3251();
        this.field2462 = new class195();
        this.field2463 = this.field2461;
    }
}
