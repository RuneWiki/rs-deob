package deob;

@ObfuscatedName("am")
public class class39 extends class174 {

    @ObfuscatedName("am.m")
    public static class170 field971 = new class170(64);

    @ObfuscatedName("am.v")
    public int field970;

    @ObfuscatedName("am.r")
    public char field961;

    @ObfuscatedName("am.n")
    public String field959 = "null";

    @ObfuscatedName("am.i")
    public int field960;

    @ObfuscatedName("am.s")
    public int field972 = 0;

    @ObfuscatedName("am.w")
    public int[] field962;

    @ObfuscatedName("am.d")
    public int[] field963;

    @ObfuscatedName("am.t")
    public String[] field958;

    @ObfuscatedName("am.g(Ldr;I)V")
    public void method808(class127 arg0) {
        while (true) {
            int var2 = arg0.method2414();
            if (var2 == 0) {
                return;
            }
            this.method809(arg0, var2);
        }
    }

    @ObfuscatedName("am.m(Ldr;II)V")
    public void method809(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field970 = arg0.method2414();
        } else if (arg1 == 2) {
            this.field961 = (char) arg0.method2414();
        } else if (arg1 == 3) {
            this.field959 = arg0.method2422();
        } else if (arg1 == 4) {
            this.field960 = arg0.method2430();
        } else if (arg1 == 5) {
            this.field972 = arg0.method2416();
            this.field962 = new int[this.field972];
            this.field958 = new String[this.field972];
            for (int var3 = 0; var3 < this.field972; var3++) {
                this.field962[var3] = arg0.method2430();
                this.field958[var3] = arg0.method2422();
            }
        } else if (arg1 == 6) {
            this.field972 = arg0.method2416();
            this.field962 = new int[this.field972];
            this.field963 = new int[this.field972];
            for (int var4 = 0; var4 < this.field972; var4++) {
                this.field962[var4] = arg0.method2430();
                this.field963[var4] = arg0.method2430();
            }
        }
    }
}
