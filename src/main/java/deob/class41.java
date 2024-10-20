package deob;

@ObfuscatedName("bt")
public class class41 extends class63 {

    @ObfuscatedName("bt.ap")
    public int field244;

    @ObfuscatedName("bt.aw")
    public byte[] field242;

    @ObfuscatedName("bt.ak")
    public int field245;

    @ObfuscatedName("bt.aj")
    public int field243;

    @ObfuscatedName("bt.ai")
    public boolean field241;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field244 = arg0;
        this.field242 = arg1;
        this.field245 = arg2;
        this.field243 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field244 = arg0;
        this.field242 = arg1;
        this.field245 = arg2;
        this.field243 = arg3;
        this.field241 = arg4;
    }

    @ObfuscatedName("bt.ap(Lco;)Lbt;")
    public class41 method756(class58 arg0) {
        this.field242 = arg0.method1096(this.field242);
        this.field244 = arg0.method1097(this.field244);
        if (this.field245 == this.field243) {
            this.field245 = this.field243 = arg0.method1100(this.field245);
        } else {
            this.field245 = arg0.method1100(this.field245);
            this.field243 = arg0.method1100(this.field243);
            if (this.field245 == this.field243) {
                this.field245--;
            }
        }
        return this;
    }
}
