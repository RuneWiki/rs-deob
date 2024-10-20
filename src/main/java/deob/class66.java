package deob;

@ObfuscatedName("bx")
public class class66 extends class69 {

    @ObfuscatedName("bx.a")
    public int field1304;

    @ObfuscatedName("bx.d")
    public byte[] field1306;

    @ObfuscatedName("bx.v")
    public int field1305;

    @ObfuscatedName("bx.r")
    public int field1307;

    @ObfuscatedName("bx.z")
    public boolean field1303;

    public class66(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1304 = arg0;
        this.field1306 = arg1;
        this.field1305 = arg2;
        this.field1307 = arg3;
    }

    public class66(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1304 = arg0;
        this.field1306 = arg1;
        this.field1305 = arg2;
        this.field1307 = arg3;
        this.field1303 = arg4;
    }

    @ObfuscatedName("bx.a(Lbr;)Lbx;")
    public class66 method1308(class78 arg0) {
        this.field1306 = arg0.method1547(this.field1306);
        this.field1304 = arg0.method1548(this.field1304);
        if (this.field1307 == this.field1305) {
            this.field1305 = this.field1307 = arg0.method1549(this.field1305);
        } else {
            this.field1305 = arg0.method1549(this.field1305);
            this.field1307 = arg0.method1549(this.field1307);
            if (this.field1307 == this.field1305) {
                this.field1305--;
            }
        }
        return this;
    }
}
