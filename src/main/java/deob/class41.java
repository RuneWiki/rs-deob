package deob;

@ObfuscatedName("bl")
public class class41 extends class63 {

    @ObfuscatedName("bl.aq")
    public int field251;

    @ObfuscatedName("bl.ad")
    public byte[] field248;

    @ObfuscatedName("bl.ag")
    public int field250;

    @ObfuscatedName("bl.ak")
    public int field249;

    @ObfuscatedName("bl.ap")
    public boolean field252;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field251 = arg0;
        this.field248 = arg1;
        this.field250 = arg2;
        this.field249 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field251 = arg0;
        this.field248 = arg1;
        this.field250 = arg2;
        this.field249 = arg3;
        this.field252 = arg4;
    }

    @ObfuscatedName("bl.aq(Lcu;)Lbl;")
    public class41 method766(class58 arg0) {
        this.field248 = arg0.method1059(this.field248);
        this.field251 = arg0.method1060(this.field251);
        if (this.field250 == this.field249) {
            this.field250 = this.field249 = arg0.method1061(this.field250);
        } else {
            this.field250 = arg0.method1061(this.field250);
            this.field249 = arg0.method1061(this.field249);
            if (this.field250 == this.field249) {
                this.field250--;
            }
        }
        return this;
    }
}
