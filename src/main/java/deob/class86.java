package deob;

@ObfuscatedName("cs")
public class class86 extends class193 {

    @ObfuscatedName("cs.u")
    public class249 field1344;

    @ObfuscatedName("cs.q")
    public class192 field1351 = new class192();

    public class86(class249 arg0) {
        this.field1344 = arg0;
    }

    @ObfuscatedName("cs.i(IIIII)V")
    public void method1570(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1351.method3336(); var7 != null; var7 = (class80) this.field1351.method3341()) {
            var6++;
            if (var7.field1260 == arg0) {
                var7.method1425(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1260 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class192.method3343(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1351.method3336().method3364();
            }
        } else if (var6 < 4) {
            this.field1351.method3335(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cs.h(II)Lcz;")
    public class80 method1572(int arg0) {
        class80 var2 = (class80) this.field1351.method3336();
        if (var2 == null || var2.field1260 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1351.method3341(); var3 != null && var3.field1260 <= arg0; var3 = (class80) this.field1351.method3341()) {
            var2.method3364();
            var2 = var3;
        }
        if (this.field1344.field3360 + var2.field1262 + var2.field1260 > arg0) {
            return var2;
        } else {
            var2.method3364();
            return null;
        }
    }

    @ObfuscatedName("cs.u(I)Z")
    public boolean method1576() {
        return this.field1351.method3342();
    }
}
