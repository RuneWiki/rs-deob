package deob;

@ObfuscatedName("bx")
public class class58 extends class61 {

    @ObfuscatedName("bx.q")
    public int field1135;

    @ObfuscatedName("bx.s")
    public byte[] field1131;

    @ObfuscatedName("bx.h")
    public int field1133;

    @ObfuscatedName("bx.e")
    public int field1134;

    @ObfuscatedName("bx.n")
    public boolean field1132;

    public class58(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1135 = arg0;
        this.field1131 = arg1;
        this.field1133 = arg2;
        this.field1134 = arg3;
    }

    public class58(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1135 = arg0;
        this.field1131 = arg1;
        this.field1133 = arg2;
        this.field1134 = arg3;
        this.field1132 = arg4;
    }

    @ObfuscatedName("bx.q(Lbj;)Lbx;")
    public class58 method1079(class70 arg0) {
        this.field1131 = arg0.method1351(this.field1131);
        this.field1135 = arg0.method1353(this.field1135);
        if (this.field1134 == this.field1133) {
            this.field1133 = this.field1134 = arg0.method1341(this.field1133);
        } else {
            this.field1133 = arg0.method1341(this.field1133);
            this.field1134 = arg0.method1341(this.field1134);
            if (this.field1134 == this.field1133) {
                this.field1133--;
            }
        }
        return this;
    }
}
