package deob;

@ObfuscatedName("br")
public class class41 extends class59 {

    @ObfuscatedName("br.af")
    public int field282;

    @ObfuscatedName("br.an")
    public byte[] field280;

    @ObfuscatedName("br.aw")
    public int field284;

    @ObfuscatedName("br.ac")
    public int field283;

    @ObfuscatedName("br.au")
    public boolean field281;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field282 = arg0;
        this.field280 = arg1;
        this.field284 = arg2;
        this.field283 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field282 = arg0;
        this.field280 = arg1;
        this.field284 = arg2;
        this.field283 = arg3;
        this.field281 = arg4;
    }

    @ObfuscatedName("br.af(Lcc;)Lbr;")
    public class41 method780(class56 arg0) {
        this.field280 = arg0.method1054(this.field280);
        this.field282 = arg0.method1055(this.field282);
        if (this.field284 == this.field283) {
            this.field284 = this.field283 = arg0.method1063(this.field284);
        } else {
            this.field284 = arg0.method1063(this.field284);
            this.field283 = arg0.method1063(this.field283);
            if (this.field284 == this.field283) {
                this.field284--;
            }
        }
        return this;
    }
}
