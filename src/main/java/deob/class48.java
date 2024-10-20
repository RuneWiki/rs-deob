package deob;

@ObfuscatedName("au")
public class class48 extends class204 {

    @ObfuscatedName("au.l")
    public static class193 field1067 = new class193(64);

    @ObfuscatedName("au.a")
    public int field1068;

    @ObfuscatedName("au.i")
    public int field1069;

    @ObfuscatedName("au.f")
    public int field1070;

    @ObfuscatedName("ao.j(II)Lau;")
    public static class48 method781(int arg0) {
        class48 var1 = (class48) field1067.method3466((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1074.method3005(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method953(new class119(var2));
        }
        field1067.method3468(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.l(Ldc;B)V")
    public void method953(class119 arg0) {
        while (true) {
            int var2 = arg0.method2316();
            if (var2 == 0) {
                return;
            }
            this.method954(arg0, var2);
        }
    }

    @ObfuscatedName("au.a(Ldc;II)V")
    public void method954(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1068 = arg0.method2318();
            this.field1069 = arg0.method2316();
            this.field1070 = arg0.method2316();
        }
    }

    @ObfuscatedName("w.i(I)V")
    public static void method564() {
        field1067.method3475();
    }
}
