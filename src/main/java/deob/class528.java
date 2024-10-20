package deob;

@ObfuscatedName("um")
public class class528 {

    @ObfuscatedName("um.at")
    public int[] field5143 = new int[8];

    @ObfuscatedName("um.ah")
    public short[] field5144 = new short[8];

    public class528(class189 arg0) {
        int var2 = 0;
        if (arg0.method3389()) {
            var2 = arg0.method3420().length;
            System.arraycopy(arg0.method3420(), 0, this.field5143, 0, var2);
            System.arraycopy(arg0.method3381(), 0, this.field5144, 0, var2);
        }
        for (int var3 = var2; var3 < 8; var3++) {
            this.field5143[var3] = -1;
            this.field5144[var3] = -1;
        }
    }

    @ObfuscatedName("um.at(I)[I")
    public int[] method8681() {
        return this.field5143;
    }

    @ObfuscatedName("um.ah(I)[S")
    public short[] method8682() {
        return this.field5144;
    }

    @ObfuscatedName("um.ar(IISI)V")
    public void method8683(int arg0, int arg1, short arg2) {
        this.field5143[arg0] = arg1;
        this.field5144[arg0] = arg2;
    }

    @ObfuscatedName("um.ao([I[SI)V")
    public void method8684(int[] arg0, short[] arg1) {
        this.field5143 = arg0;
        this.field5144 = arg1;
    }
}
