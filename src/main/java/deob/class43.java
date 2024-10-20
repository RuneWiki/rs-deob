package deob;

@ObfuscatedName("az")
public class class43 extends class182 {

    @ObfuscatedName("az.v")
    public static class171 field983 = new class171(64);

    @ObfuscatedName("az.i")
    public char field982;

    @ObfuscatedName("az.g")
    public char field973;

    @ObfuscatedName("az.x")
    public String field974 = "null";

    @ObfuscatedName("az.b")
    public int field975;

    @ObfuscatedName("az.q")
    public int field970 = 0;

    @ObfuscatedName("az.l")
    public int[] field976;

    @ObfuscatedName("az.m")
    public int[] field978;

    @ObfuscatedName("az.u")
    public String[] field979;

    @ObfuscatedName("az.e(Ldk;B)V")
    public void method807(class107 arg0) {
        while (true) {
            int var2 = arg0.method2226();
            if (var2 == 0) {
                return;
            }
            this.method808(arg0, var2);
        }
    }

    @ObfuscatedName("az.v(Ldk;IB)V")
    public void method808(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field982 = (char) arg0.method2226();
        } else if (arg1 == 2) {
            this.field973 = (char) arg0.method2226();
        } else if (arg1 == 3) {
            this.field974 = arg0.method2124();
        } else if (arg1 == 4) {
            this.field975 = arg0.method2121();
        } else if (arg1 == 5) {
            this.field970 = arg0.method2152();
            this.field976 = new int[this.field970];
            this.field979 = new String[this.field970];
            for (int var3 = 0; var3 < this.field970; var3++) {
                this.field976[var3] = arg0.method2121();
                this.field979[var3] = arg0.method2124();
            }
        } else if (arg1 == 6) {
            this.field970 = arg0.method2152();
            this.field976 = new int[this.field970];
            this.field978 = new int[this.field970];
            for (int var4 = 0; var4 < this.field970; var4++) {
                this.field976[var4] = arg0.method2121();
                this.field978[var4] = arg0.method2121();
            }
        }
    }
}
