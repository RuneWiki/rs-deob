package deob;

@ObfuscatedName("jk")
public class class269 extends class219 {

    @ObfuscatedName("jk.b")
    public static class213 field3446 = new class213(64);

    @ObfuscatedName("jk.z")
    public int field3448 = 0;

    @ObfuscatedName("cp.g(Ljr;I)V")
    public static void method1801(class262 arg0) {
        Statics.field3449 = arg0;
        Statics.field3447 = Statics.field3449.method4279(16);
    }

    @ObfuscatedName("bu.e(II)Ljk;")
    public static class269 method1109(int arg0) {
        class269 var1 = (class269) field3446.method3706((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3449.method4294(16, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4462(new class195(var2));
        }
        field3446.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jk.b(Lgg;I)V")
    public void method4462(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4451(arg0, var2);
        }
    }

    @ObfuscatedName("jk.z(Lgg;II)V")
    public void method4451(class195 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3448 = arg0.method3310();
        }
    }

    @ObfuscatedName("bu.n(I)V")
    public static void method1110() {
        field3446.method3709();
    }
}
