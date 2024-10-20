package deob;

@ObfuscatedName("bl")
public class class63 extends class66 {

    @ObfuscatedName("bl.t")
    public int field1235;

    @ObfuscatedName("bl.i")
    public byte[] field1236;

    @ObfuscatedName("bl.g")
    public int field1239;

    @ObfuscatedName("bl.h")
    public int field1238;

    @ObfuscatedName("bl.z")
    public boolean field1237;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1235 = arg0;
        this.field1236 = arg1;
        this.field1239 = arg2;
        this.field1238 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1235 = arg0;
        this.field1236 = arg1;
        this.field1239 = arg2;
        this.field1238 = arg3;
        this.field1237 = arg4;
    }

    @ObfuscatedName("bl.t(Lbo;)Lbl;")
    public class63 method1189(class75 arg0) {
        this.field1236 = arg0.method1438(this.field1236);
        this.field1235 = arg0.method1448(this.field1235);
        if (this.field1239 == this.field1238) {
            this.field1239 = this.field1238 = arg0.method1440(this.field1239);
        } else {
            this.field1239 = arg0.method1440(this.field1239);
            this.field1238 = arg0.method1440(this.field1238);
            if (this.field1239 == this.field1238) {
                this.field1239--;
            }
        }
        return this;
    }
}
