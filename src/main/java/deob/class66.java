package deob;

@ObfuscatedName("be")
public class class66 extends class69 {

    @ObfuscatedName("be.k")
    public int field1291;

    @ObfuscatedName("be.q")
    public byte[] field1293;

    @ObfuscatedName("be.f")
    public int field1292;

    @ObfuscatedName("be.c")
    public int field1290;

    @ObfuscatedName("be.v")
    public boolean field1294;

    public class66(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1291 = arg0;
        this.field1293 = arg1;
        this.field1292 = arg2;
        this.field1290 = arg3;
    }

    public class66(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1291 = arg0;
        this.field1293 = arg1;
        this.field1292 = arg2;
        this.field1290 = arg3;
        this.field1294 = arg4;
    }

    @ObfuscatedName("be.k(Lbj;)Lbe;")
    public class66 method1288(class78 arg0) {
        this.field1293 = arg0.method1558(this.field1293);
        this.field1291 = arg0.method1551(this.field1291);
        if (this.field1292 == this.field1290) {
            this.field1292 = this.field1290 = arg0.method1553(this.field1292);
        } else {
            this.field1292 = arg0.method1553(this.field1292);
            this.field1290 = arg0.method1553(this.field1290);
            if (this.field1292 == this.field1290) {
                this.field1292--;
            }
        }
        return this;
    }
}
