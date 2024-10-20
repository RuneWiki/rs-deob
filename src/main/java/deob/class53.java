package deob;

@ObfuscatedName("bm")
public class class53 extends class204 {

    @ObfuscatedName("bm.i")
    public static class193 field1169 = new class193(64);

    @ObfuscatedName("bm.q")
    public int field1174 = 0;

    @ObfuscatedName("fm.h(IB)Lbm;")
    public static class53 method2941(int arg0) {
        class53 var1 = (class53) field1169.method3472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1168.method3051(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1043(new class119(var2));
        }
        field1169.method3474(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bm.m(Ldp;B)V")
    public void method1043(class119 arg0) {
        while (true) {
            int var2 = arg0.method2320();
            if (var2 == 0) {
                return;
            }
            this.method1044(arg0, var2);
        }
    }

    @ObfuscatedName("bm.i(Ldp;IB)V")
    public void method1044(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1174 = arg0.method2322();
        }
    }

    @ObfuscatedName("gn.q(B)V")
    public static void method3460() {
        field1169.method3483();
    }
}
