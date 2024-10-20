package deob;

@ObfuscatedName("bl")
public class class58 extends class61 {

    @ObfuscatedName("bl.t")
    public int field1141;

    @ObfuscatedName("bl.b")
    public byte[] field1144;

    @ObfuscatedName("bl.p")
    public int field1143;

    @ObfuscatedName("bl.e")
    public int field1142;

    @ObfuscatedName("bl.i")
    public boolean field1145;

    public class58(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1141 = arg0;
        this.field1144 = arg1;
        this.field1143 = arg2;
        this.field1142 = arg3;
    }

    public class58(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1141 = arg0;
        this.field1144 = arg1;
        this.field1143 = arg2;
        this.field1142 = arg3;
        this.field1145 = arg4;
    }

    @ObfuscatedName("bl.t(Lbo;)Lbl;")
    public class58 method1163(class70 arg0) {
        this.field1144 = arg0.method1404(this.field1144);
        this.field1141 = arg0.method1405(this.field1141);
        if (this.field1143 == this.field1142) {
            this.field1143 = this.field1142 = arg0.method1406(this.field1143);
        } else {
            this.field1143 = arg0.method1406(this.field1143);
            this.field1142 = arg0.method1406(this.field1142);
            if (this.field1143 == this.field1142) {
                this.field1143--;
            }
        }
        return this;
    }
}
