package deob;

@ObfuscatedName("gd")
public class class195 {

    @ObfuscatedName("gd.m")
    public class207 field3067 = new class207();

    @ObfuscatedName("gd.l")
    public class207 field3066;

    public class195() {
        this.field3067.field3091 = this.field3067;
        this.field3067.field3092 = this.field3067;
    }

    @ObfuscatedName("gd.m(Lgq;)V")
    public void method3561(class207 arg0) {
        if (arg0.field3092 != null) {
            arg0.method3698();
        }
        arg0.field3092 = this.field3067.field3092;
        arg0.field3091 = this.field3067;
        arg0.field3092.field3091 = arg0;
        arg0.field3091.field3092 = arg0;
    }

    @ObfuscatedName("gd.l()Lgq;")
    public class207 method3562() {
        class207 var1 = this.field3067.field3091;
        if (this.field3067 == var1) {
            this.field3066 = null;
            return null;
        } else {
            this.field3066 = var1.field3091;
            return var1;
        }
    }

    @ObfuscatedName("gd.y()Lgq;")
    public class207 method3563() {
        class207 var1 = this.field3066;
        if (this.field3067 == var1) {
            this.field3066 = null;
            return null;
        } else {
            this.field3066 = var1.field3091;
            return var1;
        }
    }
}
