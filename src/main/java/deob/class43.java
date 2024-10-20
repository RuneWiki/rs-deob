package deob;

@ObfuscatedName("ao")
public class class43 extends class183 {

    @ObfuscatedName("ao.i")
    public static class172 field988 = new class172(64);

    @ObfuscatedName("ao.k")
    public char field987;

    @ObfuscatedName("ao.e")
    public char field985;

    @ObfuscatedName("ao.w")
    public String field986 = "null";

    @ObfuscatedName("ao.m")
    public int field989;

    @ObfuscatedName("ao.u")
    public int field991 = 0;

    @ObfuscatedName("ao.j")
    public int[] field994;

    @ObfuscatedName("ao.o")
    public int[] field992;

    @ObfuscatedName("ao.h")
    public String[] field990;

    @ObfuscatedName("t.g(Leo;I)V")
    public static void method159(class147 arg0) {
        Statics.field996 = arg0;
    }

    @ObfuscatedName("ao.i(Ldk;B)V")
    public void method798(class107 arg0) {
        while (true) {
            int var2 = arg0.method2092();
            if (var2 == 0) {
                return;
            }
            this.method804(arg0, var2);
        }
    }

    @ObfuscatedName("ao.k(Ldk;II)V")
    public void method804(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field987 = (char) arg0.method2092();
        } else if (arg1 == 2) {
            this.field985 = (char) arg0.method2092();
        } else if (arg1 == 3) {
            this.field986 = arg0.method2251();
        } else if (arg1 == 4) {
            this.field989 = arg0.method2112();
        } else if (arg1 == 5) {
            this.field991 = arg0.method2094();
            this.field994 = new int[this.field991];
            this.field990 = new String[this.field991];
            for (int var3 = 0; var3 < this.field991; var3++) {
                this.field994[var3] = arg0.method2112();
                this.field990[var3] = arg0.method2251();
            }
        } else if (arg1 == 6) {
            this.field991 = arg0.method2094();
            this.field994 = new int[this.field991];
            this.field992 = new int[this.field991];
            for (int var4 = 0; var4 < this.field991; var4++) {
                this.field994[var4] = arg0.method2112();
                this.field992[var4] = arg0.method2112();
            }
        }
    }
}
