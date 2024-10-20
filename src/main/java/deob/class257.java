package deob;

@ObfuscatedName("ig")
public final class class257 {

    @ObfuscatedName("ig.v")
    public class404 field2884 = new class404();

    @ObfuscatedName("ig.c")
    public int field2881;

    @ObfuscatedName("ig.i")
    public int field2882;

    @ObfuscatedName("ig.f")
    public class418 field2883;

    @ObfuscatedName("ig.b")
    public class340 field2880 = new class340();

    public class257(int arg0) {
        this.field2881 = arg0;
        this.field2882 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2883 = new class418(var2);
    }

    @ObfuscatedName("ig.v(J)Loz;")
    public class404 method4644(long arg0) {
        class404 var3 = (class404) this.field2883.method6760(arg0);
        if (var3 != null) {
            this.field2880.method5660(var3);
        }
        return var3;
    }

    @ObfuscatedName("ig.c(J)V")
    public void method4645(long arg0) {
        class404 var3 = (class404) this.field2883.method6760(arg0);
        if (var3 != null) {
            var3.method6503();
            var3.method6500();
            this.field2882++;
        }
    }

    @ObfuscatedName("ig.i(Loz;J)V")
    public void method4651(class404 arg0, long arg1) {
        if (this.field2882 == 0) {
            class404 var4 = this.field2880.method5662();
            var4.method6503();
            var4.method6500();
            if (this.field2884 == var4) {
                class404 var5 = this.field2880.method5662();
                var5.method6503();
                var5.method6500();
            }
        } else {
            this.field2882--;
        }
        this.field2883.method6757(arg0, arg1);
        this.field2880.method5660(arg0);
    }

    @ObfuscatedName("ig.f()V")
    public void method4647() {
        this.field2880.method5659();
        this.field2883.method6767();
        this.field2884 = new class404();
        this.field2882 = this.field2881;
    }
}
