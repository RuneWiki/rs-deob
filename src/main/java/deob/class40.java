package deob;

@ObfuscatedName("aa")
public class class40 extends class176 {

    @ObfuscatedName("aa.i")
    public static class172 field983 = new class172(64);

    @ObfuscatedName("aa.k")
    public char field984;

    @ObfuscatedName("aa.q")
    public char field985;

    @ObfuscatedName("aa.j")
    public String field990 = "null";

    @ObfuscatedName("aa.z")
    public int field987;

    @ObfuscatedName("aa.m")
    public int field982 = 0;

    @ObfuscatedName("aa.w")
    public int[] field989;

    @ObfuscatedName("aa.a")
    public int[] field988;

    @ObfuscatedName("aa.d")
    public String[] field991;

    @ObfuscatedName("eu.e(Lea;I)V")
    public static void method2986(class155 arg0) {
        Statics.field986 = arg0;
    }

    @ObfuscatedName("dz.i(II)Laa;")
    public static class40 method2240(int arg0) {
        class40 var1 = (class40) field983.method3262((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field986.method3069(8, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method873(new class128(var2));
        }
        field983.method3264(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.k(Ldl;I)V")
    public void method873(class128 arg0) {
        while (true) {
            int var2 = arg0.method2548();
            if (var2 == 0) {
                return;
            }
            this.method869(arg0, var2);
        }
    }

    @ObfuscatedName("aa.q(Ldl;IB)V")
    public void method869(class128 arg0, int arg1) {
        if (arg1 == 1) {
            this.field984 = (char) arg0.method2548();
        } else if (arg1 == 2) {
            this.field985 = (char) arg0.method2548();
        } else if (arg1 == 3) {
            this.field990 = arg0.method2559();
        } else if (arg1 == 4) {
            this.field987 = arg0.method2592();
        } else if (arg1 == 5) {
            this.field982 = arg0.method2456();
            this.field989 = new int[this.field982];
            this.field991 = new String[this.field982];
            for (int var3 = 0; var3 < this.field982; var3++) {
                this.field989[var3] = arg0.method2592();
                this.field991[var3] = arg0.method2559();
            }
        } else if (arg1 == 6) {
            this.field982 = arg0.method2456();
            this.field989 = new int[this.field982];
            this.field988 = new int[this.field982];
            for (int var4 = 0; var4 < this.field982; var4++) {
                this.field989[var4] = arg0.method2592();
                this.field988[var4] = arg0.method2592();
            }
        }
    }
}
