package deob;

@ObfuscatedName("ao")
public class class51 extends class204 {

    @ObfuscatedName("ao.v")
    public static class193 field1103 = new class193(64);

    @ObfuscatedName("ao.f")
    public int field1104 = 0;

    @ObfuscatedName("dh.i(Lfn;I)V")
    public static void method2593(class167 arg0) {
        Statics.field2042 = arg0;
    }

    @ObfuscatedName("aw.v(II)Lao;")
    public static class51 method905(int arg0) {
        class51 var1 = (class51) field1103.method3467((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2042.method3080(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method961(new class119(var2));
        }
        field1103.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.f(Ldj;S)V")
    public void method961(class119 arg0) {
        while (true) {
            int var2 = arg0.method2310();
            if (var2 == 0) {
                return;
            }
            this.method971(arg0, var2);
        }
    }

    @ObfuscatedName("ao.h(Ldj;II)V")
    public void method971(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1104 = arg0.method2312();
        }
    }
}
