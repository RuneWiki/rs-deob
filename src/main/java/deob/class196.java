package deob;

@ObfuscatedName("gq")
public class class196 extends class130 {

    @ObfuscatedName("gq.y")
    public static class125 field2839 = new class125(64);

    @ObfuscatedName("gq.o")
    public char field2840;

    @ObfuscatedName("gq.r")
    public char field2842;

    @ObfuscatedName("gq.w")
    public String field2848 = "null";

    @ObfuscatedName("gq.j")
    public int field2838;

    @ObfuscatedName("gq.q")
    public int field2844 = 0;

    @ObfuscatedName("gq.d")
    public int[] field2843;

    @ObfuscatedName("gq.n")
    public int[] field2845;

    @ObfuscatedName("gq.c")
    public String[] field2847;

    @ObfuscatedName("c.k(Lgh;S)V")
    public static void method124(class183 arg0) {
        Statics.field2849 = arg0;
    }

    @ObfuscatedName("by.y(II)Lgq;")
    public static class196 method1378(int arg0) {
        class196 var1 = (class196) field2839.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2849.method3065(8, arg0);
        class196 var3 = new class196();
        if (var2 != null) {
            var3.method3332(new class161(var2));
        }
        field2839.method2164(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gq.o(Lfm;I)V")
    public void method3332(class161 arg0) {
        while (true) {
            int var2 = arg0.method2733();
            if (var2 == 0) {
                return;
            }
            this.method3336(arg0, var2);
        }
    }

    @ObfuscatedName("gq.r(Lfm;II)V")
    public void method3336(class161 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2840 = (char) arg0.method2733();
        } else if (arg1 == 2) {
            this.field2842 = (char) arg0.method2733();
        } else if (arg1 == 3) {
            this.field2848 = arg0.method2740();
        } else if (arg1 == 4) {
            this.field2838 = arg0.method2868();
        } else if (arg1 == 5) {
            this.field2844 = arg0.method2735();
            this.field2843 = new int[this.field2844];
            this.field2847 = new String[this.field2844];
            for (int var3 = 0; var3 < this.field2844; var3++) {
                this.field2843[var3] = arg0.method2868();
                this.field2847[var3] = arg0.method2740();
            }
        } else if (arg1 == 6) {
            this.field2844 = arg0.method2735();
            this.field2843 = new int[this.field2844];
            this.field2845 = new int[this.field2844];
            for (int var4 = 0; var4 < this.field2844; var4++) {
                this.field2843[var4] = arg0.method2868();
                this.field2845[var4] = arg0.method2868();
            }
        }
    }
}
