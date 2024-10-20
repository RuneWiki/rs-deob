package deob;

@ObfuscatedName("ah")
public class class27 extends class212 {

    @ObfuscatedName("ah.c")
    public class50 field668;

    @ObfuscatedName("ah.h")
    public class206 field660 = new class206();

    public class27(class50 arg0) {
        this.field668 = arg0;
    }

    @ObfuscatedName("ah.e(IIIIB)V")
    public void method581(int arg0, int arg1, int arg2, int arg3) {
        class21 var5 = null;
        int var6 = 0;
        for (class21 var7 = (class21) this.field660.method3693(); var7 != null; var7 = (class21) this.field660.method3695()) {
            var6++;
            if (var7.field589 == arg0) {
                var7.method526(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field589 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3692(new class21(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field660.method3693().method3755();
            }
        } else if (var6 < 4) {
            this.field660.method3700(new class21(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ah.l(II)Lm;")
    public class21 method580(int arg0) {
        class21 var2 = (class21) this.field660.method3693();
        if (var2 == null || var2.field589 > arg0) {
            return null;
        }
        for (class21 var3 = (class21) this.field660.method3695(); var3 != null && var3.field589 <= arg0; var3 = (class21) this.field660.method3695()) {
            var2.method3755();
            var2 = var3;
        }
        if (this.field668.field1105 + var2.field591 + var2.field589 > arg0) {
            return var2;
        } else {
            var2.method3755();
            return null;
        }
    }

    @ObfuscatedName("ah.c(I)Z")
    public boolean method590() {
        return this.field660.method3689();
    }
}
