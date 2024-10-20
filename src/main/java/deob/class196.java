package deob;

@ObfuscatedName("gg")
public class class196 extends class130 {

    @ObfuscatedName("gg.l")
    public static class125 field2862 = new class125(64);

    @ObfuscatedName("gg.i")
    public char field2863;

    @ObfuscatedName("gg.t")
    public char field2864;

    @ObfuscatedName("gg.k")
    public String field2865 = "null";

    @ObfuscatedName("gg.h")
    public int field2866;

    @ObfuscatedName("gg.n")
    public int field2867 = 0;

    @ObfuscatedName("gg.f")
    public int[] field2869;

    @ObfuscatedName("gg.a")
    public int[] field2868;

    @ObfuscatedName("gg.r")
    public String[] field2870;

    @ObfuscatedName("av.b(Lgj;B)V")
    public static void method935(class183 arg0) {
        Statics.field2871 = arg0;
    }

    @ObfuscatedName("gg.l(Leg;I)V")
    public void method3425(class154 arg0) {
        while (true) {
            int var2 = arg0.method2678();
            if (var2 == 0) {
                return;
            }
            this.method3427(arg0, var2);
        }
    }

    @ObfuscatedName("gg.i(Leg;II)V")
    public void method3427(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2863 = (char) arg0.method2678();
        } else if (arg1 == 2) {
            this.field2864 = (char) arg0.method2678();
        } else if (arg1 == 3) {
            this.field2865 = arg0.method2686();
        } else if (arg1 == 4) {
            this.field2866 = arg0.method2683();
        } else if (arg1 == 5) {
            this.field2867 = arg0.method2801();
            this.field2869 = new int[this.field2867];
            this.field2870 = new String[this.field2867];
            for (int var3 = 0; var3 < this.field2867; var3++) {
                this.field2869[var3] = arg0.method2683();
                this.field2870[var3] = arg0.method2686();
            }
        } else if (arg1 == 6) {
            this.field2867 = arg0.method2801();
            this.field2869 = new int[this.field2867];
            this.field2868 = new int[this.field2867];
            for (int var4 = 0; var4 < this.field2867; var4++) {
                this.field2869[var4] = arg0.method2683();
                this.field2868[var4] = arg0.method2683();
            }
        }
    }
}
