package deob;

@ObfuscatedName("ai")
public class class39 extends class174 {

    @ObfuscatedName("ai.v")
    public static class170 field971 = new class170(64);

    @ObfuscatedName("ai.m")
    public int field972;

    @ObfuscatedName("ai.j")
    public char field973;

    @ObfuscatedName("ai.o")
    public String field974 = "null";

    @ObfuscatedName("ai.l")
    public int field975;

    @ObfuscatedName("ai.g")
    public int field981 = 0;

    @ObfuscatedName("ai.w")
    public int[] field982;

    @ObfuscatedName("ai.c")
    public int[] field978;

    @ObfuscatedName("ai.z")
    public String[] field979;

    @ObfuscatedName("ai.i(Lda;B)V")
    public void method843(class127 arg0) {
        while (true) {
            int var2 = arg0.method2491();
            if (var2 == 0) {
                return;
            }
            this.method842(arg0, var2);
        }
    }

    @ObfuscatedName("ai.v(Lda;II)V")
    public void method842(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field972 = arg0.method2491();
        } else if (arg1 == 2) {
            this.field973 = (char) arg0.method2491();
        } else if (arg1 == 3) {
            this.field974 = arg0.method2500();
        } else if (arg1 == 4) {
            this.field975 = arg0.method2668();
        } else if (arg1 == 5) {
            this.field981 = arg0.method2493();
            this.field982 = new int[this.field981];
            this.field979 = new String[this.field981];
            for (int var3 = 0; var3 < this.field981; var3++) {
                this.field982[var3] = arg0.method2668();
                this.field979[var3] = arg0.method2500();
            }
        } else if (arg1 == 6) {
            this.field981 = arg0.method2493();
            this.field982 = new int[this.field981];
            this.field978 = new int[this.field981];
            for (int var4 = 0; var4 < this.field981; var4++) {
                this.field982[var4] = arg0.method2668();
                this.field978[var4] = arg0.method2668();
            }
        }
    }
}
