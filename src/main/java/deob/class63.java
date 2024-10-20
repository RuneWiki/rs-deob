package deob;

@ObfuscatedName("ba")
public class class63 extends class66 {

    @ObfuscatedName("ba.s")
    public int field1241;

    @ObfuscatedName("ba.j")
    public byte[] field1238;

    @ObfuscatedName("ba.p")
    public int field1237;

    @ObfuscatedName("ba.x")
    public int field1240;

    @ObfuscatedName("ba.d")
    public boolean field1239;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1241 = arg0;
        this.field1238 = arg1;
        this.field1237 = arg2;
        this.field1240 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1241 = arg0;
        this.field1238 = arg1;
        this.field1237 = arg2;
        this.field1240 = arg3;
        this.field1239 = arg4;
    }

    @ObfuscatedName("ba.s(Lbp;)Lba;")
    public class63 method1215(class75 arg0) {
        this.field1238 = arg0.method1474(this.field1238);
        this.field1241 = arg0.method1476(this.field1241);
        if (this.field1240 == this.field1237) {
            this.field1237 = this.field1240 = arg0.method1477(this.field1237);
        } else {
            this.field1237 = arg0.method1477(this.field1237);
            this.field1240 = arg0.method1477(this.field1240);
            if (this.field1240 == this.field1237) {
                this.field1237--;
            }
        }
        return this;
    }
}
