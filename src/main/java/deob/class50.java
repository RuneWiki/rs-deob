package deob;

@ObfuscatedName("aj")
public class class50 extends class204 {

    @ObfuscatedName("aj.q")
    public static class193 field1090 = new class193(64);

    @ObfuscatedName("aj.v")
    public boolean field1096 = false;

    @ObfuscatedName("ap.h(Lfv;B)V")
    public static void method707(class167 arg0) {
        Statics.field1091 = arg0;
    }

    @ObfuscatedName("c.q(II)Laj;")
    public static class50 method137(int arg0) {
        class50 var1 = (class50) field1090.method3538((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1091.method3073(15, arg0);
        class50 var3 = new class50();
        if (var2 != null) {
            var3.method976(new class119(var2));
        }
        field1090.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.v(Ldm;I)V")
    public void method976(class119 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method978(arg0, var2);
        }
    }

    @ObfuscatedName("aj.n(Ldm;IB)V")
    public void method978(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1096 = true;
        }
    }
}
