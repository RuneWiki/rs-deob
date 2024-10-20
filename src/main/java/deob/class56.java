package deob;

@ObfuscatedName("bt")
public class class56 extends class59 {

    @ObfuscatedName("bt.e")
    public int field1138;

    @ObfuscatedName("bt.o")
    public byte[] field1136;

    @ObfuscatedName("bt.y")
    public int field1137;

    @ObfuscatedName("bt.b")
    public int field1135;

    @ObfuscatedName("bt.w")
    public boolean field1139;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1138 = arg0;
        this.field1136 = arg1;
        this.field1137 = arg2;
        this.field1135 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1138 = arg0;
        this.field1136 = arg1;
        this.field1137 = arg2;
        this.field1135 = arg3;
        this.field1139 = arg4;
    }

    @ObfuscatedName("bt.e(Lbx;)Lbt;")
    public class56 method1058(class68 arg0) {
        this.field1136 = arg0.method1310(this.field1136);
        this.field1138 = arg0.method1311(this.field1138);
        if (this.field1137 == this.field1135) {
            this.field1137 = this.field1135 = arg0.method1315(this.field1137);
        } else {
            this.field1137 = arg0.method1315(this.field1137);
            this.field1135 = arg0.method1315(this.field1135);
            if (this.field1137 == this.field1135) {
                this.field1137--;
            }
        }
        return this;
    }
}
