package deob;

@ObfuscatedName("cg")
public class class94 extends class109 {

    @ObfuscatedName("cg.w")
    public int field1308;

    @ObfuscatedName("cg.m")
    public byte[] field1306;

    @ObfuscatedName("cg.q")
    public int field1304;

    @ObfuscatedName("cg.b")
    public int field1307;

    @ObfuscatedName("cg.f")
    public boolean field1305;

    public class94(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1308 = arg0;
        this.field1306 = arg1;
        this.field1304 = arg2;
        this.field1307 = arg3;
    }

    public class94(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1308 = arg0;
        this.field1306 = arg1;
        this.field1304 = arg2;
        this.field1307 = arg3;
        this.field1305 = arg4;
    }

    @ObfuscatedName("cg.w(Lcx;)Lcg;")
    public class94 method2008(class103 arg0) {
        this.field1306 = arg0.method2136(this.field1306);
        this.field1308 = arg0.method2137(this.field1308);
        if (this.field1307 == this.field1304) {
            this.field1304 = this.field1307 = arg0.method2134(this.field1304);
        } else {
            this.field1304 = arg0.method2134(this.field1304);
            this.field1307 = arg0.method2134(this.field1307);
            if (this.field1307 == this.field1304) {
                this.field1304--;
            }
        }
        return this;
    }
}
