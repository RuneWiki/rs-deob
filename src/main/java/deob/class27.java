package deob;

@ObfuscatedName("aq")
public class class27 extends class212 {

    @ObfuscatedName("aq.f")
    public class50 field630;

    @ObfuscatedName("aq.c")
    public class206 field629 = new class206();

    public class27(class50 arg0) {
        this.field630 = arg0;
    }

    @ObfuscatedName("aq.k(IIIII)V")
    public void method606(int arg0, int arg1, int arg2, int arg3) {
        class21 var5 = null;
        int var6 = 0;
        for (class21 var7 = (class21) this.field629.method3645(); var7 != null; var7 = (class21) this.field629.method3665()) {
            var6++;
            if (var7.field567 == arg0) {
                var7.method558(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field567 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3639(new class21(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field629.method3645().method3703();
            }
        } else if (var6 < 4) {
            this.field629.method3654(new class21(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("aq.q(IB)Ln;")
    public class21 method610(int arg0) {
        class21 var2 = (class21) this.field629.method3645();
        if (var2 == null || var2.field567 > arg0) {
            return null;
        }
        for (class21 var3 = (class21) this.field629.method3665(); var3 != null && var3.field567 <= arg0; var3 = (class21) this.field629.method3665()) {
            var2.method3703();
            var2 = var3;
        }
        if (this.field630.field1095 + var2.field568 + var2.field567 > arg0) {
            return var2;
        } else {
            var2.method3703();
            return null;
        }
    }

    @ObfuscatedName("aq.f(B)Z")
    public boolean method600() {
        return this.field629.method3649();
    }
}
