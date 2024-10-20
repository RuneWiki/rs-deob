package deob;

@ObfuscatedName("at")
public class class43 extends class180 {

    @ObfuscatedName("at.u")
    public static class170 field979 = new class170(64);

    @ObfuscatedName("at.k")
    public char field973;

    @ObfuscatedName("at.v")
    public char field972;

    @ObfuscatedName("at.l")
    public String field980 = "null";

    @ObfuscatedName("at.g")
    public int field974;

    @ObfuscatedName("at.a")
    public int field975 = 0;

    @ObfuscatedName("at.x")
    public int[] field976;

    @ObfuscatedName("at.r")
    public int[] field977;

    @ObfuscatedName("at.w")
    public String[] field982;

    @ObfuscatedName("bu.y(Lev;B)V")
    public static void method1400(class145 arg0) {
        Statics.field970 = arg0;
    }

    @ObfuscatedName("at.u(Ldo;I)V")
    public void method808(class107 arg0) {
        while (true) {
            int var2 = arg0.method2109();
            if (var2 == 0) {
                return;
            }
            this.method809(arg0, var2);
        }
    }

    @ObfuscatedName("at.k(Ldo;II)V")
    public void method809(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field973 = (char) arg0.method2109();
        } else if (arg1 == 2) {
            this.field972 = (char) arg0.method2109();
        } else if (arg1 == 3) {
            this.field980 = arg0.method2126();
        } else if (arg1 == 4) {
            this.field974 = arg0.method2114();
        } else if (arg1 == 5) {
            this.field975 = arg0.method2111();
            this.field976 = new int[this.field975];
            this.field982 = new String[this.field975];
            for (int var3 = 0; var3 < this.field975; var3++) {
                this.field976[var3] = arg0.method2114();
                this.field982[var3] = arg0.method2126();
            }
        } else if (arg1 == 6) {
            this.field975 = arg0.method2111();
            this.field976 = new int[this.field975];
            this.field977 = new int[this.field975];
            for (int var4 = 0; var4 < this.field975; var4++) {
                this.field976[var4] = arg0.method2114();
                this.field977[var4] = arg0.method2114();
            }
        }
    }
}
