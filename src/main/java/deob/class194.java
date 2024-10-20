package deob;

@ObfuscatedName("gp")
public final class class194 {

    @ObfuscatedName("gp.f")
    public class205 field3084 = new class205();

    @ObfuscatedName("gp.u")
    public int field3081;

    @ObfuscatedName("gp.x")
    public int field3082;

    @ObfuscatedName("gp.b")
    public class197 field3083;

    @ObfuscatedName("gp.l")
    public class204 field3080 = new class204();

    public class194(int arg0) {
        this.field3081 = arg0;
        this.field3082 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3083 = new class197(var2);
    }

    @ObfuscatedName("gp.f(J)Lgi;")
    public class205 method3530(long arg0) {
        class205 var3 = (class205) this.field3083.method3555(arg0);
        if (var3 != null) {
            this.field3080.method3641(var3);
        }
        return var3;
    }

    @ObfuscatedName("gp.u(J)V")
    public void method3522(long arg0) {
        class205 var3 = (class205) this.field3083.method3555(arg0);
        if (var3 != null) {
            var3.method3679();
            var3.method3655();
            this.field3082++;
        }
    }

    @ObfuscatedName("gp.x(Lgi;J)V")
    public void method3521(class205 arg0, long arg1) {
        if (this.field3082 == 0) {
            class205 var4 = this.field3080.method3635();
            var4.method3679();
            var4.method3655();
            if (this.field3084 == var4) {
                class205 var5 = this.field3080.method3635();
                var5.method3679();
                var5.method3655();
            }
        } else {
            this.field3082--;
        }
        this.field3083.method3559(arg0, arg1);
        this.field3080.method3641(arg0);
    }

    @ObfuscatedName("gp.b()V")
    public void method3529() {
        this.field3080.method3637();
        this.field3083.method3557();
        this.field3084 = new class205();
        this.field3082 = this.field3081;
    }
}
