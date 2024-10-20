package deob;

@ObfuscatedName("bx")
public class class63 extends class47 {

    @ObfuscatedName("bx.f")
    public int field1246;

    @ObfuscatedName("bx.o")
    public byte[] field1242;

    @ObfuscatedName("bx.h")
    public int field1244;

    @ObfuscatedName("bx.u")
    public int field1245;

    @ObfuscatedName("bx.a")
    public boolean field1243;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1246 = arg0;
        this.field1242 = arg1;
        this.field1244 = arg2;
        this.field1245 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1246 = arg0;
        this.field1242 = arg1;
        this.field1244 = arg2;
        this.field1245 = arg3;
        this.field1243 = arg4;
    }

    @ObfuscatedName("bx.j(Lbu;)Lbx;")
    public class63 method1332(class62 arg0) {
        this.field1242 = arg0.method1316(this.field1242);
        this.field1246 = arg0.method1317(this.field1246);
        if (this.field1245 == this.field1244) {
            this.field1244 = this.field1245 = arg0.method1318(this.field1244);
        } else {
            this.field1244 = arg0.method1318(this.field1244);
            this.field1245 = arg0.method1318(this.field1245);
            if (this.field1245 == this.field1244) {
                this.field1244--;
            }
        }
        return this;
    }
}
