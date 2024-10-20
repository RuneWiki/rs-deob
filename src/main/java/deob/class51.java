package deob;

@ObfuscatedName("au")
public class class51 extends class69 {

    @ObfuscatedName("au.v")
    public int field399;

    @ObfuscatedName("au.n")
    public byte[] field403;

    @ObfuscatedName("au.f")
    public int field401;

    @ObfuscatedName("au.y")
    public int field402;

    @ObfuscatedName("au.p")
    public boolean field400;

    public class51(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field399 = arg0;
        this.field403 = arg1;
        this.field401 = arg2;
        this.field402 = arg3;
    }

    public class51(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field399 = arg0;
        this.field403 = arg1;
        this.field401 = arg2;
        this.field402 = arg3;
        this.field400 = arg4;
    }

    @ObfuscatedName("au.v(Lbe;)Lau;")
    public class51 method601(class66 arg0) {
        this.field403 = arg0.method901(this.field403);
        this.field399 = arg0.method902(this.field399);
        if (this.field402 == this.field401) {
            this.field401 = this.field402 = arg0.method903(this.field401);
        } else {
            this.field401 = arg0.method903(this.field401);
            this.field402 = arg0.method903(this.field402);
            if (this.field402 == this.field401) {
                this.field401--;
            }
        }
        return this;
    }
}
