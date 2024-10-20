package deob;

@ObfuscatedName("ag")
public class class43 extends class183 {

    @ObfuscatedName("ag.x")
    public static class172 field983 = new class172(64);

    @ObfuscatedName("ag.k")
    public char field993;

    @ObfuscatedName("ag.i")
    public char field986;

    @ObfuscatedName("ag.d")
    public String field987 = "null";

    @ObfuscatedName("ag.q")
    public int field988;

    @ObfuscatedName("ag.m")
    public int field985 = 0;

    @ObfuscatedName("ag.a")
    public int[] field990;

    @ObfuscatedName("ag.w")
    public int[] field989;

    @ObfuscatedName("ag.e")
    public String[] field992;

    @ObfuscatedName("ag.n(Ldw;I)V")
    public void method826(class107 arg0) {
        while (true) {
            int var2 = arg0.method2148();
            if (var2 == 0) {
                return;
            }
            this.method827(arg0, var2);
        }
    }

    @ObfuscatedName("ag.x(Ldw;IB)V")
    public void method827(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field993 = (char) arg0.method2148();
        } else if (arg1 == 2) {
            this.field986 = (char) arg0.method2148();
        } else if (arg1 == 3) {
            this.field987 = arg0.method2182();
        } else if (arg1 == 4) {
            this.field988 = arg0.method2183();
        } else if (arg1 == 5) {
            this.field985 = arg0.method2140();
            this.field990 = new int[this.field985];
            this.field992 = new String[this.field985];
            for (int var3 = 0; var3 < this.field985; var3++) {
                this.field990[var3] = arg0.method2183();
                this.field992[var3] = arg0.method2182();
            }
        } else if (arg1 == 6) {
            this.field985 = arg0.method2140();
            this.field990 = new int[this.field985];
            this.field989 = new int[this.field985];
            for (int var4 = 0; var4 < this.field985; var4++) {
                this.field990[var4] = arg0.method2183();
                this.field989[var4] = arg0.method2183();
            }
        }
    }
}
