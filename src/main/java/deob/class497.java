package deob;

@ObfuscatedName("tn")
public class class497 extends class499 {

    @ObfuscatedName("tn.aq")
    public int field4976 = 0;

    @ObfuscatedName("tn.aw")
    public int field4973 = 0;

    @ObfuscatedName("tn.al")
    public int field4971 = 0;

    @ObfuscatedName("tn.ai")
    public int field4974 = 0;

    @ObfuscatedName("tn.ar")
    public int field4975 = 0;

    @ObfuscatedName("tn.as")
    public int field4977 = 0;

    public class497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super(arg6, arg7);
        this.field4976 = arg0;
        this.field4973 = arg1;
        this.field4971 = arg2;
        this.field4974 = arg3;
        this.field4975 = arg4;
        this.field4977 = arg5;
    }

    @ObfuscatedName("tn.aq(I)I")
    public int method8021() {
        double var1 = this.method8034();
        return (int) Math.round((double) (this.field4974 - this.field4976) * var1 + (double) this.field4976);
    }

    @ObfuscatedName("tn.aw(I)I")
    public int method8022() {
        double var1 = this.method8034();
        return (int) Math.round((double) (this.field4975 - this.field4973) * var1 + (double) this.field4973);
    }

    @ObfuscatedName("tn.al(B)I")
    public int method8024() {
        double var1 = this.method8034();
        return (int) Math.round((double) (this.field4977 - this.field4971) * var1 + (double) this.field4971);
    }
}
