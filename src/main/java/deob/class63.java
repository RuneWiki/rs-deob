package deob;

@ObfuscatedName("bc")
public class class63 extends class47 {

    @ObfuscatedName("bc.l")
    public int field1272;

    @ObfuscatedName("bc.c")
    public byte[] field1271;

    @ObfuscatedName("bc.d")
    public int field1270;

    @ObfuscatedName("bc.b")
    public int field1273;

    @ObfuscatedName("bc.i")
    public boolean field1274;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1272 = arg0;
        this.field1271 = arg1;
        this.field1270 = arg2;
        this.field1273 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1272 = arg0;
        this.field1271 = arg1;
        this.field1270 = arg2;
        this.field1273 = arg3;
        this.field1274 = arg4;
    }

    @ObfuscatedName("bc.t(Lbw;)Lbc;")
    public class63 method1338(class62 arg0) {
        this.field1271 = arg0.method1321(this.field1271);
        this.field1272 = arg0.method1322(this.field1272);
        if (this.field1273 == this.field1270) {
            this.field1270 = this.field1273 = arg0.method1336(this.field1270);
        } else {
            this.field1270 = arg0.method1336(this.field1270);
            this.field1273 = arg0.method1336(this.field1273);
            if (this.field1273 == this.field1270) {
                this.field1270--;
            }
        }
        return this;
    }
}
