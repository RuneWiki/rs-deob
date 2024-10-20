package deob;

@ObfuscatedName("bq")
public class class64 extends class48 {

    @ObfuscatedName("bq.b")
    public int field1242;

    @ObfuscatedName("bq.r")
    public byte[] field1243;

    @ObfuscatedName("bq.l")
    public int field1241;

    @ObfuscatedName("bq.s")
    public int field1244;

    @ObfuscatedName("bq.d")
    public boolean field1245;

    public class64(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1242 = arg0;
        this.field1243 = arg1;
        this.field1241 = arg2;
        this.field1244 = arg3;
    }

    public class64(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1242 = arg0;
        this.field1243 = arg1;
        this.field1241 = arg2;
        this.field1244 = arg3;
        this.field1245 = arg4;
    }

    @ObfuscatedName("bq.i(Lbl;)Lbq;")
    public class64 method1313(class63 arg0) {
        this.field1243 = arg0.method1309(this.field1243);
        this.field1242 = arg0.method1302(this.field1242);
        if (this.field1244 == this.field1241) {
            this.field1241 = this.field1244 = arg0.method1303(this.field1241);
        } else {
            this.field1241 = arg0.method1303(this.field1241);
            this.field1244 = arg0.method1303(this.field1244);
            if (this.field1244 == this.field1241) {
                this.field1241--;
            }
        }
        return this;
    }
}
