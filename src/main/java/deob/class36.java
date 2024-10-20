package deob;

@ObfuscatedName("ak")
public class class36 extends class54 {

    @ObfuscatedName("ak.n")
    public int field252;

    @ObfuscatedName("ak.c")
    public byte[] field250;

    @ObfuscatedName("ak.m")
    public int field254;

    @ObfuscatedName("ak.k")
    public int field253;

    @ObfuscatedName("ak.o")
    public boolean field251;

    public class36(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field252 = arg0;
        this.field250 = arg1;
        this.field254 = arg2;
        this.field253 = arg3;
    }

    public class36(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field252 = arg0;
        this.field250 = arg1;
        this.field254 = arg2;
        this.field253 = arg3;
        this.field251 = arg4;
    }

    @ObfuscatedName("ak.n(Laf;)Lak;")
    public class36 method669(class51 arg0) {
        this.field250 = arg0.method966(this.field250);
        this.field252 = arg0.method973(this.field252);
        if (this.field254 == this.field253) {
            this.field254 = this.field253 = arg0.method975(this.field254);
        } else {
            this.field254 = arg0.method975(this.field254);
            this.field253 = arg0.method975(this.field253);
            if (this.field254 == this.field253) {
                this.field254--;
            }
        }
        return this;
    }
}
