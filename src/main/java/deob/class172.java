package deob;

@ObfuscatedName("fa")
public final class class172 {

    @ObfuscatedName("fa.p")
    public class174 field2804 = new class174();

    public class172() {
        this.field2804.field2807 = this.field2804;
        this.field2804.field2808 = this.field2804;
    }

    @ObfuscatedName("fa.p(Lfe;)V")
    public void method3373(class174 arg0) {
        if (arg0.field2808 != null) {
            arg0.method3401();
        }
        arg0.field2808 = this.field2804.field2808;
        arg0.field2807 = this.field2804;
        arg0.field2808.field2807 = arg0;
        arg0.field2807.field2808 = arg0;
    }

    @ObfuscatedName("fa.l(Lfe;)V")
    public void method3372(class174 arg0) {
        if (arg0.field2808 != null) {
            arg0.method3401();
        }
        arg0.field2808 = this.field2804;
        arg0.field2807 = this.field2804.field2807;
        arg0.field2808.field2807 = arg0;
        arg0.field2807.field2808 = arg0;
    }

    @ObfuscatedName("fa.d()Lfe;")
    public class174 method3375() {
        class174 var1 = this.field2804.field2807;
        if (this.field2804 == var1) {
            return null;
        } else {
            var1.method3401();
            return var1;
        }
    }

    @ObfuscatedName("fa.x()Lfe;")
    public class174 method3383() {
        class174 var1 = this.field2804.field2807;
        return this.field2804 == var1 ? null : var1;
    }

    @ObfuscatedName("fa.o()V")
    public void method3377() {
        while (true) {
            class174 var1 = this.field2804.field2807;
            if (this.field2804 == var1) {
                return;
            }
            var1.method3401();
        }
    }
}
