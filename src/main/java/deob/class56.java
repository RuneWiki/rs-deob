package deob;

@ObfuscatedName("bg")
public class class56 extends class59 {

    @ObfuscatedName("bg.i")
    public int field1142;

    @ObfuscatedName("bg.c")
    public byte[] field1140;

    @ObfuscatedName("bg.h")
    public int field1141;

    @ObfuscatedName("bg.v")
    public int field1139;

    @ObfuscatedName("bg.q")
    public boolean field1143;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1142 = arg0;
        this.field1140 = arg1;
        this.field1141 = arg2;
        this.field1139 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1142 = arg0;
        this.field1140 = arg1;
        this.field1141 = arg2;
        this.field1139 = arg3;
        this.field1143 = arg4;
    }

    @ObfuscatedName("bg.i(Lbj;)Lbg;")
    public class56 method1082(class68 arg0) {
        this.field1140 = arg0.method1351(this.field1140);
        this.field1142 = arg0.method1344(this.field1142);
        if (this.field1141 == this.field1139) {
            this.field1141 = this.field1139 = arg0.method1345(this.field1141);
        } else {
            this.field1141 = arg0.method1345(this.field1141);
            this.field1139 = arg0.method1345(this.field1139);
            if (this.field1141 == this.field1139) {
                this.field1141--;
            }
        }
        return this;
    }
}
