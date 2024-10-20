package deob;

@ObfuscatedName("as")
public class class39 extends class174 {

    @ObfuscatedName("as.f")
    public static class170 field964 = new class170(64);

    @ObfuscatedName("as.o")
    public char field965;

    @ObfuscatedName("as.h")
    public char field966;

    @ObfuscatedName("as.u")
    public String field967 = "null";

    @ObfuscatedName("as.a")
    public int field968;

    @ObfuscatedName("as.q")
    public int field969 = 0;

    @ObfuscatedName("as.t")
    public int[] field973;

    @ObfuscatedName("as.n")
    public int[] field971;

    @ObfuscatedName("as.i")
    public String[] field972;

    @ObfuscatedName("ai.j(Lew;I)V")
    public static void method565(class153 arg0) {
        Statics.field963 = arg0;
    }

    @ObfuscatedName("as.f(Ldq;B)V")
    public void method829(class127 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method828(arg0, var2);
        }
    }

    @ObfuscatedName("as.o(Ldq;II)V")
    public void method828(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field965 = (char) arg0.method2464();
        } else if (arg1 == 2) {
            this.field966 = (char) arg0.method2464();
        } else if (arg1 == 3) {
            this.field967 = arg0.method2518();
        } else if (arg1 == 4) {
            this.field968 = arg0.method2508();
        } else if (arg1 == 5) {
            this.field969 = arg0.method2582();
            this.field973 = new int[this.field969];
            this.field972 = new String[this.field969];
            for (int var3 = 0; var3 < this.field969; var3++) {
                this.field973[var3] = arg0.method2508();
                this.field972[var3] = arg0.method2518();
            }
        } else if (arg1 == 6) {
            this.field969 = arg0.method2582();
            this.field973 = new int[this.field969];
            this.field971 = new int[this.field969];
            for (int var4 = 0; var4 < this.field969; var4++) {
                this.field973[var4] = arg0.method2508();
                this.field971[var4] = arg0.method2508();
            }
        }
    }
}
