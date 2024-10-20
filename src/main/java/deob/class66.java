package deob;

@ObfuscatedName("bn")
public class class66 extends class69 {

    @ObfuscatedName("bn.m")
    public int field1307;

    @ObfuscatedName("bn.w")
    public byte[] field1306;

    @ObfuscatedName("bn.e")
    public int field1309;

    @ObfuscatedName("bn.o")
    public int field1308;

    @ObfuscatedName("bn.g")
    public boolean field1305;

    public class66(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1307 = arg0;
        this.field1306 = arg1;
        this.field1309 = arg2;
        this.field1308 = arg3;
    }

    public class66(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1307 = arg0;
        this.field1306 = arg1;
        this.field1309 = arg2;
        this.field1308 = arg3;
        this.field1305 = arg4;
    }

    @ObfuscatedName("bn.m(Lbw;)Lbn;")
    public class66 method1331(class78 arg0) {
        this.field1306 = arg0.method1585(this.field1306);
        this.field1307 = arg0.method1586(this.field1307);
        if (this.field1309 == this.field1308) {
            this.field1309 = this.field1308 = arg0.method1590(this.field1309);
        } else {
            this.field1309 = arg0.method1590(this.field1309);
            this.field1308 = arg0.method1590(this.field1308);
            if (this.field1309 == this.field1308) {
                this.field1309--;
            }
        }
        return this;
    }
}
