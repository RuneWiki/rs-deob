package deob;

@ObfuscatedName("gm")
public final class class197 {

    @ObfuscatedName("gm.s")
    public class208 field3133 = new class208();

    @ObfuscatedName("gm.z")
    public int field3130;

    @ObfuscatedName("gm.t")
    public int field3131;

    @ObfuscatedName("gm.y")
    public class200 field3132;

    @ObfuscatedName("gm.p")
    public class207 field3129 = new class207();

    public class197(int arg0) {
        this.field3130 = arg0;
        this.field3131 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3132 = new class200(var2);
    }

    @ObfuscatedName("gm.s(J)Lgc;")
    public class208 method3523(long arg0) {
        class208 var3 = (class208) this.field3132.method3555(arg0);
        if (var3 != null) {
            this.field3129.method3652(var3);
        }
        return var3;
    }

    @ObfuscatedName("gm.z(J)V")
    public void method3520(long arg0) {
        class208 var3 = (class208) this.field3132.method3555(arg0);
        if (var3 != null) {
            var3.method3699();
            var3.method3674();
            this.field3131++;
        }
    }

    @ObfuscatedName("gm.t(Lgc;J)V")
    public void method3521(class208 arg0, long arg1) {
        if (this.field3131 == 0) {
            class208 var4 = this.field3129.method3669();
            var4.method3699();
            var4.method3674();
            if (this.field3133 == var4) {
                class208 var5 = this.field3129.method3669();
                var5.method3699();
                var5.method3674();
            }
        } else {
            this.field3131--;
        }
        this.field3132.method3556(arg0, arg1);
        this.field3129.method3652(arg0);
    }

    @ObfuscatedName("gm.y()V")
    public void method3522() {
        this.field3129.method3656();
        this.field3132.method3557();
        this.field3133 = new class208();
        this.field3131 = this.field3130;
    }
}
