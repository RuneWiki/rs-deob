package deob;

@ObfuscatedName("cj")
public class class86 extends class193 {

    @ObfuscatedName("cj.e")
    public class249 field1356;

    @ObfuscatedName("cj.t")
    public class192 field1357 = new class192();

    public class86(class249 arg0) {
        this.field1356 = arg0;
    }

    @ObfuscatedName("cj.p(IIIIB)V")
    public void method1471(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1357.method3222(); var7 != null; var7 = (class80) this.field1357.method3213()) {
            var6++;
            if (var7.field1277 == arg0) {
                var7.method1363(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1277 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class192.method3208(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1357.method3222().method3234();
            }
        } else if (var6 < 4) {
            this.field1357.method3207(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cj.m(II)Lcw;")
    public class80 method1472(int arg0) {
        class80 var2 = (class80) this.field1357.method3222();
        if (var2 == null || var2.field1277 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1357.method3213(); var3 != null && var3.field1277 <= arg0; var3 = (class80) this.field1357.method3213()) {
            var2.method3234();
            var2 = var3;
        }
        if (this.field1356.field3380 + var2.field1277 + var2.field1272 > arg0) {
            return var2;
        } else {
            var2.method3234();
            return null;
        }
    }

    @ObfuscatedName("cj.e(I)Z")
    public boolean method1473() {
        return this.field1357.method3214();
    }
}
