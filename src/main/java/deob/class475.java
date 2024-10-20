package deob;

@ObfuscatedName("rx")
public class class475 {

    @ObfuscatedName("rx.f")
    public int[] field4943 = new int[8];

    @ObfuscatedName("rx.w")
    public short[] field4945 = new short[8];

    public class475(class191 arg0) {
        int var2 = 0;
        if (arg0.method3431()) {
            var2 = arg0.method3458().length;
            System.arraycopy(arg0.method3458(), 0, this.field4943, 0, var2);
            System.arraycopy(arg0.method3450(), 0, this.field4945, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field4943[var3] = -1;
            this.field4945[var3] = -1;
        }
    }

    @ObfuscatedName("rx.f(I)[I")
    public int[] method8214() {
        return this.field4943;
    }

    @ObfuscatedName("rx.w(B)[S")
    public short[] method8215() {
        return this.field4945;
    }

    @ObfuscatedName("rx.v(IISS)V")
    public void method8216(int arg0, int arg1, short arg2) {
        this.field4943[arg0] = arg1;
        this.field4945[arg0] = arg2;
    }

    @ObfuscatedName("rx.s([I[SB)V")
    public void method8219(int[] arg0, short[] arg1) {
        this.field4943 = arg0;
        this.field4945 = arg1;
    }
}
