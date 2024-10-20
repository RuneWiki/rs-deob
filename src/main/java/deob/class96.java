package deob;

@ObfuscatedName("cz")
public class class96 extends class111 {

    @ObfuscatedName("cz.c")
    public int field1339;

    @ObfuscatedName("cz.q")
    public byte[] field1338;

    @ObfuscatedName("cz.m")
    public int field1340;

    @ObfuscatedName("cz.j")
    public int field1337;

    @ObfuscatedName("cz.g")
    public boolean field1341;

    public class96(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1339 = arg0;
        this.field1338 = arg1;
        this.field1340 = arg2;
        this.field1337 = arg3;
    }

    public class96(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1339 = arg0;
        this.field1338 = arg1;
        this.field1340 = arg2;
        this.field1337 = arg3;
        this.field1341 = arg4;
    }

    @ObfuscatedName("cz.c(Ldi;)Lcz;")
    public class96 method1961(class105 arg0) {
        this.field1338 = arg0.method2069(this.field1338);
        this.field1339 = arg0.method2070(this.field1339);
        if (this.field1340 == this.field1337) {
            this.field1340 = this.field1337 = arg0.method2071(this.field1340);
        } else {
            this.field1340 = arg0.method2071(this.field1340);
            this.field1337 = arg0.method2071(this.field1337);
            if (this.field1340 == this.field1337) {
                this.field1340--;
            }
        }
        return this;
    }
}
