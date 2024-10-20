package deob;

@ObfuscatedName("bk")
public class class63 extends class47 {

    @ObfuscatedName("bk.h")
    public int field1241;

    @ObfuscatedName("bk.s")
    public byte[] field1242;

    @ObfuscatedName("bk.o")
    public int field1240;

    @ObfuscatedName("bk.p")
    public int field1243;

    @ObfuscatedName("bk.x")
    public boolean field1244;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1241 = arg0;
        this.field1242 = arg1;
        this.field1240 = arg2;
        this.field1243 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1241 = arg0;
        this.field1242 = arg1;
        this.field1240 = arg2;
        this.field1243 = arg3;
        this.field1244 = arg4;
    }

    @ObfuscatedName("bk.g(Lbd;)Lbk;")
    public class63 method1335(class62 arg0) {
        this.field1242 = arg0.method1321(this.field1242);
        this.field1241 = arg0.method1322(this.field1241);
        if (this.field1243 == this.field1240) {
            this.field1240 = this.field1243 = arg0.method1327(this.field1240);
        } else {
            this.field1240 = arg0.method1327(this.field1240);
            this.field1243 = arg0.method1327(this.field1243);
            if (this.field1243 == this.field1240) {
                this.field1240--;
            }
        }
        return this;
    }
}
