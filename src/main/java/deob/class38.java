package deob;

@ObfuscatedName("av")
public class class38 extends class174 {

    @ObfuscatedName("av.h")
    public static class170 field964 = new class170(64);

    @ObfuscatedName("av.s")
    public int field958;

    @ObfuscatedName("av.o")
    public int field966;

    @ObfuscatedName("av.p")
    public int field960;

    @ObfuscatedName("ad.g(IB)Lav;")
    public static class38 method831(int arg0) {
        class38 var1 = (class38) field964.method3303((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2491.method3080(14, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method809(new class127(var2));
        }
        field964.method3313(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.h(Ldw;I)V")
    public void method809(class127 arg0) {
        while (true) {
            int var2 = arg0.method2499();
            if (var2 == 0) {
                return;
            }
            this.method810(arg0, var2);
        }
    }

    @ObfuscatedName("av.s(Ldw;II)V")
    public void method810(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field958 = arg0.method2501();
            this.field966 = arg0.method2499();
            this.field960 = arg0.method2499();
        }
    }
}
