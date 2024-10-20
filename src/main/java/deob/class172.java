package deob;

@ObfuscatedName("fv")
public final class class172 {

    @ObfuscatedName("fv.p")
    public class174 field2804 = new class174();

    public class172() {
        this.field2804.field2808 = this.field2804;
        this.field2804.field2807 = this.field2804;
    }

    @ObfuscatedName("fv.p(Lfd;)V")
    public void method3281(class174 arg0) {
        if (arg0.field2807 != null) {
            arg0.method3310();
        }
        arg0.field2807 = this.field2804.field2807;
        arg0.field2808 = this.field2804;
        arg0.field2807.field2808 = arg0;
        arg0.field2808.field2807 = arg0;
    }

    @ObfuscatedName("fv.i(Lfd;)V")
    public void method3282(class174 arg0) {
        if (arg0.field2807 != null) {
            arg0.method3310();
        }
        arg0.field2807 = this.field2804;
        arg0.field2808 = this.field2804.field2808;
        arg0.field2807.field2808 = arg0;
        arg0.field2808.field2807 = arg0;
    }

    @ObfuscatedName("fv.o()Lfd;")
    public class174 method3283() {
        class174 var1 = this.field2804.field2808;
        if (this.field2804 == var1) {
            return null;
        } else {
            var1.method3310();
            return var1;
        }
    }

    @ObfuscatedName("fv.n()Lfd;")
    public class174 method3287() {
        class174 var1 = this.field2804.field2808;
        return this.field2804 == var1 ? null : var1;
    }

    @ObfuscatedName("fv.l()V")
    public void method3296() {
        while (true) {
            class174 var1 = this.field2804.field2808;
            if (this.field2804 == var1) {
                return;
            }
            var1.method3310();
        }
    }
}
