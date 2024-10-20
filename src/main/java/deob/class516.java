package deob;

@ObfuscatedName("tw")
public class class516 {

    @ObfuscatedName("tw.au")
    public int[] field5114 = new int[8];

    @ObfuscatedName("tw.ae")
    public short[] field5115 = new short[8];

    public class516(class196 arg0) {
        int var2 = 0;
        if (arg0.method3413()) {
            var2 = arg0.method3414().length;
            System.arraycopy(arg0.method3414(), 0, this.field5114, 0, var2);
            System.arraycopy(arg0.method3416(), 0, this.field5115, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field5114[var3] = -1;
            this.field5115[var3] = -1;
        }
    }

    @ObfuscatedName("tw.au(B)[I")
    public int[] method8541() {
        return this.field5114;
    }

    @ObfuscatedName("tw.ae(B)[S")
    public short[] method8542() {
        return this.field5115;
    }

    @ObfuscatedName("tw.ao(IISI)V")
    public void method8543(int arg0, int arg1, short arg2) {
        this.field5114[arg0] = arg1;
        this.field5115[arg0] = arg2;
    }

    @ObfuscatedName("tw.at([I[SB)V")
    public void method8544(int[] arg0, short[] arg1) {
        this.field5114 = arg0;
        this.field5115 = arg1;
    }
}
