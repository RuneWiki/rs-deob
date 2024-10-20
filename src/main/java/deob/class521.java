package deob;

@ObfuscatedName("uq")
public class class521 extends class523 {

    @ObfuscatedName("uq.ap")
    public int field5226 = 0;

    @ObfuscatedName("uq.aw")
    public int field5227 = 0;

    public class521(int arg0, int arg1, int arg2, int arg3) {
        super(arg2, arg3);
        this.field5226 = arg0;
        this.field5227 = arg1;
    }

    @ObfuscatedName("uq.ap(B)I")
    public int method8704() {
        double var1 = this.method8708();
        return (int) Math.round((double) (this.field5227 - this.field5226) * var1 + (double) this.field5226);
    }
}
