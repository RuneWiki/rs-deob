package deob;

@ObfuscatedName("gv")
public final class class197 {

    @ObfuscatedName("gv.f")
    public class208 field3129 = new class208();

    @ObfuscatedName("gv.e")
    public int field3130;

    @ObfuscatedName("gv.n")
    public int field3131;

    @ObfuscatedName("gv.t")
    public class200 field3132;

    @ObfuscatedName("gv.v")
    public class207 field3133 = new class207();

    public class197(int arg0) {
        this.field3130 = arg0;
        this.field3131 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3132 = new class200(var2);
    }

    @ObfuscatedName("gv.f(J)Lgi;")
    public class208 method3569(long arg0) {
        class208 var3 = (class208) this.field3132.method3605(arg0);
        if (var3 != null) {
            this.field3133.method3710(var3);
        }
        return var3;
    }

    @ObfuscatedName("gv.e(J)V")
    public void method3570(long arg0) {
        class208 var3 = (class208) this.field3132.method3605(arg0);
        if (var3 != null) {
            var3.method3744();
            var3.method3724();
            this.field3131++;
        }
    }

    @ObfuscatedName("gv.n(Lgi;J)V")
    public void method3571(class208 arg0, long arg1) {
        if (this.field3131 == 0) {
            class208 var4 = this.field3133.method3716();
            var4.method3744();
            var4.method3724();
            if (this.field3129 == var4) {
                class208 var5 = this.field3133.method3716();
                var5.method3744();
                var5.method3724();
            }
        } else {
            this.field3131--;
        }
        this.field3132.method3606(arg0, arg1);
        this.field3133.method3710(arg0);
    }

    @ObfuscatedName("gv.t()V")
    public void method3572() {
        this.field3133.method3714();
        this.field3132.method3607();
        this.field3129 = new class208();
        this.field3131 = this.field3130;
    }
}
