package deob;

@ObfuscatedName("at")
public class class39 extends class174 {

    @ObfuscatedName("at.w")
    public static class170 field969 = new class170(64);

    @ObfuscatedName("at.f")
    public int field980;

    @ObfuscatedName("at.e")
    public char field973;

    @ObfuscatedName("at.t")
    public String field970 = "null";

    @ObfuscatedName("at.d")
    public int field971;

    @ObfuscatedName("at.p")
    public int field974 = 0;

    @ObfuscatedName("at.k")
    public int[] field975;

    @ObfuscatedName("at.r")
    public int[] field976;

    @ObfuscatedName("at.l")
    public String[] field977;

    @ObfuscatedName("ex.i(Leg;B)V")
    public static void method2662(class152 arg0) {
        Statics.field978 = arg0;
    }

    @ObfuscatedName("m.w(IB)Lat;")
    public static class39 method155(int arg0) {
        class39 var1 = (class39) field969.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field978.method2970(8, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method816(new class127(var2));
        }
        field969.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.f(Ldz;B)V")
    public void method816(class127 arg0) {
        while (true) {
            int var2 = arg0.method2472();
            if (var2 == 0) {
                return;
            }
            this.method818(arg0, var2);
        }
    }

    @ObfuscatedName("at.e(Ldz;II)V")
    public void method818(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field980 = arg0.method2472();
        } else if (arg1 == 2) {
            this.field973 = (char) arg0.method2472();
        } else if (arg1 == 3) {
            this.field970 = arg0.method2460();
        } else if (arg1 == 4) {
            this.field971 = arg0.method2457();
        } else if (arg1 == 5) {
            this.field974 = arg0.method2615();
            this.field975 = new int[this.field974];
            this.field977 = new String[this.field974];
            for (int var3 = 0; var3 < this.field974; var3++) {
                this.field975[var3] = arg0.method2457();
                this.field977[var3] = arg0.method2460();
            }
        } else if (arg1 == 6) {
            this.field974 = arg0.method2615();
            this.field975 = new int[this.field974];
            this.field976 = new int[this.field974];
            for (int var4 = 0; var4 < this.field974; var4++) {
                this.field975[var4] = arg0.method2457();
                this.field976[var4] = arg0.method2457();
            }
        }
    }
}
