package deob;

@ObfuscatedName("fi")
public class class178 extends class428 {

    @ObfuscatedName("fi.v")
    public static class269 field1922 = new class269(64);

    @ObfuscatedName("fi.x")
    public int field1920 = 0;

    @ObfuscatedName("dw.h(II)Lfi;")
    public static class178 method2635(int arg0) {
        class178 var1 = (class178) field1922.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1921.method5909(16, arg0);
        class178 var3 = new class178();
        if (var2 != null) {
            var3.method3198(new class467(var2));
        }
        field1922.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fi.e(Lqy;B)V")
    public void method3198(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3209(arg0, var2);
        }
    }

    @ObfuscatedName("fi.v(Lqy;II)V")
    public void method3209(class467 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1920 = arg0.method7794();
        }
    }

    @ObfuscatedName("bl.x(B)V")
    public static void method1095() {
        field1922.method4918();
    }
}
