package deob;

@ObfuscatedName("bn")
public class class63 extends class66 {

    @ObfuscatedName("bn.c")
    public int field1224;

    @ObfuscatedName("bn.h")
    public byte[] field1225;

    @ObfuscatedName("bn.k")
    public int field1226;

    @ObfuscatedName("bn.t")
    public int field1227;

    @ObfuscatedName("bn.g")
    public boolean field1228;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1224 = arg0;
        this.field1225 = arg1;
        this.field1226 = arg2;
        this.field1227 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1224 = arg0;
        this.field1225 = arg1;
        this.field1226 = arg2;
        this.field1227 = arg3;
        this.field1228 = arg4;
    }

    @ObfuscatedName("bn.c(Lbl;)Lbn;")
    public class63 method1229(class75 arg0) {
        this.field1225 = arg0.method1471(this.field1225);
        this.field1224 = arg0.method1479(this.field1224);
        if (this.field1227 == this.field1226) {
            this.field1226 = this.field1227 = arg0.method1476(this.field1226);
        } else {
            this.field1226 = arg0.method1476(this.field1226);
            this.field1227 = arg0.method1476(this.field1227);
            if (this.field1227 == this.field1226) {
                this.field1226--;
            }
        }
        return this;
    }
}
