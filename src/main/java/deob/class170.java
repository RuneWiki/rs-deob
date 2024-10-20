package deob;

@ObfuscatedName("fb")
public final class class170 {

    @ObfuscatedName("fb.i")
    public class174 field2797 = new class174();

    @ObfuscatedName("fb.v")
    public int field2800;

    @ObfuscatedName("fb.m")
    public int field2798;

    @ObfuscatedName("fb.j")
    public class175 field2796;

    @ObfuscatedName("fb.o")
    public class172 field2799 = new class172();

    public class170(int arg0) {
        this.field2800 = arg0;
        this.field2798 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2796 = new class175(var2);
    }

    @ObfuscatedName("fb.i(J)Lfe;")
    public class174 method3308(long arg0) {
        class174 var3 = (class174) this.field2796.method3348(arg0);
        if (var3 != null) {
            this.field2799.method3319(var3);
        }
        return var3;
    }

    @ObfuscatedName("fb.v(J)V")
    public void method3309(long arg0) {
        class174 var3 = (class174) this.field2796.method3348(arg0);
        if (var3 != null) {
            var3.method3409();
            var3.method3345();
            this.field2798++;
        }
    }

    @ObfuscatedName("fb.m(Lfe;J)V")
    public void method3307(class174 arg0, long arg1) {
        if (this.field2798 == 0) {
            class174 var4 = this.field2799.method3320();
            var4.method3409();
            var4.method3345();
            if (this.field2797 == var4) {
                class174 var5 = this.field2799.method3320();
                var5.method3409();
                var5.method3345();
            }
        } else {
            this.field2798--;
        }
        this.field2796.method3349(arg0, arg1);
        this.field2799.method3319(arg0);
    }

    @ObfuscatedName("fb.j()V")
    public void method3311() {
        this.field2799.method3322();
        this.field2796.method3350();
        this.field2797 = new class174();
        this.field2798 = this.field2800;
    }
}
