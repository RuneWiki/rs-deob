package deob;

@ObfuscatedName("gj")
public final class class194 {

    @ObfuscatedName("gj.n")
    public class195 field3007 = new class195();

    public class194() {
        this.field3007.field3008 = this.field3007;
        this.field3007.field3009 = this.field3007;
    }

    @ObfuscatedName("gj.n(Lgo;)V")
    public void method3503(class195 arg0) {
        if (arg0.field3009 != null) {
            arg0.method3518();
        }
        arg0.field3009 = this.field3007.field3009;
        arg0.field3008 = this.field3007;
        arg0.field3009.field3008 = arg0;
        arg0.field3008.field3009 = arg0;
    }

    @ObfuscatedName("gj.o(Lgo;)V")
    public void method3504(class195 arg0) {
        if (arg0.field3009 != null) {
            arg0.method3518();
        }
        arg0.field3009 = this.field3007;
        arg0.field3008 = this.field3007.field3008;
        arg0.field3009.field3008 = arg0;
        arg0.field3008.field3009 = arg0;
    }

    @ObfuscatedName("gj.a()Lgo;")
    public class195 method3511() {
        class195 var1 = this.field3007.field3008;
        if (this.field3007 == var1) {
            return null;
        } else {
            var1.method3518();
            return var1;
        }
    }

    @ObfuscatedName("gj.w()Lgo;")
    public class195 method3506() {
        class195 var1 = this.field3007.field3008;
        return this.field3007 == var1 ? null : var1;
    }

    @ObfuscatedName("gj.m()V")
    public void method3507() {
        while (true) {
            class195 var1 = this.field3007.field3008;
            if (this.field3007 == var1) {
                return;
            }
            var1.method3518();
        }
    }
}
