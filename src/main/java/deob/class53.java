package deob;

@ObfuscatedName("bd")
public class class53 extends class204 {

    @ObfuscatedName("bd.s")
    public static class193 field1151 = new class193(64);

    @ObfuscatedName("bd.q")
    public int field1150 = 0;

    @ObfuscatedName("fp.n(Lfm;B)V")
    public static void method3196(class167 arg0) {
        Statics.field1149 = arg0;
        Statics.field1148 = Statics.field1149.method3020(16);
    }

    @ObfuscatedName("cm.d(II)Lbd;")
    public static class53 method1923(int arg0) {
        class53 var1 = (class53) field1151.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1149.method3010(16, arg0);
        class53 var3 = new class53();
        if (var2 != null) {
            var3.method1051(new class119(var2));
        }
        field1151.method3481(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bd.s(Ldq;I)V")
    public void method1051(class119 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method1040(arg0, var2);
        }
    }

    @ObfuscatedName("bd.q(Ldq;II)V")
    public void method1040(class119 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1150 = arg0.method2377();
        }
    }

    @ObfuscatedName("ae.j(I)V")
    public static void method965() {
        field1151.method3480();
    }
}
