package deob;

@ObfuscatedName("up")
public class class536 {

    @ObfuscatedName("up.az")
    public int[] field5239 = new int[8];

    @ObfuscatedName("up.ah")
    public short[] field5238 = new short[8];

    public class536(class208 arg0) {
        int var2 = 0;
        if (arg0.method3546()) {
            var2 = arg0.method3547().length;
            System.arraycopy(arg0.method3547(), 0, this.field5239, 0, var2);
            System.arraycopy(arg0.method3549(), 0, this.field5238, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field5239[var3] = -1;
            this.field5238[var3] = -1;
        }
    }

    @ObfuscatedName("up.az(B)[I")
    public int[] method8722() {
        return this.field5239;
    }

    @ObfuscatedName("up.ah(B)[S")
    public short[] method8715() {
        return this.field5238;
    }

    @ObfuscatedName("up.af(IISI)V")
    public void method8716(int arg0, int arg1, short arg2) {
        this.field5239[arg0] = arg1;
        this.field5238[arg0] = arg2;
    }

    @ObfuscatedName("up.at([I[SI)V")
    public void method8717(int[] arg0, short[] arg1) {
        this.field5239 = arg0;
        this.field5238 = arg1;
    }
}
