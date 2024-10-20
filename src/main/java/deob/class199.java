package deob;

@ObfuscatedName("gv")
public class class199 {

    @ObfuscatedName("gv.i")
    public class211 field3146 = new class211();

    @ObfuscatedName("gv.h")
    public class211 field3147;

    public class199() {
        this.field3146.field3173 = this.field3146;
        this.field3146.field3172 = this.field3146;
    }

    @ObfuscatedName("gv.i(Lhd;)V")
    public void method3555(class211 arg0) {
        if (arg0.field3172 != null) {
            arg0.method3696();
        }
        arg0.field3172 = this.field3146.field3172;
        arg0.field3173 = this.field3146;
        arg0.field3172.field3173 = arg0;
        arg0.field3173.field3172 = arg0;
    }

    @ObfuscatedName("gv.h()Lhd;")
    public class211 method3556() {
        class211 var1 = this.field3146.field3173;
        if (this.field3146 == var1) {
            this.field3147 = null;
            return null;
        } else {
            this.field3147 = var1.field3173;
            return var1;
        }
    }

    @ObfuscatedName("gv.e()Lhd;")
    public class211 method3562() {
        class211 var1 = this.field3147;
        if (this.field3146 == var1) {
            this.field3147 = null;
            return null;
        } else {
            this.field3147 = var1.field3173;
            return var1;
        }
    }
}
