package deob;

@ObfuscatedName("bp")
public class class62 extends class46 {

    @ObfuscatedName("bp.k")
    public int field1222;

    @ObfuscatedName("bp.x")
    public byte[] field1224;

    @ObfuscatedName("bp.m")
    public int field1223;

    @ObfuscatedName("bp.n")
    public int field1225;

    @ObfuscatedName("bp.q")
    public boolean field1226;

    public class62(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1222 = arg0;
        this.field1224 = arg1;
        this.field1223 = arg2;
        this.field1225 = arg3;
    }

    public class62(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1222 = arg0;
        this.field1224 = arg1;
        this.field1223 = arg2;
        this.field1225 = arg3;
        this.field1226 = arg4;
    }

    @ObfuscatedName("bp.u(Lbq;)Lbp;")
    public class62 method1311(class61 arg0) {
        this.field1224 = arg0.method1303(this.field1224);
        this.field1222 = arg0.method1302(this.field1222);
        if (this.field1225 == this.field1223) {
            this.field1223 = this.field1225 = arg0.method1305(this.field1223);
        } else {
            this.field1223 = arg0.method1305(this.field1223);
            this.field1225 = arg0.method1305(this.field1225);
            if (this.field1225 == this.field1223) {
                this.field1223--;
            }
        }
        return this;
    }
}
