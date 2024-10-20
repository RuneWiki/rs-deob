package deob;

@ObfuscatedName("ak")
public class class48 extends class204 {

    @ObfuscatedName("ak.v")
    public static class193 field1061 = new class193(64);

    @ObfuscatedName("ak.r")
    public int field1062;

    @ObfuscatedName("ak.n")
    public int field1066;

    @ObfuscatedName("ak.x")
    public int field1060;

    @ObfuscatedName("ei.i(Lfe;I)V")
    public static void method2928(class167 arg0) {
        Statics.field1064 = arg0;
    }

    @ObfuscatedName("fm.v(II)Lak;")
    public static class48 method2970(int arg0) {
        class48 var1 = (class48) field1061.method3464((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1064.method3035(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method968(new class119(var2));
        }
        field1061.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.r(Ldx;B)V")
    public void method968(class119 arg0) {
        while (true) {
            int var2 = arg0.method2380();
            if (var2 == 0) {
                return;
            }
            this.method969(arg0, var2);
        }
    }

    @ObfuscatedName("ak.n(Ldx;II)V")
    public void method969(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1062 = arg0.method2347();
            this.field1066 = arg0.method2380();
            this.field1060 = arg0.method2380();
        }
    }

    @ObfuscatedName("x.x(S)V")
    public static void method51() {
        field1061.method3467();
    }
}
