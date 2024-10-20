package deob;

@ObfuscatedName("gm")
public class class196 extends class130 {

    @ObfuscatedName("gm.d")
    public static class125 field2856 = new class125(64);

    @ObfuscatedName("gm.h")
    public char field2857;

    @ObfuscatedName("gm.p")
    public char field2858;

    @ObfuscatedName("gm.j")
    public String field2862 = "null";

    @ObfuscatedName("gm.n")
    public int field2864;

    @ObfuscatedName("gm.r")
    public int field2859 = 0;

    @ObfuscatedName("gm.c")
    public int[] field2863;

    @ObfuscatedName("gm.i")
    public int[] field2866;

    @ObfuscatedName("gm.o")
    public String[] field2861;

    @ObfuscatedName("ao.q(Lgj;I)V")
    public static void method783(class183 arg0) {
        Statics.field2860 = arg0;
    }

    @ObfuscatedName("fy.d(II)Lgm;")
    public static class196 method3021(int arg0) {
        class196 var1 = (class196) field2856.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2860.method3133(8, arg0);
        class196 var3 = new class196();
        if (var2 != null) {
            var3.method3376(new class154(var2));
        }
        field2856.method2248(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gm.h(Lel;I)V")
    public void method3376(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3371(arg0, var2);
        }
    }

    @ObfuscatedName("gm.p(Lel;II)V")
    public void method3371(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2857 = (char) arg0.method2666();
        } else if (arg1 == 2) {
            this.field2858 = (char) arg0.method2666();
        } else if (arg1 == 3) {
            this.field2862 = arg0.method2701();
        } else if (arg1 == 4) {
            this.field2864 = arg0.method2798();
        } else if (arg1 == 5) {
            this.field2859 = arg0.method2668();
            this.field2863 = new int[this.field2859];
            this.field2861 = new String[this.field2859];
            for (int var3 = 0; var3 < this.field2859; var3++) {
                this.field2863[var3] = arg0.method2798();
                this.field2861[var3] = arg0.method2701();
            }
        } else if (arg1 == 6) {
            this.field2859 = arg0.method2668();
            this.field2863 = new int[this.field2859];
            this.field2866 = new int[this.field2859];
            for (int var4 = 0; var4 < this.field2859; var4++) {
                this.field2863[var4] = arg0.method2798();
                this.field2866[var4] = arg0.method2798();
            }
        }
    }
}
