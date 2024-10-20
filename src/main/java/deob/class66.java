package deob;

@ObfuscatedName("bn")
public class class66 extends class69 {

    @ObfuscatedName("bn.x")
    public int field1278;

    @ObfuscatedName("bn.r")
    public byte[] field1276;

    @ObfuscatedName("bn.j")
    public int field1277;

    @ObfuscatedName("bn.z")
    public int field1279;

    @ObfuscatedName("bn.i")
    public boolean field1275;

    public class66(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1278 = arg0;
        this.field1276 = arg1;
        this.field1277 = arg2;
        this.field1279 = arg3;
    }

    public class66(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1278 = arg0;
        this.field1276 = arg1;
        this.field1277 = arg2;
        this.field1279 = arg3;
        this.field1275 = arg4;
    }

    @ObfuscatedName("bn.x(Lbr;)Lbn;")
    public class66 method1291(class78 arg0) {
        this.field1276 = arg0.method1534(this.field1276);
        this.field1278 = arg0.method1547(this.field1278);
        if (this.field1279 == this.field1277) {
            this.field1277 = this.field1279 = arg0.method1538(this.field1277);
        } else {
            this.field1277 = arg0.method1538(this.field1277);
            this.field1279 = arg0.method1538(this.field1279);
            if (this.field1279 == this.field1277) {
                this.field1277--;
            }
        }
        return this;
    }
}
