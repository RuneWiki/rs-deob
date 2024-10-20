package deob;

@ObfuscatedName("cv")
public class class95 extends class440 {

    @ObfuscatedName("cv.v")
    public class186 field1283;

    @ObfuscatedName("cv.s")
    public class358 field1284 = new class358();

    public class95(class186 arg0) {
        this.field1283 = arg0;
    }

    @ObfuscatedName("cv.f(IIIII)V")
    public void method2481(int arg0, int arg1, int arg2, int arg3) {
        class92 var5 = null;
        int var6 = 0;
        for (class92 var7 = (class92) this.field1284.method6318(); var7 != null; var7 = (class92) this.field1284.method6290()) {
            var6++;
            if (var7.field1237 == arg0) {
                var7.method2327(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1237 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class358.method6287(new class92(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1284.method6318().method7431();
            }
        } else if (var6 < 4) {
            this.field1284.method6321(new class92(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cv.w(II)Lcz;")
    public class92 method2482(int arg0) {
        class92 var2 = (class92) this.field1284.method6318();
        if (var2 == null || var2.field1237 > arg0) {
            return null;
        }
        for (class92 var3 = (class92) this.field1284.method6290(); var3 != null && var3.field1237 <= arg0; var3 = (class92) this.field1284.method6290()) {
            var2.method7431();
            var2 = var3;
        }
        if (this.field1283.field1989 + var2.field1240 + var2.field1237 > arg0) {
            return var2;
        } else {
            var2.method7431();
            return null;
        }
    }

    @ObfuscatedName("cv.v(I)Z")
    public boolean method2492() {
        return this.field1284.method6335();
    }
}
