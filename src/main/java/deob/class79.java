package deob;

@ObfuscatedName("ce")
public class class79 extends class181 {

    @ObfuscatedName("ce.i")
    public class247 field1102;

    @ObfuscatedName("ce.k")
    public class261 field1096 = new class261();

    public class79(class247 arg0) {
        this.field1102 = arg0;
    }

    @ObfuscatedName("ce.s(IIIII)V")
    public void method1849(int arg0, int arg1, int arg2, int arg3) {
        class71 var5 = null;
        int var6 = 0;
        for (class71 var7 = (class71) this.field1096.method4426(); var7 != null; var7 = (class71) this.field1096.method4410()) {
            var6++;
            if (var7.field986 == arg0) {
                var7.method1576(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field986 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class261.method4408(new class71(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1096.method4426().method3304();
            }
        } else if (var6 < 4) {
            this.field1096.method4407(new class71(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("ce.j(IB)Lbb;")
    public class71 method1843(int arg0) {
        class71 var2 = (class71) this.field1096.method4426();
        if (var2 == null || var2.field986 > arg0) {
            return null;
        }
        for (class71 var3 = (class71) this.field1096.method4410(); var3 != null && var3.field986 <= arg0; var3 = (class71) this.field1096.method4410()) {
            var2.method3304();
            var2 = var3;
        }
        if (this.field1102.field3264 + var2.field986 + var2.field984 > arg0) {
            return var2;
        } else {
            var2.method3304();
            return null;
        }
    }

    @ObfuscatedName("ce.i(B)Z")
    public boolean method1844() {
        return this.field1096.method4412();
    }
}
