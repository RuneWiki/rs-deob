package deob;

@ObfuscatedName("iw")
public class class251 extends class195 {

    @ObfuscatedName("iw.q")
    public static class190 field3361 = new class190(64);

    @ObfuscatedName("iw.x")
    public int field3363;

    @ObfuscatedName("iw.y")
    public int field3364;

    @ObfuscatedName("iw.e")
    public int field3365;

    @ObfuscatedName("cj.d(II)Liw;")
    public static class251 method1392(int arg0) {
        class251 var1 = (class251) field3361.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3362.method3750(14, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4018(new class174(var2));
        }
        field3361.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.q(Lfw;I)V")
    public void method4018(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method4019(arg0, var2);
        }
    }

    @ObfuscatedName("iw.x(Lfw;II)V")
    public void method4019(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3363 = arg0.method2916();
            this.field3364 = arg0.method2921();
            this.field3365 = arg0.method2921();
        }
    }

    @ObfuscatedName("cb.y(B)V")
    public static void method1594() {
        field3361.method3250();
    }
}
