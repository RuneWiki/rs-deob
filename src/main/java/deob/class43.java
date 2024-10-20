package deob;

@ObfuscatedName("ad")
public class class43 extends class183 {

    @ObfuscatedName("ad.s")
    public static class172 field983 = new class172(64);

    @ObfuscatedName("ad.v")
    public char field980;

    @ObfuscatedName("ad.o")
    public char field987;

    @ObfuscatedName("ad.k")
    public String field982 = "null";

    @ObfuscatedName("ad.m")
    public int field984;

    @ObfuscatedName("ad.i")
    public int field990 = 0;

    @ObfuscatedName("ad.t")
    public int[] field985;

    @ObfuscatedName("ad.l")
    public int[] field986;

    @ObfuscatedName("ad.p")
    public String[] field989;

    @ObfuscatedName("h.g(II)Lad;")
    public static class43 method157(int arg0) {
        class43 var1 = (class43) field983.method3112((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field991.method2703(8, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method820(new class107(var2));
        }
        field983.method3115(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.s(Lde;I)V")
    public void method820(class107 arg0) {
        while (true) {
            int var2 = arg0.method2116();
            if (var2 == 0) {
                return;
            }
            this.method818(arg0, var2);
        }
    }

    @ObfuscatedName("ad.v(Lde;II)V")
    public void method818(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field980 = (char) arg0.method2116();
        } else if (arg1 == 2) {
            this.field987 = (char) arg0.method2116();
        } else if (arg1 == 3) {
            this.field982 = arg0.method2100();
        } else if (arg1 == 4) {
            this.field984 = arg0.method2097();
        } else if (arg1 == 5) {
            this.field990 = arg0.method2094();
            this.field985 = new int[this.field990];
            this.field989 = new String[this.field990];
            for (int var3 = 0; var3 < this.field990; var3++) {
                this.field985[var3] = arg0.method2097();
                this.field989[var3] = arg0.method2100();
            }
        } else if (arg1 == 6) {
            this.field990 = arg0.method2094();
            this.field985 = new int[this.field990];
            this.field986 = new int[this.field990];
            for (int var4 = 0; var4 < this.field990; var4++) {
                this.field985[var4] = arg0.method2097();
                this.field986[var4] = arg0.method2097();
            }
        }
    }
}
