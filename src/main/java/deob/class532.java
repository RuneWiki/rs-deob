package deob;

@ObfuscatedName("ua")
public class class532 {

    @ObfuscatedName("ua.am")
    public int[] field5182 = new int[8];

    @ObfuscatedName("ua.ap")
    public short[] field5185 = new short[8];

    public class532(class189 arg0) {
        int var2 = 0;
        if (arg0.method3407()) {
            var2 = arg0.method3456().length;
            System.arraycopy(arg0.method3456(), 0, this.field5182, 0, var2);
            System.arraycopy(arg0.method3403(), 0, this.field5185, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field5182[var3] = -1;
            this.field5185[var3] = -1;
        }
    }

    @ObfuscatedName("ua.am(B)[I")
    public int[] method8800() {
        return this.field5182;
    }

    @ObfuscatedName("ua.ap(B)[S")
    public short[] method8815() {
        return this.field5185;
    }

    @ObfuscatedName("ua.af(IISI)V")
    public void method8803(int arg0, int arg1, short arg2) {
        this.field5182[arg0] = arg1;
        this.field5185[arg0] = arg2;
    }

    @ObfuscatedName("ua.aj([I[SB)V")
    public void method8804(int[] arg0, short[] arg1) {
        this.field5182 = arg0;
        this.field5185 = arg1;
    }
}
