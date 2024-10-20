package deob;

@ObfuscatedName("ap")
public class class38 extends class172 {

    @ObfuscatedName("ap.h")
    public static class168 field964 = new class168(64);

    @ObfuscatedName("ap.c")
    public int field966;

    @ObfuscatedName("ap.p")
    public char field970;

    @ObfuscatedName("ap.i")
    public String field967 = "null";

    @ObfuscatedName("ap.v")
    public int field968;

    @ObfuscatedName("ap.l")
    public int field969 = 0;

    @ObfuscatedName("ap.m")
    public int[] field975;

    @ObfuscatedName("ap.g")
    public int[] field973;

    @ObfuscatedName("ap.t")
    public String[] field972;

    @ObfuscatedName("di.z(Len;B)V")
    public static void method2435(class150 arg0) {
        Statics.field963 = arg0;
    }

    @ObfuscatedName("ap.h(Ldq;I)V")
    public void method816(class126 arg0) {
        while (true) {
            int var2 = arg0.method2450();
            if (var2 == 0) {
                return;
            }
            this.method814(arg0, var2);
        }
    }

    @ObfuscatedName("ap.c(Ldq;II)V")
    public void method814(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field966 = arg0.method2450();
        } else if (arg1 == 2) {
            this.field970 = (char) arg0.method2450();
        } else if (arg1 == 3) {
            this.field967 = arg0.method2603();
        } else if (arg1 == 4) {
            this.field968 = arg0.method2467();
        } else if (arg1 == 5) {
            this.field969 = arg0.method2627();
            this.field975 = new int[this.field969];
            this.field972 = new String[this.field969];
            for (int var3 = 0; var3 < this.field969; var3++) {
                this.field975[var3] = arg0.method2467();
                this.field972[var3] = arg0.method2603();
            }
        } else if (arg1 == 6) {
            this.field969 = arg0.method2627();
            this.field975 = new int[this.field969];
            this.field973 = new int[this.field969];
            for (int var4 = 0; var4 < this.field969; var4++) {
                this.field975[var4] = arg0.method2467();
                this.field973[var4] = arg0.method2467();
            }
        }
    }
}
