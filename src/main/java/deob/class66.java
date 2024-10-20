package deob;

@ObfuscatedName("bd")
public class class66 extends class69 {

    @ObfuscatedName("bd.i")
    public int field1286;

    @ObfuscatedName("bd.h")
    public byte[] field1289;

    @ObfuscatedName("bd.e")
    public int field1287;

    @ObfuscatedName("bd.g")
    public int field1288;

    @ObfuscatedName("bd.n")
    public boolean field1285;

    public class66(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1286 = arg0;
        this.field1289 = arg1;
        this.field1287 = arg2;
        this.field1288 = arg3;
    }

    public class66(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1286 = arg0;
        this.field1289 = arg1;
        this.field1287 = arg2;
        this.field1288 = arg3;
        this.field1285 = arg4;
    }

    @ObfuscatedName("bd.i(Lbl;)Lbd;")
    public class66 method1291(class78 arg0) {
        this.field1289 = arg0.method1543(this.field1289);
        this.field1286 = arg0.method1544(this.field1286);
        if (this.field1288 == this.field1287) {
            this.field1287 = this.field1288 = arg0.method1545(this.field1287);
        } else {
            this.field1287 = arg0.method1545(this.field1287);
            this.field1288 = arg0.method1545(this.field1288);
            if (this.field1288 == this.field1287) {
                this.field1287--;
            }
        }
        return this;
    }
}
