package deob;

@ObfuscatedName("cf")
public class class84 extends class217 {

    @ObfuscatedName("cf.b")
    public class276 field1292;

    @ObfuscatedName("cf.z")
    public class216 field1293 = new class216();

    public class84(class276 arg0) {
        this.field1292 = arg0;
    }

    @ObfuscatedName("cf.g(IIIII)V")
    public void method1802(int arg0, int arg1, int arg2, int arg3) {
        class77 var5 = null;
        int var6 = 0;
        for (class77 var7 = (class77) this.field1293.method3767(); var7 != null; var7 = (class77) this.field1293.method3765()) {
            var6++;
            if (var7.field1202 == arg0) {
                var7.method1601(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1202 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class216.method3762(new class77(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1293.method3767().method3796();
            }
        } else if (var6 < 4) {
            this.field1293.method3760(new class77(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cf.e(IB)Lbv;")
    public class77 method1804(int arg0) {
        class77 var2 = (class77) this.field1293.method3767();
        if (var2 == null || var2.field1202 > arg0) {
            return null;
        }
        for (class77 var3 = (class77) this.field1293.method3765(); var3 != null && var3.field1202 <= arg0; var3 = (class77) this.field1293.method3765()) {
            var2.method3796();
            var2 = var3;
        }
        if (this.field1292.field3533 + var2.field1204 + var2.field1202 > arg0) {
            return var2;
        } else {
            var2.method3796();
            return null;
        }
    }

    @ObfuscatedName("cf.b(B)Z")
    public boolean method1805() {
        return this.field1293.method3778();
    }
}
