package deob;

@ObfuscatedName("bl")
public class class63 extends class66 {

    @ObfuscatedName("bl.a")
    public int field1233;

    @ObfuscatedName("bl.r")
    public byte[] field1232;

    @ObfuscatedName("bl.f")
    public int field1231;

    @ObfuscatedName("bl.s")
    public int field1234;

    @ObfuscatedName("bl.y")
    public boolean field1235;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1233 = arg0;
        this.field1232 = arg1;
        this.field1231 = arg2;
        this.field1234 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1233 = arg0;
        this.field1232 = arg1;
        this.field1231 = arg2;
        this.field1234 = arg3;
        this.field1235 = arg4;
    }

    @ObfuscatedName("bl.a(Lba;)Lbl;")
    public class63 method1257(class75 arg0) {
        this.field1232 = arg0.method1521(this.field1232);
        this.field1233 = arg0.method1510(this.field1233);
        if (this.field1234 == this.field1231) {
            this.field1231 = this.field1234 = arg0.method1514(this.field1231);
        } else {
            this.field1231 = arg0.method1514(this.field1231);
            this.field1234 = arg0.method1514(this.field1234);
            if (this.field1234 == this.field1231) {
                this.field1231--;
            }
        }
        return this;
    }
}
