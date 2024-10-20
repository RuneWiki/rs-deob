package deob;

@ObfuscatedName("ju")
public class class272 extends class219 {

    @ObfuscatedName("ju.z")
    public static class213 field3477 = new class213(64);

    @ObfuscatedName("ju.n")
    public boolean field3478 = false;

    @ObfuscatedName("jj.d(II)Lju;")
    public static class272 method4441(int arg0) {
        class272 var1 = (class272) field3477.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3476.method4273(15, arg0);
        class272 var3 = new class272();
        if (var2 != null) {
            var3.method4512(new class195(var2));
        }
        field3477.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ju.z(Lgy;I)V")
    public void method4512(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4513(arg0, var2);
        }
    }

    @ObfuscatedName("ju.n(Lgy;II)V")
    public void method4513(class195 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3478 = true;
        }
    }
}
