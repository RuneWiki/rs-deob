package deob;

@ObfuscatedName("ba")
public class class58 extends class61 {

    @ObfuscatedName("ba.n")
    public int field1167;

    @ObfuscatedName("ba.d")
    public byte[] field1168;

    @ObfuscatedName("ba.z")
    public int field1166;

    @ObfuscatedName("ba.y")
    public int field1165;

    @ObfuscatedName("ba.e")
    public boolean field1169;

    public class58(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1167 = arg0;
        this.field1168 = arg1;
        this.field1166 = arg2;
        this.field1165 = arg3;
    }

    public class58(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1167 = arg0;
        this.field1168 = arg1;
        this.field1166 = arg2;
        this.field1165 = arg3;
        this.field1169 = arg4;
    }

    @ObfuscatedName("ba.n(Lbh;)Lba;")
    public class58 method1137(class70 arg0) {
        this.field1168 = arg0.method1407(this.field1168);
        this.field1167 = arg0.method1408(this.field1167);
        if (this.field1166 == this.field1165) {
            this.field1166 = this.field1165 = arg0.method1409(this.field1166);
        } else {
            this.field1166 = arg0.method1409(this.field1166);
            this.field1165 = arg0.method1409(this.field1165);
            if (this.field1166 == this.field1165) {
                this.field1166--;
            }
        }
        return this;
    }
}
