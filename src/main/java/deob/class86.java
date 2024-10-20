package deob;

@ObfuscatedName("cq")
public class class86 extends class196 {

    @ObfuscatedName("cq.x")
    public class252 field1386;

    @ObfuscatedName("cq.k")
    public class195 field1379 = new class195();

    public class86(class252 arg0) {
        this.field1386 = arg0;
    }

    @ObfuscatedName("cq.w(IIIIB)V")
    public void method1518(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1379.method3273(); var7 != null; var7 = (class80) this.field1379.method3275()) {
            var6++;
            if (var7.field1302 == arg0) {
                var7.method1406(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1302 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class195.method3272(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1379.method3273().method3294();
            }
        } else if (var6 < 4) {
            this.field1379.method3289(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cq.o(II)Lck;")
    public class80 method1519(int arg0) {
        class80 var2 = (class80) this.field1379.method3273();
        if (var2 == null || var2.field1302 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1379.method3275(); var3 != null && var3.field1302 <= arg0; var3 = (class80) this.field1379.method3275()) {
            var2.method3294();
            var2 = var3;
        }
        if (this.field1386.field3370 + var2.field1302 + var2.field1300 > arg0) {
            return var2;
        } else {
            var2.method3294();
            return null;
        }
    }

    @ObfuscatedName("cq.x(B)Z")
    public boolean method1524() {
        return this.field1379.method3276();
    }
}
