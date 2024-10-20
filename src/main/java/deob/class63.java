package deob;

@ObfuscatedName("bu")
public class class63 extends class66 {

    @ObfuscatedName("bu.e")
    public int field1205;

    @ObfuscatedName("bu.w")
    public byte[] field1204;

    @ObfuscatedName("bu.f")
    public int field1206;

    @ObfuscatedName("bu.s")
    public int field1203;

    @ObfuscatedName("bu.p")
    public boolean field1207;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1205 = arg0;
        this.field1204 = arg1;
        this.field1206 = arg2;
        this.field1203 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1205 = arg0;
        this.field1204 = arg1;
        this.field1206 = arg2;
        this.field1203 = arg3;
        this.field1207 = arg4;
    }

    @ObfuscatedName("bu.e(Lbz;)Lbu;")
    public class63 method1232(class75 arg0) {
        this.field1204 = arg0.method1481(this.field1204);
        this.field1205 = arg0.method1483(this.field1205);
        if (this.field1206 == this.field1203) {
            this.field1206 = this.field1203 = arg0.method1484(this.field1206);
        } else {
            this.field1206 = arg0.method1484(this.field1206);
            this.field1203 = arg0.method1484(this.field1203);
            if (this.field1206 == this.field1203) {
                this.field1206--;
            }
        }
        return this;
    }
}
