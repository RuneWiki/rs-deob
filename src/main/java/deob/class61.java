package deob;

@ObfuscatedName("bv")
public class class61 extends class64 {

    @ObfuscatedName("bv.j")
    public int field1203;

    @ObfuscatedName("bv.y")
    public byte[] field1199;

    @ObfuscatedName("bv.z")
    public int field1201;

    @ObfuscatedName("bv.l")
    public int field1200;

    @ObfuscatedName("bv.w")
    public boolean field1202;

    public class61(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1203 = arg0;
        this.field1199 = arg1;
        this.field1201 = arg2;
        this.field1200 = arg3;
    }

    public class61(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1203 = arg0;
        this.field1199 = arg1;
        this.field1201 = arg2;
        this.field1200 = arg3;
        this.field1202 = arg4;
    }

    @ObfuscatedName("bv.j(Lbq;)Lbv;")
    public class61 method1283(class73 arg0) {
        this.field1199 = arg0.method1542(this.field1199);
        this.field1203 = arg0.method1544(this.field1203);
        if (this.field1201 == this.field1200) {
            this.field1201 = this.field1200 = arg0.method1547(this.field1201);
        } else {
            this.field1201 = arg0.method1547(this.field1201);
            this.field1200 = arg0.method1547(this.field1200);
            if (this.field1201 == this.field1200) {
                this.field1201--;
            }
        }
        return this;
    }
}
