package deob;

@ObfuscatedName("bw")
public class class53 extends class204 {

    @ObfuscatedName("bw.r")
    public static class193 field1169 = new class193(64);

    @ObfuscatedName("bw.n")
    public int field1164 = 0;

    @ObfuscatedName("aw.i(IB)Lbw;")
    public static class53 method732(int arg0) {
        class53 var1 = (class53) field1169.method3464((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1167.method3035(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1074(new class119(var2));
        }
        field1169.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bw.v(Ldx;I)V")
    public void method1074(class119 arg0) {
        while (true) {
            int var2 = arg0.method2380();
            if (var2 == 0) {
                return;
            }
            this.method1075(arg0, var2);
        }
    }

    @ObfuscatedName("bw.r(Ldx;II)V")
    public void method1075(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1164 = arg0.method2347();
        }
    }

    @ObfuscatedName("cd.n(I)V")
    public static void method1758() {
        field1169.method3467();
    }
}
