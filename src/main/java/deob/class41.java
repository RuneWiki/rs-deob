package deob;

@ObfuscatedName("bq")
public class class41 extends class63 {

    @ObfuscatedName("bq.ab")
    public int field246;

    @ObfuscatedName("bq.ay")
    public byte[] field243;

    @ObfuscatedName("bq.an")
    public int field244;

    @ObfuscatedName("bq.au")
    public int field245;

    @ObfuscatedName("bq.ax")
    public boolean field242;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field246 = arg0;
        this.field243 = arg1;
        this.field244 = arg2;
        this.field245 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field246 = arg0;
        this.field243 = arg1;
        this.field244 = arg2;
        this.field245 = arg3;
        this.field242 = arg4;
    }

    @ObfuscatedName("bq.ab(Lcl;)Lbq;")
    public class41 method725(class58 arg0) {
        this.field243 = arg0.method1030(this.field243);
        this.field246 = arg0.method1031(this.field246);
        if (this.field245 == this.field244) {
            this.field244 = this.field245 = arg0.method1032(this.field244);
        } else {
            this.field244 = arg0.method1032(this.field244);
            this.field245 = arg0.method1032(this.field245);
            if (this.field245 == this.field244) {
                this.field244--;
            }
        }
        return this;
    }
}
