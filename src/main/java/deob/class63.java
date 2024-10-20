package deob;

@ObfuscatedName("bm")
public class class63 extends class66 {

    @ObfuscatedName("bm.w")
    public int field1238;

    @ObfuscatedName("bm.x")
    public byte[] field1239;

    @ObfuscatedName("bm.t")
    public int field1237;

    @ObfuscatedName("bm.p")
    public int field1240;

    @ObfuscatedName("bm.e")
    public boolean field1241;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1238 = arg0;
        this.field1239 = arg1;
        this.field1237 = arg2;
        this.field1240 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1238 = arg0;
        this.field1239 = arg1;
        this.field1237 = arg2;
        this.field1240 = arg3;
        this.field1241 = arg4;
    }

    @ObfuscatedName("bm.w(Lbq;)Lbm;")
    public class63 method1257(class75 arg0) {
        this.field1239 = arg0.method1489(this.field1239);
        this.field1238 = arg0.method1490(this.field1238);
        if (this.field1240 == this.field1237) {
            this.field1237 = this.field1240 = arg0.method1491(this.field1237);
        } else {
            this.field1237 = arg0.method1491(this.field1237);
            this.field1240 = arg0.method1491(this.field1240);
            if (this.field1240 == this.field1237) {
                this.field1237--;
            }
        }
        return this;
    }
}
