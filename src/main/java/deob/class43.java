package deob;

@ObfuscatedName("ak")
public class class43 extends class183 {

    @ObfuscatedName("ak.s")
    public static class172 field982 = new class172(64);

    @ObfuscatedName("ak.h")
    public char field983;

    @ObfuscatedName("ak.m")
    public char field984;

    @ObfuscatedName("ak.u")
    public String field981 = "null";

    @ObfuscatedName("ak.j")
    public int field989;

    @ObfuscatedName("ak.b")
    public int field987 = 0;

    @ObfuscatedName("ak.v")
    public int[] field988;

    @ObfuscatedName("ak.y")
    public int[] field990;

    @ObfuscatedName("ak.w")
    public String[] field986;

    @ObfuscatedName("ak.g(Ldi;I)V")
    public void method811(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method815(arg0, var2);
        }
    }

    @ObfuscatedName("ak.s(Ldi;IB)V")
    public void method815(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field983 = (char) arg0.method2101();
        } else if (arg1 == 2) {
            this.field984 = (char) arg0.method2101();
        } else if (arg1 == 3) {
            this.field981 = arg0.method2137();
        } else if (arg1 == 4) {
            this.field989 = arg0.method2286();
        } else if (arg1 == 5) {
            this.field987 = arg0.method2166();
            this.field988 = new int[this.field987];
            this.field986 = new String[this.field987];
            for (int var3 = 0; var3 < this.field987; var3++) {
                this.field988[var3] = arg0.method2286();
                this.field986[var3] = arg0.method2137();
            }
        } else if (arg1 == 6) {
            this.field987 = arg0.method2166();
            this.field988 = new int[this.field987];
            this.field990 = new int[this.field987];
            for (int var4 = 0; var4 < this.field987; var4++) {
                this.field988[var4] = arg0.method2286();
                this.field990[var4] = arg0.method2286();
            }
        }
    }
}
