package deob;

@ObfuscatedName("ae")
public class class44 extends class185 {

    @ObfuscatedName("ae.y")
    public static class174 field987 = new class174(64);

    @ObfuscatedName("ae.g")
    public char field988;

    @ObfuscatedName("ae.j")
    public char field985;

    @ObfuscatedName("ae.w")
    public String field986 = "null";

    @ObfuscatedName("ae.c")
    public int field982;

    @ObfuscatedName("ae.x")
    public int field984 = 0;

    @ObfuscatedName("ae.f")
    public int[] field989;

    @ObfuscatedName("ae.t")
    public int[] field990;

    @ObfuscatedName("ae.n")
    public String[] field991;

    @ObfuscatedName("ae.l(Ldk;I)V")
    public void method832(class108 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method828(arg0, var2);
        }
    }

    @ObfuscatedName("ae.y(Ldk;II)V")
    public void method828(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field988 = (char) arg0.method2291();
        } else if (arg1 == 2) {
            this.field985 = (char) arg0.method2291();
        } else if (arg1 == 3) {
            this.field986 = arg0.method2168();
        } else if (arg1 == 4) {
            this.field982 = arg0.method2297();
        } else if (arg1 == 5) {
            this.field984 = arg0.method2163();
            this.field989 = new int[this.field984];
            this.field991 = new String[this.field984];
            for (int var3 = 0; var3 < this.field984; var3++) {
                this.field989[var3] = arg0.method2297();
                this.field991[var3] = arg0.method2168();
            }
        } else if (arg1 == 6) {
            this.field984 = arg0.method2163();
            this.field989 = new int[this.field984];
            this.field990 = new int[this.field984];
            for (int var4 = 0; var4 < this.field984; var4++) {
                this.field989[var4] = arg0.method2297();
                this.field990[var4] = arg0.method2297();
            }
        }
    }
}
