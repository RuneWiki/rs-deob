package deob;

@ObfuscatedName("bj")
public class class63 extends class66 {

    @ObfuscatedName("bj.j")
    public int field1242;

    @ObfuscatedName("bj.l")
    public byte[] field1240;

    @ObfuscatedName("bj.a")
    public int field1241;

    @ObfuscatedName("bj.i")
    public int field1239;

    @ObfuscatedName("bj.f")
    public boolean field1243;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1242 = arg0;
        this.field1240 = arg1;
        this.field1241 = arg2;
        this.field1239 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1242 = arg0;
        this.field1240 = arg1;
        this.field1241 = arg2;
        this.field1239 = arg3;
        this.field1243 = arg4;
    }

    @ObfuscatedName("bj.j(Lbh;)Lbj;")
    public class63 method1243(class75 arg0) {
        this.field1240 = arg0.method1492(this.field1240);
        this.field1242 = arg0.method1495(this.field1242);
        if (this.field1241 == this.field1239) {
            this.field1241 = this.field1239 = arg0.method1498(this.field1241);
        } else {
            this.field1241 = arg0.method1498(this.field1241);
            this.field1239 = arg0.method1498(this.field1239);
            if (this.field1241 == this.field1239) {
                this.field1241--;
            }
        }
        return this;
    }
}
