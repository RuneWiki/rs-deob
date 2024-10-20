package deob;

@ObfuscatedName("bb")
public class class57 extends class60 {

    @ObfuscatedName("bb.v")
    public int field1133;

    @ObfuscatedName("bb.t")
    public byte[] field1130;

    @ObfuscatedName("bb.f")
    public int field1131;

    @ObfuscatedName("bb.j")
    public int field1132;

    @ObfuscatedName("bb.l")
    public boolean field1129;

    public class57(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1133 = arg0;
        this.field1130 = arg1;
        this.field1131 = arg2;
        this.field1132 = arg3;
    }

    public class57(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1133 = arg0;
        this.field1130 = arg1;
        this.field1131 = arg2;
        this.field1132 = arg3;
        this.field1129 = arg4;
    }

    @ObfuscatedName("bb.v(Lbv;)Lbb;")
    public class57 method1086(class69 arg0) {
        this.field1130 = arg0.method1335(this.field1130);
        this.field1133 = arg0.method1343(this.field1133);
        if (this.field1132 == this.field1131) {
            this.field1131 = this.field1132 = arg0.method1337(this.field1131);
        } else {
            this.field1131 = arg0.method1337(this.field1131);
            this.field1132 = arg0.method1337(this.field1132);
            if (this.field1132 == this.field1131) {
                this.field1131--;
            }
        }
        return this;
    }
}
