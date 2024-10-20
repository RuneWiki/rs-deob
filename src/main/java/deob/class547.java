package deob;

@ObfuscatedName("vs")
public class class547 {

    @ObfuscatedName("vs.ak")
    public int[] field5349 = new int[8];

    @ObfuscatedName("vs.al")
    public short[] field5348 = new short[8];

    public class547(class210 arg0) {
        int var2 = 0;
        if (arg0.method3677()) {
            var2 = arg0.method3657().length;
            System.arraycopy(arg0.method3657(), 0, this.field5349, 0, var2);
            System.arraycopy(arg0.method3672(), 0, this.field5348, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field5349[var3] = -1;
            this.field5348[var3] = -1;
        }
    }

    @ObfuscatedName("vs.ak(B)[I")
    public int[] method9036() {
        return this.field5349;
    }

    @ObfuscatedName("vs.al(B)[S")
    public short[] method9033() {
        return this.field5348;
    }

    @ObfuscatedName("vs.aj(IISI)V")
    public void method9034(int arg0, int arg1, short arg2) {
        this.field5349[arg0] = arg1;
        this.field5348[arg0] = arg2;
    }

    @ObfuscatedName("vs.az([I[SB)V")
    public void method9035(int[] arg0, short[] arg1) {
        this.field5349 = arg0;
        this.field5348 = arg1;
    }
}
