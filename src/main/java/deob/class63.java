package deob;

@ObfuscatedName("ba")
public class class63 extends class66 {

    @ObfuscatedName("ba.z")
    public int field1229;

    @ObfuscatedName("ba.q")
    public byte[] field1228;

    @ObfuscatedName("ba.k")
    public int field1231;

    @ObfuscatedName("ba.f")
    public int field1230;

    @ObfuscatedName("ba.d")
    public boolean field1227;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1229 = arg0;
        this.field1228 = arg1;
        this.field1231 = arg2;
        this.field1230 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1229 = arg0;
        this.field1228 = arg1;
        this.field1231 = arg2;
        this.field1230 = arg3;
        this.field1227 = arg4;
    }

    @ObfuscatedName("ba.z(Lbn;)Lba;")
    public class63 method1208(class75 arg0) {
        this.field1228 = arg0.method1459(this.field1228);
        this.field1229 = arg0.method1460(this.field1229);
        if (this.field1231 == this.field1230) {
            this.field1231 = this.field1230 = arg0.method1461(this.field1231);
        } else {
            this.field1231 = arg0.method1461(this.field1231);
            this.field1230 = arg0.method1461(this.field1230);
            if (this.field1231 == this.field1230) {
                this.field1231--;
            }
        }
        return this;
    }
}
