package deob;

@ObfuscatedName("gq")
public final class class192 {

    @ObfuscatedName("gq.m")
    public class202 field2539 = new class202();

    public class192() {
        this.field2539.field2567 = this.field2539;
        this.field2539.field2568 = this.field2539;
    }

    @ObfuscatedName("gq.m(Lgu;)V")
    public void method3369(class202 arg0) {
        if (arg0.field2568 != null) {
            arg0.method3513();
        }
        arg0.field2568 = this.field2539.field2568;
        arg0.field2567 = this.field2539;
        arg0.field2568.field2567 = arg0;
        arg0.field2567.field2568 = arg0;
    }

    @ObfuscatedName("gq.p(Lgu;)V")
    public void method3370(class202 arg0) {
        if (arg0.field2568 != null) {
            arg0.method3513();
        }
        arg0.field2568 = this.field2539;
        arg0.field2567 = this.field2539.field2567;
        arg0.field2568.field2567 = arg0;
        arg0.field2567.field2568 = arg0;
    }

    @ObfuscatedName("gq.i()Lgu;")
    public class202 method3383() {
        class202 var1 = this.field2539.field2567;
        if (this.field2539 == var1) {
            return null;
        } else {
            var1.method3513();
            return var1;
        }
    }

    @ObfuscatedName("gq.j()Lgu;")
    public class202 method3372() {
        class202 var1 = this.field2539.field2567;
        return this.field2539 == var1 ? null : var1;
    }

    @ObfuscatedName("gq.v()V")
    public void method3373() {
        while (true) {
            class202 var1 = this.field2539.field2567;
            if (this.field2539 == var1) {
                return;
            }
            var1.method3513();
        }
    }
}
