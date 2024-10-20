package deob;

@ObfuscatedName("bf")
public class class66 extends class69 {

    @ObfuscatedName("bf.e")
    public int field1302;

    @ObfuscatedName("bf.l")
    public byte[] field1305;

    @ObfuscatedName("bf.c")
    public int field1303;

    @ObfuscatedName("bf.h")
    public int field1304;

    @ObfuscatedName("bf.r")
    public boolean field1301;

    public class66(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1302 = arg0;
        this.field1305 = arg1;
        this.field1303 = arg2;
        this.field1304 = arg3;
    }

    public class66(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1302 = arg0;
        this.field1305 = arg1;
        this.field1303 = arg2;
        this.field1304 = arg3;
        this.field1301 = arg4;
    }

    @ObfuscatedName("bf.e(Lbd;)Lbf;")
    public class66 method1349(class78 arg0) {
        this.field1305 = arg0.method1599(this.field1305);
        this.field1302 = arg0.method1605(this.field1302);
        if (this.field1304 == this.field1303) {
            this.field1303 = this.field1304 = arg0.method1600(this.field1303);
        } else {
            this.field1303 = arg0.method1600(this.field1303);
            this.field1304 = arg0.method1600(this.field1304);
            if (this.field1304 == this.field1303) {
                this.field1303--;
            }
        }
        return this;
    }
}
