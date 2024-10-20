package deob;

@ObfuscatedName("bm")
public class class41 extends class63 {

    @ObfuscatedName("bm.am")
    public int field271;

    @ObfuscatedName("bm.ap")
    public byte[] field269;

    @ObfuscatedName("bm.af")
    public int field270;

    @ObfuscatedName("bm.aj")
    public int field272;

    @ObfuscatedName("bm.aq")
    public boolean field268;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field271 = arg0;
        this.field269 = arg1;
        this.field270 = arg2;
        this.field272 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field271 = arg0;
        this.field269 = arg1;
        this.field270 = arg2;
        this.field272 = arg3;
        this.field268 = arg4;
    }

    @ObfuscatedName("bm.am(Lcp;)Lbm;")
    public class41 method782(class58 arg0) {
        this.field269 = arg0.method1080(this.field269);
        this.field271 = arg0.method1084(this.field271);
        if (this.field272 == this.field270) {
            this.field270 = this.field272 = arg0.method1082(this.field270);
        } else {
            this.field270 = arg0.method1082(this.field270);
            this.field272 = arg0.method1082(this.field272);
            if (this.field272 == this.field270) {
                this.field270--;
            }
        }
        return this;
    }
}
