package deob;

@ObfuscatedName("gf")
public final class class197 {

    @ObfuscatedName("gf.k")
    public class208 field3131 = new class208();

    @ObfuscatedName("gf.q")
    public int field3130;

    @ObfuscatedName("gf.f")
    public int field3129;

    @ObfuscatedName("gf.c")
    public class200 field3132;

    @ObfuscatedName("gf.v")
    public class207 field3133 = new class207();

    public class197(int arg0) {
        this.field3130 = arg0;
        this.field3129 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3132 = new class200(var2);
    }

    @ObfuscatedName("gf.k(J)Lgv;")
    public class208 method3535(long arg0) {
        class208 var3 = (class208) this.field3132.method3580(arg0);
        if (var3 != null) {
            this.field3133.method3672(var3);
        }
        return var3;
    }

    @ObfuscatedName("gf.q(J)V")
    public void method3536(long arg0) {
        class208 var3 = (class208) this.field3132.method3580(arg0);
        if (var3 != null) {
            var3.method3703();
            var3.method3684();
            this.field3129++;
        }
    }

    @ObfuscatedName("gf.f(Lgv;J)V")
    public void method3537(class208 arg0, long arg1) {
        if (this.field3129 == 0) {
            class208 var4 = this.field3133.method3669();
            var4.method3703();
            var4.method3684();
            if (this.field3131 == var4) {
                class208 var5 = this.field3133.method3669();
                var5.method3703();
                var5.method3684();
            }
        } else {
            this.field3129--;
        }
        this.field3132.method3574(arg0, arg1);
        this.field3133.method3672(arg0);
    }

    @ObfuscatedName("gf.c()V")
    public void method3538() {
        this.field3133.method3671();
        this.field3132.method3576();
        this.field3131 = new class208();
        this.field3129 = this.field3130;
    }
}
