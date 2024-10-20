package deob;

@ObfuscatedName("vh")
public class class552 {

    @ObfuscatedName("vh.ac")
    public int[] field5420 = new int[8];

    @ObfuscatedName("vh.ae")
    public short[] field5419 = new short[8];

    public class552(class195 arg0) {
        int var2 = 0;
        if (arg0.method3596()) {
            var2 = arg0.method3608().length;
            System.arraycopy(arg0.method3608(), 0, this.field5420, 0, var2);
            System.arraycopy(arg0.method3610(), 0, this.field5419, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field5420[var3] = -1;
            this.field5419[var3] = -1;
        }
    }

    @ObfuscatedName("vh.ac(I)[I")
    public int[] method9221() {
        return this.field5420;
    }

    @ObfuscatedName("vh.ae(B)[S")
    public short[] method9228() {
        return this.field5419;
    }

    @ObfuscatedName("vh.ag(IISI)V")
    public void method9223(int arg0, int arg1, short arg2) {
        this.field5420[arg0] = arg1;
        this.field5419[arg0] = arg2;
    }

    @ObfuscatedName("vh.am([I[SI)V")
    public void method9224(int[] arg0, short[] arg1) {
        this.field5420 = arg0;
        this.field5419 = arg1;
    }
}
