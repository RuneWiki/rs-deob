package deob;

@ObfuscatedName("gn")
public final class class185 {

    @ObfuscatedName("gn.e")
    public class195 field2429 = new class195();

    public class185() {
        this.field2429.field2457 = this.field2429;
        this.field2429.field2458 = this.field2429;
    }

    @ObfuscatedName("gn.e(Lgt;)V")
    public void method3199(class195 arg0) {
        if (arg0.field2458 != null) {
            arg0.method3351();
        }
        arg0.field2458 = this.field2429.field2458;
        arg0.field2457 = this.field2429;
        arg0.field2458.field2457 = arg0;
        arg0.field2457.field2458 = arg0;
    }

    @ObfuscatedName("gn.o(Lgt;)V")
    public void method3201(class195 arg0) {
        if (arg0.field2458 != null) {
            arg0.method3351();
        }
        arg0.field2458 = this.field2429;
        arg0.field2457 = this.field2429.field2457;
        arg0.field2458.field2457 = arg0;
        arg0.field2457.field2458 = arg0;
    }

    @ObfuscatedName("gn.m()Lgt;")
    public class195 method3198() {
        class195 var1 = this.field2429.field2457;
        if (this.field2429 == var1) {
            return null;
        } else {
            var1.method3351();
            return var1;
        }
    }

    @ObfuscatedName("gn.g()Lgt;")
    public class195 method3202() {
        class195 var1 = this.field2429.field2457;
        return this.field2429 == var1 ? null : var1;
    }

    @ObfuscatedName("gn.d()V")
    public void method3203() {
        while (true) {
            class195 var1 = this.field2429.field2457;
            if (this.field2429 == var1) {
                return;
            }
            var1.method3351();
        }
    }
}
