package deob;

@ObfuscatedName("ak")
public class class38 extends class56 {

    @ObfuscatedName("ak.o")
    public int field266;

    @ObfuscatedName("ak.q")
    public byte[] field264;

    @ObfuscatedName("ak.l")
    public int field265;

    @ObfuscatedName("ak.k")
    public int field263;

    @ObfuscatedName("ak.a")
    public boolean field267;

    public class38(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field266 = arg0;
        this.field264 = arg1;
        this.field265 = arg2;
        this.field263 = arg3;
    }

    public class38(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field266 = arg0;
        this.field264 = arg1;
        this.field265 = arg2;
        this.field263 = arg3;
        this.field267 = arg4;
    }

    @ObfuscatedName("ak.o(Lbr;)Lak;")
    public class38 method650(class53 arg0) {
        this.field264 = arg0.method964(this.field264);
        this.field266 = arg0.method963(this.field266);
        if (this.field265 == this.field263) {
            this.field265 = this.field263 = arg0.method965(this.field265);
        } else {
            this.field265 = arg0.method965(this.field265);
            this.field263 = arg0.method965(this.field263);
            if (this.field265 == this.field263) {
                this.field265--;
            }
        }
        return this;
    }
}
