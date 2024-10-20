package deob;

@ObfuscatedName("gz")
public class class196 extends class130 {

    @ObfuscatedName("gz.i")
    public static class125 field2864 = new class125(64);

    @ObfuscatedName("gz.u")
    public char field2865;

    @ObfuscatedName("gz.h")
    public char field2866;

    @ObfuscatedName("gz.r")
    public String field2867 = "null";

    @ObfuscatedName("gz.o")
    public int field2870;

    @ObfuscatedName("gz.l")
    public int field2869 = 0;

    @ObfuscatedName("gz.n")
    public int[] field2863;

    @ObfuscatedName("gz.m")
    public int[] field2873;

    @ObfuscatedName("gz.w")
    public String[] field2872;

    @ObfuscatedName("gz.f(Leo;I)V")
    public void method3376(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3377(arg0, var2);
        }
    }

    @ObfuscatedName("gz.i(Leo;II)V")
    public void method3377(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2865 = (char) arg0.method2666();
        } else if (arg1 == 2) {
            this.field2866 = (char) arg0.method2666();
        } else if (arg1 == 3) {
            this.field2867 = arg0.method2674();
        } else if (arg1 == 4) {
            this.field2870 = arg0.method2695();
        } else if (arg1 == 5) {
            this.field2869 = arg0.method2668();
            this.field2863 = new int[this.field2869];
            this.field2872 = new String[this.field2869];
            for (int var3 = 0; var3 < this.field2869; var3++) {
                this.field2863[var3] = arg0.method2695();
                this.field2872[var3] = arg0.method2674();
            }
        } else if (arg1 == 6) {
            this.field2869 = arg0.method2668();
            this.field2863 = new int[this.field2869];
            this.field2873 = new int[this.field2869];
            for (int var4 = 0; var4 < this.field2869; var4++) {
                this.field2863[var4] = arg0.method2695();
                this.field2873[var4] = arg0.method2695();
            }
        }
    }
}
