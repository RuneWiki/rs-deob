package deob;

@ObfuscatedName("ad")
public class class43 extends class183 {

    @ObfuscatedName("ad.g")
    public static class172 field982 = new class172(64);

    @ObfuscatedName("ad.x")
    public char field983;

    @ObfuscatedName("ad.c")
    public char field984;

    @ObfuscatedName("ad.n")
    public String field985 = "null";

    @ObfuscatedName("ad.s")
    public int field986;

    @ObfuscatedName("ad.r")
    public int field987 = 0;

    @ObfuscatedName("ad.w")
    public int[] field994;

    @ObfuscatedName("ad.u")
    public int[] field988;

    @ObfuscatedName("ad.d")
    public String[] field990;

    @ObfuscatedName("l.p(II)Lad;")
    public static class43 method488(int arg0) {
        class43 var1 = (class43) field982.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field995.method2855(8, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method858(new class107(var2));
        }
        field982.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.g(Ldp;I)V")
    public void method858(class107 arg0) {
        while (true) {
            int var2 = arg0.method2173();
            if (var2 == 0) {
                return;
            }
            this.method860(arg0, var2);
        }
    }

    @ObfuscatedName("ad.x(Ldp;II)V")
    public void method860(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field983 = (char) arg0.method2173();
        } else if (arg1 == 2) {
            this.field984 = (char) arg0.method2173();
        } else if (arg1 == 3) {
            this.field985 = arg0.method2351();
        } else if (arg1 == 4) {
            this.field986 = arg0.method2305();
        } else if (arg1 == 5) {
            this.field987 = arg0.method2175();
            this.field994 = new int[this.field987];
            this.field990 = new String[this.field987];
            for (int var3 = 0; var3 < this.field987; var3++) {
                this.field994[var3] = arg0.method2305();
                this.field990[var3] = arg0.method2351();
            }
        } else if (arg1 == 6) {
            this.field987 = arg0.method2175();
            this.field994 = new int[this.field987];
            this.field988 = new int[this.field987];
            for (int var4 = 0; var4 < this.field987; var4++) {
                this.field994[var4] = arg0.method2305();
                this.field988[var4] = arg0.method2305();
            }
        }
    }
}
