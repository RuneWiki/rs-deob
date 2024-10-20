package deob;

@ObfuscatedName("be")
public class class63 extends class66 {

    @ObfuscatedName("be.y")
    public int field1232;

    @ObfuscatedName("be.d")
    public byte[] field1235;

    @ObfuscatedName("be.g")
    public int field1233;

    @ObfuscatedName("be.w")
    public int field1234;

    @ObfuscatedName("be.e")
    public boolean field1231;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1232 = arg0;
        this.field1235 = arg1;
        this.field1233 = arg2;
        this.field1234 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1232 = arg0;
        this.field1235 = arg1;
        this.field1233 = arg2;
        this.field1234 = arg3;
        this.field1231 = arg4;
    }

    @ObfuscatedName("be.y(Lbr;)Lbe;")
    public class63 method1245(class75 arg0) {
        this.field1235 = arg0.method1508(this.field1235);
        this.field1232 = arg0.method1499(this.field1232);
        if (this.field1234 == this.field1233) {
            this.field1233 = this.field1234 = arg0.method1501(this.field1233);
        } else {
            this.field1233 = arg0.method1501(this.field1233);
            this.field1234 = arg0.method1501(this.field1234);
            if (this.field1234 == this.field1233) {
                this.field1233--;
            }
        }
        return this;
    }
}
