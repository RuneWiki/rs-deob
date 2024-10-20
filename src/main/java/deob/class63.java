package deob;

@ObfuscatedName("bl")
public class class63 extends class47 {

    @ObfuscatedName("bl.g")
    public int field1233;

    @ObfuscatedName("bl.a")
    public byte[] field1232;

    @ObfuscatedName("bl.t")
    public int field1231;

    @ObfuscatedName("bl.f")
    public int field1234;

    @ObfuscatedName("bl.c")
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

    @ObfuscatedName("bl.d(Lbc;)Lbl;")
    public class63 method1293(class62 arg0) {
        this.field1232 = arg0.method1283(this.field1232);
        this.field1233 = arg0.method1284(this.field1233);
        if (this.field1234 == this.field1231) {
            this.field1231 = this.field1234 = arg0.method1287(this.field1231);
        } else {
            this.field1231 = arg0.method1287(this.field1231);
            this.field1234 = arg0.method1287(this.field1234);
            if (this.field1234 == this.field1231) {
                this.field1231--;
            }
        }
        return this;
    }
}
