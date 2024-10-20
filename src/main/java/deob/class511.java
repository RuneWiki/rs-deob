package deob;

@ObfuscatedName("tx")
public class class511 extends class513 {

    @ObfuscatedName("tx.ab")
    public int field5129 = 0;

    @ObfuscatedName("tx.ay")
    public int field5127 = 0;

    @ObfuscatedName("tx.an")
    public int field5128 = 0;

    @ObfuscatedName("tx.au")
    public int field5133 = 0;

    @ObfuscatedName("tx.ax")
    public int field5131 = 0;

    @ObfuscatedName("tx.ao")
    public int field5130 = 0;

    public class511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super(arg6, arg7);
        this.field5129 = arg0;
        this.field5127 = arg1;
        this.field5128 = arg2;
        this.field5133 = arg3;
        this.field5131 = arg4;
        this.field5130 = arg5;
    }

    @ObfuscatedName("tx.ab(I)I")
    public int method8253() {
        double var1 = this.method8272();
        return (int) Math.round((double) (this.field5133 - this.field5129) * var1 + (double) this.field5129);
    }

    @ObfuscatedName("tx.ay(B)I")
    public int method8252() {
        double var1 = this.method8272();
        return (int) Math.round((double) (this.field5131 - this.field5127) * var1 + (double) this.field5127);
    }

    @ObfuscatedName("tx.an(I)I")
    public int method8259() {
        double var1 = this.method8272();
        return (int) Math.round((double) (this.field5130 - this.field5128) * var1 + (double) this.field5128);
    }
}
