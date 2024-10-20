package deob;

@ObfuscatedName("fe")
public final class class172 {

    @ObfuscatedName("fe.i")
    public class174 field2802 = new class174();

    public class172() {
        this.field2802.field2805 = this.field2802;
        this.field2802.field2806 = this.field2802;
    }

    @ObfuscatedName("fe.i(Lfd;)V")
    public void method3235(class174 arg0) {
        if (arg0.field2806 != null) {
            arg0.method3264();
        }
        arg0.field2806 = this.field2802.field2806;
        arg0.field2805 = this.field2802;
        arg0.field2806.field2805 = arg0;
        arg0.field2805.field2806 = arg0;
    }

    @ObfuscatedName("fe.p(Lfd;)V")
    public void method3236(class174 arg0) {
        if (arg0.field2806 != null) {
            arg0.method3264();
        }
        arg0.field2806 = this.field2802;
        arg0.field2805 = this.field2802.field2805;
        arg0.field2806.field2805 = arg0;
        arg0.field2805.field2806 = arg0;
    }

    @ObfuscatedName("fe.a()Lfd;")
    public class174 method3244() {
        class174 var1 = this.field2802.field2805;
        if (this.field2802 == var1) {
            return null;
        } else {
            var1.method3264();
            return var1;
        }
    }

    @ObfuscatedName("fe.l()Lfd;")
    public class174 method3250() {
        class174 var1 = this.field2802.field2805;
        return this.field2802 == var1 ? null : var1;
    }

    @ObfuscatedName("fe.q()V")
    public void method3239() {
        while (true) {
            class174 var1 = this.field2802.field2805;
            if (this.field2802 == var1) {
                return;
            }
            var1.method3264();
        }
    }
}
