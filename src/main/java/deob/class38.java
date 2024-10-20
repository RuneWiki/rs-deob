package deob;

@ObfuscatedName("ag")
public class class38 extends class172 {

    @ObfuscatedName("ag.e")
    public static class168 field952 = new class168(64);

    @ObfuscatedName("ag.n")
    public int field963;

    @ObfuscatedName("ag.j")
    public char field957;

    @ObfuscatedName("ag.i")
    public String field955 = "null";

    @ObfuscatedName("ag.o")
    public int field951;

    @ObfuscatedName("ag.l")
    public int field961 = 0;

    @ObfuscatedName("ag.p")
    public int[] field958;

    @ObfuscatedName("ag.t")
    public int[] field954;

    @ObfuscatedName("ag.w")
    public String[] field960;

    @ObfuscatedName("ao.g(Lez;I)V")
    public static void method725(class150 arg0) {
        Statics.field959 = arg0;
    }

    @ObfuscatedName("ag.e(Ldu;S)V")
    public void method825(class126 arg0) {
        while (true) {
            int var2 = arg0.method2485();
            if (var2 == 0) {
                return;
            }
            this.method826(arg0, var2);
        }
    }

    @ObfuscatedName("ag.n(Ldu;IB)V")
    public void method826(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field963 = arg0.method2485();
        } else if (arg1 == 2) {
            this.field957 = (char) arg0.method2485();
        } else if (arg1 == 3) {
            this.field955 = arg0.method2470();
        } else if (arg1 == 4) {
            this.field951 = arg0.method2593();
        } else if (arg1 == 5) {
            this.field961 = arg0.method2487();
            this.field958 = new int[this.field961];
            this.field960 = new String[this.field961];
            for (int var3 = 0; var3 < this.field961; var3++) {
                this.field958[var3] = arg0.method2593();
                this.field960[var3] = arg0.method2470();
            }
        } else if (arg1 == 6) {
            this.field961 = arg0.method2487();
            this.field958 = new int[this.field961];
            this.field954 = new int[this.field961];
            for (int var4 = 0; var4 < this.field961; var4++) {
                this.field958[var4] = arg0.method2593();
                this.field954[var4] = arg0.method2593();
            }
        }
    }
}
