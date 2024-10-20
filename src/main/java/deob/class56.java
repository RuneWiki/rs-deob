package deob;

@ObfuscatedName("bq")
public class class56 extends class59 {

    @ObfuscatedName("bq.b")
    public int field1127;

    @ObfuscatedName("bq.u")
    public byte[] field1126;

    @ObfuscatedName("bq.x")
    public int field1125;

    @ObfuscatedName("bq.j")
    public int field1128;

    @ObfuscatedName("bq.o")
    public boolean field1129;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1127 = arg0;
        this.field1126 = arg1;
        this.field1125 = arg2;
        this.field1128 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1127 = arg0;
        this.field1126 = arg1;
        this.field1125 = arg2;
        this.field1128 = arg3;
        this.field1129 = arg4;
    }

    @ObfuscatedName("bq.b(Lbr;)Lbq;")
    public class56 method1064(class68 arg0) {
        this.field1126 = arg0.method1330(this.field1126);
        this.field1127 = arg0.method1331(this.field1127);
        if (this.field1128 == this.field1125) {
            this.field1125 = this.field1128 = arg0.method1332(this.field1125);
        } else {
            this.field1125 = arg0.method1332(this.field1125);
            this.field1128 = arg0.method1332(this.field1128);
            if (this.field1128 == this.field1125) {
                this.field1125--;
            }
        }
        return this;
    }
}
