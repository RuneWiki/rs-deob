package deob;

@ObfuscatedName("te")
public class class502 {

    @ObfuscatedName("te.at")
    public int[] field5025 = new int[8];

    @ObfuscatedName("te.an")
    public short[] field5026 = new short[8];

    public class502(class195 arg0) {
        int var2 = 0;
        if (arg0.method3377()) {
            var2 = arg0.method3378().length;
            System.arraycopy(arg0.method3378(), 0, this.field5025, 0, var2);
            System.arraycopy(arg0.method3385(), 0, this.field5026, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field5025[var3] = -1;
            this.field5026[var3] = -1;
        }
    }

    @ObfuscatedName("te.at(I)[I")
    public int[] method8380() {
        return this.field5025;
    }

    @ObfuscatedName("te.an(I)[S")
    public short[] method8381() {
        return this.field5026;
    }

    @ObfuscatedName("te.av(IISI)V")
    public void method8388(int arg0, int arg1, short arg2) {
        this.field5025[arg0] = arg1;
        this.field5026[arg0] = arg2;
    }

    @ObfuscatedName("te.as([I[SI)V")
    public void method8383(int[] arg0, short[] arg1) {
        this.field5025 = arg0;
        this.field5026 = arg1;
    }
}
