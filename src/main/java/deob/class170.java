package deob;

@ObfuscatedName("fz")
public final class class170 {

    @ObfuscatedName("fz.i")
    public class174 field2799 = new class174();

    @ObfuscatedName("fz.w")
    public int field2796;

    @ObfuscatedName("fz.f")
    public int field2797;

    @ObfuscatedName("fz.e")
    public class175 field2798;

    @ObfuscatedName("fz.t")
    public class172 field2795 = new class172();

    public class170(int arg0) {
        this.field2796 = arg0;
        this.field2797 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2798 = new class175(var2);
    }

    @ObfuscatedName("fz.i(J)Lfw;")
    public class174 method3235(long arg0) {
        class174 var3 = (class174) this.field2798.method3273(arg0);
        if (var3 != null) {
            this.field2795.method3246(var3);
        }
        return var3;
    }

    @ObfuscatedName("fz.w(J)V")
    public void method3236(long arg0) {
        class174 var3 = (class174) this.field2798.method3273(arg0);
        if (var3 != null) {
            var3.method3328();
            var3.method3270();
            this.field2797++;
        }
    }

    @ObfuscatedName("fz.f(Lfw;J)V")
    public void method3234(class174 arg0, long arg1) {
        if (this.field2797 == 0) {
            class174 var4 = this.field2795.method3259();
            var4.method3328();
            var4.method3270();
            if (this.field2799 == var4) {
                class174 var5 = this.field2795.method3259();
                var5.method3328();
                var5.method3270();
            }
        } else {
            this.field2797--;
        }
        this.field2798.method3278(arg0, arg1);
        this.field2795.method3246(arg0);
    }

    @ObfuscatedName("fz.e()V")
    public void method3243() {
        this.field2795.method3258();
        this.field2798.method3275();
        this.field2799 = new class174();
        this.field2797 = this.field2796;
    }
}
