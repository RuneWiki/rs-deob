package deob;

@ObfuscatedName("gt")
public final class class197 {

    @ObfuscatedName("gt.a")
    public class208 field3135 = new class208();

    @ObfuscatedName("gt.d")
    public int field3134;

    @ObfuscatedName("gt.v")
    public int field3133;

    @ObfuscatedName("gt.r")
    public class200 field3136;

    @ObfuscatedName("gt.z")
    public class207 field3137 = new class207();

    public class197(int arg0) {
        this.field3134 = arg0;
        this.field3133 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3136 = new class200(var2);
    }

    @ObfuscatedName("gt.a(J)Lgb;")
    public class208 method3544(long arg0) {
        class208 var3 = (class208) this.field3136.method3580(arg0);
        if (var3 != null) {
            this.field3137.method3688(var3);
        }
        return var3;
    }

    @ObfuscatedName("gt.d(J)V")
    public void method3547(long arg0) {
        class208 var3 = (class208) this.field3136.method3580(arg0);
        if (var3 != null) {
            var3.method3729();
            var3.method3701();
            this.field3133++;
        }
    }

    @ObfuscatedName("gt.v(Lgb;J)V")
    public void method3546(class208 arg0, long arg1) {
        if (this.field3133 == 0) {
            class208 var4 = this.field3137.method3690();
            var4.method3729();
            var4.method3701();
            if (this.field3135 == var4) {
                class208 var5 = this.field3137.method3690();
                var5.method3729();
                var5.method3701();
            }
        } else {
            this.field3133--;
        }
        this.field3136.method3586(arg0, arg1);
        this.field3137.method3688(arg0);
    }

    @ObfuscatedName("gt.r()V")
    public void method3552() {
        this.field3137.method3697();
        this.field3136.method3582();
        this.field3135 = new class208();
        this.field3133 = this.field3134;
    }
}
