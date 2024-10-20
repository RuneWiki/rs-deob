package deob;

@ObfuscatedName("af")
public class class47 extends class187 {

    @ObfuscatedName("af.i")
    public static class176 field1064 = new class176(64);

    @ObfuscatedName("af.k")
    public int field1065 = 0;

    @ObfuscatedName("de.b(Lex;I)V")
    public static void method2080(class151 arg0) {
        Statics.field1068 = arg0;
        Statics.field537 = Statics.field1068.method2772(16);
    }

    @ObfuscatedName("eh.e(II)Laf;")
    public static class47 method2746(int arg0) {
        class47 var1 = (class47) field1064.method3218((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1068.method2761(16, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method890(new class110(var2));
        }
        field1064.method3220(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.i(Ldc;I)V")
    public void method890(class110 arg0) {
        while (true) {
            int var2 = arg0.method2142();
            if (var2 == 0) {
                return;
            }
            this.method891(arg0, var2);
        }
    }

    @ObfuscatedName("af.k(Ldc;IB)V")
    public void method891(class110 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1065 = arg0.method2292();
        }
    }

    @ObfuscatedName("dr.h(I)V")
    public static void method2472() {
        field1064.method3231();
    }
}
