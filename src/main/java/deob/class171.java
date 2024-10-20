package deob;

@ObfuscatedName("fo")
public final class class171 {

    @ObfuscatedName("fo.p")
    public class173 field2794 = new class173();

    public class171() {
        this.field2794.field2798 = this.field2794;
        this.field2794.field2797 = this.field2794;
    }

    @ObfuscatedName("fo.p(Lfa;)V")
    public void method3232(class173 arg0) {
        if (arg0.field2797 != null) {
            arg0.method3260();
        }
        arg0.field2797 = this.field2794.field2797;
        arg0.field2798 = this.field2794;
        arg0.field2797.field2798 = arg0;
        arg0.field2798.field2797 = arg0;
    }

    @ObfuscatedName("fo.j(Lfa;)V")
    public void method3233(class173 arg0) {
        if (arg0.field2797 != null) {
            arg0.method3260();
        }
        arg0.field2797 = this.field2794;
        arg0.field2798 = this.field2794.field2798;
        arg0.field2797.field2798 = arg0;
        arg0.field2798.field2797 = arg0;
    }

    @ObfuscatedName("fo.w()Lfa;")
    public class173 method3234() {
        class173 var1 = this.field2794.field2798;
        if (this.field2794 == var1) {
            return null;
        } else {
            var1.method3260();
            return var1;
        }
    }

    @ObfuscatedName("fo.h()Lfa;")
    public class173 method3235() {
        class173 var1 = this.field2794.field2798;
        return this.field2794 == var1 ? null : var1;
    }

    @ObfuscatedName("fo.v()V")
    public void method3238() {
        while (true) {
            class173 var1 = this.field2794.field2798;
            if (this.field2794 == var1) {
                return;
            }
            var1.method3260();
        }
    }
}
