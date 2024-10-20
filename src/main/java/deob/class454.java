package deob;

@ObfuscatedName("rs")
public class class454 extends class456 {

    @ObfuscatedName("rs.af")
    public int field4795 = 0;

    @ObfuscatedName("rs.an")
    public int field4799 = 0;

    @ObfuscatedName("rs.aw")
    public int field4796 = 0;

    @ObfuscatedName("rs.ac")
    public int field4794 = 0;

    @ObfuscatedName("rs.au")
    public int field4798 = 0;

    @ObfuscatedName("rs.ab")
    public int field4797 = 0;

    public class454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super(arg6, arg7);
        this.field4795 = arg0;
        this.field4799 = arg1;
        this.field4796 = arg2;
        this.field4794 = arg3;
        this.field4798 = arg4;
        this.field4797 = arg5;
    }

    @ObfuscatedName("rs.af(I)I")
    public int method7678() {
        double var1 = this.method7695();
        return (int) Math.round((double) (this.field4794 - this.field4795) * var1 + (double) this.field4795);
    }

    @ObfuscatedName("rs.an(I)I")
    public int method7683() {
        double var1 = this.method7695();
        return (int) Math.round((double) (this.field4798 - this.field4799) * var1 + (double) this.field4799);
    }

    @ObfuscatedName("rs.aw(B)I")
    public int method7676() {
        double var1 = this.method7695();
        return (int) Math.round((double) (this.field4797 - this.field4796) * var1 + (double) this.field4796);
    }
}
