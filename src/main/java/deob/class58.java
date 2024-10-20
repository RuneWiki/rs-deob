package deob;

@ObfuscatedName("bc")
public class class58 extends class61 {

    @ObfuscatedName("bc.y")
    public int field1164;

    @ObfuscatedName("bc.k")
    public byte[] field1161;

    @ObfuscatedName("bc.g")
    public int field1162;

    @ObfuscatedName("bc.n")
    public int field1163;

    @ObfuscatedName("bc.t")
    public boolean field1160;

    public class58(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1164 = arg0;
        this.field1161 = arg1;
        this.field1162 = arg2;
        this.field1163 = arg3;
    }

    public class58(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1164 = arg0;
        this.field1161 = arg1;
        this.field1162 = arg2;
        this.field1163 = arg3;
        this.field1160 = arg4;
    }

    @ObfuscatedName("bc.y(Lbr;)Lbc;")
    public class58 method1135(class70 arg0) {
        this.field1161 = arg0.method1377(this.field1161);
        this.field1164 = arg0.method1379(this.field1164);
        if (this.field1163 == this.field1162) {
            this.field1162 = this.field1163 = arg0.method1383(this.field1162);
        } else {
            this.field1162 = arg0.method1383(this.field1162);
            this.field1163 = arg0.method1383(this.field1163);
            if (this.field1163 == this.field1162) {
                this.field1162--;
            }
        }
        return this;
    }
}
