package deob;

@ObfuscatedName("gz")
public class class196 extends class130 {

    @ObfuscatedName("gz.g")
    public static class125 field2849 = new class125(64);

    @ObfuscatedName("gz.x")
    public char field2851;

    @ObfuscatedName("gz.q")
    public char field2852;

    @ObfuscatedName("gz.d")
    public String field2859 = "null";

    @ObfuscatedName("gz.k")
    public int field2854;

    @ObfuscatedName("gz.j")
    public int field2855 = 0;

    @ObfuscatedName("gz.s")
    public int[] field2856;

    @ObfuscatedName("gz.o")
    public int[] field2857;

    @ObfuscatedName("gz.a")
    public String[] field2853;

    @ObfuscatedName("fu.p(II)Lgz;")
    public static class196 method3016(int arg0) {
        class196 var1 = (class196) field2849.method2169((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2858.method3044(8, arg0);
        class196 var3 = new class196();
        if (var2 != null) {
            var3.method3290(new class154(var2));
        }
        field2849.method2174(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gz.g(Lev;I)V")
    public void method3290(class154 arg0) {
        while (true) {
            int var2 = arg0.method2593();
            if (var2 == 0) {
                return;
            }
            this.method3291(arg0, var2);
        }
    }

    @ObfuscatedName("gz.x(Lev;II)V")
    public void method3291(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2851 = (char) arg0.method2593();
        } else if (arg1 == 2) {
            this.field2852 = (char) arg0.method2593();
        } else if (arg1 == 3) {
            this.field2859 = arg0.method2625();
        } else if (arg1 == 4) {
            this.field2854 = arg0.method2598();
        } else if (arg1 == 5) {
            this.field2855 = arg0.method2595();
            this.field2856 = new int[this.field2855];
            this.field2853 = new String[this.field2855];
            for (int var3 = 0; var3 < this.field2855; var3++) {
                this.field2856[var3] = arg0.method2598();
                this.field2853[var3] = arg0.method2625();
            }
        } else if (arg1 == 6) {
            this.field2855 = arg0.method2595();
            this.field2856 = new int[this.field2855];
            this.field2857 = new int[this.field2855];
            for (int var4 = 0; var4 < this.field2855; var4++) {
                this.field2856[var4] = arg0.method2598();
                this.field2857[var4] = arg0.method2598();
            }
        }
    }
}
