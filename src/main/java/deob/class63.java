package deob;

@ObfuscatedName("bk")
public class class63 extends class66 {

    @ObfuscatedName("bk.n")
    public int field1223;

    @ObfuscatedName("bk.q")
    public byte[] field1224;

    @ObfuscatedName("bk.c")
    public int field1227;

    @ObfuscatedName("bk.l")
    public int field1226;

    @ObfuscatedName("bk.r")
    public boolean field1225;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1223 = arg0;
        this.field1224 = arg1;
        this.field1227 = arg2;
        this.field1226 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1223 = arg0;
        this.field1224 = arg1;
        this.field1227 = arg2;
        this.field1226 = arg3;
        this.field1225 = arg4;
    }

    @ObfuscatedName("bk.n(Lbb;)Lbk;")
    public class63 method1266(class75 arg0) {
        this.field1224 = arg0.method1499(this.field1224);
        this.field1223 = arg0.method1498(this.field1223);
        if (this.field1227 == this.field1226) {
            this.field1227 = this.field1226 = arg0.method1501(this.field1227);
        } else {
            this.field1227 = arg0.method1501(this.field1227);
            this.field1226 = arg0.method1501(this.field1226);
            if (this.field1227 == this.field1226) {
                this.field1227--;
            }
        }
        return this;
    }
}
