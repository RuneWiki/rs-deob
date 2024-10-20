package deob;

@ObfuscatedName("sg")
public class class494 extends class496 {

    @ObfuscatedName("sg.am")
    public int field4943 = 0;

    @ObfuscatedName("sg.ap")
    public int field4941 = 0;

    @ObfuscatedName("sg.af")
    public int field4944 = 0;

    @ObfuscatedName("sg.aj")
    public int field4940 = 0;

    @ObfuscatedName("sg.aq")
    public int field4942 = 0;

    @ObfuscatedName("sg.ar")
    public int field4945 = 0;

    public class494(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super(arg6, arg7);
        this.field4943 = arg0;
        this.field4941 = arg1;
        this.field4944 = arg2;
        this.field4940 = arg3;
        this.field4942 = arg4;
        this.field4945 = arg5;
    }

    @ObfuscatedName("sg.am(I)I")
    public int method8022() {
        double var1 = this.method8037();
        return (int) Math.round((double) (this.field4940 - this.field4943) * var1 + (double) this.field4943);
    }

    @ObfuscatedName("sg.ap(B)I")
    public int method8021() {
        double var1 = this.method8037();
        return (int) Math.round((double) (this.field4942 - this.field4941) * var1 + (double) this.field4941);
    }

    @ObfuscatedName("sg.af(B)I")
    public int method8023() {
        double var1 = this.method8037();
        return (int) Math.round((double) (this.field4945 - this.field4944) * var1 + (double) this.field4944);
    }
}
