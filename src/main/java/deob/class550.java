package deob;

@ObfuscatedName("vj")
public class class550 {

    @ObfuscatedName("vj.ab")
    public int[] field5387 = new int[8];

    @ObfuscatedName("vj.ay")
    public short[] field5386 = new short[8];

    public class550(class246 arg0) {
        int var2 = 0;
        if (arg0.method4526()) {
            var2 = arg0.method4553().length;
            System.arraycopy(arg0.method4553(), 0, this.field5387, 0, var2);
            System.arraycopy(arg0.method4533(), 0, this.field5386, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field5387[var3] = -1;
            this.field5386[var3] = -1;
        }
    }

    @ObfuscatedName("vj.ab(I)[I")
    public int[] method9050() {
        return this.field5387;
    }

    @ObfuscatedName("vj.ay(I)[S")
    public short[] method9051() {
        return this.field5386;
    }

    @ObfuscatedName("vj.an(IISI)V")
    public void method9054(int arg0, int arg1, short arg2) {
        this.field5387[arg0] = arg1;
        this.field5386[arg0] = arg2;
    }

    @ObfuscatedName("vj.au([I[SB)V")
    public void method9053(int[] arg0, short[] arg1) {
        this.field5387 = arg0;
        this.field5386 = arg1;
    }
}
