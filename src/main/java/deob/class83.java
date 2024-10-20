package deob;

@ObfuscatedName("cw")
public class class83 extends class204 {

    @ObfuscatedName("cw.w")
    public class260 field1250;

    @ObfuscatedName("cw.s")
    public class203 field1251 = new class203();

    public class83(class260 arg0) {
        this.field1250 = arg0;
    }

    @ObfuscatedName("cw.p(IIIII)V")
    public void method1687(int arg0, int arg1, int arg2, int arg3) {
        class76 var5 = null;
        int var6 = 0;
        for (class76 var7 = (class76) this.field1251.method3556(); var7 != null; var7 = (class76) this.field1251.method3537()) {
            var6++;
            if (var7.field1160 == arg0) {
                var7.method1487(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1160 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class203.method3542(new class76(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1251.method3556().method3561();
            }
        } else if (var6 < 4) {
            this.field1251.method3532(new class76(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cw.i(IB)Lbj;")
    public class76 method1690(int arg0) {
        class76 var2 = (class76) this.field1251.method3556();
        if (var2 == null || var2.field1160 > arg0) {
            return null;
        }
        for (class76 var3 = (class76) this.field1251.method3537(); var3 != null && var3.field1160 <= arg0; var3 = (class76) this.field1251.method3537()) {
            var2.method3561();
            var2 = var3;
        }
        if (this.field1250.field3430 + var2.field1163 + var2.field1160 > arg0) {
            return var2;
        } else {
            var2.method3561();
            return null;
        }
    }

    @ObfuscatedName("cw.w(B)Z")
    public boolean method1689() {
        return this.field1251.method3538();
    }
}
