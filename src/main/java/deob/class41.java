package deob;

@ObfuscatedName("bp")
public class class41 extends class63 {

    @ObfuscatedName("bp.at")
    public int field266;

    @ObfuscatedName("bp.an")
    public byte[] field265;

    @ObfuscatedName("bp.av")
    public int field264;

    @ObfuscatedName("bp.as")
    public int field267;

    @ObfuscatedName("bp.ax")
    public boolean field268;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field266 = arg0;
        this.field265 = arg1;
        this.field264 = arg2;
        this.field267 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field266 = arg0;
        this.field265 = arg1;
        this.field264 = arg2;
        this.field267 = arg3;
        this.field268 = arg4;
    }

    @ObfuscatedName("bp.at(Lch;)Lbp;")
    public class41 method721(class58 arg0) {
        this.field265 = arg0.method1022(this.field265);
        this.field266 = arg0.method1011(this.field266);
        if (this.field267 == this.field264) {
            this.field264 = this.field267 = arg0.method1012(this.field264);
        } else {
            this.field264 = arg0.method1012(this.field264);
            this.field267 = arg0.method1012(this.field267);
            if (this.field267 == this.field264) {
                this.field264--;
            }
        }
        return this;
    }
}
