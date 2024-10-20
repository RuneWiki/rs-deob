package deob;

@ObfuscatedName("tp")
public class class509 extends class511 {

    @ObfuscatedName("tp.ak")
    public int field5098 = 0;

    @ObfuscatedName("tp.al")
    public int field5097 = 0;

    @ObfuscatedName("tp.aj")
    public int field5099 = 0;

    @ObfuscatedName("tp.az")
    public int field5100 = 0;

    @ObfuscatedName("tp.af")
    public int field5101 = 0;

    @ObfuscatedName("tp.aa")
    public int field5102 = 0;

    public class509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super(arg6, arg7);
        this.field5098 = arg0;
        this.field5097 = arg1;
        this.field5099 = arg2;
        this.field5100 = arg3;
        this.field5101 = arg4;
        this.field5102 = arg5;
    }

    @ObfuscatedName("tp.ak(B)I")
    public int method8215() {
        double var1 = this.method8231();
        return (int) Math.round((double) (this.field5100 - this.field5098) * var1 + (double) this.field5098);
    }

    @ObfuscatedName("tp.al(I)I")
    public int method8216() {
        double var1 = this.method8231();
        return (int) Math.round((double) (this.field5101 - this.field5097) * var1 + (double) this.field5097);
    }

    @ObfuscatedName("tp.aj(I)I")
    public int method8217() {
        double var1 = this.method8231();
        return (int) Math.round((double) (this.field5102 - this.field5099) * var1 + (double) this.field5099);
    }
}
