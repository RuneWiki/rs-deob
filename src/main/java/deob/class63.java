package deob;

@ObfuscatedName("bu")
public class class63 extends class47 {

    @ObfuscatedName("bu.x")
    public int field1244;

    @ObfuscatedName("bu.e")
    public byte[] field1245;

    @ObfuscatedName("bu.r")
    public int field1246;

    @ObfuscatedName("bu.p")
    public int field1247;

    @ObfuscatedName("bu.n")
    public boolean field1248;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1244 = arg0;
        this.field1245 = arg1;
        this.field1246 = arg2;
        this.field1247 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1244 = arg0;
        this.field1245 = arg1;
        this.field1246 = arg2;
        this.field1247 = arg3;
        this.field1248 = arg4;
    }

    @ObfuscatedName("bu.a(Lbo;)Lbu;")
    public class63 method1302(class62 arg0) {
        this.field1245 = arg0.method1292(this.field1245);
        this.field1244 = arg0.method1294(this.field1244);
        if (this.field1247 == this.field1246) {
            this.field1246 = this.field1247 = arg0.method1293(this.field1246);
        } else {
            this.field1246 = arg0.method1293(this.field1246);
            this.field1247 = arg0.method1293(this.field1247);
            if (this.field1247 == this.field1246) {
                this.field1246--;
            }
        }
        return this;
    }
}
