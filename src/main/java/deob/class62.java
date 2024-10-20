package deob;

@ObfuscatedName("bl")
public class class62 extends class46 {

    @ObfuscatedName("bl.j")
    public int field1229;

    @ObfuscatedName("bl.w")
    public byte[] field1230;

    @ObfuscatedName("bl.h")
    public int field1228;

    @ObfuscatedName("bl.v")
    public int field1227;

    @ObfuscatedName("bl.k")
    public boolean field1231;

    public class62(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1229 = arg0;
        this.field1230 = arg1;
        this.field1228 = arg2;
        this.field1227 = arg3;
    }

    public class62(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1229 = arg0;
        this.field1230 = arg1;
        this.field1228 = arg2;
        this.field1227 = arg3;
        this.field1231 = arg4;
    }

    @ObfuscatedName("bl.p(Lbd;)Lbl;")
    public class62 method1283(class61 arg0) {
        this.field1230 = arg0.method1270(this.field1230);
        this.field1229 = arg0.method1275(this.field1229);
        if (this.field1228 == this.field1227) {
            this.field1228 = this.field1227 = arg0.method1273(this.field1228);
        } else {
            this.field1228 = arg0.method1273(this.field1228);
            this.field1227 = arg0.method1273(this.field1227);
            if (this.field1228 == this.field1227) {
                this.field1228--;
            }
        }
        return this;
    }
}
