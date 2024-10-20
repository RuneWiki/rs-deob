package deob;

@ObfuscatedName("gu")
public final class class194 {

    @ObfuscatedName("gu.o")
    public class195 field3002 = new class195();

    public class194() {
        this.field3002.field3004 = this.field3002;
        this.field3002.field3003 = this.field3002;
    }

    @ObfuscatedName("gu.o(Lgg;)V")
    public void method3526(class195 arg0) {
        if (arg0.field3003 != null) {
            arg0.method3545();
        }
        arg0.field3003 = this.field3002.field3003;
        arg0.field3004 = this.field3002;
        arg0.field3003.field3004 = arg0;
        arg0.field3004.field3003 = arg0;
    }

    @ObfuscatedName("gu.l(Lgg;)V")
    public void method3527(class195 arg0) {
        if (arg0.field3003 != null) {
            arg0.method3545();
        }
        arg0.field3003 = this.field3002;
        arg0.field3004 = this.field3002.field3004;
        arg0.field3003.field3004 = arg0;
        arg0.field3004.field3003 = arg0;
    }

    @ObfuscatedName("gu.g()Lgg;")
    public class195 method3533() {
        class195 var1 = this.field3002.field3004;
        if (this.field3002 == var1) {
            return null;
        } else {
            var1.method3545();
            return var1;
        }
    }

    @ObfuscatedName("gu.u()Lgg;")
    public class195 method3529() {
        class195 var1 = this.field3002.field3004;
        return this.field3002 == var1 ? null : var1;
    }

    @ObfuscatedName("gu.q()V")
    public void method3530() {
        while (true) {
            class195 var1 = this.field3002.field3004;
            if (this.field3002 == var1) {
                return;
            }
            var1.method3545();
        }
    }
}
