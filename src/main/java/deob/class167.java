package deob;

@ObfuscatedName("fc")
public final class class167 {

    @ObfuscatedName("fc.z")
    public class174 field2799 = new class174();

    @ObfuscatedName("fc.n")
    public int field2797;

    @ObfuscatedName("fc.u")
    public int field2798;

    @ObfuscatedName("fc.t")
    public class169 field2796;

    @ObfuscatedName("fc.e")
    public class173 field2800 = new class173();

    public class167(int arg0) {
        this.field2797 = arg0;
        this.field2798 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2796 = new class169(var2);
    }

    @ObfuscatedName("fc.z(J)Lfb;")
    public class174 method3183(long arg0) {
        class174 var3 = (class174) this.field2796.method3208(arg0);
        if (var3 != null) {
            this.field2800.method3265(var3);
        }
        return var3;
    }

    @ObfuscatedName("fc.n(J)V")
    public void method3182(long arg0) {
        class174 var3 = (class174) this.field2796.method3208(arg0);
        if (var3 != null) {
            var3.method3288();
            var3.method3282();
            this.field2798++;
        }
    }

    @ObfuscatedName("fc.u(Lfb;J)V")
    public void method3185(class174 arg0, long arg1) {
        if (this.field2798 == 0) {
            class174 var4 = this.field2800.method3263();
            var4.method3288();
            var4.method3282();
            if (this.field2799 == var4) {
                class174 var5 = this.field2800.method3263();
                var5.method3288();
                var5.method3282();
            }
        } else {
            this.field2798--;
        }
        this.field2796.method3210(arg0, arg1);
        this.field2800.method3265(arg0);
    }

    @ObfuscatedName("fc.t()V")
    public void method3193() {
        this.field2800.method3267();
        this.field2796.method3218();
        this.field2799 = new class174();
        this.field2798 = this.field2797;
    }
}
