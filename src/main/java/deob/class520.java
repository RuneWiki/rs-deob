package deob;

@ObfuscatedName("ti")
public class class520 extends class522 {

    @ObfuscatedName("ti.ap")
    public int field5223 = 0;

    @ObfuscatedName("ti.aw")
    public int field5221 = 0;

    @ObfuscatedName("ti.ak")
    public int field5222 = 0;

    @ObfuscatedName("ti.aj")
    public int field5220 = 0;

    @ObfuscatedName("ti.ai")
    public int field5224 = 0;

    @ObfuscatedName("ti.ay")
    public int field5225 = 0;

    public class520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super(arg6, arg7);
        this.field5223 = arg0;
        this.field5221 = arg1;
        this.field5222 = arg2;
        this.field5220 = arg3;
        this.field5224 = arg4;
        this.field5225 = arg5;
    }

    @ObfuscatedName("ti.ap(I)I")
    public int method8695() {
        double var1 = this.method8708();
        return (int) Math.round((double) (this.field5220 - this.field5223) * var1 + (double) this.field5223);
    }

    @ObfuscatedName("ti.aw(B)I")
    public int method8699() {
        double var1 = this.method8708();
        return (int) Math.round((double) (this.field5224 - this.field5221) * var1 + (double) this.field5221);
    }

    @ObfuscatedName("ti.ak(I)I")
    public int method8697() {
        double var1 = this.method8708();
        return (int) Math.round((double) (this.field5225 - this.field5222) * var1 + (double) this.field5222);
    }
}
