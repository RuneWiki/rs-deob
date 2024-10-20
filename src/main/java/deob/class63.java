package deob;

@ObfuscatedName("bu")
public class class63 extends class66 {

    @ObfuscatedName("bu.v")
    public int field1230;

    @ObfuscatedName("bu.f")
    public byte[] field1229;

    @ObfuscatedName("bu.i")
    public int field1232;

    @ObfuscatedName("bu.d")
    public int field1231;

    @ObfuscatedName("bu.o")
    public boolean field1228;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1230 = arg0;
        this.field1229 = arg1;
        this.field1232 = arg2;
        this.field1231 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1230 = arg0;
        this.field1229 = arg1;
        this.field1232 = arg2;
        this.field1231 = arg3;
        this.field1228 = arg4;
    }

    @ObfuscatedName("bu.v(Lbe;)Lbu;")
    public class63 method1246(class75 arg0) {
        this.field1229 = arg0.method1507(this.field1229);
        this.field1230 = arg0.method1492(this.field1230);
        if (this.field1232 == this.field1231) {
            this.field1232 = this.field1231 = arg0.method1491(this.field1232);
        } else {
            this.field1232 = arg0.method1491(this.field1232);
            this.field1231 = arg0.method1491(this.field1231);
            if (this.field1232 == this.field1231) {
                this.field1232--;
            }
        }
        return this;
    }
}
