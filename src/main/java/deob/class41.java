package deob;

@ObfuscatedName("bi")
public class class41 extends class63 {

    @ObfuscatedName("bi.aw")
    public int field284;

    @ObfuscatedName("bi.ay")
    public byte[] field286;

    @ObfuscatedName("bi.ar")
    public int field285;

    @ObfuscatedName("bi.am")
    public int field287;

    @ObfuscatedName("bi.as")
    public boolean field283;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field284 = arg0;
        this.field286 = arg1;
        this.field285 = arg2;
        this.field287 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field284 = arg0;
        this.field286 = arg1;
        this.field285 = arg2;
        this.field287 = arg3;
        this.field283 = arg4;
    }

    @ObfuscatedName("bi.aw(Lcj;)Lbi;")
    public class41 method753(class58 arg0) {
        this.field286 = arg0.method1070(this.field286);
        this.field284 = arg0.method1063(this.field284);
        if (this.field287 == this.field285) {
            this.field285 = this.field287 = arg0.method1066(this.field285);
        } else {
            this.field285 = arg0.method1066(this.field285);
            this.field287 = arg0.method1066(this.field287);
            if (this.field287 == this.field285) {
                this.field285--;
            }
        }
        return this;
    }
}
