package deob;

@ObfuscatedName("jz")
public class class278 extends class219 {

    @ObfuscatedName("jz.i")
    public static class213 field3537 = new class213(64);

    @ObfuscatedName("jz.o")
    public int field3536;

    @ObfuscatedName("jz.j")
    public int field3539;

    @ObfuscatedName("jz.k")
    public int field3540;

    @ObfuscatedName("dh.c(Ljm;B)V")
    public static void method2083(class262 arg0) {
        Statics.field3538 = arg0;
    }

    @ObfuscatedName("km.i(II)Ljz;")
    public static class278 method4830(int arg0) {
        class278 var1 = (class278) field3537.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3538.method4190(14, arg0);
        class278 var3 = new class278();
        if (var2 != null) {
            var3.method4513(new class195(var2));
        }
        field3537.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jz.o(Lgp;B)V")
    public void method4513(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4525(arg0, var2);
        }
    }

    @ObfuscatedName("jz.j(Lgp;II)V")
    public void method4525(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3536 = arg0.method3218();
            this.field3539 = arg0.method3429();
            this.field3540 = arg0.method3429();
        }
    }

    @ObfuscatedName("eu.k(B)V")
    public static void method2866() {
        field3537.method3629();
    }
}
