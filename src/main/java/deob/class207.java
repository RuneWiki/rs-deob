package deob;

@ObfuscatedName("go")
public final class class207 {

    @ObfuscatedName("go.s")
    public class208 field3155 = new class208();

    public class207() {
        this.field3155.field3156 = this.field3155;
        this.field3155.field3157 = this.field3155;
    }

    @ObfuscatedName("go.s(Lgc;)V")
    public void method3652(class208 arg0) {
        if (arg0.field3157 != null) {
            arg0.method3674();
        }
        arg0.field3157 = this.field3155.field3157;
        arg0.field3156 = this.field3155;
        arg0.field3157.field3156 = arg0;
        arg0.field3156.field3157 = arg0;
    }

    @ObfuscatedName("go.z(Lgc;)V")
    public void method3653(class208 arg0) {
        if (arg0.field3157 != null) {
            arg0.method3674();
        }
        arg0.field3157 = this.field3155;
        arg0.field3156 = this.field3155.field3156;
        arg0.field3157.field3156 = arg0;
        arg0.field3156.field3157 = arg0;
    }

    @ObfuscatedName("go.t()Lgc;")
    public class208 method3669() {
        class208 var1 = this.field3155.field3156;
        if (this.field3155 == var1) {
            return null;
        } else {
            var1.method3674();
            return var1;
        }
    }

    @ObfuscatedName("go.y()Lgc;")
    public class208 method3651() {
        class208 var1 = this.field3155.field3156;
        return this.field3155 == var1 ? null : var1;
    }

    @ObfuscatedName("go.p()V")
    public void method3656() {
        while (true) {
            class208 var1 = this.field3155.field3156;
            if (this.field3155 == var1) {
                return;
            }
            var1.method3674();
        }
    }
}
