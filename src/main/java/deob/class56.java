package deob;

@ObfuscatedName("bv")
public class class56 extends class59 {

    @ObfuscatedName("bv.n")
    public int field1129;

    @ObfuscatedName("bv.x")
    public byte[] field1127;

    @ObfuscatedName("bv.k")
    public int field1126;

    @ObfuscatedName("bv.i")
    public int field1128;

    @ObfuscatedName("bv.d")
    public boolean field1130;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1129 = arg0;
        this.field1127 = arg1;
        this.field1126 = arg2;
        this.field1128 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1129 = arg0;
        this.field1127 = arg1;
        this.field1126 = arg2;
        this.field1128 = arg3;
        this.field1130 = arg4;
    }

    @ObfuscatedName("bv.n(Lbl;)Lbv;")
    public class56 method1093(class68 arg0) {
        this.field1127 = arg0.method1335(this.field1127);
        this.field1129 = arg0.method1337(this.field1129);
        if (this.field1128 == this.field1126) {
            this.field1126 = this.field1128 = arg0.method1336(this.field1126);
        } else {
            this.field1126 = arg0.method1336(this.field1126);
            this.field1128 = arg0.method1336(this.field1128);
            if (this.field1128 == this.field1126) {
                this.field1126--;
            }
        }
        return this;
    }
}
