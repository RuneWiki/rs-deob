package deob;

@ObfuscatedName("io")
public class class257 extends class207 {

    @ObfuscatedName("io.w")
    public static class201 field3258 = new class201(64);

    @ObfuscatedName("io.s")
    public boolean field3257 = false;

    @ObfuscatedName("dj.z(Lir;I)V")
    public static void method2859(class248 arg0) {
        Statics.field3259 = arg0;
    }

    @ObfuscatedName("j.w(II)Lio;")
    public static class257 method256(int arg0) {
        class257 var1 = (class257) field3258.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3259.method4247(19, arg0);
        class257 var3 = new class257();
        if (var2 != null) {
            var3.method4457(new class183(var2));
        }
        field3258.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.s(Lgk;I)V")
    public void method4457(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4448(arg0, var2);
        }
    }

    @ObfuscatedName("io.l(Lgk;II)V")
    public void method4448(class183 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3257 = true;
        }
    }
}
