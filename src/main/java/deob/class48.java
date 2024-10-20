package deob;

@ObfuscatedName("ak")
public class class48 extends class204 {

    @ObfuscatedName("ak.l")
    public static class193 field1028 = new class193(64);

    @ObfuscatedName("ak.y")
    public int field1029;

    @ObfuscatedName("ak.u")
    public int field1038;

    @ObfuscatedName("ak.k")
    public int field1030;

    @ObfuscatedName("fy.m(II)Lak;")
    public static class48 method3213(int arg0) {
        class48 var1 = (class48) field1028.method3537((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1039.method3080(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method993(new class119(var2));
        }
        field1028.method3539(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.l(Ldx;I)V")
    public void method993(class119 arg0) {
        while (true) {
            int var2 = arg0.method2562();
            if (var2 == 0) {
                return;
            }
            this.method994(arg0, var2);
        }
    }

    @ObfuscatedName("ak.y(Ldx;II)V")
    public void method994(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1029 = arg0.method2541();
            this.field1038 = arg0.method2562();
            this.field1030 = arg0.method2562();
        }
    }

    @ObfuscatedName("o.u(I)V")
    public static void method601() {
        field1028.method3540();
    }
}
