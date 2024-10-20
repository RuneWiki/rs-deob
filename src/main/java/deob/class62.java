package deob;

@ObfuscatedName("bf")
public class class62 extends class46 {

    @ObfuscatedName("bf.e")
    public int field1224;

    @ObfuscatedName("bf.n")
    public byte[] field1221;

    @ObfuscatedName("bf.j")
    public int field1222;

    @ObfuscatedName("bf.i")
    public int field1223;

    @ObfuscatedName("bf.o")
    public boolean field1220;

    public class62(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1224 = arg0;
        this.field1221 = arg1;
        this.field1222 = arg2;
        this.field1223 = arg3;
    }

    public class62(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1224 = arg0;
        this.field1221 = arg1;
        this.field1222 = arg2;
        this.field1223 = arg3;
        this.field1220 = arg4;
    }

    @ObfuscatedName("bf.g(Lbx;)Lbf;")
    public class62 method1309(class61 arg0) {
        this.field1221 = arg0.method1294(this.field1221);
        this.field1224 = arg0.method1302(this.field1224);
        if (this.field1223 == this.field1222) {
            this.field1222 = this.field1223 = arg0.method1296(this.field1222);
        } else {
            this.field1222 = arg0.method1296(this.field1222);
            this.field1223 = arg0.method1296(this.field1223);
            if (this.field1223 == this.field1222) {
                this.field1222--;
            }
        }
        return this;
    }
}
