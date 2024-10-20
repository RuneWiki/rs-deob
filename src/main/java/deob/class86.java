package deob;

@ObfuscatedName("cr")
public class class86 extends class196 {

    @ObfuscatedName("cr.f")
    public class252 field1366;

    @ObfuscatedName("cr.m")
    public class195 field1367 = new class195();

    public class86(class252 arg0) {
        this.field1366 = arg0;
    }

    @ObfuscatedName("cr.s(IIIII)V")
    public void method1557(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1367.method3352(); var7 != null; var7 = (class80) this.field1367.method3367()) {
            var6++;
            if (var7.field1286 == arg0) {
                var7.method1411(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1286 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class195.method3350(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1367.method3352().method3372();
            }
        } else if (var6 < 4) {
            this.field1367.method3361(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cr.c(IB)Lcd;")
    public class80 method1559(int arg0) {
        class80 var2 = (class80) this.field1367.method3352();
        if (var2 == null || var2.field1286 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1367.method3367(); var3 != null && var3.field1286 <= arg0; var3 = (class80) this.field1367.method3367()) {
            var2.method3372();
            var2 = var3;
        }
        if (this.field1366.field3375 + var2.field1289 + var2.field1286 > arg0) {
            return var2;
        } else {
            var2.method3372();
            return null;
        }
    }

    @ObfuscatedName("cr.f(I)Z")
    public boolean method1560() {
        return this.field1367.method3351();
    }
}
