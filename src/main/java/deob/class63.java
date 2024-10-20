package deob;

@ObfuscatedName("bv")
public class class63 extends class47 {

    @ObfuscatedName("bv.e")
    public int field1227;

    @ObfuscatedName("bv.g")
    public byte[] field1226;

    @ObfuscatedName("bv.o")
    public int field1225;

    @ObfuscatedName("bv.a")
    public int field1228;

    @ObfuscatedName("bv.h")
    public boolean field1229;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1227 = arg0;
        this.field1226 = arg1;
        this.field1225 = arg2;
        this.field1228 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1227 = arg0;
        this.field1226 = arg1;
        this.field1225 = arg2;
        this.field1228 = arg3;
        this.field1229 = arg4;
    }

    @ObfuscatedName("bv.b(Lbf;)Lbv;")
    public class63 method1304(class62 arg0) {
        this.field1226 = arg0.method1302(this.field1226);
        this.field1227 = arg0.method1293(this.field1227);
        if (this.field1228 == this.field1225) {
            this.field1225 = this.field1228 = arg0.method1298(this.field1225);
        } else {
            this.field1225 = arg0.method1298(this.field1225);
            this.field1228 = arg0.method1298(this.field1228);
            if (this.field1228 == this.field1225) {
                this.field1225--;
            }
        }
        return this;
    }
}
