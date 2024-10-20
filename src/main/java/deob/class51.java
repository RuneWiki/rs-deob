package deob;

@ObfuscatedName("am")
public class class51 extends class204 {

    @ObfuscatedName("am.p")
    public static class193 field1100 = new class193(64);

    @ObfuscatedName("am.v")
    public int field1101 = 0;

    @ObfuscatedName("cp.d(Lfn;I)V")
    public static void method1955(class167 arg0) {
        Statics.field3151 = arg0;
    }

    @ObfuscatedName("fs.p(II)Lam;")
    public static class51 method3017(int arg0) {
        class51 var1 = (class51) field1100.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3151.method3134(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method1003(new class119(var2));
        }
        field1100.method3554(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.v(Ldf;I)V")
    public void method1003(class119 arg0) {
        while (true) {
            int var2 = arg0.method2357();
            if (var2 == 0) {
                return;
            }
            this.method1000(arg0, var2);
        }
    }

    @ObfuscatedName("am.l(Ldf;II)V")
    public void method1000(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1101 = arg0.method2359();
        }
    }
}
