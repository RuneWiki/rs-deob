package deob;

@ObfuscatedName("be")
public class class56 extends class72 {

    @ObfuscatedName("be.u")
    public int field1018;

    @ObfuscatedName("be.x")
    public byte[] field1016;

    @ObfuscatedName("be.i")
    public int field1017;

    @ObfuscatedName("be.a")
    public int field1015;

    @ObfuscatedName("be.f")
    public boolean field1019;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1018 = arg0;
        this.field1016 = arg1;
        this.field1017 = arg2;
        this.field1015 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1018 = arg0;
        this.field1016 = arg1;
        this.field1017 = arg2;
        this.field1015 = arg3;
        this.field1019 = arg4;
    }

    @ObfuscatedName("be.u(Lbr;)Lbe;")
    public class56 method979(class66 arg0) {
        this.field1016 = arg0.method1086(this.field1016);
        this.field1018 = arg0.method1087(this.field1018);
        if (this.field1017 == this.field1015) {
            this.field1017 = this.field1015 = arg0.method1088(this.field1017);
        } else {
            this.field1017 = arg0.method1088(this.field1017);
            this.field1015 = arg0.method1088(this.field1015);
            if (this.field1017 == this.field1015) {
                this.field1017--;
            }
        }
        return this;
    }
}
