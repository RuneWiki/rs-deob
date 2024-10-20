package deob;

@ObfuscatedName("bq")
public class class63 extends class66 {

    @ObfuscatedName("bq.o")
    public int field1225;

    @ObfuscatedName("bq.e")
    public byte[] field1227;

    @ObfuscatedName("bq.u")
    public int field1226;

    @ObfuscatedName("bq.b")
    public int field1228;

    @ObfuscatedName("bq.p")
    public boolean field1229;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1225 = arg0;
        this.field1227 = arg1;
        this.field1226 = arg2;
        this.field1228 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1225 = arg0;
        this.field1227 = arg1;
        this.field1226 = arg2;
        this.field1228 = arg3;
        this.field1229 = arg4;
    }

    @ObfuscatedName("bq.o(Lbk;)Lbq;")
    public class63 method1216(class75 arg0) {
        this.field1227 = arg0.method1470(this.field1227);
        this.field1225 = arg0.method1469(this.field1225);
        if (this.field1228 == this.field1226) {
            this.field1226 = this.field1228 = arg0.method1471(this.field1226);
        } else {
            this.field1226 = arg0.method1471(this.field1226);
            this.field1228 = arg0.method1471(this.field1228);
            if (this.field1228 == this.field1226) {
                this.field1226--;
            }
        }
        return this;
    }
}
