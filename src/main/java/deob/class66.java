package deob;

@ObfuscatedName("bu")
public class class66 extends class69 {

    @ObfuscatedName("bu.f")
    public int field1280;

    @ObfuscatedName("bu.e")
    public byte[] field1279;

    @ObfuscatedName("bu.n")
    public int field1278;

    @ObfuscatedName("bu.t")
    public int field1281;

    @ObfuscatedName("bu.v")
    public boolean field1282;

    public class66(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1280 = arg0;
        this.field1279 = arg1;
        this.field1278 = arg2;
        this.field1281 = arg3;
    }

    public class66(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1280 = arg0;
        this.field1279 = arg1;
        this.field1278 = arg2;
        this.field1281 = arg3;
        this.field1282 = arg4;
    }

    @ObfuscatedName("bu.f(Lbj;)Lbu;")
    public class66 method1311(class78 arg0) {
        this.field1279 = arg0.method1565(this.field1279);
        this.field1280 = arg0.method1566(this.field1280);
        if (this.field1281 == this.field1278) {
            this.field1278 = this.field1281 = arg0.method1564(this.field1278);
        } else {
            this.field1278 = arg0.method1564(this.field1278);
            this.field1281 = arg0.method1564(this.field1281);
            if (this.field1281 == this.field1278) {
                this.field1278--;
            }
        }
        return this;
    }
}
