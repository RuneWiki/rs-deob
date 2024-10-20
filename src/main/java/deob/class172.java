package deob;

@ObfuscatedName("fh")
public final class class172 {

    @ObfuscatedName("fh.n")
    public class183 field2852 = new class183();

    @ObfuscatedName("fh.x")
    public int field2851;

    @ObfuscatedName("fh.k")
    public int field2854;

    @ObfuscatedName("fh.i")
    public class175 field2853;

    @ObfuscatedName("fh.d")
    public class182 field2850 = new class182();

    public class172(int arg0) {
        this.field2851 = arg0;
        this.field2854 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2853 = new class175(var2);
    }

    @ObfuscatedName("fh.n(J)Lgr;")
    public class183 method3115(long arg0) {
        class183 var3 = (class183) this.field2853.method3149(arg0);
        if (var3 != null) {
            this.field2850.method3244(var3);
        }
        return var3;
    }

    @ObfuscatedName("fh.x(J)V")
    public void method3116(long arg0) {
        class183 var3 = (class183) this.field2853.method3149(arg0);
        if (var3 != null) {
            var3.method3277();
            var3.method3253();
            this.field2854++;
        }
    }

    @ObfuscatedName("fh.k(Lgr;J)V")
    public void method3117(class183 arg0, long arg1) {
        if (this.field2854 == 0) {
            class183 var4 = this.field2850.method3239();
            var4.method3277();
            var4.method3253();
            if (this.field2852 == var4) {
                class183 var5 = this.field2850.method3239();
                var5.method3277();
                var5.method3253();
            }
        } else {
            this.field2854--;
        }
        this.field2853.method3156(arg0, arg1);
        this.field2850.method3244(arg0);
    }

    @ObfuscatedName("fh.i()V")
    public void method3124() {
        this.field2850.method3241();
        this.field2853.method3155();
        this.field2852 = new class183();
        this.field2854 = this.field2851;
    }
}
