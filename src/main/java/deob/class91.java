package deob;

@ObfuscatedName("cr")
public class class91 extends class412 {

    @ObfuscatedName("cr.f")
    public class175 field1252;

    @ObfuscatedName("cr.n")
    public class338 field1251 = new class338();

    public class91(class175 arg0) {
        this.field1252 = arg0;
    }

    @ObfuscatedName("cr.c(IIIII)V")
    public void method2384(int arg0, int arg1, int arg2, int arg3) {
        class88 var5 = null;
        int var6 = 0;
        for (class88 var7 = (class88) this.field1251.method5708(); var7 != null; var7 = (class88) this.field1251.method5695()) {
            var6++;
            if (var7.field1210 == arg0) {
                var7.method2241(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1210 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class338.method5711(new class88(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1251.method5708().method6657();
            }
        } else if (var6 < 4) {
            this.field1251.method5723(new class88(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cr.p(II)Lcg;")
    public class88 method2385(int arg0) {
        class88 var2 = (class88) this.field1251.method5708();
        if (var2 == null || var2.field1210 > arg0) {
            return null;
        }
        for (class88 var3 = (class88) this.field1251.method5695(); var3 != null && var3.field1210 <= arg0; var3 = (class88) this.field1251.method5695()) {
            var2.method6657();
            var2 = var3;
        }
        if (this.field1252.field1891 + var2.field1210 + var2.field1206 > arg0) {
            return var2;
        } else {
            var2.method6657();
            return null;
        }
    }

    @ObfuscatedName("cr.f(I)Z")
    public boolean method2394() {
        return this.field1251.method5697();
    }
}
