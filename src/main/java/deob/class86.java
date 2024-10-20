package deob;

@ObfuscatedName("ck")
public class class86 extends class193 {

    @ObfuscatedName("ck.n")
    public class249 field1359;

    @ObfuscatedName("ck.r")
    public class192 field1364 = new class192();

    public class86(class249 arg0) {
        this.field1359 = arg0;
    }

    @ObfuscatedName("ck.a(IIIII)V")
    public void method1506(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1364.method3282(); var7 != null; var7 = (class80) this.field1364.method3284()) {
            var6++;
            if (var7.field1283 == arg0) {
                var7.method1372(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1283 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class192.method3280(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1364.method3282().method3308();
            }
        } else if (var6 < 4) {
            this.field1364.method3279(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ck.j(IB)Lcs;")
    public class80 method1505(int arg0) {
        class80 var2 = (class80) this.field1364.method3282();
        if (var2 == null || var2.field1283 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1364.method3284(); var3 != null && var3.field1283 <= arg0; var3 = (class80) this.field1364.method3284()) {
            var2.method3308();
            var2 = var3;
        }
        if (this.field1359.field3373 + var2.field1283 + var2.field1276 > arg0) {
            return var2;
        } else {
            var2.method3308();
            return null;
        }
    }

    @ObfuscatedName("ck.n(S)Z")
    public boolean method1514() {
        return this.field1364.method3299();
    }
}
