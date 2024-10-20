package deob;

@ObfuscatedName("fu")
public final class class174 {

    @ObfuscatedName("fu.f")
    public class185 field2846 = new class185();

    @ObfuscatedName("fu.k")
    public int field2847;

    @ObfuscatedName("fu.y")
    public int field2848;

    @ObfuscatedName("fu.e")
    public class177 field2850;

    @ObfuscatedName("fu.r")
    public class184 field2849 = new class184();

    public class174(int arg0) {
        this.field2847 = arg0;
        this.field2848 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2850 = new class177(var2);
    }

    @ObfuscatedName("fu.f(J)Lgt;")
    public class185 method3207(long arg0) {
        class185 var3 = (class185) this.field2850.method3244(arg0);
        if (var3 != null) {
            this.field2849.method3328(var3);
        }
        return var3;
    }

    @ObfuscatedName("fu.k(J)V")
    public void method3208(long arg0) {
        class185 var3 = (class185) this.field2850.method3244(arg0);
        if (var3 != null) {
            var3.method3367();
            var3.method3347();
            this.field2848++;
        }
    }

    @ObfuscatedName("fu.y(Lgt;J)V")
    public void method3209(class185 arg0, long arg1) {
        if (this.field2848 == 0) {
            class185 var4 = this.field2849.method3330();
            var4.method3367();
            var4.method3347();
            if (this.field2846 == var4) {
                class185 var5 = this.field2849.method3330();
                var5.method3367();
                var5.method3347();
            }
        } else {
            this.field2848--;
        }
        this.field2850.method3245(arg0, arg1);
        this.field2849.method3328(arg0);
    }

    @ObfuscatedName("fu.e()V")
    public void method3223() {
        this.field2849.method3332();
        this.field2850.method3259();
        this.field2846 = new class185();
        this.field2848 = this.field2847;
    }
}
