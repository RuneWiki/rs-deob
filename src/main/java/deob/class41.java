package deob;

@ObfuscatedName("av")
public class class41 extends class59 {

    @ObfuscatedName("av.f")
    public int field292;

    @ObfuscatedName("av.w")
    public byte[] field290;

    @ObfuscatedName("av.v")
    public int field289;

    @ObfuscatedName("av.s")
    public int field291;

    @ObfuscatedName("av.z")
    public boolean field293;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field292 = arg0;
        this.field290 = arg1;
        this.field289 = arg2;
        this.field291 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field292 = arg0;
        this.field290 = arg1;
        this.field289 = arg2;
        this.field291 = arg3;
        this.field293 = arg4;
    }

    @ObfuscatedName("av.f(Lbr;)Lav;")
    public class41 method744(class56 arg0) {
        this.field290 = arg0.method1045(this.field290);
        this.field292 = arg0.method1046(this.field292);
        if (this.field291 == this.field289) {
            this.field289 = this.field291 = arg0.method1047(this.field289);
        } else {
            this.field289 = arg0.method1047(this.field289);
            this.field291 = arg0.method1047(this.field291);
            if (this.field291 == this.field289) {
                this.field289--;
            }
        }
        return this;
    }
}
