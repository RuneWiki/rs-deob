package deob;

@ObfuscatedName("bp")
public class class58 extends class61 {

    @ObfuscatedName("bp.p")
    public int field1170;

    @ObfuscatedName("bp.k")
    public byte[] field1171;

    @ObfuscatedName("bp.e")
    public int field1172;

    @ObfuscatedName("bp.f")
    public int field1173;

    @ObfuscatedName("bp.w")
    public boolean field1174;

    public class58(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1170 = arg0;
        this.field1171 = arg1;
        this.field1172 = arg2;
        this.field1173 = arg3;
    }

    public class58(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1170 = arg0;
        this.field1171 = arg1;
        this.field1172 = arg2;
        this.field1173 = arg3;
        this.field1174 = arg4;
    }

    @ObfuscatedName("bp.p(Lbe;)Lbp;")
    public class58 method1114(class70 arg0) {
        this.field1171 = arg0.method1368(this.field1171);
        this.field1170 = arg0.method1374(this.field1170);
        if (this.field1173 == this.field1172) {
            this.field1172 = this.field1173 = arg0.method1370(this.field1172);
        } else {
            this.field1172 = arg0.method1370(this.field1172);
            this.field1173 = arg0.method1370(this.field1173);
            if (this.field1173 == this.field1172) {
                this.field1172--;
            }
        }
        return this;
    }
}
