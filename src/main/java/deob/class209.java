package deob;

@ObfuscatedName("hi")
public class class209 {

    @ObfuscatedName("hi.w")
    public class210 field2457 = new class210();

    @ObfuscatedName("hi.m")
    public class210 field2458;

    public class209() {
        this.field2457.field2459 = this.field2457;
        this.field2457.field2460 = this.field2457;
    }

    @ObfuscatedName("hi.w(Lhm;)V")
    public void method3825(class210 arg0) {
        if (arg0.field2460 != null) {
            arg0.method3832();
        }
        arg0.field2460 = this.field2457.field2460;
        arg0.field2459 = this.field2457;
        arg0.field2460.field2459 = arg0;
        arg0.field2459.field2460 = arg0;
    }

    @ObfuscatedName("hi.m()Lhm;")
    public class210 method3823() {
        class210 var1 = this.field2457.field2459;
        if (this.field2457 == var1) {
            this.field2458 = null;
            return null;
        } else {
            this.field2458 = var1.field2459;
            return var1;
        }
    }

    @ObfuscatedName("hi.q()Lhm;")
    public class210 method3822() {
        class210 var1 = this.field2458;
        if (this.field2457 == var1) {
            this.field2458 = null;
            return null;
        } else {
            this.field2458 = var1.field2459;
            return var1;
        }
    }
}
