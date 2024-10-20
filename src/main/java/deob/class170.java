package deob;

@ObfuscatedName("fu")
public final class class170 {

    @ObfuscatedName("fu.y")
    public class174 field2797 = new class174();

    @ObfuscatedName("fu.m")
    public int field2800;

    @ObfuscatedName("fu.d")
    public int field2798;

    @ObfuscatedName("fu.k")
    public class175 field2796;

    @ObfuscatedName("fu.n")
    public class172 field2799 = new class172();

    public class170(int arg0) {
        this.field2800 = arg0;
        this.field2798 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2796 = new class175(var2);
    }

    @ObfuscatedName("fu.y(J)Lfn;")
    public class174 method3288(long arg0) {
        class174 var3 = (class174) this.field2796.method3337(arg0);
        if (var3 != null) {
            this.field2799.method3301(var3);
        }
        return var3;
    }

    @ObfuscatedName("fu.m(J)V")
    public void method3289(long arg0) {
        class174 var3 = (class174) this.field2796.method3337(arg0);
        if (var3 != null) {
            var3.method3395();
            var3.method3327();
            this.field2798++;
        }
    }

    @ObfuscatedName("fu.d(Lfn;J)V")
    public void method3291(class174 arg0, long arg1) {
        if (this.field2798 == 0) {
            class174 var4 = this.field2799.method3303();
            var4.method3395();
            var4.method3327();
            if (this.field2797 == var4) {
                class174 var5 = this.field2799.method3303();
                var5.method3395();
                var5.method3327();
            }
        } else {
            this.field2798--;
        }
        this.field2796.method3334(arg0, arg1);
        this.field2799.method3301(arg0);
    }

    @ObfuscatedName("fu.k()V")
    public void method3297() {
        this.field2799.method3311();
        this.field2796.method3343();
        this.field2797 = new class174();
        this.field2798 = this.field2800;
    }
}
