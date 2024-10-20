package deob;

@ObfuscatedName("bz")
public class class66 extends class69 {

    @ObfuscatedName("bz.l")
    public int field1303;

    @ObfuscatedName("bz.g")
    public byte[] field1305;

    @ObfuscatedName("bz.r")
    public int field1302;

    @ObfuscatedName("bz.e")
    public int field1304;

    @ObfuscatedName("bz.h")
    public boolean field1306;

    public class66(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1303 = arg0;
        this.field1305 = arg1;
        this.field1302 = arg2;
        this.field1304 = arg3;
    }

    public class66(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1303 = arg0;
        this.field1305 = arg1;
        this.field1302 = arg2;
        this.field1304 = arg3;
        this.field1306 = arg4;
    }

    @ObfuscatedName("bz.l(Lbl;)Lbz;")
    public class66 method1382(class78 arg0) {
        this.field1305 = arg0.method1610(this.field1305);
        this.field1303 = arg0.method1611(this.field1303);
        if (this.field1304 == this.field1302) {
            this.field1302 = this.field1304 = arg0.method1612(this.field1302);
        } else {
            this.field1302 = arg0.method1612(this.field1302);
            this.field1304 = arg0.method1612(this.field1304);
            if (this.field1304 == this.field1302) {
                this.field1302--;
            }
        }
        return this;
    }
}
