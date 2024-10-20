package deob;

@ObfuscatedName("ae")
public class class27 extends class212 {

    @ObfuscatedName("ae.t")
    public class50 field623;

    @ObfuscatedName("ae.y")
    public class206 field618 = new class206();

    public class27(class50 arg0) {
        this.field623 = arg0;
    }

    @ObfuscatedName("ae.s(IIIII)V")
    public void method602(int arg0, int arg1, int arg2, int arg3) {
        class21 var5 = null;
        int var6 = 0;
        for (class21 var7 = (class21) this.field618.method3630(); var7 != null; var7 = (class21) this.field618.method3632()) {
            var6++;
            if (var7.field557 == arg0) {
                var7.method530(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field557 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3626(new class21(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field618.method3630().method3699();
            }
        } else if (var6 < 4) {
            this.field618.method3631(new class21(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ae.z(II)Li;")
    public class21 method591(int arg0) {
        class21 var2 = (class21) this.field618.method3630();
        if (var2 == null || var2.field557 > arg0) {
            return null;
        }
        for (class21 var3 = (class21) this.field618.method3632(); var3 != null && var3.field557 <= arg0; var3 = (class21) this.field618.method3632()) {
            var2.method3699();
            var2 = var3;
        }
        if (this.field623.field1057 + var2.field557 + var2.field554 > arg0) {
            return var2;
        } else {
            var2.method3699();
            return null;
        }
    }

    @ObfuscatedName("ae.t(I)Z")
    public boolean method592() {
        return this.field618.method3646();
    }
}
