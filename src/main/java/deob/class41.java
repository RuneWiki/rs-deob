package deob;

@ObfuscatedName("br")
public class class41 extends class63 {

    @ObfuscatedName("br.az")
    public int field258;

    @ObfuscatedName("br.ah")
    public byte[] field256;

    @ObfuscatedName("br.af")
    public int field257;

    @ObfuscatedName("br.at")
    public int field259;

    @ObfuscatedName("br.an")
    public boolean field255;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field258 = arg0;
        this.field256 = arg1;
        this.field257 = arg2;
        this.field259 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field258 = arg0;
        this.field256 = arg1;
        this.field257 = arg2;
        this.field259 = arg3;
        this.field255 = arg4;
    }

    @ObfuscatedName("br.az(Lcl;)Lbr;")
    public class41 method723(class58 arg0) {
        this.field256 = arg0.method1016(this.field256);
        this.field258 = arg0.method1018(this.field258);
        if (this.field259 == this.field257) {
            this.field257 = this.field259 = arg0.method1019(this.field257);
        } else {
            this.field257 = arg0.method1019(this.field257);
            this.field259 = arg0.method1019(this.field259);
            if (this.field259 == this.field257) {
                this.field257--;
            }
        }
        return this;
    }
}
