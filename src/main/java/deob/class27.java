package deob;

@ObfuscatedName("aj")
public class class27 extends class212 {

    @ObfuscatedName("aj.e")
    public class50 field636;

    @ObfuscatedName("aj.o")
    public class206 field639 = new class206();

    public class27(class50 arg0) {
        this.field636 = arg0;
    }

    @ObfuscatedName("aj.m(IIIII)V")
    public void method595(int arg0, int arg1, int arg2, int arg3) {
        class21 var5 = null;
        int var6 = 0;
        for (class21 var7 = (class21) this.field639.method3660(); var7 != null; var7 = (class21) this.field639.method3675()) {
            var6++;
            if (var7.field566 == arg0) {
                var7.method543(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field566 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3662(new class21(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field639.method3660().method3729();
            }
        } else if (var6 < 4) {
            this.field639.method3657(new class21(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("aj.w(II)Lc;")
    public class21 method592(int arg0) {
        class21 var2 = (class21) this.field639.method3660();
        if (var2 == null || var2.field566 > arg0) {
            return null;
        }
        for (class21 var3 = (class21) this.field639.method3675(); var3 != null && var3.field566 <= arg0; var3 = (class21) this.field639.method3675()) {
            var2.method3729();
            var2 = var3;
        }
        if (this.field636.field1096 + var2.field566 + var2.field559 > arg0) {
            return var2;
        } else {
            var2.method3729();
            return null;
        }
    }

    @ObfuscatedName("aj.e(I)Z")
    public boolean method593() {
        return this.field639.method3663();
    }
}
