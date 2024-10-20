package deob;

@ObfuscatedName("cx")
public class class88 extends class190 {

    @ObfuscatedName("cx.l")
    public class258 field1149;

    @ObfuscatedName("cx.m")
    public class272 field1151 = new class272();

    public class88(class258 arg0) {
        this.field1149 = arg0;
    }

    @ObfuscatedName("cx.f(IIIII)V")
    public void method1944(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1151.method4572(); var7 != null; var7 = (class80) this.field1151.method4574()) {
            var6++;
            if (var7.field1043 == arg0) {
                var7.method1682(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1043 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class272.method4571(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1151.method4572().method3407();
            }
        } else if (var6 < 4) {
            this.field1151.method4570(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cx.b(II)Lce;")
    public class80 method1952(int arg0) {
        class80 var2 = (class80) this.field1151.method4572();
        if (var2 == null || var2.field1043 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1151.method4574(); var3 != null && var3.field1043 <= arg0; var3 = (class80) this.field1151.method4574()) {
            var2.method3407();
            var2 = var3;
        }
        if (this.field1149.field3314 + var2.field1043 + var2.field1039 > arg0) {
            return var2;
        } else {
            var2.method3407();
            return null;
        }
    }

    @ObfuscatedName("cx.l(I)Z")
    public boolean method1947() {
        return this.field1151.method4576();
    }
}
