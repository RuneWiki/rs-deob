package deob;

@ObfuscatedName("ab")
public class class42 extends class175 {

    @ObfuscatedName("ab.o")
    public static class171 field1033 = new class171(64);

    @ObfuscatedName("ab.w")
    public int field1034 = 0;

    @ObfuscatedName("s.l(II)Lab;")
    public static class42 method157(int arg0) {
        class42 var1 = (class42) field1033.method3255((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1036.method3029(16, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method891(new class127(var2));
        }
        field1033.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.b(Ldm;B)V")
    public void method891(class127 arg0) {
        while (true) {
            int var2 = arg0.method2440();
            if (var2 == 0) {
                return;
            }
            this.method890(arg0, var2);
        }
    }

    @ObfuscatedName("ab.o(Ldm;II)V")
    public void method890(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1034 = arg0.method2442();
        }
    }
}
