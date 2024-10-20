package deob;

@ObfuscatedName("ba")
public class class56 extends class59 {

    @ObfuscatedName("ba.t")
    public int field1119;

    @ObfuscatedName("ba.s")
    public byte[] field1121;

    @ObfuscatedName("ba.f")
    public int field1120;

    @ObfuscatedName("ba.e")
    public int field1118;

    @ObfuscatedName("ba.d")
    public boolean field1122;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1119 = arg0;
        this.field1121 = arg1;
        this.field1120 = arg2;
        this.field1118 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1119 = arg0;
        this.field1121 = arg1;
        this.field1120 = arg2;
        this.field1118 = arg3;
        this.field1122 = arg4;
    }

    @ObfuscatedName("ba.t(Lbk;)Lba;")
    public class56 method1051(class68 arg0) {
        this.field1121 = arg0.method1314(this.field1121);
        this.field1119 = arg0.method1315(this.field1119);
        if (this.field1120 == this.field1118) {
            this.field1120 = this.field1118 = arg0.method1319(this.field1120);
        } else {
            this.field1120 = arg0.method1319(this.field1120);
            this.field1118 = arg0.method1319(this.field1118);
            if (this.field1120 == this.field1118) {
                this.field1120--;
            }
        }
        return this;
    }
}
