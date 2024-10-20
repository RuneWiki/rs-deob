package deob;

@ObfuscatedName("bj")
public class class56 extends class72 {

    @ObfuscatedName("bj.q")
    public int field1046;

    @ObfuscatedName("bj.d")
    public byte[] field1045;

    @ObfuscatedName("bj.h")
    public int field1047;

    @ObfuscatedName("bj.p")
    public int field1044;

    @ObfuscatedName("bj.j")
    public boolean field1048;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1046 = arg0;
        this.field1045 = arg1;
        this.field1047 = arg2;
        this.field1044 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1046 = arg0;
        this.field1045 = arg1;
        this.field1047 = arg2;
        this.field1044 = arg3;
        this.field1048 = arg4;
    }

    @ObfuscatedName("bj.q(Lbk;)Lbj;")
    public class56 method1067(class66 arg0) {
        this.field1045 = arg0.method1185(this.field1045);
        this.field1046 = arg0.method1193(this.field1046);
        if (this.field1047 == this.field1044) {
            this.field1047 = this.field1044 = arg0.method1184(this.field1047);
        } else {
            this.field1047 = arg0.method1184(this.field1047);
            this.field1044 = arg0.method1184(this.field1044);
            if (this.field1047 == this.field1044) {
                this.field1047--;
            }
        }
        return this;
    }
}
