package deob;

@ObfuscatedName("br")
public class class41 extends class63 {

    @ObfuscatedName("br.ak")
    public int field267;

    @ObfuscatedName("br.al")
    public byte[] field269;

    @ObfuscatedName("br.aj")
    public int field266;

    @ObfuscatedName("br.az")
    public int field268;

    @ObfuscatedName("br.af")
    public boolean field270;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field267 = arg0;
        this.field269 = arg1;
        this.field266 = arg2;
        this.field268 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field267 = arg0;
        this.field269 = arg1;
        this.field266 = arg2;
        this.field268 = arg3;
        this.field270 = arg4;
    }

    @ObfuscatedName("br.ak(Lcd;)Lbr;")
    public class41 method754(class58 arg0) {
        this.field269 = arg0.method1052(this.field269);
        this.field267 = arg0.method1047(this.field267);
        if (this.field268 == this.field266) {
            this.field266 = this.field268 = arg0.method1051(this.field266);
        } else {
            this.field266 = arg0.method1051(this.field266);
            this.field268 = arg0.method1051(this.field268);
            if (this.field268 == this.field266) {
                this.field266--;
            }
        }
        return this;
    }
}
