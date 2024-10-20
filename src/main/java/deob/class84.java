package deob;

@ObfuscatedName("cg")
public class class84 extends class193 {

    @ObfuscatedName("cg.q")
    public class249 field1358;

    @ObfuscatedName("cg.o")
    public class192 field1359 = new class192();

    public class84(class249 arg0) {
        this.field1358 = arg0;
    }

    @ObfuscatedName("cg.w(IIIIB)V")
    public void method1562(int arg0, int arg1, int arg2, int arg3) {
        class78 var5 = null;
        int var6 = 0;
        for (class78 var7 = (class78) this.field1359.method3395(); var7 != null; var7 = (class78) this.field1359.method3417()) {
            var6++;
            if (var7.field1276 == arg0) {
                var7.method1429(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1276 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class192.method3420(new class78(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1359.method3395().method3425();
            }
        } else if (var6 < 4) {
            this.field1359.method3392(new class78(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cg.s(II)Lbu;")
    public class78 method1567(int arg0) {
        class78 var2 = (class78) this.field1359.method3395();
        if (var2 == null || var2.field1276 > arg0) {
            return null;
        }
        for (class78 var3 = (class78) this.field1359.method3417(); var3 != null && var3.field1276 <= arg0; var3 = (class78) this.field1359.method3417()) {
            var2.method3425();
            var2 = var3;
        }
        if (this.field1358.field3369 + var2.field1276 + var2.field1273 > arg0) {
            return var2;
        } else {
            var2.method3425();
            return null;
        }
    }

    @ObfuscatedName("cg.q(I)Z")
    public boolean method1561() {
        return this.field1359.method3398();
    }
}
