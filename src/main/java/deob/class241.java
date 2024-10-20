package deob;

@ObfuscatedName("id")
public class class241 extends class176 {

    @ObfuscatedName("id.t")
    public static class146 field3202 = new class146(64);

    @ObfuscatedName("id.o")
    public int field3203 = 0;

    @ObfuscatedName("iu.c(II)Lid;")
    public static class241 method4094(int arg0) {
        class241 var1 = (class241) field3202.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3201.method3845(5, arg0);
        class241 var3 = new class241();
        if (var2 != null) {
            var3.method4029(new class301(var2));
        }
        field3202.method3102(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.t(Lkp;I)V")
    public void method4029(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4034(arg0, var2);
        }
    }

    @ObfuscatedName("id.o(Lkp;II)V")
    public void method4034(class301 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3203 = arg0.method5124();
        }
    }
}
