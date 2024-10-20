package deob;

@ObfuscatedName("bh")
public class class63 extends class66 {

    @ObfuscatedName("bh.d")
    public int field1235;

    @ObfuscatedName("bh.p")
    public byte[] field1236;

    @ObfuscatedName("bh.v")
    public int field1234;

    @ObfuscatedName("bh.l")
    public int field1233;

    @ObfuscatedName("bh.y")
    public boolean field1232;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1235 = arg0;
        this.field1236 = arg1;
        this.field1234 = arg2;
        this.field1233 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1235 = arg0;
        this.field1236 = arg1;
        this.field1234 = arg2;
        this.field1233 = arg3;
        this.field1232 = arg4;
    }

    @ObfuscatedName("bh.d(Lbs;)Lbh;")
    public class63 method1237(class75 arg0) {
        this.field1236 = arg0.method1499(this.field1236);
        this.field1235 = arg0.method1495(this.field1235);
        if (this.field1234 == this.field1233) {
            this.field1234 = this.field1233 = arg0.method1504(this.field1234);
        } else {
            this.field1234 = arg0.method1504(this.field1234);
            this.field1233 = arg0.method1504(this.field1233);
            if (this.field1234 == this.field1233) {
                this.field1234--;
            }
        }
        return this;
    }
}
