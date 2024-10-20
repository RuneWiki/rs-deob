package deob;

@ObfuscatedName("ix")
public class class245 extends class195 {

    @ObfuscatedName("ix.p")
    public static class190 field3321 = new class190(64);

    @ObfuscatedName("ix.i")
    public boolean field3323 = false;

    @ObfuscatedName("bd.n(Lis;I)V")
    public static void method675(class236 arg0) {
        Statics.field3325 = arg0;
    }

    @ObfuscatedName("fq.p(II)Lix;")
    public static class245 method2772(int arg0) {
        class245 var1 = (class245) field3321.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3325.method3880(15, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method4034(new class174(var2));
        }
        field3321.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.i(Lfl;I)V")
    public void method4034(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4035(arg0, var2);
        }
    }

    @ObfuscatedName("ix.j(Lfl;II)V")
    public void method4035(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3323 = true;
        }
    }
}
