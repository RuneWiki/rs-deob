package deob;

@ObfuscatedName("am")
public class class27 extends class212 {

    @ObfuscatedName("am.e")
    public class50 field663;

    @ObfuscatedName("am.g")
    public class206 field659 = new class206();

    public class27(class50 arg0) {
        this.field663 = arg0;
    }

    @ObfuscatedName("am.i(IIIIB)V")
    public void method571(int arg0, int arg1, int arg2, int arg3) {
        class21 var5 = null;
        int var6 = 0;
        for (class21 var7 = (class21) this.field659.method3633(); var7 != null; var7 = (class21) this.field659.method3635()) {
            var6++;
            if (var7.field595 == arg0) {
                var7.method521(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field595 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3642(new class21(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field659.method3633().method3706();
            }
        } else if (var6 < 4) {
            this.field659.method3651(new class21(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("am.h(II)Lq;")
    public class21 method576(int arg0) {
        class21 var2 = (class21) this.field659.method3633();
        if (var2 == null || var2.field595 > arg0) {
            return null;
        }
        for (class21 var3 = (class21) this.field659.method3635(); var3 != null && var3.field595 <= arg0; var3 = (class21) this.field659.method3635()) {
            var2.method3706();
            var2 = var3;
        }
        if (this.field663.field1088 + var2.field595 + var2.field593 > arg0) {
            return var2;
        } else {
            var2.method3706();
            return null;
        }
    }

    @ObfuscatedName("am.e(I)Z")
    public boolean method573() {
        return this.field659.method3636();
    }
}
