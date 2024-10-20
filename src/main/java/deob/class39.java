package deob;

@ObfuscatedName("ad")
public class class39 extends class174 {

    @ObfuscatedName("ad.h")
    public static class170 field975 = new class170(64);

    @ObfuscatedName("ad.s")
    public char field978;

    @ObfuscatedName("ad.o")
    public char field970;

    @ObfuscatedName("ad.p")
    public String field971 = "null";

    @ObfuscatedName("ad.x")
    public int field972;

    @ObfuscatedName("ad.k")
    public int field973 = 0;

    @ObfuscatedName("ad.r")
    public int[] field974;

    @ObfuscatedName("ad.z")
    public int[] field969;

    @ObfuscatedName("ad.n")
    public String[] field976;

    @ObfuscatedName("ad.g(Ldw;I)V")
    public void method823(class127 arg0) {
        while (true) {
            int var2 = arg0.method2499();
            if (var2 == 0) {
                return;
            }
            this.method824(arg0, var2);
        }
    }

    @ObfuscatedName("ad.h(Ldw;IB)V")
    public void method824(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field978 = (char) arg0.method2499();
        } else if (arg1 == 2) {
            this.field970 = (char) arg0.method2499();
        } else if (arg1 == 3) {
            this.field971 = arg0.method2507();
        } else if (arg1 == 4) {
            this.field972 = arg0.method2548();
        } else if (arg1 == 5) {
            this.field973 = arg0.method2501();
            this.field974 = new int[this.field973];
            this.field976 = new String[this.field973];
            for (int var3 = 0; var3 < this.field973; var3++) {
                this.field974[var3] = arg0.method2548();
                this.field976[var3] = arg0.method2507();
            }
        } else if (arg1 == 6) {
            this.field973 = arg0.method2501();
            this.field974 = new int[this.field973];
            this.field969 = new int[this.field973];
            for (int var4 = 0; var4 < this.field973; var4++) {
                this.field974[var4] = arg0.method2548();
                this.field969[var4] = arg0.method2548();
            }
        }
    }
}
