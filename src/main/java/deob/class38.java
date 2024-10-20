package deob;

@ObfuscatedName("ag")
public class class38 extends class56 {

    @ObfuscatedName("ag.s")
    public int field261;

    @ObfuscatedName("ag.h")
    public byte[] field264;

    @ObfuscatedName("ag.w")
    public int field263;

    @ObfuscatedName("ag.v")
    public int field262;

    @ObfuscatedName("ag.c")
    public boolean field265;

    public class38(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field261 = arg0;
        this.field264 = arg1;
        this.field263 = arg2;
        this.field262 = arg3;
    }

    public class38(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field261 = arg0;
        this.field264 = arg1;
        this.field263 = arg2;
        this.field262 = arg3;
        this.field265 = arg4;
    }

    @ObfuscatedName("ag.s(Lbq;)Lag;")
    public class38 method635(class53 arg0) {
        this.field264 = arg0.method927(this.field264);
        this.field261 = arg0.method920(this.field261);
        if (this.field263 == this.field262) {
            this.field263 = this.field262 = arg0.method928(this.field263);
        } else {
            this.field263 = arg0.method928(this.field263);
            this.field262 = arg0.method928(this.field262);
            if (this.field263 == this.field262) {
                this.field263--;
            }
        }
        return this;
    }
}
