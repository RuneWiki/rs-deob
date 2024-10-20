package deob;

@ObfuscatedName("it")
public class class218 extends class500 {

    @ObfuscatedName("it.al")
    public static class312 field2223 = new class312(64);

    @ObfuscatedName("it.aj")
    public int field2224;

    @ObfuscatedName("it.az")
    public int field2225;

    @ObfuscatedName("it.af")
    public int field2226;

    @ObfuscatedName("it.aa")
    public static final int[] field2222 = new int[32];

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2222[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @ObfuscatedName("bg.al(II)Lit;")
    public static class218 method685(int arg0) {
        class218 var1 = (class218) field2223.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2227.method6573(14, arg0);
        class218 var3 = new class218();
        if (var2 != null) {
            var3.method3779(new class546(var2));
        }
        field2223.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.aj(Lua;B)V")
    public void method3779(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3771(arg0, var2);
        }
    }

    @ObfuscatedName("it.az(Lua;IB)V")
    public void method3771(class546 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2224 = arg0.method8798();
            this.field2225 = arg0.method8796();
            this.field2226 = arg0.method8796();
        }
    }

    @ObfuscatedName("lv.af(B)V")
    public static void method5460() {
        field2223.method5572();
    }
}
