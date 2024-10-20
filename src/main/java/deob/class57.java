package deob;

@ObfuscatedName("bg")
public class class57 extends class60 {

    @ObfuscatedName("bg.g")
    public int field1138;

    @ObfuscatedName("bg.j")
    public byte[] field1137;

    @ObfuscatedName("bg.z")
    public int field1139;

    @ObfuscatedName("bg.b")
    public int field1140;

    @ObfuscatedName("bg.k")
    public boolean field1141;

    public class57(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1138 = arg0;
        this.field1137 = arg1;
        this.field1139 = arg2;
        this.field1140 = arg3;
    }

    public class57(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1138 = arg0;
        this.field1137 = arg1;
        this.field1139 = arg2;
        this.field1140 = arg3;
        this.field1141 = arg4;
    }

    @ObfuscatedName("bg.g(Lbo;)Lbg;")
    public class57 method1044(class69 arg0) {
        this.field1137 = arg0.method1280(this.field1137);
        this.field1138 = arg0.method1281(this.field1138);
        if (this.field1140 == this.field1139) {
            this.field1139 = this.field1140 = arg0.method1282(this.field1139);
        } else {
            this.field1139 = arg0.method1282(this.field1139);
            this.field1140 = arg0.method1282(this.field1140);
            if (this.field1140 == this.field1139) {
                this.field1139--;
            }
        }
        return this;
    }
}
