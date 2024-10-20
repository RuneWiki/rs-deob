package deob;

@ObfuscatedName("sf")
public class class490 extends class492 {

    @ObfuscatedName("sf.at")
    public int field4910 = 0;

    @ObfuscatedName("sf.ah")
    public int field4905 = 0;

    @ObfuscatedName("sf.ar")
    public int field4904 = 0;

    @ObfuscatedName("sf.ao")
    public int field4907 = 0;

    @ObfuscatedName("sf.ab")
    public int field4908 = 0;

    @ObfuscatedName("sf.au")
    public int field4909 = 0;

    public class490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super(arg6, arg7);
        this.field4910 = arg0;
        this.field4905 = arg1;
        this.field4904 = arg2;
        this.field4907 = arg3;
        this.field4908 = arg4;
        this.field4909 = arg5;
    }

    @ObfuscatedName("sf.at(B)I")
    public int method7851() {
        double var1 = this.method7869();
        return (int) Math.round((double) (this.field4907 - this.field4910) * var1 + (double) this.field4910);
    }

    @ObfuscatedName("sf.ah(B)I")
    public int method7860() {
        double var1 = this.method7869();
        return (int) Math.round((double) (this.field4908 - this.field4905) * var1 + (double) this.field4905);
    }

    @ObfuscatedName("sf.ar(I)I")
    public int method7853() {
        double var1 = this.method7869();
        return (int) Math.round((double) (this.field4909 - this.field4904) * var1 + (double) this.field4904);
    }
}
