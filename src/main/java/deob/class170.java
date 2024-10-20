package deob;

@ObfuscatedName("fb")
public final class class170 {

    @ObfuscatedName("fb.i")
    public class174 field2797 = new class174();

    @ObfuscatedName("fb.p")
    public int field2796;

    @ObfuscatedName("fb.a")
    public int field2798;

    @ObfuscatedName("fb.l")
    public class175 field2799;

    @ObfuscatedName("fb.q")
    public class172 field2800 = new class172();

    public class170(int arg0) {
        this.field2796 = arg0;
        this.field2798 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2799 = new class175(var2);
    }

    @ObfuscatedName("fb.i(J)Lfd;")
    public class174 method3223(long arg0) {
        class174 var3 = (class174) this.field2799.method3268(arg0);
        if (var3 != null) {
            this.field2800.method3235(var3);
        }
        return var3;
    }

    @ObfuscatedName("fb.p(J)V")
    public void method3224(long arg0) {
        class174 var3 = (class174) this.field2799.method3268(arg0);
        if (var3 != null) {
            var3.method3319();
            var3.method3264();
            this.field2798++;
        }
    }

    @ObfuscatedName("fb.a(Lfd;J)V")
    public void method3225(class174 arg0, long arg1) {
        if (this.field2798 == 0) {
            class174 var4 = this.field2800.method3244();
            var4.method3319();
            var4.method3264();
            if (this.field2797 == var4) {
                class174 var5 = this.field2800.method3244();
                var5.method3319();
                var5.method3264();
            }
        } else {
            this.field2798--;
        }
        this.field2799.method3269(arg0, arg1);
        this.field2800.method3235(arg0);
    }

    @ObfuscatedName("fb.l()V")
    public void method3226() {
        this.field2800.method3239();
        this.field2799.method3270();
        this.field2797 = new class174();
        this.field2798 = this.field2796;
    }
}
