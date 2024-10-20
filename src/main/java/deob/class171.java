package deob;

@ObfuscatedName("fy")
public final class class171 {

    @ObfuscatedName("fy.g")
    public class182 field2843 = new class182();

    @ObfuscatedName("fy.v")
    public int field2840;

    @ObfuscatedName("fy.z")
    public int field2839;

    @ObfuscatedName("fy.h")
    public class174 field2842;

    @ObfuscatedName("fy.k")
    public class181 field2841 = new class181();

    public class171(int arg0) {
        this.field2840 = arg0;
        this.field2839 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2842 = new class174(var2);
    }

    @ObfuscatedName("fy.g(J)Lfl;")
    public class182 method3166(long arg0) {
        class182 var3 = (class182) this.field2842.method3201(arg0);
        if (var3 != null) {
            this.field2841.method3283(var3);
        }
        return var3;
    }

    @ObfuscatedName("fy.v(J)V")
    public void method3168(long arg0) {
        class182 var3 = (class182) this.field2842.method3201(arg0);
        if (var3 != null) {
            var3.method3322();
            var3.method3299();
            this.field2839++;
        }
    }

    @ObfuscatedName("fy.z(Lfl;J)V")
    public void method3167(class182 arg0, long arg1) {
        if (this.field2839 == 0) {
            class182 var4 = this.field2841.method3285();
            var4.method3322();
            var4.method3299();
            if (this.field2843 == var4) {
                class182 var5 = this.field2841.method3285();
                var5.method3322();
                var5.method3299();
            }
        } else {
            this.field2839--;
        }
        this.field2842.method3202(arg0, arg1);
        this.field2841.method3283(arg0);
    }

    @ObfuscatedName("fy.h()V")
    public void method3176() {
        this.field2841.method3287();
        this.field2842.method3200();
        this.field2843 = new class182();
        this.field2839 = this.field2840;
    }
}
