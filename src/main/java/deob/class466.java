package deob;

@ObfuscatedName("rn")
public class class466 extends class468 {

    @ObfuscatedName("rn.at")
    public int field4806 = 0;

    @ObfuscatedName("rn.an")
    public int field4805 = 0;

    @ObfuscatedName("rn.av")
    public int field4807 = 0;

    @ObfuscatedName("rn.as")
    public int field4810 = 0;

    @ObfuscatedName("rn.ax")
    public int field4809 = 0;

    @ObfuscatedName("rn.ap")
    public int field4808 = 0;

    public class466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super(arg6, arg7);
        this.field4806 = arg0;
        this.field4805 = arg1;
        this.field4807 = arg2;
        this.field4810 = arg3;
        this.field4809 = arg4;
        this.field4808 = arg5;
    }

    @ObfuscatedName("rn.at(I)I")
    public int method7593() {
        double var1 = this.method7612();
        return (int) Math.round((double) (this.field4810 - this.field4806) * var1 + (double) this.field4806);
    }

    @ObfuscatedName("rn.an(I)I")
    public int method7595() {
        double var1 = this.method7612();
        return (int) Math.round((double) (this.field4809 - this.field4805) * var1 + (double) this.field4805);
    }

    @ObfuscatedName("rn.av(I)I")
    public int method7597() {
        double var1 = this.method7612();
        return (int) Math.round((double) (this.field4808 - this.field4807) * var1 + (double) this.field4807);
    }
}
