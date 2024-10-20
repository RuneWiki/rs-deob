package deob;

@ObfuscatedName("at")
public class class43 extends class183 {

    @ObfuscatedName("at.y")
    public static class172 field981 = new class172(64);

    @ObfuscatedName("at.s")
    public char field968;

    @ObfuscatedName("at.g")
    public char field969;

    @ObfuscatedName("at.h")
    public String field970 = "null";

    @ObfuscatedName("at.l")
    public int field971;

    @ObfuscatedName("at.e")
    public int field972 = 0;

    @ObfuscatedName("at.u")
    public int[] field966;

    @ObfuscatedName("at.j")
    public int[] field974;

    @ObfuscatedName("at.c")
    public String[] field975;

    @ObfuscatedName("at.k(Ldy;I)V")
    public void method801(class107 arg0) {
        while (true) {
            int var2 = arg0.method2138();
            if (var2 == 0) {
                return;
            }
            this.method806(arg0, var2);
        }
    }

    @ObfuscatedName("at.y(Ldy;II)V")
    public void method806(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field968 = (char) arg0.method2138();
        } else if (arg1 == 2) {
            this.field969 = (char) arg0.method2138();
        } else if (arg1 == 3) {
            this.field970 = arg0.method2146();
        } else if (arg1 == 4) {
            this.field971 = arg0.method2143();
        } else if (arg1 == 5) {
            this.field972 = arg0.method2239();
            this.field966 = new int[this.field972];
            this.field975 = new String[this.field972];
            for (int var3 = 0; var3 < this.field972; var3++) {
                this.field966[var3] = arg0.method2143();
                this.field975[var3] = arg0.method2146();
            }
        } else if (arg1 == 6) {
            this.field972 = arg0.method2239();
            this.field966 = new int[this.field972];
            this.field974 = new int[this.field972];
            for (int var4 = 0; var4 < this.field972; var4++) {
                this.field966[var4] = arg0.method2143();
                this.field974[var4] = arg0.method2143();
            }
        }
    }
}
