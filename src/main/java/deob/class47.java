package deob;

@ObfuscatedName("aj")
public class class47 extends class187 {

    @ObfuscatedName("aj.i")
    public static class176 field1066 = new class176(64);

    @ObfuscatedName("aj.b")
    public int field1067 = 0;

    @ObfuscatedName("dq.a(II)Laj;")
    public static class47 method2357(int arg0) {
        class47 var1 = (class47) field1066.method3181((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1074.method2731(16, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method917(new class110(var2));
        }
        field1066.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.v(Ldi;B)V")
    public void method917(class110 arg0) {
        while (true) {
            int var2 = arg0.method2199();
            if (var2 == 0) {
                return;
            }
            this.method909(arg0, var2);
        }
    }

    @ObfuscatedName("aj.i(Ldi;IS)V")
    public void method909(class110 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1067 = arg0.method2282();
        }
    }

    @ObfuscatedName("v.b(I)V")
    public static void method11() {
        field1066.method3184();
    }
}
