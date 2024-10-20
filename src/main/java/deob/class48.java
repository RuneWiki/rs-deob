package deob;

@ObfuscatedName("al")
public class class48 extends class204 {

    @ObfuscatedName("al.h")
    public static class193 field1064 = new class193(64);

    @ObfuscatedName("al.k")
    public int field1065;

    @ObfuscatedName("al.t")
    public int field1063;

    @ObfuscatedName("al.g")
    public int field1070;

    @ObfuscatedName("af.c(II)Lal;")
    public static class48 method665(int arg0) {
        class48 var1 = (class48) field1064.method3485((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1067.method2994(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method934(new class119(var2));
        }
        field1064.method3487(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.h(Ldf;I)V")
    public void method934(class119 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method935(arg0, var2);
        }
    }

    @ObfuscatedName("al.k(Ldf;II)V")
    public void method935(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1065 = arg0.method2293();
            this.field1063 = arg0.method2291();
            this.field1070 = arg0.method2291();
        }
    }

    @ObfuscatedName("v.t(I)V")
    public static void method568() {
        field1064.method3488();
    }
}
