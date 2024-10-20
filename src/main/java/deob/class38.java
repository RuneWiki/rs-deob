package deob;

@ObfuscatedName("aj")
public class class38 extends class56 {

    @ObfuscatedName("aj.c")
    public int field267;

    @ObfuscatedName("aj.b")
    public byte[] field265;

    @ObfuscatedName("aj.p")
    public int field264;

    @ObfuscatedName("aj.m")
    public int field268;

    @ObfuscatedName("aj.t")
    public boolean field266;

    public class38(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field267 = arg0;
        this.field265 = arg1;
        this.field264 = arg2;
        this.field268 = arg3;
    }

    public class38(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field267 = arg0;
        this.field265 = arg1;
        this.field264 = arg2;
        this.field268 = arg3;
        this.field266 = arg4;
    }

    @ObfuscatedName("aj.c(Lbp;)Laj;")
    public class38 method710(class53 arg0) {
        this.field265 = arg0.method1009(this.field265);
        this.field267 = arg0.method1010(this.field267);
        if (this.field268 == this.field264) {
            this.field264 = this.field268 = arg0.method1011(this.field264);
        } else {
            this.field264 = arg0.method1011(this.field264);
            this.field268 = arg0.method1011(this.field268);
            if (this.field268 == this.field264) {
                this.field264--;
            }
        }
        return this;
    }
}
