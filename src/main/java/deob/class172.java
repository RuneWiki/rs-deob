package deob;

@ObfuscatedName("fc")
public final class class172 {

    @ObfuscatedName("fc.g")
    public class183 field2851 = new class183();

    @ObfuscatedName("fc.i")
    public int field2850;

    @ObfuscatedName("fc.k")
    public int field2849;

    @ObfuscatedName("fc.e")
    public class175 field2852;

    @ObfuscatedName("fc.w")
    public class182 field2853 = new class182();

    public class172(int arg0) {
        this.field2850 = arg0;
        this.field2849 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2852 = new class175(var2);
    }

    @ObfuscatedName("fc.g(J)Lgy;")
    public class183 method3135(long arg0) {
        class183 var3 = (class183) this.field2852.method3174(arg0);
        if (var3 != null) {
            this.field2853.method3252(var3);
        }
        return var3;
    }

    @ObfuscatedName("fc.i(J)V")
    public void method3144(long arg0) {
        class183 var3 = (class183) this.field2852.method3174(arg0);
        if (var3 != null) {
            var3.method3304();
            var3.method3272();
            this.field2849++;
        }
    }

    @ObfuscatedName("fc.k(Lgy;J)V")
    public void method3140(class183 arg0, long arg1) {
        if (this.field2849 == 0) {
            class183 var4 = this.field2853.method3269();
            var4.method3304();
            var4.method3272();
            if (this.field2851 == var4) {
                class183 var5 = this.field2853.method3269();
                var5.method3304();
                var5.method3272();
            }
        } else {
            this.field2849--;
        }
        this.field2852.method3177(arg0, arg1);
        this.field2853.method3252(arg0);
    }

    @ObfuscatedName("fc.e()V")
    public void method3138() {
        this.field2853.method3262();
        this.field2852.method3176();
        this.field2851 = new class183();
        this.field2849 = this.field2850;
    }
}
