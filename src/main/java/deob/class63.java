package deob;

@ObfuscatedName("ba")
public class class63 extends class66 {

    @ObfuscatedName("ba.a")
    public int field1242;

    @ObfuscatedName("ba.w")
    public byte[] field1240;

    @ObfuscatedName("ba.d")
    public int field1241;

    @ObfuscatedName("ba.c")
    public int field1243;

    @ObfuscatedName("ba.y")
    public boolean field1239;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1242 = arg0;
        this.field1240 = arg1;
        this.field1241 = arg2;
        this.field1243 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1242 = arg0;
        this.field1240 = arg1;
        this.field1241 = arg2;
        this.field1243 = arg3;
        this.field1239 = arg4;
    }

    @ObfuscatedName("ba.a(Lbw;)Lba;")
    public class63 method1330(class75 arg0) {
        this.field1240 = arg0.method1600(this.field1240);
        this.field1242 = arg0.method1590(this.field1242);
        if (this.field1243 == this.field1241) {
            this.field1241 = this.field1243 = arg0.method1591(this.field1241);
        } else {
            this.field1241 = arg0.method1591(this.field1241);
            this.field1243 = arg0.method1591(this.field1243);
            if (this.field1243 == this.field1241) {
                this.field1241--;
            }
        }
        return this;
    }
}
