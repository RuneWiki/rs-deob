package deob;

@ObfuscatedName("br")
public class class56 extends class72 {

    @ObfuscatedName("br.f")
    public int field1048;

    @ObfuscatedName("br.i")
    public byte[] field1045;

    @ObfuscatedName("br.u")
    public int field1046;

    @ObfuscatedName("br.h")
    public int field1047;

    @ObfuscatedName("br.r")
    public boolean field1049;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1048 = arg0;
        this.field1045 = arg1;
        this.field1046 = arg2;
        this.field1047 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1048 = arg0;
        this.field1045 = arg1;
        this.field1046 = arg2;
        this.field1047 = arg3;
        this.field1049 = arg4;
    }

    @ObfuscatedName("br.f(Lbe;)Lbr;")
    public class56 method1032(class66 arg0) {
        this.field1045 = arg0.method1148(this.field1045);
        this.field1048 = arg0.method1152(this.field1048);
        if (this.field1047 == this.field1046) {
            this.field1046 = this.field1047 = arg0.method1149(this.field1046);
        } else {
            this.field1046 = arg0.method1149(this.field1046);
            this.field1047 = arg0.method1149(this.field1047);
            if (this.field1047 == this.field1046) {
                this.field1046--;
            }
        }
        return this;
    }
}
