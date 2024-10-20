package deob;

@ObfuscatedName("fe")
public class class180 extends class428 {

    @ObfuscatedName("fe.e")
    public static class269 field1954 = new class269(64);

    @ObfuscatedName("fe.v")
    public boolean field1955 = false;

    @ObfuscatedName("bx.h(II)Lfe;")
    public static class180 method1131(int arg0) {
        class180 var1 = (class180) field1954.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1956.method5909(19, arg0);
        class180 var3 = new class180();
        if (var2 != null) {
            var3.method3232(new class467(var2));
        }
        field1954.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fe.e(Lqy;I)V")
    public void method3232(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3233(arg0, var2);
        }
    }

    @ObfuscatedName("fe.v(Lqy;II)V")
    public void method3233(class467 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1955 = true;
        }
    }
}
