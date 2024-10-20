package deob;

@ObfuscatedName("bu")
public class class41 extends class63 {

    @ObfuscatedName("bu.au")
    public int field283;

    @ObfuscatedName("bu.ae")
    public byte[] field281;

    @ObfuscatedName("bu.ao")
    public int field282;

    @ObfuscatedName("bu.at")
    public int field280;

    @ObfuscatedName("bu.ac")
    public boolean field284;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field283 = arg0;
        this.field281 = arg1;
        this.field282 = arg2;
        this.field280 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field283 = arg0;
        this.field281 = arg1;
        this.field282 = arg2;
        this.field280 = arg3;
        this.field284 = arg4;
    }

    @ObfuscatedName("bu.au(Lcx;)Lbu;")
    public class41 method770(class58 arg0) {
        this.field281 = arg0.method1067(this.field281);
        this.field283 = arg0.method1068(this.field283);
        if (this.field282 == this.field280) {
            this.field282 = this.field280 = arg0.method1066(this.field282);
        } else {
            this.field282 = arg0.method1066(this.field282);
            this.field280 = arg0.method1066(this.field280);
            if (this.field282 == this.field280) {
                this.field282--;
            }
        }
        return this;
    }
}
