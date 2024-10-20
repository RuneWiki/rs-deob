package deob;

@ObfuscatedName("bq")
public class class56 extends class59 {

    @ObfuscatedName("bq.g")
    public int field1126;

    @ObfuscatedName("bq.v")
    public byte[] field1124;

    @ObfuscatedName("bq.z")
    public int field1128;

    @ObfuscatedName("bq.h")
    public int field1127;

    @ObfuscatedName("bq.k")
    public boolean field1125;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1126 = arg0;
        this.field1124 = arg1;
        this.field1128 = arg2;
        this.field1127 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1126 = arg0;
        this.field1124 = arg1;
        this.field1128 = arg2;
        this.field1127 = arg3;
        this.field1125 = arg4;
    }

    @ObfuscatedName("bq.g(Lbz;)Lbq;")
    public class56 method1104(class68 arg0) {
        this.field1124 = arg0.method1345(this.field1124);
        this.field1126 = arg0.method1352(this.field1126);
        if (this.field1128 == this.field1127) {
            this.field1128 = this.field1127 = arg0.method1350(this.field1128);
        } else {
            this.field1128 = arg0.method1350(this.field1128);
            this.field1127 = arg0.method1350(this.field1127);
            if (this.field1128 == this.field1127) {
                this.field1128--;
            }
        }
        return this;
    }
}
