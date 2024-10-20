package deob;

@ObfuscatedName("ai")
public class class39 extends class174 {

    @ObfuscatedName("ai.x")
    public static class170 field981 = new class170(64);

    @ObfuscatedName("ai.e")
    public int field982;

    @ObfuscatedName("ai.r")
    public char field990;

    @ObfuscatedName("ai.p")
    public String field984 = "null";

    @ObfuscatedName("ai.n")
    public int field987;

    @ObfuscatedName("ai.o")
    public int field992 = 0;

    @ObfuscatedName("ai.l")
    public int[] field986;

    @ObfuscatedName("ai.t")
    public int[] field988;

    @ObfuscatedName("ai.q")
    public String[] field985;

    @ObfuscatedName("ai.a(Ldy;I)V")
    public void method829(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method828(arg0, var2);
        }
    }

    @ObfuscatedName("ai.x(Ldy;II)V")
    public void method828(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field982 = arg0.method2411();
        } else if (arg1 == 2) {
            this.field990 = (char) arg0.method2411();
        } else if (arg1 == 3) {
            this.field984 = arg0.method2564();
        } else if (arg1 == 4) {
            this.field987 = arg0.method2416();
        } else if (arg1 == 5) {
            this.field992 = arg0.method2413();
            this.field986 = new int[this.field992];
            this.field985 = new String[this.field992];
            for (int var3 = 0; var3 < this.field992; var3++) {
                this.field986[var3] = arg0.method2416();
                this.field985[var3] = arg0.method2564();
            }
        } else if (arg1 == 6) {
            this.field992 = arg0.method2413();
            this.field986 = new int[this.field992];
            this.field988 = new int[this.field992];
            for (int var4 = 0; var4 < this.field992; var4++) {
                this.field986[var4] = arg0.method2416();
                this.field988[var4] = arg0.method2416();
            }
        }
    }
}
