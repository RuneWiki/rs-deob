package deob;

@ObfuscatedName("gv")
public class class207 {

    @ObfuscatedName("gv.a")
    public class208 field2597 = new class208();

    @ObfuscatedName("gv.w")
    public class208 field2596;

    public class207() {
        this.field2597.field2599 = this.field2597;
        this.field2597.field2598 = this.field2597;
    }

    @ObfuscatedName("gv.a(Lgc;)V")
    public void method3481(class208 arg0) {
        if (arg0.field2598 != null) {
            arg0.method3492();
        }
        arg0.field2598 = this.field2597.field2598;
        arg0.field2599 = this.field2597;
        arg0.field2598.field2599 = arg0;
        arg0.field2599.field2598 = arg0;
    }

    @ObfuscatedName("gv.w()Lgc;")
    public class208 method3482() {
        class208 var1 = this.field2597.field2599;
        if (this.field2597 == var1) {
            this.field2596 = null;
            return null;
        } else {
            this.field2596 = var1.field2599;
            return var1;
        }
    }

    @ObfuscatedName("gv.e()Lgc;")
    public class208 method3485() {
        class208 var1 = this.field2596;
        if (this.field2597 == var1) {
            this.field2596 = null;
            return null;
        } else {
            this.field2596 = var1.field2599;
            return var1;
        }
    }
}
