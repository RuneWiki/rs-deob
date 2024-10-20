package deob;

@ObfuscatedName("ht")
public class class197 extends class481 {

    @ObfuscatedName("ht.ah")
    public static class299 field2025 = new class299(64);

    @ObfuscatedName("ht.ar")
    public int field2030;

    @ObfuscatedName("ht.ao")
    public int field2027;

    @ObfuscatedName("ht.ab")
    public int field2028;

    @ObfuscatedName("ht.au")
    public static final int[] field2029 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2029[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("dl.at(II)Lht;")
    public static class197 method2516(int arg0) {
        class197 var1 = (class197) field2025.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2026.method6284(14, arg0);
        class197 var3 = new class197();
        if (var2 != null) {
            var3.method3493(new class527(var2));
        }
        field2025.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ht.ah(Luj;B)V")
    public void method3493(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3488(arg0, var2);
        }
    }

    @ObfuscatedName("ht.ar(Luj;II)V")
    public void method3488(class527 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2030 = arg0.method8412();
            this.field2027 = arg0.method8410();
            this.field2028 = arg0.method8410();
        }
    }

    @ObfuscatedName("ji.ao(S)V")
    public static void method4485() {
        field2025.method5292();
    }
}
