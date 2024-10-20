package deob;

@ObfuscatedName("au")
public class class40 extends class176 {

    @ObfuscatedName("au.b")
    public static class172 field971 = new class172(64);

    @ObfuscatedName("au.r")
    public char field980;

    @ObfuscatedName("au.l")
    public char field974;

    @ObfuscatedName("au.s")
    public String field975 = "null";

    @ObfuscatedName("au.d")
    public int field976;

    @ObfuscatedName("au.e")
    public int field977 = 0;

    @ObfuscatedName("au.u")
    public int[] field978;

    @ObfuscatedName("au.q")
    public int[] field979;

    @ObfuscatedName("au.o")
    public String[] field972;

    @ObfuscatedName("au.i(Lds;I)V")
    public void method823(class128 arg0) {
        while (true) {
            int var2 = arg0.method2531();
            if (var2 == 0) {
                return;
            }
            this.method825(arg0, var2);
        }
    }

    @ObfuscatedName("au.b(Lds;II)V")
    public void method825(class128 arg0, int arg1) {
        if (arg1 == 1) {
            this.field980 = (char) arg0.method2531();
        } else if (arg1 == 2) {
            this.field974 = (char) arg0.method2531();
        } else if (arg1 == 3) {
            this.field975 = arg0.method2618();
        } else if (arg1 == 4) {
            this.field976 = arg0.method2468();
        } else if (arg1 == 5) {
            this.field977 = arg0.method2473();
            this.field978 = new int[this.field977];
            this.field972 = new String[this.field977];
            for (int var3 = 0; var3 < this.field977; var3++) {
                this.field978[var3] = arg0.method2468();
                this.field972[var3] = arg0.method2618();
            }
        } else if (arg1 == 6) {
            this.field977 = arg0.method2473();
            this.field978 = new int[this.field977];
            this.field979 = new int[this.field977];
            for (int var4 = 0; var4 < this.field977; var4++) {
                this.field978[var4] = arg0.method2468();
                this.field979[var4] = arg0.method2468();
            }
        }
    }
}
