package deob;

@ObfuscatedName("be")
public class class58 extends class61 {

    @ObfuscatedName("be.b")
    public int field1167;

    @ObfuscatedName("be.e")
    public byte[] field1168;

    @ObfuscatedName("be.a")
    public int field1169;

    @ObfuscatedName("be.k")
    public int field1166;

    @ObfuscatedName("be.p")
    public boolean field1170;

    public class58(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1167 = arg0;
        this.field1168 = arg1;
        this.field1169 = arg2;
        this.field1166 = arg3;
    }

    public class58(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1167 = arg0;
        this.field1168 = arg1;
        this.field1169 = arg2;
        this.field1166 = arg3;
        this.field1170 = arg4;
    }

    @ObfuscatedName("be.b(Lbm;)Lbe;")
    public class58 method1098(class70 arg0) {
        this.field1168 = arg0.method1329(this.field1168);
        this.field1167 = arg0.method1336(this.field1167);
        if (this.field1169 == this.field1166) {
            this.field1169 = this.field1166 = arg0.method1331(this.field1169);
        } else {
            this.field1169 = arg0.method1331(this.field1169);
            this.field1166 = arg0.method1331(this.field1166);
            if (this.field1169 == this.field1166) {
                this.field1169--;
            }
        }
        return this;
    }
}
