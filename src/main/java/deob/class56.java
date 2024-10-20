package deob;

@ObfuscatedName("bf")
public class class56 extends class59 {

    @ObfuscatedName("bf.k")
    public int field1128;

    @ObfuscatedName("bf.b")
    public byte[] field1130;

    @ObfuscatedName("bf.e")
    public int field1129;

    @ObfuscatedName("bf.i")
    public int field1131;

    @ObfuscatedName("bf.t")
    public boolean field1132;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1128 = arg0;
        this.field1130 = arg1;
        this.field1129 = arg2;
        this.field1131 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1128 = arg0;
        this.field1130 = arg1;
        this.field1129 = arg2;
        this.field1131 = arg3;
        this.field1132 = arg4;
    }

    @ObfuscatedName("bf.k(Lbo;)Lbf;")
    public class56 method1072(class68 arg0) {
        this.field1130 = arg0.method1329(this.field1130);
        this.field1128 = arg0.method1330(this.field1128);
        if (this.field1131 == this.field1129) {
            this.field1129 = this.field1131 = arg0.method1333(this.field1129);
        } else {
            this.field1129 = arg0.method1333(this.field1129);
            this.field1131 = arg0.method1333(this.field1131);
            if (this.field1131 == this.field1129) {
                this.field1129--;
            }
        }
        return this;
    }
}
