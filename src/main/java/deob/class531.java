package deob;

@ObfuscatedName("up")
public class class531 {

    @ObfuscatedName("up.ac")
    public int[] field5145 = new int[8];

    @ObfuscatedName("up.al")
    public short[] field5144 = new short[8];

    public class531(class206 arg0) {
        int var2 = 0;
        if (arg0.method3479()) {
            var2 = arg0.method3480().length;
            System.arraycopy(arg0.method3480(), 0, this.field5145, 0, var2);
            System.arraycopy(arg0.method3491(), 0, this.field5144, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field5145[var3] = -1;
            this.field5144[var3] = -1;
        }
    }

    @ObfuscatedName("up.ac(I)[I")
    public int[] method8616() {
        return this.field5145;
    }

    @ObfuscatedName("up.al(I)[S")
    public short[] method8617() {
        return this.field5144;
    }

    @ObfuscatedName("up.ak(IISB)V")
    public void method8618(int arg0, int arg1, short arg2) {
        this.field5145[arg0] = arg1;
        this.field5144[arg0] = arg2;
    }

    @ObfuscatedName("up.ax([I[SI)V")
    public void method8619(int[] arg0, short[] arg1) {
        this.field5145 = arg0;
        this.field5144 = arg1;
    }
}
