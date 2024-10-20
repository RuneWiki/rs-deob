package deob;

@ObfuscatedName("sd")
public class class479 extends class481 {

    @ObfuscatedName("sd.aw")
    public int field4866 = 0;

    @ObfuscatedName("sd.ay")
    public int field4870 = 0;

    @ObfuscatedName("sd.ar")
    public int field4867 = 0;

    @ObfuscatedName("sd.am")
    public int field4868 = 0;

    @ObfuscatedName("sd.as")
    public int field4869 = 0;

    @ObfuscatedName("sd.aj")
    public int field4865 = 0;

    public class479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super(arg6, arg7);
        this.field4866 = arg0;
        this.field4870 = arg1;
        this.field4867 = arg2;
        this.field4868 = arg3;
        this.field4869 = arg4;
        this.field4865 = arg5;
    }

    @ObfuscatedName("sd.aw(S)I")
    public int method7690() {
        double var1 = this.method7702();
        return (int) Math.round((double) (this.field4868 - this.field4866) * var1 + (double) this.field4866);
    }

    @ObfuscatedName("sd.ay(I)I")
    public int method7691() {
        double var1 = this.method7702();
        return (int) Math.round((double) (this.field4869 - this.field4870) * var1 + (double) this.field4870);
    }

    @ObfuscatedName("sd.ar(S)I")
    public int method7693() {
        double var1 = this.method7702();
        return (int) Math.round((double) (this.field4865 - this.field4867) * var1 + (double) this.field4867);
    }
}
