package deob;

@ObfuscatedName("cb")
public class class96 extends class111 {

    @ObfuscatedName("cb.f")
    public int field1323;

    @ObfuscatedName("cb.h")
    public byte[] field1324;

    @ObfuscatedName("cb.e")
    public int field1325;

    @ObfuscatedName("cb.b")
    public int field1326;

    @ObfuscatedName("cb.l")
    public boolean field1327;

    public class96(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1323 = arg0;
        this.field1324 = arg1;
        this.field1325 = arg2;
        this.field1326 = arg3;
    }

    public class96(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1323 = arg0;
        this.field1324 = arg1;
        this.field1325 = arg2;
        this.field1326 = arg3;
        this.field1327 = arg4;
    }

    @ObfuscatedName("cb.f(Ldl;)Lcb;")
    public class96 method2010(class105 arg0) {
        this.field1324 = arg0.method2127(this.field1324);
        this.field1323 = arg0.method2118(this.field1323);
        if (this.field1326 == this.field1325) {
            this.field1325 = this.field1326 = arg0.method2119(this.field1325);
        } else {
            this.field1325 = arg0.method2119(this.field1325);
            this.field1326 = arg0.method2119(this.field1326);
            if (this.field1326 == this.field1325) {
                this.field1325--;
            }
        }
        return this;
    }
}
