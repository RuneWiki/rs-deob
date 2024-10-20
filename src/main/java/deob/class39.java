package deob;

@ObfuscatedName("ab")
public class class39 extends class174 {

    @ObfuscatedName("ab.c")
    public static class170 field959 = new class170(64);

    @ObfuscatedName("ab.p")
    public char field958;

    @ObfuscatedName("ab.z")
    public char field961;

    @ObfuscatedName("ab.m")
    public String field962 = "null";

    @ObfuscatedName("ab.k")
    public int field968;

    @ObfuscatedName("ab.v")
    public int field964 = 0;

    @ObfuscatedName("ab.y")
    public int[] field966;

    @ObfuscatedName("ab.d")
    public int[] field967;

    @ObfuscatedName("ab.l")
    public String[] field963;

    @ObfuscatedName("ck.q(Ley;I)V")
    public static void method1854(class153 arg0) {
        Statics.field965 = arg0;
    }

    @ObfuscatedName("ab.c(Ldo;I)V")
    public void method809(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method808(arg0, var2);
        }
    }

    @ObfuscatedName("ab.p(Ldo;IB)V")
    public void method808(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field958 = (char) arg0.method2534();
        } else if (arg1 == 2) {
            this.field961 = (char) arg0.method2534();
        } else if (arg1 == 3) {
            this.field962 = arg0.method2460();
        } else if (arg1 == 4) {
            this.field968 = arg0.method2430();
        } else if (arg1 == 5) {
            this.field964 = arg0.method2427();
            this.field966 = new int[this.field964];
            this.field963 = new String[this.field964];
            for (int var3 = 0; var3 < this.field964; var3++) {
                this.field966[var3] = arg0.method2430();
                this.field963[var3] = arg0.method2460();
            }
        } else if (arg1 == 6) {
            this.field964 = arg0.method2427();
            this.field966 = new int[this.field964];
            this.field967 = new int[this.field964];
            for (int var4 = 0; var4 < this.field964; var4++) {
                this.field966[var4] = arg0.method2430();
                this.field967[var4] = arg0.method2430();
            }
        }
    }
}
