package deob;

@ObfuscatedName("gj")
public class class195 {

    @ObfuscatedName("gj.a")
    public class207 field3084 = new class207();

    @ObfuscatedName("gj.r")
    public class207 field3083;

    public class195() {
        this.field3084.field3109 = this.field3084;
        this.field3084.field3108 = this.field3084;
    }

    @ObfuscatedName("gj.a(Lgl;)V")
    public void method3531(class207 arg0) {
        if (arg0.field3108 != null) {
            arg0.method3655();
        }
        arg0.field3108 = this.field3084.field3108;
        arg0.field3109 = this.field3084;
        arg0.field3108.field3109 = arg0;
        arg0.field3109.field3108 = arg0;
    }

    @ObfuscatedName("gj.r()Lgl;")
    public class207 method3532() {
        class207 var1 = this.field3084.field3109;
        if (this.field3084 == var1) {
            this.field3083 = null;
            return null;
        } else {
            this.field3083 = var1.field3109;
            return var1;
        }
    }

    @ObfuscatedName("gj.f()Lgl;")
    public class207 method3533() {
        class207 var1 = this.field3083;
        if (this.field3084 == var1) {
            this.field3083 = null;
            return null;
        } else {
            this.field3083 = var1.field3109;
            return var1;
        }
    }
}
