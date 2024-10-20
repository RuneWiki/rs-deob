package deob;

@ObfuscatedName("aj")
public class class27 extends class212 {

    @ObfuscatedName("aj.n")
    public class50 field643;

    @ObfuscatedName("aj.t")
    public class206 field641 = new class206();

    public class27(class50 arg0) {
        this.field643 = arg0;
    }

    @ObfuscatedName("aj.f(IIIIB)V")
    public void method600(int arg0, int arg1, int arg2, int arg3) {
        class21 var5 = null;
        int var6 = 0;
        for (class21 var7 = (class21) this.field641.method3688(); var7 != null; var7 = (class21) this.field641.method3684()) {
            var6++;
            if (var7.field571 == arg0) {
                var7.method553(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field571 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3692(new class21(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field641.method3688().method3744();
            }
        } else if (var6 < 4) {
            this.field641.method3686(new class21(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("aj.e(II)La;")
    public class21 method601(int arg0) {
        class21 var2 = (class21) this.field641.method3688();
        if (var2 == null || var2.field571 > arg0) {
            return null;
        }
        for (class21 var3 = (class21) this.field641.method3684(); var3 != null && var3.field571 <= arg0; var3 = (class21) this.field641.method3684()) {
            var2.method3744();
            var2 = var3;
        }
        if (this.field643.field1085 + var2.field571 + var2.field569 > arg0) {
            return var2;
        } else {
            var2.method3744();
            return null;
        }
    }

    @ObfuscatedName("aj.n(S)Z")
    public boolean method602() {
        return this.field641.method3691();
    }
}
