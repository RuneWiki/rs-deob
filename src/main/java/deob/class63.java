package deob;

@ObfuscatedName("bb")
public class class63 extends class47 {

    @ObfuscatedName("bb.w")
    public int field1241;

    @ObfuscatedName("bb.f")
    public byte[] field1238;

    @ObfuscatedName("bb.e")
    public int field1240;

    @ObfuscatedName("bb.t")
    public int field1239;

    @ObfuscatedName("bb.d")
    public boolean field1242;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1241 = arg0;
        this.field1238 = arg1;
        this.field1240 = arg2;
        this.field1239 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1241 = arg0;
        this.field1238 = arg1;
        this.field1240 = arg2;
        this.field1239 = arg3;
        this.field1242 = arg4;
    }

    @ObfuscatedName("bb.i(Lbp;)Lbb;")
    public class63 method1312(class62 arg0) {
        this.field1238 = arg0.method1301(this.field1238);
        this.field1241 = arg0.method1303(this.field1241);
        if (this.field1240 == this.field1239) {
            this.field1240 = this.field1239 = arg0.method1302(this.field1240);
        } else {
            this.field1240 = arg0.method1302(this.field1240);
            this.field1239 = arg0.method1302(this.field1239);
            if (this.field1240 == this.field1239) {
                this.field1240--;
            }
        }
        return this;
    }
}
