package deob;

@ObfuscatedName("by")
public class class63 extends class47 {

    @ObfuscatedName("by.c")
    public int field1229;

    @ObfuscatedName("by.p")
    public byte[] field1226;

    @ObfuscatedName("by.z")
    public int field1227;

    @ObfuscatedName("by.m")
    public int field1228;

    @ObfuscatedName("by.k")
    public boolean field1230;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1229 = arg0;
        this.field1226 = arg1;
        this.field1227 = arg2;
        this.field1228 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1229 = arg0;
        this.field1226 = arg1;
        this.field1227 = arg2;
        this.field1228 = arg3;
        this.field1230 = arg4;
    }

    @ObfuscatedName("by.q(Lbr;)Lby;")
    public class63 method1343(class62 arg0) {
        this.field1226 = arg0.method1330(this.field1226);
        this.field1229 = arg0.method1332(this.field1229);
        if (this.field1228 == this.field1227) {
            this.field1227 = this.field1228 = arg0.method1333(this.field1227);
        } else {
            this.field1227 = arg0.method1333(this.field1227);
            this.field1228 = arg0.method1333(this.field1228);
            if (this.field1228 == this.field1227) {
                this.field1227--;
            }
        }
        return this;
    }
}
