package deob;

@ObfuscatedName("gh")
public final class class207 {

    @ObfuscatedName("gh.f")
    public class208 field3155 = new class208();

    public class207() {
        this.field3155.field3157 = this.field3155;
        this.field3155.field3156 = this.field3155;
    }

    @ObfuscatedName("gh.f(Lgi;)V")
    public void method3710(class208 arg0) {
        if (arg0.field3156 != null) {
            arg0.method3724();
        }
        arg0.field3156 = this.field3155.field3156;
        arg0.field3157 = this.field3155;
        arg0.field3156.field3157 = arg0;
        arg0.field3157.field3156 = arg0;
    }

    @ObfuscatedName("gh.e(Lgi;)V")
    public void method3711(class208 arg0) {
        if (arg0.field3156 != null) {
            arg0.method3724();
        }
        arg0.field3156 = this.field3155;
        arg0.field3157 = this.field3155.field3157;
        arg0.field3156.field3157 = arg0;
        arg0.field3157.field3156 = arg0;
    }

    @ObfuscatedName("gh.n()Lgi;")
    public class208 method3716() {
        class208 var1 = this.field3155.field3157;
        if (this.field3155 == var1) {
            return null;
        } else {
            var1.method3724();
            return var1;
        }
    }

    @ObfuscatedName("gh.t()Lgi;")
    public class208 method3713() {
        class208 var1 = this.field3155.field3157;
        return this.field3155 == var1 ? null : var1;
    }

    @ObfuscatedName("gh.v()V")
    public void method3714() {
        while (true) {
            class208 var1 = this.field3155.field3157;
            if (this.field3155 == var1) {
                return;
            }
            var1.method3724();
        }
    }
}
