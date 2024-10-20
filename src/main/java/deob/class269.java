package deob;

@ObfuscatedName("jb")
public class class269 extends class219 {

    @ObfuscatedName("jb.o")
    public static class213 field3443 = new class213(64);

    @ObfuscatedName("jb.j")
    public int field3445 = 0;

    @ObfuscatedName("jv.c(IB)Ljb;")
    public static class269 method4186(int arg0) {
        class269 var1 = (class269) field3443.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3448.method4190(16, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4367(new class195(var2));
        }
        field3443.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jb.i(Lgp;I)V")
    public void method4367(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4368(arg0, var2);
        }
    }

    @ObfuscatedName("jb.o(Lgp;II)V")
    public void method4368(class195 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3445 = arg0.method3218();
        }
    }

    @ObfuscatedName("jg.j(B)V")
    public static void method4437() {
        field3443.method3629();
    }
}
