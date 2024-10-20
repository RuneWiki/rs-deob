package deob;

@ObfuscatedName("tr")
public class class515 {

    @ObfuscatedName("tr.aw")
    public int[] field5074 = new int[8];

    @ObfuscatedName("tr.ay")
    public short[] field5075 = new short[8];

    public class515(class196 arg0) {
        int var2 = 0;
        if (arg0.method3385()) {
            var2 = arg0.method3390().length;
            System.arraycopy(arg0.method3390(), 0, this.field5074, 0, var2);
            System.arraycopy(arg0.method3420(), 0, this.field5075, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field5074[var3] = -1;
            this.field5075[var3] = -1;
        }
    }

    @ObfuscatedName("tr.aw(S)[I")
    public int[] method8507() {
        return this.field5074;
    }

    @ObfuscatedName("tr.ay(I)[S")
    public short[] method8508() {
        return this.field5075;
    }

    @ObfuscatedName("tr.ar(IISI)V")
    public void method8509(int arg0, int arg1, short arg2) {
        this.field5074[arg0] = arg1;
        this.field5075[arg0] = arg2;
    }

    @ObfuscatedName("tr.am([I[SB)V")
    public void method8517(int[] arg0, short[] arg1) {
        this.field5074 = arg0;
        this.field5075 = arg1;
    }
}
