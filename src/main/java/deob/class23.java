package deob;

@ObfuscatedName("z")
public class class23 extends class41 {

    @ObfuscatedName("z.s")
    public int field164;

    @ObfuscatedName("z.t")
    public byte[] field165;

    @ObfuscatedName("z.v")
    public int field166;

    @ObfuscatedName("z.j")
    public int field167;

    @ObfuscatedName("z.l")
    public boolean field168;

    public class23(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field164 = arg0;
        this.field165 = arg1;
        this.field166 = arg2;
        this.field167 = arg3;
    }

    public class23(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field164 = arg0;
        this.field165 = arg1;
        this.field166 = arg2;
        this.field167 = arg3;
        this.field168 = arg4;
    }

    @ObfuscatedName("z.s(Lao;)Lz;")
    public class23 method418(class38 arg0) {
        this.field165 = arg0.method743(this.field165);
        this.field164 = arg0.method736(this.field164);
        if (this.field167 == this.field166) {
            this.field166 = this.field167 = arg0.method737(this.field166);
        } else {
            this.field166 = arg0.method737(this.field166);
            this.field167 = arg0.method737(this.field167);
            if (this.field167 == this.field166) {
                this.field166--;
            }
        }
        return this;
    }
}
