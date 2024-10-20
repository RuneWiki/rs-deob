package deob;

@ObfuscatedName("gt")
public final class class193 {

    @ObfuscatedName("gt.m")
    public class204 field3061 = new class204();

    @ObfuscatedName("gt.l")
    public int field3058;

    @ObfuscatedName("gt.y")
    public int field3059;

    @ObfuscatedName("gt.u")
    public class196 field3060;

    @ObfuscatedName("gt.k")
    public class203 field3057 = new class203();

    public class193(int arg0) {
        this.field3058 = arg0;
        this.field3059 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3060 = new class196(var2);
    }

    @ObfuscatedName("gt.m(J)Lgb;")
    public class204 method3537(long arg0) {
        class204 var3 = (class204) this.field3060.method3571(arg0);
        if (var3 != null) {
            this.field3057.method3670(var3);
        }
        return var3;
    }

    @ObfuscatedName("gt.l(J)V")
    public void method3538(long arg0) {
        class204 var3 = (class204) this.field3060.method3571(arg0);
        if (var3 != null) {
            var3.method3702();
            var3.method3685();
            this.field3059++;
        }
    }

    @ObfuscatedName("gt.y(Lgb;J)V")
    public void method3539(class204 arg0, long arg1) {
        if (this.field3059 == 0) {
            class204 var4 = this.field3057.method3672();
            var4.method3702();
            var4.method3685();
            if (this.field3061 == var4) {
                class204 var5 = this.field3057.method3672();
                var5.method3702();
                var5.method3685();
            }
        } else {
            this.field3059--;
        }
        this.field3060.method3572(arg0, arg1);
        this.field3057.method3670(arg0);
    }

    @ObfuscatedName("gt.u()V")
    public void method3540() {
        this.field3057.method3675();
        this.field3060.method3587();
        this.field3061 = new class204();
        this.field3059 = this.field3058;
    }
}
