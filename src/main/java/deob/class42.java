package deob;

@ObfuscatedName("au")
public class class42 extends class174 {

    @ObfuscatedName("au.o")
    public static class170 field1037 = new class170(64);

    @ObfuscatedName("au.h")
    public int field1045 = 0;

    @ObfuscatedName("at.j(Lew;I)V")
    public static void method817(class153 arg0) {
        Statics.field1043 = arg0;
        Statics.field1036 = Statics.field1043.method3037(16);
    }

    @ObfuscatedName("dp.f(IB)Lau;")
    public static class42 method2199(int arg0) {
        class42 var1 = (class42) field1037.method3256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1043.method3027(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method887(new class127(var2));
        }
        field1037.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.o(Ldq;B)V")
    public void method887(class127 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method888(arg0, var2);
        }
    }

    @ObfuscatedName("au.h(Ldq;II)V")
    public void method888(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1045 = arg0.method2582();
        }
    }
}
