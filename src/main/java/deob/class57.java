package deob;

@ObfuscatedName("bl")
public class class57 extends class60 {

    @ObfuscatedName("bl.a")
    public int field1140;

    @ObfuscatedName("bl.v")
    public byte[] field1141;

    @ObfuscatedName("bl.i")
    public int field1142;

    @ObfuscatedName("bl.b")
    public int field1139;

    @ObfuscatedName("bl.l")
    public boolean field1143;

    public class57(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1140 = arg0;
        this.field1141 = arg1;
        this.field1142 = arg2;
        this.field1139 = arg3;
    }

    public class57(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1140 = arg0;
        this.field1141 = arg1;
        this.field1142 = arg2;
        this.field1139 = arg3;
        this.field1143 = arg4;
    }

    @ObfuscatedName("bl.a(Lbt;)Lbl;")
    public class57 method1086(class69 arg0) {
        this.field1141 = arg0.method1337(this.field1141);
        this.field1140 = arg0.method1330(this.field1140);
        if (this.field1142 == this.field1139) {
            this.field1142 = this.field1139 = arg0.method1331(this.field1142);
        } else {
            this.field1142 = arg0.method1331(this.field1142);
            this.field1139 = arg0.method1331(this.field1139);
            if (this.field1142 == this.field1139) {
                this.field1142--;
            }
        }
        return this;
    }
}
