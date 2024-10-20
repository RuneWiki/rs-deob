package deob;

@ObfuscatedName("fz")
public final class class172 {

    @ObfuscatedName("fz.y")
    public class174 field2802 = new class174();

    public class172() {
        this.field2802.field2805 = this.field2802;
        this.field2802.field2806 = this.field2802;
    }

    @ObfuscatedName("fz.y(Lfn;)V")
    public void method3301(class174 arg0) {
        if (arg0.field2806 != null) {
            arg0.method3327();
        }
        arg0.field2806 = this.field2802.field2806;
        arg0.field2805 = this.field2802;
        arg0.field2806.field2805 = arg0;
        arg0.field2805.field2806 = arg0;
    }

    @ObfuscatedName("fz.m(Lfn;)V")
    public void method3314(class174 arg0) {
        if (arg0.field2806 != null) {
            arg0.method3327();
        }
        arg0.field2806 = this.field2802;
        arg0.field2805 = this.field2802.field2805;
        arg0.field2806.field2805 = arg0;
        arg0.field2805.field2806 = arg0;
    }

    @ObfuscatedName("fz.d()Lfn;")
    public class174 method3303() {
        class174 var1 = this.field2802.field2805;
        if (this.field2802 == var1) {
            return null;
        } else {
            var1.method3327();
            return var1;
        }
    }

    @ObfuscatedName("fz.k()Lfn;")
    public class174 method3304() {
        class174 var1 = this.field2802.field2805;
        return this.field2802 == var1 ? null : var1;
    }

    @ObfuscatedName("fz.n()V")
    public void method3311() {
        while (true) {
            class174 var1 = this.field2802.field2805;
            if (this.field2802 == var1) {
                return;
            }
            var1.method3327();
        }
    }
}
