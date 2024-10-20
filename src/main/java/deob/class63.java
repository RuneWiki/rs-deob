package deob;

@ObfuscatedName("bd")
public class class63 extends class66 {

    @ObfuscatedName("bd.g")
    public int field1225;

    @ObfuscatedName("bd.b")
    public byte[] field1224;

    @ObfuscatedName("bd.w")
    public int field1226;

    @ObfuscatedName("bd.d")
    public int field1227;

    @ObfuscatedName("bd.z")
    public boolean field1228;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1225 = arg0;
        this.field1224 = arg1;
        this.field1226 = arg2;
        this.field1227 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1225 = arg0;
        this.field1224 = arg1;
        this.field1226 = arg2;
        this.field1227 = arg3;
        this.field1228 = arg4;
    }

    @ObfuscatedName("bd.g(Lbi;)Lbd;")
    public class63 method1284(class75 arg0) {
        this.field1224 = arg0.method1531(this.field1224);
        this.field1225 = arg0.method1530(this.field1225);
        if (this.field1227 == this.field1226) {
            this.field1226 = this.field1227 = arg0.method1532(this.field1226);
        } else {
            this.field1226 = arg0.method1532(this.field1226);
            this.field1227 = arg0.method1532(this.field1227);
            if (this.field1227 == this.field1226) {
                this.field1226--;
            }
        }
        return this;
    }
}
