package deob;

@ObfuscatedName("aj")
public class class43 extends class187 {

    @ObfuscatedName("aj.e")
    public static class176 field986 = new class176(64);

    @ObfuscatedName("aj.i")
    public int field977;

    @ObfuscatedName("aj.k")
    public int field978;

    @ObfuscatedName("aj.h")
    public int field984;

    @ObfuscatedName("ew.b(Lex;I)V")
    public static void method2739(class151 arg0) {
        Statics.field979 = arg0;
    }

    @ObfuscatedName("g.e(IB)Laj;")
    public static class43 method96(int arg0) {
        class43 var1 = (class43) field986.method3218((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field979.method2761(14, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method823(new class110(var2));
        }
        field986.method3220(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.i(Ldc;B)V")
    public void method823(class110 arg0) {
        while (true) {
            int var2 = arg0.method2142();
            if (var2 == 0) {
                return;
            }
            this.method824(arg0, var2);
        }
    }

    @ObfuscatedName("aj.k(Ldc;II)V")
    public void method824(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field977 = arg0.method2292();
            this.field978 = arg0.method2142();
            this.field984 = arg0.method2142();
        }
    }

    @ObfuscatedName("v.h(I)V")
    public static void method149() {
        field986.method3231();
    }
}
