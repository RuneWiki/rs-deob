package deob;

@ObfuscatedName("bx")
public class class63 extends class47 {

    @ObfuscatedName("bx.m")
    public int field1227;

    @ObfuscatedName("bx.d")
    public byte[] field1228;

    @ObfuscatedName("bx.k")
    public int field1229;

    @ObfuscatedName("bx.n")
    public int field1226;

    @ObfuscatedName("bx.s")
    public boolean field1230;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1227 = arg0;
        this.field1228 = arg1;
        this.field1229 = arg2;
        this.field1226 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1227 = arg0;
        this.field1228 = arg1;
        this.field1229 = arg2;
        this.field1226 = arg3;
        this.field1230 = arg4;
    }

    @ObfuscatedName("bx.y(Lbg;)Lbx;")
    public class63 method1327(class62 arg0) {
        this.field1228 = arg0.method1316(this.field1228);
        this.field1227 = arg0.method1317(this.field1227);
        if (this.field1229 == this.field1226) {
            this.field1229 = this.field1226 = arg0.method1318(this.field1229);
        } else {
            this.field1229 = arg0.method1318(this.field1229);
            this.field1226 = arg0.method1318(this.field1226);
            if (this.field1229 == this.field1226) {
                this.field1229--;
            }
        }
        return this;
    }
}
