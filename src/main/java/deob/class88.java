package deob;

@ObfuscatedName("cg")
public class class88 extends class190 {

    @ObfuscatedName("cg.k")
    public class257 field1144;

    @ObfuscatedName("cg.d")
    public class271 field1145 = new class271();

    public class88(class257 arg0) {
        this.field1144 = arg0;
    }

    @ObfuscatedName("cg.x(IIIIB)V")
    public void method1940(int arg0, int arg1, int arg2, int arg3) {
        class80 var5 = null;
        int var6 = 0;
        for (class80 var7 = (class80) this.field1145.method4488(); var7 != null; var7 = (class80) this.field1145.method4543()) {
            var6++;
            if (var7.field1036 == arg0) {
                var7.method1680(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1036 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class271.method4521(new class80(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1145.method4488().method3355();
            }
        } else if (var6 < 4) {
            this.field1145.method4508(new class80(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cg.m(II)Lcc;")
    public class80 method1944(int arg0) {
        class80 var2 = (class80) this.field1145.method4488();
        if (var2 == null || var2.field1036 > arg0) {
            return null;
        }
        for (class80 var3 = (class80) this.field1145.method4543(); var3 != null && var3.field1036 <= arg0; var3 = (class80) this.field1145.method4543()) {
            var2.method3355();
            var2 = var3;
        }
        if (this.field1144.field3276 + var2.field1039 + var2.field1036 > arg0) {
            return var2;
        } else {
            var2.method3355();
            return null;
        }
    }

    @ObfuscatedName("cg.k(I)Z")
    public boolean method1941() {
        return this.field1145.method4495();
    }
}
