package deob;

@ObfuscatedName("bm")
public class class78 extends class212 {

    @ObfuscatedName("bm.g")
    public class268 field1101;

    @ObfuscatedName("bm.x")
    public class211 field1100 = new class211();

    public class78(class268 arg0) {
        this.field1101 = arg0;
    }

    @ObfuscatedName("bm.a(IIIIB)V")
    public void method1892(int arg0, int arg1, int arg2, int arg3) {
        class71 var5 = null;
        int var6 = 0;
        for (class71 var7 = (class71) this.field1100.method3936(); var7 != null; var7 = (class71) this.field1100.method3937()) {
            var6++;
            if (var7.field1008 == arg0) {
                var7.method1608(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1008 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class211.method3934(new class71(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1100.method3936().method3960();
            }
        } else if (var6 < 4) {
            this.field1100.method3930(new class71(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("bm.s(IB)Lby;")
    public class71 method1893(int arg0) {
        class71 var2 = (class71) this.field1100.method3936();
        if (var2 == null || var2.field1008 > arg0) {
            return null;
        }
        for (class71 var3 = (class71) this.field1100.method3937(); var3 != null && var3.field1008 <= arg0; var3 = (class71) this.field1100.method3937()) {
            var2.method3960();
            var2 = var3;
        }
        if (this.field1101.field3395 + var2.field1009 + var2.field1008 > arg0) {
            return var2;
        } else {
            var2.method3960();
            return null;
        }
    }

    @ObfuscatedName("bm.g(B)Z")
    public boolean method1894() {
        return this.field1100.method3938();
    }
}
