package deob;

@ObfuscatedName("bj")
public class class63 extends class47 {

    @ObfuscatedName("bj.i")
    public int field1241;

    @ObfuscatedName("bj.o")
    public byte[] field1242;

    @ObfuscatedName("bj.n")
    public int field1243;

    @ObfuscatedName("bj.l")
    public int field1244;

    @ObfuscatedName("bj.v")
    public boolean field1245;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1241 = arg0;
        this.field1242 = arg1;
        this.field1243 = arg2;
        this.field1244 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1241 = arg0;
        this.field1242 = arg1;
        this.field1243 = arg2;
        this.field1244 = arg3;
        this.field1245 = arg4;
    }

    @ObfuscatedName("bj.p(Lbq;)Lbj;")
    public class63 method1350(class62 arg0) {
        this.field1242 = arg0.method1343(this.field1242);
        this.field1241 = arg0.method1339(this.field1241);
        if (this.field1244 == this.field1243) {
            this.field1243 = this.field1244 = arg0.method1340(this.field1243);
        } else {
            this.field1243 = arg0.method1340(this.field1243);
            this.field1244 = arg0.method1340(this.field1244);
            if (this.field1244 == this.field1243) {
                this.field1243--;
            }
        }
        return this;
    }
}
