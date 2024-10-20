package deob;

@ObfuscatedName("at")
public class class39 extends class174 {

    @ObfuscatedName("at.q")
    public static class170 field989 = new class170(64);

    @ObfuscatedName("at.y")
    public char field982;

    @ObfuscatedName("at.v")
    public char field984;

    @ObfuscatedName("at.g")
    public String field985 = "null";

    @ObfuscatedName("at.x")
    public int field986;

    @ObfuscatedName("at.u")
    public int field987 = 0;

    @ObfuscatedName("at.l")
    public int[] field988;

    @ObfuscatedName("at.a")
    public int[] field981;

    @ObfuscatedName("at.h")
    public String[] field990;

    @ObfuscatedName("at.c(Ldg;B)V")
    public void method780(class127 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method779(arg0, var2);
        }
    }

    @ObfuscatedName("at.q(Ldg;II)V")
    public void method779(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field982 = (char) arg0.method2383();
        } else if (arg1 == 2) {
            this.field984 = (char) arg0.method2383();
        } else if (arg1 == 3) {
            this.field985 = arg0.method2315();
        } else if (arg1 == 4) {
            this.field986 = arg0.method2323();
        } else if (arg1 == 5) {
            this.field987 = arg0.method2327();
            this.field988 = new int[this.field987];
            this.field990 = new String[this.field987];
            for (int var3 = 0; var3 < this.field987; var3++) {
                this.field988[var3] = arg0.method2323();
                this.field990[var3] = arg0.method2315();
            }
        } else if (arg1 == 6) {
            this.field987 = arg0.method2327();
            this.field988 = new int[this.field987];
            this.field981 = new int[this.field987];
            for (int var4 = 0; var4 < this.field987; var4++) {
                this.field988[var4] = arg0.method2323();
                this.field981[var4] = arg0.method2323();
            }
        }
    }
}
