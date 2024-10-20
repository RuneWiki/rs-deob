package deob;

@ObfuscatedName("tt")
public class class511 extends class513 {

    @ObfuscatedName("tt.aq")
    public int field5135 = 0;

    @ObfuscatedName("tt.ad")
    public int field5136 = 0;

    public class511(int arg0, int arg1, int arg2, int arg3) {
        super(arg2, arg3);
        this.field5135 = arg0;
        this.field5136 = arg1;
    }

    @ObfuscatedName("tt.aq(I)I")
    public int method8168() {
        double var1 = this.method8171();
        return (int) Math.round((double) (this.field5136 - this.field5135) * var1 + (double) this.field5135);
    }
}
