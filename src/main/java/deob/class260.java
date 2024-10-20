package deob;

@ObfuscatedName("iw")
public final class class260 {

    @ObfuscatedName("iw.u")
    public class176 field3536 = new class176();

    public class260() {
        this.field3536.field2119 = this.field3536;
        this.field3536.field2120 = this.field3536;
    }

    @ObfuscatedName("iw.u(Lfn;)V")
    public void method4483(class176 arg0) {
        if (arg0.field2120 != null) {
            arg0.method3319();
        }
        arg0.field2120 = this.field3536.field2120;
        arg0.field2119 = this.field3536;
        arg0.field2120.field2119 = arg0;
        arg0.field2119.field2120 = arg0;
    }

    @ObfuscatedName("iw.f(Lfn;)V")
    public void method4482(class176 arg0) {
        if (arg0.field2120 != null) {
            arg0.method3319();
        }
        arg0.field2120 = this.field3536;
        arg0.field2119 = this.field3536.field2119;
        arg0.field2120.field2119 = arg0;
        arg0.field2119.field2120 = arg0;
    }

    @ObfuscatedName("iw.b()Lfn;")
    public class176 method4484() {
        class176 var1 = this.field3536.field2119;
        return this.field3536 == var1 ? null : var1;
    }
}
