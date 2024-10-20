package deob;

@ObfuscatedName("sz")
public class class479 {

    @ObfuscatedName("sz.aj")
    public int[] field4908 = new int[8];

    @ObfuscatedName("sz.al")
    public short[] field4909 = new short[8];

    public class479(class193 arg0) {
        int var2 = 0;
        if (arg0.method3359()) {
            var2 = arg0.method3360().length;
            System.arraycopy(arg0.method3360(), 0, this.field4908, 0, var2);
            System.arraycopy(arg0.method3356(), 0, this.field4909, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field4908[var3] = -1;
            this.field4909[var3] = -1;
        }
    }

    @ObfuscatedName("sz.aj(B)[I")
    public int[] method8166() {
        return this.field4908;
    }

    @ObfuscatedName("sz.al(B)[S")
    public short[] method8167() {
        return this.field4909;
    }

    @ObfuscatedName("sz.ac(IISI)V")
    public void method8168(int arg0, int arg1, short arg2) {
        this.field4908[arg0] = arg1;
        this.field4909[arg0] = arg2;
    }

    @ObfuscatedName("sz.ab([I[SB)V")
    public void method8165(int[] arg0, short[] arg1) {
        this.field4908 = arg0;
        this.field4909 = arg1;
    }
}
