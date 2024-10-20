package deob;

@ObfuscatedName("bx")
public class class63 extends class66 {

    @ObfuscatedName("bx.k")
    public int field1209;

    @ObfuscatedName("bx.h")
    public byte[] field1210;

    @ObfuscatedName("bx.o")
    public int field1211;

    @ObfuscatedName("bx.z")
    public int field1208;

    @ObfuscatedName("bx.c")
    public boolean field1212;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1209 = arg0;
        this.field1210 = arg1;
        this.field1211 = arg2;
        this.field1208 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1209 = arg0;
        this.field1210 = arg1;
        this.field1211 = arg2;
        this.field1208 = arg3;
        this.field1212 = arg4;
    }

    @ObfuscatedName("bx.k(Lbt;)Lbx;")
    public class63 method1223(class75 arg0) {
        this.field1210 = arg0.method1477(this.field1210);
        this.field1209 = arg0.method1478(this.field1209);
        if (this.field1211 == this.field1208) {
            this.field1211 = this.field1208 = arg0.method1479(this.field1211);
        } else {
            this.field1211 = arg0.method1479(this.field1211);
            this.field1208 = arg0.method1479(this.field1208);
            if (this.field1211 == this.field1208) {
                this.field1211--;
            }
        }
        return this;
    }
}
