package deob;

@ObfuscatedName("bt")
public class class63 extends class66 {

    @ObfuscatedName("bt.o")
    public int field1226;

    @ObfuscatedName("bt.f")
    public byte[] field1225;

    @ObfuscatedName("bt.i")
    public int field1228;

    @ObfuscatedName("bt.h")
    public int field1227;

    @ObfuscatedName("bt.q")
    public boolean field1224;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1226 = arg0;
        this.field1225 = arg1;
        this.field1228 = arg2;
        this.field1227 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1226 = arg0;
        this.field1225 = arg1;
        this.field1228 = arg2;
        this.field1227 = arg3;
        this.field1224 = arg4;
    }

    @ObfuscatedName("bt.o(Lbg;)Lbt;")
    public class63 method1204(class75 arg0) {
        this.field1225 = arg0.method1443(this.field1225);
        this.field1226 = arg0.method1449(this.field1226);
        if (this.field1228 == this.field1227) {
            this.field1228 = this.field1227 = arg0.method1442(this.field1228);
        } else {
            this.field1228 = arg0.method1442(this.field1228);
            this.field1227 = arg0.method1442(this.field1227);
            if (this.field1228 == this.field1227) {
                this.field1228--;
            }
        }
        return this;
    }
}
