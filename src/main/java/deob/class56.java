package deob;

@ObfuscatedName("bc")
public class class56 extends class59 {

    @ObfuscatedName("bc.t")
    public int field1134;

    @ObfuscatedName("bc.o")
    public byte[] field1137;

    @ObfuscatedName("bc.i")
    public int field1135;

    @ObfuscatedName("bc.p")
    public int field1136;

    @ObfuscatedName("bc.c")
    public boolean field1133;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1134 = arg0;
        this.field1137 = arg1;
        this.field1135 = arg2;
        this.field1136 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1134 = arg0;
        this.field1137 = arg1;
        this.field1135 = arg2;
        this.field1136 = arg3;
        this.field1133 = arg4;
    }

    @ObfuscatedName("bc.t(Lbp;)Lbc;")
    public class56 method1054(class68 arg0) {
        this.field1137 = arg0.method1321(this.field1137);
        this.field1134 = arg0.method1326(this.field1134);
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
