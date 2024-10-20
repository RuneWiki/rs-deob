package deob;

@ObfuscatedName("gg")
public class class196 extends class130 {

    @ObfuscatedName("gg.n")
    public static class125 field2868 = new class125(64);

    @ObfuscatedName("gg.g")
    public char field2862;

    @ObfuscatedName("gg.v")
    public char field2863;

    @ObfuscatedName("gg.y")
    public String field2864 = "null";

    @ObfuscatedName("gg.p")
    public int field2869;

    @ObfuscatedName("gg.j")
    public int field2866 = 0;

    @ObfuscatedName("gg.m")
    public int[] field2867;

    @ObfuscatedName("gg.a")
    public int[] field2865;

    @ObfuscatedName("gg.i")
    public String[] field2860;

    @ObfuscatedName("en.x(IB)Lgg;")
    public static class196 method2595(int arg0) {
        class196 var1 = (class196) field2868.method2275((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2861.method3153(8, arg0);
        class196 var3 = new class196();
        if (var2 != null) {
            var3.method3409(new class154(var2));
        }
        field2868.method2282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gg.n(Leq;I)V")
    public void method3409(class154 arg0) {
        while (true) {
            int var2 = arg0.method2878();
            if (var2 == 0) {
                return;
            }
            this.method3411(arg0, var2);
        }
    }

    @ObfuscatedName("gg.g(Leq;II)V")
    public void method3411(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2862 = (char) arg0.method2878();
        } else if (arg1 == 2) {
            this.field2863 = (char) arg0.method2878();
        } else if (arg1 == 3) {
            this.field2864 = arg0.method2709();
        } else if (arg1 == 4) {
            this.field2869 = arg0.method2803();
        } else if (arg1 == 5) {
            this.field2866 = arg0.method2833();
            this.field2867 = new int[this.field2866];
            this.field2860 = new String[this.field2866];
            for (int var3 = 0; var3 < this.field2866; var3++) {
                this.field2867[var3] = arg0.method2803();
                this.field2860[var3] = arg0.method2709();
            }
        } else if (arg1 == 6) {
            this.field2866 = arg0.method2833();
            this.field2867 = new int[this.field2866];
            this.field2865 = new int[this.field2866];
            for (int var4 = 0; var4 < this.field2866; var4++) {
                this.field2867[var4] = arg0.method2803();
                this.field2865[var4] = arg0.method2803();
            }
        }
    }
}
