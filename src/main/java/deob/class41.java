package deob;

@ObfuscatedName("bt")
public class class41 extends class63 {

    @ObfuscatedName("bt.at")
    public int field255;

    @ObfuscatedName("bt.ah")
    public byte[] field252;

    @ObfuscatedName("bt.ar")
    public int field253;

    @ObfuscatedName("bt.ao")
    public int field254;

    @ObfuscatedName("bt.ab")
    public boolean field251;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field255 = arg0;
        this.field252 = arg1;
        this.field253 = arg2;
        this.field254 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field255 = arg0;
        this.field252 = arg1;
        this.field253 = arg2;
        this.field254 = arg3;
        this.field251 = arg4;
    }

    @ObfuscatedName("bt.at(Lce;)Lbt;")
    public class41 method766(class58 arg0) {
        this.field252 = arg0.method1062(this.field252);
        this.field255 = arg0.method1061(this.field255);
        if (this.field254 == this.field253) {
            this.field253 = this.field254 = arg0.method1068(this.field253);
        } else {
            this.field253 = arg0.method1068(this.field253);
            this.field254 = arg0.method1068(this.field254);
            if (this.field254 == this.field253) {
                this.field253--;
            }
        }
        return this;
    }
}
