package deob;

@ObfuscatedName("qz")
public class class468 {

    @ObfuscatedName("qz.h")
    public int[] field4921 = new int[8];

    @ObfuscatedName("qz.e")
    public short[] field4919 = new short[8];

    public class468(class187 arg0) {
        int var2 = 0;
        if (arg0.method3327()) {
            var2 = arg0.method3333().length;
            System.arraycopy(arg0.method3333(), 0, this.field4921, 0, var2);
            System.arraycopy(arg0.method3370(), 0, this.field4919, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field4921[var3] = -1;
            this.field4919[var3] = -1;
        }
    }

    @ObfuscatedName("qz.h(I)[I")
    public int[] method8039() {
        return this.field4921;
    }

    @ObfuscatedName("qz.e(I)[S")
    public short[] method8041() {
        return this.field4919;
    }

    @ObfuscatedName("qz.v(IISI)V")
    public void method8042(int arg0, int arg1, short arg2) {
        this.field4921[arg0] = arg1;
        this.field4919[arg0] = arg2;
    }

    @ObfuscatedName("qz.x([I[SI)V")
    public void method8043(int[] arg0, short[] arg1) {
        this.field4921 = arg0;
        this.field4919 = arg1;
    }
}
