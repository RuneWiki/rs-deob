package deob;

@ObfuscatedName("af")
public class class38 extends class56 {

    @ObfuscatedName("af.c")
    public int field258;

    @ObfuscatedName("af.v")
    public byte[] field259;

    @ObfuscatedName("af.q")
    public int field260;

    @ObfuscatedName("af.f")
    public int field261;

    @ObfuscatedName("af.j")
    public boolean field262;

    public class38(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field258 = arg0;
        this.field259 = arg1;
        this.field260 = arg2;
        this.field261 = arg3;
    }

    public class38(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field258 = arg0;
        this.field259 = arg1;
        this.field260 = arg2;
        this.field261 = arg3;
        this.field262 = arg4;
    }

    @ObfuscatedName("af.c(Lbe;)Laf;")
    public class38 method629(class53 arg0) {
        this.field259 = arg0.method950(this.field259);
        this.field258 = arg0.method936(this.field258);
        if (this.field261 == this.field260) {
            this.field260 = this.field261 = arg0.method943(this.field260);
        } else {
            this.field260 = arg0.method943(this.field260);
            this.field261 = arg0.method943(this.field261);
            if (this.field261 == this.field260) {
                this.field260--;
            }
        }
        return this;
    }
}
