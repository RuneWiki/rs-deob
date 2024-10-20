package deob;

@ObfuscatedName("az")
public class class36 extends class54 {

    @ObfuscatedName("az.i")
    public int field238;

    @ObfuscatedName("az.w")
    public byte[] field235;

    @ObfuscatedName("az.s")
    public int field237;

    @ObfuscatedName("az.a")
    public int field236;

    @ObfuscatedName("az.o")
    public boolean field239;

    public class36(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field238 = arg0;
        this.field235 = arg1;
        this.field237 = arg2;
        this.field236 = arg3;
    }

    public class36(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field238 = arg0;
        this.field235 = arg1;
        this.field237 = arg2;
        this.field236 = arg3;
        this.field239 = arg4;
    }

    @ObfuscatedName("az.i(Laa;)Laz;")
    public class36 method677(class51 arg0) {
        this.field235 = arg0.method988(this.field235);
        this.field238 = arg0.method984(this.field238);
        if (this.field237 == this.field236) {
            this.field237 = this.field236 = arg0.method985(this.field237);
        } else {
            this.field237 = arg0.method985(this.field237);
            this.field236 = arg0.method985(this.field236);
            if (this.field237 == this.field236) {
                this.field237--;
            }
        }
        return this;
    }
}
