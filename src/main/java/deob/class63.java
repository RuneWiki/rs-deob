package deob;

@ObfuscatedName("bx")
public class class63 extends class66 {

    @ObfuscatedName("bx.i")
    public int field1236;

    @ObfuscatedName("bx.v")
    public byte[] field1238;

    @ObfuscatedName("bx.r")
    public int field1237;

    @ObfuscatedName("bx.n")
    public int field1239;

    @ObfuscatedName("bx.x")
    public boolean field1240;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1236 = arg0;
        this.field1238 = arg1;
        this.field1237 = arg2;
        this.field1239 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1236 = arg0;
        this.field1238 = arg1;
        this.field1237 = arg2;
        this.field1239 = arg3;
        this.field1240 = arg4;
    }

    @ObfuscatedName("bx.i(Lbe;)Lbx;")
    public class63 method1279(class75 arg0) {
        this.field1238 = arg0.method1514(this.field1238);
        this.field1236 = arg0.method1515(this.field1236);
        if (this.field1239 == this.field1237) {
            this.field1237 = this.field1239 = arg0.method1519(this.field1237);
        } else {
            this.field1237 = arg0.method1519(this.field1237);
            this.field1239 = arg0.method1519(this.field1239);
            if (this.field1239 == this.field1237) {
                this.field1237--;
            }
        }
        return this;
    }
}
