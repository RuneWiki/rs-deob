package deob;

@ObfuscatedName("ts")
public class class510 extends class512 {

    @ObfuscatedName("ts.aq")
    public int field5132 = 0;

    @ObfuscatedName("ts.ad")
    public int field5130 = 0;

    @ObfuscatedName("ts.ag")
    public int field5129 = 0;

    @ObfuscatedName("ts.ak")
    public int field5131 = 0;

    @ObfuscatedName("ts.ap")
    public int field5133 = 0;

    @ObfuscatedName("ts.an")
    public int field5134 = 0;

    public class510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super(arg6, arg7);
        this.field5132 = arg0;
        this.field5130 = arg1;
        this.field5129 = arg2;
        this.field5131 = arg3;
        this.field5133 = arg4;
        this.field5134 = arg5;
    }

    @ObfuscatedName("ts.aq(I)I")
    public int method8160() {
        double var1 = this.method8171();
        return (int) Math.round((double) (this.field5131 - this.field5132) * var1 + (double) this.field5132);
    }

    @ObfuscatedName("ts.ad(I)I")
    public int method8161() {
        double var1 = this.method8171();
        return (int) Math.round((double) (this.field5133 - this.field5130) * var1 + (double) this.field5130);
    }

    @ObfuscatedName("ts.ag(I)I")
    public int method8159() {
        double var1 = this.method8171();
        return (int) Math.round((double) (this.field5134 - this.field5129) * var1 + (double) this.field5129);
    }
}
