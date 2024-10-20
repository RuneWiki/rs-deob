package deob;

@ObfuscatedName("gy")
public class class199 {

    @ObfuscatedName("gy.x")
    public class211 field3145 = new class211();

    @ObfuscatedName("gy.r")
    public class211 field3146;

    public class199() {
        this.field3145.field3171 = this.field3145;
        this.field3145.field3172 = this.field3145;
    }

    @ObfuscatedName("gy.x(Lhx;)V")
    public void method3562(class211 arg0) {
        if (arg0.field3172 != null) {
            arg0.method3691();
        }
        arg0.field3172 = this.field3145.field3172;
        arg0.field3171 = this.field3145;
        arg0.field3172.field3171 = arg0;
        arg0.field3171.field3172 = arg0;
    }

    @ObfuscatedName("gy.r()Lhx;")
    public class211 method3559() {
        class211 var1 = this.field3145.field3171;
        if (this.field3145 == var1) {
            this.field3146 = null;
            return null;
        } else {
            this.field3146 = var1.field3171;
            return var1;
        }
    }

    @ObfuscatedName("gy.j()Lhx;")
    public class211 method3560() {
        class211 var1 = this.field3146;
        if (this.field3145 == var1) {
            this.field3146 = null;
            return null;
        } else {
            this.field3146 = var1.field3171;
            return var1;
        }
    }
}
