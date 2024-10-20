package deob;

@ObfuscatedName("ub")
public class class535 {

    @ObfuscatedName("ub.aq")
    public int[] field5204 = new int[8];

    @ObfuscatedName("ub.aw")
    public short[] field5203 = new short[8];

    public class535(class190 arg0) {
        int var2 = 0;
        if (arg0.method3380()) {
            var2 = arg0.method3371().length;
            System.arraycopy(arg0.method3371(), 0, this.field5204, 0, var2);
            System.arraycopy(arg0.method3414(), 0, this.field5203, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field5204[var3] = -1;
            this.field5203[var3] = -1;
        }
    }

    @ObfuscatedName("ub.aq(I)[I")
    public int[] method8833() {
        return this.field5204;
    }

    @ObfuscatedName("ub.aw(I)[S")
    public short[] method8826() {
        return this.field5203;
    }

    @ObfuscatedName("ub.al(IISI)V")
    public void method8827(int arg0, int arg1, short arg2) {
        this.field5204[arg0] = arg1;
        this.field5203[arg0] = arg2;
    }

    @ObfuscatedName("ub.ai([I[SI)V")
    public void method8828(int[] arg0, short[] arg1) {
        this.field5204 = arg0;
        this.field5203 = arg1;
    }
}
