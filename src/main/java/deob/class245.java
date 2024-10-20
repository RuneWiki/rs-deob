package deob;

@ObfuscatedName("ip")
public class class245 extends class195 {

    @ObfuscatedName("ip.w")
    public static class190 field3323 = new class190(64);

    @ObfuscatedName("ip.a")
    public boolean field3324 = false;

    @ObfuscatedName("fl.i(Liq;I)V")
    public static void method3080(class236 arg0) {
        Statics.field3325 = arg0;
    }

    @ObfuscatedName("gl.w(IB)Lip;")
    public static class245 method3502(int arg0) {
        class245 var1 = (class245) field3323.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3325.method3768(15, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method3964(new class174(var2));
        }
        field3323.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.a(Lfp;I)V")
    public void method3964(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method3974(arg0, var2);
        }
    }

    @ObfuscatedName("ip.t(Lfp;II)V")
    public void method3974(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3324 = true;
        }
    }
}
