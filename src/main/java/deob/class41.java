package deob;

@ObfuscatedName("br")
public class class41 extends class63 {

    @ObfuscatedName("br.aq")
    public int field266;

    @ObfuscatedName("br.aw")
    public byte[] field270;

    @ObfuscatedName("br.al")
    public int field268;

    @ObfuscatedName("br.ai")
    public int field269;

    @ObfuscatedName("br.ar")
    public boolean field267;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field266 = arg0;
        this.field270 = arg1;
        this.field268 = arg2;
        this.field269 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field266 = arg0;
        this.field270 = arg1;
        this.field268 = arg2;
        this.field269 = arg3;
        this.field267 = arg4;
    }

    @ObfuscatedName("br.aq(Lcn;)Lbr;")
    public class41 method715(class58 arg0) {
        this.field270 = arg0.method1036(this.field270);
        this.field266 = arg0.method1028(this.field266);
        if (this.field269 == this.field268) {
            this.field268 = this.field269 = arg0.method1029(this.field268);
        } else {
            this.field268 = arg0.method1029(this.field268);
            this.field269 = arg0.method1029(this.field269);
            if (this.field269 == this.field268) {
                this.field268--;
            }
        }
        return this;
    }
}
