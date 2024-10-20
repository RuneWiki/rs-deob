package deob;

@ObfuscatedName("ab")
public class class38 extends class56 {

    @ObfuscatedName("ab.c")
    public int field272;

    @ObfuscatedName("ab.l")
    public byte[] field275;

    @ObfuscatedName("ab.s")
    public int field273;

    @ObfuscatedName("ab.e")
    public int field274;

    @ObfuscatedName("ab.r")
    public boolean field271;

    public class38(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field272 = arg0;
        this.field275 = arg1;
        this.field273 = arg2;
        this.field274 = arg3;
    }

    public class38(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field272 = arg0;
        this.field275 = arg1;
        this.field273 = arg2;
        this.field274 = arg3;
        this.field271 = arg4;
    }

    @ObfuscatedName("ab.c(Lbe;)Lab;")
    public class38 method677(class53 arg0) {
        this.field275 = arg0.method973(this.field275);
        this.field272 = arg0.method971(this.field272);
        if (this.field274 == this.field273) {
            this.field273 = this.field274 = arg0.method970(this.field273);
        } else {
            this.field273 = arg0.method970(this.field273);
            this.field274 = arg0.method970(this.field274);
            if (this.field274 == this.field273) {
                this.field273--;
            }
        }
        return this;
    }
}
