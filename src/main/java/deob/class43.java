package deob;

@ObfuscatedName("ad")
public class class43 extends class182 {

    @ObfuscatedName("ad.b")
    public static class171 field992 = new class171(64);

    @ObfuscatedName("ad.e")
    public char field990;

    @ObfuscatedName("ad.i")
    public char field991;

    @ObfuscatedName("ad.t")
    public String field994 = "null";

    @ObfuscatedName("ad.z")
    public int field993;

    @ObfuscatedName("ad.g")
    public int field996 = 0;

    @ObfuscatedName("ad.c")
    public int[] field995;

    @ObfuscatedName("ad.o")
    public int[] field989;

    @ObfuscatedName("ad.q")
    public String[] field997;

    @ObfuscatedName("e.k(Ley;I)V")
    public static void method16(class146 arg0) {
        Statics.field998 = arg0;
    }

    @ObfuscatedName("ad.b(Ldi;B)V")
    public void method822(class107 arg0) {
        while (true) {
            int var2 = arg0.method2115();
            if (var2 == 0) {
                return;
            }
            this.method824(arg0, var2);
        }
    }

    @ObfuscatedName("ad.e(Ldi;II)V")
    public void method824(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field990 = (char) arg0.method2115();
        } else if (arg1 == 2) {
            this.field991 = (char) arg0.method2115();
        } else if (arg1 == 3) {
            this.field994 = arg0.method2123();
        } else if (arg1 == 4) {
            this.field993 = arg0.method2120();
        } else if (arg1 == 5) {
            this.field996 = arg0.method2117();
            this.field995 = new int[this.field996];
            this.field997 = new String[this.field996];
            for (int var3 = 0; var3 < this.field996; var3++) {
                this.field995[var3] = arg0.method2120();
                this.field997[var3] = arg0.method2123();
            }
        } else if (arg1 == 6) {
            this.field996 = arg0.method2117();
            this.field995 = new int[this.field996];
            this.field989 = new int[this.field996];
            for (int var4 = 0; var4 < this.field996; var4++) {
                this.field995[var4] = arg0.method2120();
                this.field989[var4] = arg0.method2120();
            }
        }
    }
}
