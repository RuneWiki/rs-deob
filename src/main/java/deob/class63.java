package deob;

@ObfuscatedName("bd")
public class class63 extends class47 {

    @ObfuscatedName("bd.m")
    public int field1229;

    @ObfuscatedName("bd.v")
    public byte[] field1227;

    @ObfuscatedName("bd.r")
    public int field1228;

    @ObfuscatedName("bd.n")
    public int field1226;

    @ObfuscatedName("bd.i")
    public boolean field1230;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1229 = arg0;
        this.field1227 = arg1;
        this.field1228 = arg2;
        this.field1226 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1229 = arg0;
        this.field1227 = arg1;
        this.field1228 = arg2;
        this.field1226 = arg3;
        this.field1230 = arg4;
    }

    @ObfuscatedName("bd.g(Lby;)Lbd;")
    public class63 method1328(class62 arg0) {
        this.field1227 = arg0.method1317(this.field1227);
        this.field1229 = arg0.method1318(this.field1229);
        if (this.field1228 == this.field1226) {
            this.field1228 = this.field1226 = arg0.method1319(this.field1228);
        } else {
            this.field1228 = arg0.method1319(this.field1228);
            this.field1226 = arg0.method1319(this.field1226);
            if (this.field1228 == this.field1226) {
                this.field1228--;
            }
        }
        return this;
    }
}
