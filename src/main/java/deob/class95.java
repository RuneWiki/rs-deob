package deob;

@ObfuscatedName("cm")
public class class95 extends class430 {

    @ObfuscatedName("cm.c")
    public class181 field1258;

    @ObfuscatedName("cm.x")
    public class351 field1257 = new class351();

    public class95(class181 arg0) {
        this.field1258 = arg0;
    }

    @ObfuscatedName("cm.a(IIIII)V")
    public void method2376(int arg0, int arg1, int arg2, int arg3) {
        class92 var5 = null;
        int var6 = 0;
        for (class92 var7 = (class92) this.field1257.method6075(); var7 != null; var7 = (class92) this.field1257.method6077()) {
            var6++;
            if (var7.field1220 == arg0) {
                var7.method2241(arg0, arg1, arg2, arg3);
                return;
            }
            if (var7.field1220 <= arg0) {
                var5 = var7;
            }
        }
        if (var5 != null) {
            class351.method6086(new class92(arg0, arg1, arg2, arg3), var5);
            if (var6 >= 4) {
                this.field1257.method6075().method7170();
            }
        } else if (var6 < 4) {
            this.field1257.method6073(new class92(arg0, arg1, arg2, arg3));
        }
    }

    @ObfuscatedName("cm.f(II)Lcu;")
    public class92 method2383(int arg0) {
        class92 var2 = (class92) this.field1257.method6075();
        if (var2 == null || var2.field1220 > arg0) {
            return null;
        }
        for (class92 var3 = (class92) this.field1257.method6077(); var3 != null && var3.field1220 <= arg0; var3 = (class92) this.field1257.method6077()) {
            var2.method7170();
            var2 = var3;
        }
        if (this.field1258.field1923 + var2.field1220 + var2.field1217 > arg0) {
            return var2;
        } else {
            var2.method7170();
            return null;
        }
    }

    @ObfuscatedName("cm.c(I)Z")
    public boolean method2378() {
        return this.field1257.method6141();
    }
}
