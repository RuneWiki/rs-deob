package deob;

@ObfuscatedName("ct")
public class class96 extends class111 {

    @ObfuscatedName("ct.g")
    public int field1348;

    @ObfuscatedName("ct.r")
    public byte[] field1346;

    @ObfuscatedName("ct.e")
    public int field1347;

    @ObfuscatedName("ct.q")
    public int field1349;

    @ObfuscatedName("ct.c")
    public boolean field1345;

    public class96(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1348 = arg0;
        this.field1346 = arg1;
        this.field1347 = arg2;
        this.field1349 = arg3;
    }

    public class96(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1348 = arg0;
        this.field1346 = arg1;
        this.field1347 = arg2;
        this.field1349 = arg3;
        this.field1345 = arg4;
    }

    @ObfuscatedName("ct.g(Ldm;)Lct;")
    public class96 method2185(class105 arg0) {
        this.field1346 = arg0.method2293(this.field1346);
        this.field1348 = arg0.method2298(this.field1348);
        if (this.field1349 == this.field1347) {
            this.field1347 = this.field1349 = arg0.method2294(this.field1347);
        } else {
            this.field1347 = arg0.method2294(this.field1347);
            this.field1349 = arg0.method2294(this.field1349);
            if (this.field1349 == this.field1347) {
                this.field1347--;
            }
        }
        return this;
    }
}
