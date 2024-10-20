package deob;

@ObfuscatedName("fl")
public final class class172 {

    @ObfuscatedName("fl.g")
    public class174 field2798 = new class174();

    public class172() {
        this.field2798.field2801 = this.field2798;
        this.field2798.field2802 = this.field2798;
    }

    @ObfuscatedName("fl.g(Lfn;)V")
    public void method3256(class174 arg0) {
        if (arg0.field2802 != null) {
            arg0.method3289();
        }
        arg0.field2802 = this.field2798.field2802;
        arg0.field2801 = this.field2798;
        arg0.field2802.field2801 = arg0;
        arg0.field2801.field2802 = arg0;
    }

    @ObfuscatedName("fl.m(Lfn;)V")
    public void method3257(class174 arg0) {
        if (arg0.field2802 != null) {
            arg0.method3289();
        }
        arg0.field2802 = this.field2798;
        arg0.field2801 = this.field2798.field2801;
        arg0.field2802.field2801 = arg0;
        arg0.field2801.field2802 = arg0;
    }

    @ObfuscatedName("fl.v()Lfn;")
    public class174 method3258() {
        class174 var1 = this.field2798.field2801;
        if (this.field2798 == var1) {
            return null;
        } else {
            var1.method3289();
            return var1;
        }
    }

    @ObfuscatedName("fl.r()Lfn;")
    public class174 method3262() {
        class174 var1 = this.field2798.field2801;
        return this.field2798 == var1 ? null : var1;
    }

    @ObfuscatedName("fl.n()V")
    public void method3260() {
        while (true) {
            class174 var1 = this.field2798.field2801;
            if (this.field2798 == var1) {
                return;
            }
            var1.method3289();
        }
    }
}
