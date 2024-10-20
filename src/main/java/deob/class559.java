package deob;

@ObfuscatedName("vt")
public class class559 {

    @ObfuscatedName("vt.ap")
    public int[] field5469 = new int[8];

    @ObfuscatedName("vt.aw")
    public short[] field5468 = new short[8];

    public class559(class195 arg0) {
        int var2 = 0;
        if (arg0.method3737()) {
            var2 = arg0.method3738().length;
            System.arraycopy(arg0.method3738(), 0, this.field5469, 0, var2);
            System.arraycopy(arg0.method3740(), 0, this.field5468, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field5469[var3] = -1;
            this.field5468[var3] = -1;
        }
    }

    @ObfuscatedName("vt.ap(B)[I")
    public int[] method9550() {
        return this.field5469;
    }

    @ObfuscatedName("vt.aw(B)[S")
    public short[] method9544() {
        return this.field5468;
    }

    @ObfuscatedName("vt.ak(IISB)V")
    public void method9546(int arg0, int arg1, short arg2) {
        this.field5469[arg0] = arg1;
        this.field5468[arg0] = arg2;
    }

    @ObfuscatedName("vt.aj([I[SI)V")
    public void method9547(int[] arg0, short[] arg1) {
        this.field5469 = arg0;
        this.field5468 = arg1;
    }
}
