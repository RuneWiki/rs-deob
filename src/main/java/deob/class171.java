package deob;

@ObfuscatedName("fz")
public final class class171 {

    @ObfuscatedName("fz.k")
    public class182 field2842 = new class182();

    @ObfuscatedName("fz.r")
    public int field2840;

    @ObfuscatedName("fz.y")
    public int field2841;

    @ObfuscatedName("fz.w")
    public class174 field2839;

    @ObfuscatedName("fz.m")
    public class181 field2843 = new class181();

    public class171(int arg0) {
        this.field2840 = arg0;
        this.field2841 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2839 = new class174(var2);
    }

    @ObfuscatedName("fz.k(J)Lfj;")
    public class182 method3141(long arg0) {
        class182 var3 = (class182) this.field2839.method3163(arg0);
        if (var3 != null) {
            this.field2843.method3242(var3);
        }
        return var3;
    }

    @ObfuscatedName("fz.r(J)V")
    public void method3136(long arg0) {
        class182 var3 = (class182) this.field2839.method3163(arg0);
        if (var3 != null) {
            var3.method3275();
            var3.method3256();
            this.field2841++;
        }
    }

    @ObfuscatedName("fz.y(Lfj;J)V")
    public void method3137(class182 arg0, long arg1) {
        if (this.field2841 == 0) {
            class182 var4 = this.field2843.method3244();
            var4.method3275();
            var4.method3256();
            if (this.field2842 == var4) {
                class182 var5 = this.field2843.method3244();
                var5.method3275();
                var5.method3256();
            }
        } else {
            this.field2841--;
        }
        this.field2839.method3164(arg0, arg1);
        this.field2843.method3242(arg0);
    }

    @ObfuscatedName("fz.w()V")
    public void method3138() {
        this.field2843.method3246();
        this.field2839.method3165();
        this.field2842 = new class182();
        this.field2841 = this.field2840;
    }
}
