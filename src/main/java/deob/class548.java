package deob;

@ObfuscatedName("vi")
public class class548 {

    @ObfuscatedName("vi.aq")
    public int[] field5369 = new int[8];

    @ObfuscatedName("vi.ad")
    public short[] field5368 = new short[8];

    public class548(class193 arg0) {
        int var2 = 0;
        if (arg0.method3412()) {
            var2 = arg0.method3413().length;
            System.arraycopy(arg0.method3413(), 0, this.field5369, 0, var2);
            System.arraycopy(arg0.method3415(), 0, this.field5368, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field5369[var3] = -1;
            this.field5368[var3] = -1;
        }
    }

    @ObfuscatedName("vi.aq(B)[I")
    public int[] method8973() {
        return this.field5369;
    }

    @ObfuscatedName("vi.ad(I)[S")
    public short[] method8982() {
        return this.field5368;
    }

    @ObfuscatedName("vi.ag(IISB)V")
    public void method8975(int arg0, int arg1, short arg2) {
        this.field5369[arg0] = arg1;
        this.field5368[arg0] = arg2;
    }

    @ObfuscatedName("vi.ak([I[SB)V")
    public void method8976(int[] arg0, short[] arg1) {
        this.field5369 = arg0;
        this.field5368 = arg1;
    }
}
