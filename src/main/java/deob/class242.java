package deob;

@ObfuscatedName("il")
public class class242 extends class195 {

    @ObfuscatedName("il.e")
    public static class190 field3285 = new class190(64);

    @ObfuscatedName("il.v")
    public int field3286 = 0;

    @ObfuscatedName("cm.i(Liw;I)V")
    public static void method1619(class236 arg0) {
        Statics.field3283 = arg0;
        Statics.field3289 = Statics.field3283.method3847(16);
    }

    @ObfuscatedName("l.c(II)Lil;")
    public static class242 method152(int arg0) {
        class242 var1 = (class242) field3285.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3283.method3769(16, arg0);
        class242 var3 = new class242();
        if (var2 != null) {
            var3.method3940(new class174(var2));
        }
        field3285.method3222(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.e(Lfx;S)V")
    public void method3940(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method3931(arg0, var2);
        }
    }

    @ObfuscatedName("il.v(Lfx;IB)V")
    public void method3931(class174 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3286 = arg0.method2872();
        }
    }
}
