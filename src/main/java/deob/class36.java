package deob;

@ObfuscatedName("at")
public class class36 extends class54 {

    @ObfuscatedName("at.v")
    public int field253;

    @ObfuscatedName("at.c")
    public byte[] field256;

    @ObfuscatedName("at.i")
    public int field254;

    @ObfuscatedName("at.f")
    public int field252;

    @ObfuscatedName("at.b")
    public boolean field255;

    public class36(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field253 = arg0;
        this.field256 = arg1;
        this.field254 = arg2;
        this.field252 = arg3;
    }

    public class36(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field253 = arg0;
        this.field256 = arg1;
        this.field254 = arg2;
        this.field252 = arg3;
        this.field255 = arg4;
    }

    @ObfuscatedName("at.v(Las;)Lat;")
    public class36 method658(class51 arg0) {
        this.field256 = arg0.method968(this.field256);
        this.field253 = arg0.method969(this.field253);
        if (this.field254 == this.field252) {
            this.field254 = this.field252 = arg0.method970(this.field254);
        } else {
            this.field254 = arg0.method970(this.field254);
            this.field252 = arg0.method970(this.field252);
            if (this.field254 == this.field252) {
                this.field254--;
            }
        }
        return this;
    }
}
