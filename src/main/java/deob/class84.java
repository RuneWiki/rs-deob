package deob;

@ObfuscatedName("ci")
public class class84 extends class217 {

    @ObfuscatedName("ci.n")
    public class276 field1287;

    @ObfuscatedName("ci.r")
    public class216 field1288 = new class216();

    public class84(class276 arg0) {
        this.field1287 = arg0;
    }

    @ObfuscatedName("ci.d(IIIII)V")
    public void method1714(int arg0, int arg1, int arg2, int arg3) {
        class77 var5 = null;
        int var6 = 0;
        for (class77 var7 = (class77) this.field1288.method3762(); var7 != null; var7 = (class77) this.field1288.method3756()) {
            var6++;
            if (var7.field1203 == arg0) {
                var7.method1516(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1203 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class216.method3752(new class77(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1288.method3762().method3785();
            }
        } else if (var6 < 4) {
            this.field1288.method3751(new class77(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ci.z(II)Lbo;")
    public class77 method1716(int arg0) {
        class77 var2 = (class77) this.field1288.method3762();
        if (var2 == null || var2.field1203 > arg0) {
            return null;
        }
        for (class77 var3 = (class77) this.field1288.method3756(); var3 != null && var3.field1203 <= arg0; var3 = (class77) this.field1288.method3756()) {
            var2.method3785();
            var2 = var3;
        }
        if (this.field1287.field3526 + var2.field1205 + var2.field1203 > arg0) {
            return var2;
        } else {
            var2.method3785();
            return null;
        }
    }

    @ObfuscatedName("ci.n(I)Z")
    public boolean method1717() {
        return this.field1288.method3755();
    }
}
