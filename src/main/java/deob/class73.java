package deob;

@ObfuscatedName("bz")
public class class73 extends class207 {

    @ObfuscatedName("bz.w")
    public class264 field1079;

    @ObfuscatedName("bz.s")
    public class206 field1084 = new class206();

    public class73(class264 arg0) {
        this.field1079 = arg0;
    }

    @ObfuscatedName("bz.f(IIIIB)V")
    public void method1744(int arg0, int arg1, int arg2, int arg3) {
        class66 var5 = null;
        int var6 = 0;
        for (class66 var7 = (class66) this.field1084.method3793(); var7 != null; var7 = (class66) this.field1084.method3795()) {
            var6++;
            if (var7.field987 == arg0) {
                var7.method1509(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field987 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class206.method3792(new class66(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1084.method3793().method3818();
            }
        } else if (var6 < 4) {
            this.field1084.method3810(new class66(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("bz.l(II)Lbv;")
    public class66 method1745(int arg0) {
        class66 var2 = (class66) this.field1084.method3793();
        if (var2 == null || var2.field987 > arg0) {
            return null;
        }
        for (class66 var3 = (class66) this.field1084.method3795(); var3 != null && var3.field987 <= arg0; var3 = (class66) this.field1084.method3795()) {
            var2.method3818();
            var2 = var3;
        }
        if (this.field1079.field3379 + var2.field989 + var2.field987 > arg0) {
            return var2;
        } else {
            var2.method3818();
            return null;
        }
    }

    @ObfuscatedName("bz.w(I)Z")
    public boolean method1746() {
        return this.field1084.method3805();
    }
}
