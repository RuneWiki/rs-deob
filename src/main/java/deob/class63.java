package deob;

@ObfuscatedName("bh")
public class class63 extends class47 {

    @ObfuscatedName("bh.p")
    public int field1240;

    @ObfuscatedName("bh.a")
    public byte[] field1238;

    @ObfuscatedName("bh.l")
    public int field1239;

    @ObfuscatedName("bh.q")
    public int field1241;

    @ObfuscatedName("bh.b")
    public boolean field1242;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1240 = arg0;
        this.field1238 = arg1;
        this.field1239 = arg2;
        this.field1241 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1240 = arg0;
        this.field1238 = arg1;
        this.field1239 = arg2;
        this.field1241 = arg3;
        this.field1242 = arg4;
    }

    @ObfuscatedName("bh.i(Lbz;)Lbh;")
    public class63 method1270(class62 arg0) {
        this.field1238 = arg0.method1261(this.field1238);
        this.field1240 = arg0.method1262(this.field1240);
        if (this.field1241 == this.field1239) {
            this.field1239 = this.field1241 = arg0.method1267(this.field1239);
        } else {
            this.field1239 = arg0.method1267(this.field1239);
            this.field1241 = arg0.method1267(this.field1241);
            if (this.field1241 == this.field1239) {
                this.field1239--;
            }
        }
        return this;
    }
}
