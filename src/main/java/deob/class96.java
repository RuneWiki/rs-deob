package deob;

@ObfuscatedName("cr")
public class class96 extends class111 {

    @ObfuscatedName("cr.f")
    public int field1343;

    @ObfuscatedName("cr.l")
    public byte[] field1340;

    @ObfuscatedName("cr.w")
    public int field1341;

    @ObfuscatedName("cr.s")
    public int field1339;

    @ObfuscatedName("cr.e")
    public boolean field1342;

    public class96(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1343 = arg0;
        this.field1340 = arg1;
        this.field1341 = arg2;
        this.field1339 = arg3;
    }

    public class96(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1343 = arg0;
        this.field1340 = arg1;
        this.field1341 = arg2;
        this.field1339 = arg3;
        this.field1342 = arg4;
    }

    @ObfuscatedName("cr.f(Ldt;)Lcr;")
    public class96 method2065(class105 arg0) {
        this.field1340 = arg0.method2166(this.field1340);
        this.field1343 = arg0.method2168(this.field1343);
        if (this.field1341 == this.field1339) {
            this.field1341 = this.field1339 = arg0.method2167(this.field1341);
        } else {
            this.field1341 = arg0.method2167(this.field1341);
            this.field1339 = arg0.method2167(this.field1339);
            if (this.field1341 == this.field1339) {
                this.field1341--;
            }
        }
        return this;
    }
}
