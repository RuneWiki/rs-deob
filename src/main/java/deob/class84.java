package deob;

@ObfuscatedName("cw")
public class class84 extends class217 {

    @ObfuscatedName("cw.i")
    public class276 field1279;

    @ObfuscatedName("cw.a")
    public class216 field1280 = new class216();

    public class84(class276 arg0) {
        this.field1279 = arg0;
    }

    @ObfuscatedName("cw.t(IIIII)V")
    public void method1744(int arg0, int arg1, int arg2, int arg3) {
        class77 var5 = null;
        int var6 = 0;
        for (class77 var7 = (class77) this.field1280.method3683(); var7 != null; var7 = (class77) this.field1280.method3702()) {
            var6++;
            if (var7.field1202 == arg0) {
                var7.method1528(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1202 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class216.method3681(new class77(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1280.method3683().method3721();
            }
        } else if (var6 < 4) {
            this.field1280.method3680(new class77(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cw.q(II)Lbp;")
    public class77 method1738(int arg0) {
        class77 var2 = (class77) this.field1280.method3683();
        if (var2 == null || var2.field1202 > arg0) {
            return null;
        }
        for (class77 var3 = (class77) this.field1280.method3702(); var3 != null && var3.field1202 <= arg0; var3 = (class77) this.field1280.method3702()) {
            var2.method3721();
            var2 = var3;
        }
        if (this.field1279.field3533 + var2.field1202 + var2.field1201 > arg0) {
            return var2;
        } else {
            var2.method3721();
            return null;
        }
    }

    @ObfuscatedName("cw.i(I)Z")
    public boolean method1739() {
        return this.field1280.method3686();
    }
}
