package deob;

@ObfuscatedName("sx")
public class class490 {

    @ObfuscatedName("sx.af")
    public int[] field4998 = new int[8];

    @ObfuscatedName("sx.an")
    public short[] field4996 = new short[8];

    public class490(class191 arg0) {
        int var2 = 0;
        if (arg0.method3462()) {
            var2 = arg0.method3463().length;
            System.arraycopy(arg0.method3463(), 0, this.field4998, 0, var2);
            System.arraycopy(arg0.method3465(), 0, this.field4996, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field4998[var3] = -1;
            this.field4996[var3] = -1;
        }
    }

    @ObfuscatedName("sx.af(B)[I")
    public int[] method8501() {
        return this.field4998;
    }

    @ObfuscatedName("sx.an(I)[S")
    public short[] method8494() {
        return this.field4996;
    }

    @ObfuscatedName("sx.aw(IISI)V")
    public void method8495(int arg0, int arg1, short arg2) {
        this.field4998[arg0] = arg1;
        this.field4996[arg0] = arg2;
    }

    @ObfuscatedName("sx.ac([I[SB)V")
    public void method8507(int[] arg0, short[] arg1) {
        this.field4998 = arg0;
        this.field4996 = arg1;
    }
}
