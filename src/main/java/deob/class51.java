package deob;

@ObfuscatedName("af")
public class class51 extends class205 {

    @ObfuscatedName("af.i")
    public static class194 field1107 = new class194(64);

    @ObfuscatedName("af.g")
    public int field1105 = 0;

    @ObfuscatedName("at.t(II)Laf;")
    public static class51 method937(int arg0) {
        class51 var1 = (class51) field1107.method3453((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1110.method3002(5, arg0);
        class51 var3 = new class51();
        if (var2 != null) {
            var3.method953(new class120(var2));
        }
        field1107.method3461(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.i(Ldr;I)V")
    public void method953(class120 arg0) {
        while (true) {
            int var2 = arg0.method2334();
            if (var2 == 0) {
                return;
            }
            this.method958(arg0, var2);
        }
    }

    @ObfuscatedName("af.g(Ldr;II)V")
    public void method958(class120 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1105 = arg0.method2310();
        }
    }
}
