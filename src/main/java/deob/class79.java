package deob;

@ObfuscatedName("cr")
public class class79 extends class181 {

    @ObfuscatedName("cr.e")
    public class247 field1129;

    @ObfuscatedName("cr.p")
    public class261 field1131 = new class261();

    public class79(class247 arg0) {
        this.field1129 = arg0;
    }

    @ObfuscatedName("cr.q(IIIIB)V")
    public void method1779(int arg0, int arg1, int arg2, int arg3) {
        class71 var5 = null;
        int var6 = 0;
        for (class71 var7 = (class71) this.field1131.method4453(); var7 != null; var7 = (class71) this.field1131.method4423()) {
            var6++;
            if (var7.field1017 == arg0) {
                var7.method1507(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1017 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class261.method4431(new class71(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1131.method4453().method3286();
            }
        } else if (var6 < 4) {
            this.field1131.method4420(new class71(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cr.w(IB)Lbu;")
    public class71 method1780(int arg0) {
        class71 var2 = (class71) this.field1131.method4453();
        if (var2 == null || var2.field1017 > arg0) {
            return null;
        }
        for (class71 var3 = (class71) this.field1131.method4423(); var3 != null && var3.field1017 <= arg0; var3 = (class71) this.field1131.method4423()) {
            var2.method3286();
            var2 = var3;
        }
        if (this.field1129.field3286 + var2.field1017 + var2.field1011 > arg0) {
            return var2;
        } else {
            var2.method3286();
            return null;
        }
    }

    @ObfuscatedName("cr.e(I)Z")
    public boolean method1790() {
        return this.field1131.method4425();
    }
}
