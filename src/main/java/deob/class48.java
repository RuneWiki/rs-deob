package deob;

@ObfuscatedName("ab")
public class class48 extends class204 {

    @ObfuscatedName("ab.q")
    public static class193 field1068 = new class193(64);

    @ObfuscatedName("ab.c")
    public int field1070;

    @ObfuscatedName("ab.l")
    public int field1071;

    @ObfuscatedName("ab.r")
    public int field1072;

    @ObfuscatedName("fz.n(II)Lab;")
    public static class48 method3228(int arg0) {
        class48 var1 = (class48) field1068.method3475((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1069.method3094(14, arg0);
        class48 var3 = new class48();
        if (var2 != null) {
            var3.method972(new class119(var2));
        }
        field1068.method3488(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.q(Ldc;I)V")
    public void method972(class119 arg0) {
        while (true) {
            int var2 = arg0.method2360();
            if (var2 == 0) {
                return;
            }
            this.method971(arg0, var2);
        }
    }

    @ObfuscatedName("ab.c(Ldc;II)V")
    public void method971(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1070 = arg0.method2430();
            this.field1071 = arg0.method2360();
            this.field1072 = arg0.method2360();
        }
    }

    @ObfuscatedName("eu.l(B)V")
    public static void method2751() {
        field1068.method3479();
    }
}
