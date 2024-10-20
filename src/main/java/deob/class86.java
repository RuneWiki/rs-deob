package deob;

@ObfuscatedName("ct")
public class class86 extends class193 {

    @ObfuscatedName("ct.x")
    public class249 field1331;

    @ObfuscatedName("ct.y")
    public class192 field1334 = new class192();

    public class86(class249 arg0) {
        this.field1331 = arg0;
    }

    @ObfuscatedName("ct.d(IIIII)V")
    public void method1541(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1334.method3282(); var7 != null; var7 = (class80) this.field1334.method3277()) {
            var6++;
            if (var7.field1258 == arg0) {
                var7.method1410(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1258 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class192.method3280(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1334.method3282().method3312();
            }
        } else if (var6 < 4) {
            this.field1334.method3291(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ct.q(II)Lcl;")
    public class80 method1548(int arg0) {
        class80 var2 = (class80) this.field1334.method3282();
        if (var2 == null || var2.field1258 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1334.method3277(); var3 != null && var3.field1258 <= arg0; var3 = (class80) this.field1334.method3277()) {
            var2.method3312();
            var2 = var3;
        }
        if (this.field1331.field3344 + var2.field1258 + var2.field1254 > arg0) {
            return var2;
        } else {
            var2.method3312();
            return null;
        }
    }

    @ObfuscatedName("ct.x(B)Z")
    public boolean method1543() {
        return this.field1334.method3285();
    }
}
