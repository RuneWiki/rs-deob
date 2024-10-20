package deob;

@ObfuscatedName("tt")
public class class512 extends class514 {

    @ObfuscatedName("tt.ab")
    public int field5136 = 0;

    @ObfuscatedName("tt.ay")
    public int field5135 = 0;

    public class512(int arg0, int arg1, int arg2, int arg3) {
        super(arg2, arg3);
        this.field5136 = arg0;
        this.field5135 = arg1;
    }

    @ObfuscatedName("tt.ab(I)I")
    public int method8264() {
        double var1 = this.method8272();
        return (int) Math.round((double) (this.field5135 - this.field5136) * var1 + (double) this.field5136);
    }
}
