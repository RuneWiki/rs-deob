package deob;

@ObfuscatedName("gd")
public final class class203 {

    @ObfuscatedName("gd.f")
    public class209 field2482 = new class209();

    @ObfuscatedName("gd.l")
    public int field2480;

    @ObfuscatedName("gd.w")
    public int field2481;

    @ObfuscatedName("gd.s")
    public class205 field2479;

    @ObfuscatedName("gd.e")
    public class197 field2483 = new class197();

    public class203(int arg0) {
        this.field2480 = arg0;
        this.field2481 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2479 = new class205(var2);
    }

    @ObfuscatedName("gd.f(J)Lhe;")
    public class209 method3737(long arg0) {
        class209 var3 = (class209) this.field2479.method3774(arg0);
        if (var3 != null) {
            this.field2483.method3685(var3);
        }
        return var3;
    }

    @ObfuscatedName("gd.l(J)V")
    public void method3738(long arg0) {
        class209 var3 = (class209) this.field2479.method3774(arg0);
        if (var3 != null) {
            var3.method3818();
            var3.method3851();
            this.field2481++;
        }
    }

    @ObfuscatedName("gd.w(Lhe;J)V")
    public void method3744(class209 arg0, long arg1) {
        if (this.field2481 == 0) {
            class209 var4 = this.field2483.method3688();
            var4.method3818();
            var4.method3851();
            if (this.field2482 == var4) {
                class209 var5 = this.field2483.method3688();
                var5.method3818();
                var5.method3851();
            }
        } else {
            this.field2481--;
        }
        this.field2479.method3773(arg0, arg1);
        this.field2483.method3685(arg0);
    }

    @ObfuscatedName("gd.s()V")
    public void method3740() {
        this.field2483.method3699();
        this.field2479.method3775();
        this.field2482 = new class209();
        this.field2481 = this.field2480;
    }
}
