package deob;

@ObfuscatedName("bk")
public class class63 extends class66 {

    @ObfuscatedName("bk.i")
    public int field1226;

    @ObfuscatedName("bk.v")
    public byte[] field1229;

    @ObfuscatedName("bk.f")
    public int field1227;

    @ObfuscatedName("bk.h")
    public int field1225;

    @ObfuscatedName("bk.a")
    public boolean field1228;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1226 = arg0;
        this.field1229 = arg1;
        this.field1227 = arg2;
        this.field1225 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1226 = arg0;
        this.field1229 = arg1;
        this.field1227 = arg2;
        this.field1225 = arg3;
        this.field1228 = arg4;
    }

    @ObfuscatedName("bk.i(Lbq;)Lbk;")
    public class63 method1201(class75 arg0) {
        this.field1229 = arg0.method1462(this.field1229);
        this.field1226 = arg0.method1463(this.field1226);
        if (this.field1227 == this.field1225) {
            this.field1227 = this.field1225 = arg0.method1464(this.field1227);
        } else {
            this.field1227 = arg0.method1464(this.field1227);
            this.field1225 = arg0.method1464(this.field1225);
            if (this.field1227 == this.field1225) {
                this.field1227--;
            }
        }
        return this;
    }
}
