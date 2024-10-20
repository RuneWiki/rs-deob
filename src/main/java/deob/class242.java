package deob;

@ObfuscatedName("iw")
public class class242 extends class195 {

    @ObfuscatedName("iw.i")
    public static class190 field3259 = new class190(64);

    @ObfuscatedName("iw.u")
    public int field3258 = 0;

    @ObfuscatedName("cu.c(IB)Liw;")
    public static class242 method1566(int arg0) {
        class242 var1 = (class242) field3259.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3257.method3741(16, arg0);
        class242 var3 = new class242();
        if (var2 != null) {
            var3.method3869(new class174(var2));
        }
        field3259.method3233(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.o(Lfp;I)V")
    public void method3869(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method3870(arg0, var2);
        }
    }

    @ObfuscatedName("iw.i(Lfp;II)V")
    public void method3870(class174 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3258 = arg0.method2861();
        }
    }
}
