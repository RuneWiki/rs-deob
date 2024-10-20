package deob;

@ObfuscatedName("tu")
public class class509 extends class470 {

    @ObfuscatedName("tu.ay")
    public static class289 field5050 = new class289(64);

    @ObfuscatedName("tu.ar")
    public Object[][] field5051;

    @ObfuscatedName("tu.am")
    public int[][] field5052;

    @ObfuscatedName("tu.as")
    public int field5049 = -1;

    @ObfuscatedName("tu.ar(Lty;I)V")
    public void method8153(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method8155(arg0, var2);
        }
    }

    @ObfuscatedName("tu.am(II)[Ljava/lang/Object;")
    public Object[] method8154(int arg0) {
        return this.field5051 == null ? null : this.field5051[arg0];
    }

    @ObfuscatedName("tu.as(Lty;II)V")
    public void method8155(class514 arg0, int arg1) {
        if (arg1 == 3) {
            int var3 = arg0.method8244();
            if (this.field5051 == null) {
                this.field5051 = new Object[var3][];
                this.field5052 = new int[var3][];
            }
            for (int var4 = arg0.method8244(); var4 != 255; var4 = arg0.method8244()) {
                int var5 = arg0.method8244();
                int[] var6 = new int[var5];
                for (int var7 = 0; var7 < var5; var7++) {
                    var6[var7] = arg0.method8260();
                }
                this.field5051[var4] = class510.method96(arg0, var6);
                this.field5052[var4] = var6;
            }
        } else if (arg1 == 4) {
            this.field5049 = arg0.method8489();
        }
    }

    @ObfuscatedName("tu.aj(B)V")
    public void method8166() {
    }
}
