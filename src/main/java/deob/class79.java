package deob;

@ObfuscatedName("cr")
public class class79 extends class186 {

    @ObfuscatedName("cr.q")
    public class258 field1092;

    @ObfuscatedName("cr.w")
    public class272 field1094 = new class272();

    public class79(class258 arg0) {
        this.field1092 = arg0;
    }

    @ObfuscatedName("cr.m(IIIIB)V")
    public void method1820(int arg0, int arg1, int arg2, int arg3) {
        class71 var5 = null;
        int var6 = 0;
        for (class71 var7 = (class71) this.field1094.method4823(); var7 != null; var7 = (class71) this.field1094.method4825()) {
            var6++;
            if (var7.field983 == arg0) {
                var7.method1553(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field983 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class272.method4837(new class71(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1094.method4823().method3306();
            }
        } else if (var6 < 4) {
            this.field1094.method4820(new class71(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cr.f(II)Lbg;")
    public class71 method1822(int arg0) {
        class71 var2 = (class71) this.field1094.method4823();
        if (var2 == null || var2.field983 > arg0) {
            return null;
        }
        for (class71 var3 = (class71) this.field1094.method4825(); var3 != null && var3.field983 <= arg0; var3 = (class71) this.field1094.method4825()) {
            var2.method3306();
            var2 = var3;
        }
        if (this.field1092.field3362 + var2.field983 + var2.field980 > arg0) {
            return var2;
        } else {
            var2.method3306();
            return null;
        }
    }

    @ObfuscatedName("cr.q(I)Z")
    public boolean method1819() {
        return this.field1094.method4834();
    }
}
