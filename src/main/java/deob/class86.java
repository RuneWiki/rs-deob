package deob;

@ObfuscatedName("cb")
public class class86 extends class193 {

    @ObfuscatedName("cb.i")
    public class249 field1374;

    @ObfuscatedName("cb.j")
    public class192 field1370 = new class192();

    public class86(class249 arg0) {
        this.field1374 = arg0;
    }

    @ObfuscatedName("cb.n(IIIII)V")
    public void method1545(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1370.method3321(); var7 != null; var7 = (class80) this.field1370.method3323()) {
            var6++;
            if (var7.field1294 == arg0) {
                var7.method1406(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1294 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class192.method3335(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1370.method3321().method3347();
            }
        } else if (var6 < 4) {
            this.field1370.method3326(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cb.p(IB)Lcy;")
    public class80 method1547(int arg0) {
        class80 var2 = (class80) this.field1370.method3321();
        if (var2 == null || var2.field1294 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1370.method3323(); var3 != null && var3.field1294 <= arg0; var3 = (class80) this.field1370.method3323()) {
            var2.method3347();
            var2 = var3;
        }
        if (this.field1374.field3371 + var2.field1294 + var2.field1292 > arg0) {
            return var2;
        } else {
            var2.method3347();
            return null;
        }
    }

    @ObfuscatedName("cb.i(I)Z")
    public boolean method1548() {
        return this.field1370.method3318();
    }
}
