package deob;

@ObfuscatedName("bs")
public class class66 extends class69 {

    @ObfuscatedName("bs.s")
    public int field1277;

    @ObfuscatedName("bs.z")
    public byte[] field1274;

    @ObfuscatedName("bs.t")
    public int field1275;

    @ObfuscatedName("bs.y")
    public int field1276;

    @ObfuscatedName("bs.p")
    public boolean field1273;

    public class66(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1277 = arg0;
        this.field1274 = arg1;
        this.field1275 = arg2;
        this.field1276 = arg3;
    }

    public class66(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1277 = arg0;
        this.field1274 = arg1;
        this.field1275 = arg2;
        this.field1276 = arg3;
        this.field1273 = arg4;
    }

    @ObfuscatedName("bs.s(Lbq;)Lbs;")
    public class66 method1273(class78 arg0) {
        this.field1274 = arg0.method1531(this.field1274);
        this.field1277 = arg0.method1532(this.field1277);
        if (this.field1276 == this.field1275) {
            this.field1275 = this.field1276 = arg0.method1533(this.field1275);
        } else {
            this.field1275 = arg0.method1533(this.field1275);
            this.field1276 = arg0.method1533(this.field1276);
            if (this.field1276 == this.field1275) {
                this.field1275--;
            }
        }
        return this;
    }
}
