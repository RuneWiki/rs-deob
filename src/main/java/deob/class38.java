package deob;

@ObfuscatedName("ab")
public class class38 extends class56 {

    @ObfuscatedName("ab.c")
    public int field270;

    @ObfuscatedName("ab.p")
    public byte[] field273;

    @ObfuscatedName("ab.f")
    public int field272;

    @ObfuscatedName("ab.n")
    public int field271;

    @ObfuscatedName("ab.k")
    public boolean field274;

    public class38(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field270 = arg0;
        this.field273 = arg1;
        this.field272 = arg2;
        this.field271 = arg3;
    }

    public class38(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field270 = arg0;
        this.field273 = arg1;
        this.field272 = arg2;
        this.field271 = arg3;
        this.field274 = arg4;
    }

    @ObfuscatedName("ab.c(Lbg;)Lab;")
    public class38 method701(class53 arg0) {
        this.field273 = arg0.method1034(this.field273);
        this.field270 = arg0.method1025(this.field270);
        if (this.field272 == this.field271) {
            this.field272 = this.field271 = arg0.method1032(this.field272);
        } else {
            this.field272 = arg0.method1032(this.field272);
            this.field271 = arg0.method1032(this.field271);
            if (this.field272 == this.field271) {
                this.field272--;
            }
        }
        return this;
    }
}
