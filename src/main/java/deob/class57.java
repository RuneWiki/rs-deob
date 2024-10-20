package deob;

@ObfuscatedName("bx")
public class class57 extends class60 {

    @ObfuscatedName("bx.b")
    public int field1133;

    @ObfuscatedName("bx.e")
    public byte[] field1137;

    @ObfuscatedName("bx.i")
    public int field1135;

    @ObfuscatedName("bx.k")
    public int field1136;

    @ObfuscatedName("bx.h")
    public boolean field1134;

    public class57(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1133 = arg0;
        this.field1137 = arg1;
        this.field1135 = arg2;
        this.field1136 = arg3;
    }

    public class57(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1133 = arg0;
        this.field1137 = arg1;
        this.field1135 = arg2;
        this.field1136 = arg3;
        this.field1134 = arg4;
    }

    @ObfuscatedName("bx.b(Lbd;)Lbx;")
    public class57 method1063(class69 arg0) {
        this.field1137 = arg0.method1321(this.field1137);
        this.field1133 = arg0.method1322(this.field1133);
        if (this.field1136 == this.field1135) {
            this.field1135 = this.field1136 = arg0.method1323(this.field1135);
        } else {
            this.field1135 = arg0.method1323(this.field1135);
            this.field1136 = arg0.method1323(this.field1136);
            if (this.field1136 == this.field1135) {
                this.field1135--;
            }
        }
        return this;
    }
}
