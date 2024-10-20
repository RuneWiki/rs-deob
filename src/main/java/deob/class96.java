package deob;

@ObfuscatedName("cq")
public class class96 extends class111 {

    @ObfuscatedName("cq.v")
    public int field1327;

    @ObfuscatedName("cq.s")
    public byte[] field1330;

    @ObfuscatedName("cq.o")
    public int field1329;

    @ObfuscatedName("cq.k")
    public int field1328;

    @ObfuscatedName("cq.u")
    public boolean field1331;

    public class96(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1327 = arg0;
        this.field1330 = arg1;
        this.field1329 = arg2;
        this.field1328 = arg3;
    }

    public class96(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1327 = arg0;
        this.field1330 = arg1;
        this.field1329 = arg2;
        this.field1328 = arg3;
        this.field1331 = arg4;
    }

    @ObfuscatedName("cq.v(Ldt;)Lcq;")
    public class96 method2011(class105 arg0) {
        this.field1330 = arg0.method2121(this.field1330);
        this.field1327 = arg0.method2126(this.field1327);
        if (this.field1329 == this.field1328) {
            this.field1329 = this.field1328 = arg0.method2122(this.field1329);
        } else {
            this.field1329 = arg0.method2122(this.field1329);
            this.field1328 = arg0.method2122(this.field1328);
            if (this.field1329 == this.field1328) {
                this.field1329--;
            }
        }
        return this;
    }
}
