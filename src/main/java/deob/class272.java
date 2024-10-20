package deob;

@ObfuscatedName("jp")
public class class272 extends class219 {

    @ObfuscatedName("jp.e")
    public static class213 field3479 = new class213(64);

    @ObfuscatedName("jp.b")
    public boolean field3480 = false;

    @ObfuscatedName("gs.g(II)Ljp;")
    public static class272 method3270(int arg0) {
        class272 var1 = (class272) field3479.method3706((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3482.method4294(15, arg0);
        class272 var3 = new class272();
        if (var2 != null) {
            var3.method4497(new class195(var2));
        }
        field3479.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jp.e(Lgg;B)V")
    public void method4497(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4494(arg0, var2);
        }
    }

    @ObfuscatedName("jp.b(Lgg;II)V")
    public void method4494(class195 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3480 = true;
        }
    }
}
