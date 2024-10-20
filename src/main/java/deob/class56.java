package deob;

@ObfuscatedName("bk")
public class class56 extends class59 {

    @ObfuscatedName("bk.g")
    public int field1130;

    @ObfuscatedName("bk.s")
    public byte[] field1128;

    @ObfuscatedName("bk.v")
    public int field1127;

    @ObfuscatedName("bk.o")
    public int field1129;

    @ObfuscatedName("bk.k")
    public boolean field1131;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1130 = arg0;
        this.field1128 = arg1;
        this.field1127 = arg2;
        this.field1129 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1130 = arg0;
        this.field1128 = arg1;
        this.field1127 = arg2;
        this.field1129 = arg3;
        this.field1131 = arg4;
    }

    @ObfuscatedName("bk.g(Lbi;)Lbk;")
    public class56 method1064(class68 arg0) {
        this.field1128 = arg0.method1305(this.field1128);
        this.field1130 = arg0.method1306(this.field1130);
        if (this.field1129 == this.field1127) {
            this.field1127 = this.field1129 = arg0.method1307(this.field1127);
        } else {
            this.field1127 = arg0.method1307(this.field1127);
            this.field1129 = arg0.method1307(this.field1129);
            if (this.field1129 == this.field1127) {
                this.field1127--;
            }
        }
        return this;
    }
}
