package deob;

@ObfuscatedName("ct")
public class class94 extends class109 {

    @ObfuscatedName("ct.z")
    public int field1280;

    @ObfuscatedName("ct.w")
    public byte[] field1279;

    @ObfuscatedName("ct.s")
    public int field1278;

    @ObfuscatedName("ct.l")
    public int field1281;

    @ObfuscatedName("ct.u")
    public boolean field1282;

    public class94(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1280 = arg0;
        this.field1279 = arg1;
        this.field1278 = arg2;
        this.field1281 = arg3;
    }

    public class94(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1280 = arg0;
        this.field1279 = arg1;
        this.field1278 = arg2;
        this.field1281 = arg3;
        this.field1282 = arg4;
    }

    @ObfuscatedName("ct.z(Lcu;)Lct;")
    public class94 method1980(class103 arg0) {
        this.field1279 = arg0.method2083(this.field1279);
        this.field1280 = arg0.method2084(this.field1280);
        if (this.field1281 == this.field1278) {
            this.field1278 = this.field1281 = arg0.method2085(this.field1278);
        } else {
            this.field1278 = arg0.method2085(this.field1278);
            this.field1281 = arg0.method2085(this.field1281);
            if (this.field1281 == this.field1278) {
                this.field1278--;
            }
        }
        return this;
    }
}
