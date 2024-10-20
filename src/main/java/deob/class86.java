package deob;

@ObfuscatedName("ck")
public class class86 extends class193 {

    @ObfuscatedName("ck.i")
    public class249 field1355;

    @ObfuscatedName("ck.u")
    public class192 field1352 = new class192();

    public class86(class249 arg0) {
        this.field1355 = arg0;
    }

    @ObfuscatedName("ck.c(IIIIB)V")
    public void method1502(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1352.method3262(); var7 != null; var7 = (class80) this.field1352.method3276()) {
            var6++;
            if (var7.field1277 == arg0) {
                var7.method1382(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1277 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class192.method3260(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1352.method3262().method3287();
            }
        } else if (var6 < 4) {
            this.field1352.method3272(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ck.o(II)Lcf;")
    public class80 method1504(int arg0) {
        class80 var2 = (class80) this.field1352.method3262();
        if (var2 == null || var2.field1277 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1352.method3276(); var3 != null && var3.field1277 <= arg0; var3 = (class80) this.field1352.method3276()) {
            var2.method3287();
            var2 = var3;
        }
        if (this.field1355.field3347 + var2.field1278 + var2.field1277 > arg0) {
            return var2;
        } else {
            var2.method3287();
            return null;
        }
    }

    @ObfuscatedName("ck.i(I)Z")
    public boolean method1510() {
        return this.field1352.method3265();
    }
}
