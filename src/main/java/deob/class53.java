package deob;

@ObfuscatedName("bw")
public class class53 extends class204 {

    @ObfuscatedName("bw.i")
    public static class193 field1155 = new class193(64);

    @ObfuscatedName("bw.d")
    public int field1156 = 0;

    @ObfuscatedName("bh.v(Lfh;I)V")
    public static void method1546(class167 arg0) {
        Statics.field2180 = arg0;
        Statics.field1158 = Statics.field2180.method3093(16);
    }

    @ObfuscatedName("cz.f(II)Lbw;")
    public static class53 method2049(int arg0) {
        class53 var1 = (class53) field1155.method3490((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2180.method3082(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1056(new class119(var2));
        }
        field1155.method3502(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bw.i(Ldx;I)V")
    public void method1056(class119 arg0) {
        while (true) {
            int var2 = arg0.method2400();
            if (var2 == 0) {
                return;
            }
            this.method1057(arg0, var2);
        }
    }

    @ObfuscatedName("bw.d(Ldx;II)V")
    public void method1057(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1156 = arg0.method2334();
        }
    }
}
