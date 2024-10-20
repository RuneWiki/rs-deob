package deob;

@ObfuscatedName("bi")
public class class56 extends class59 {

    @ObfuscatedName("bi.z")
    public int field1103;

    @ObfuscatedName("bi.j")
    public byte[] field1100;

    @ObfuscatedName("bi.a")
    public int field1101;

    @ObfuscatedName("bi.y")
    public int field1102;

    @ObfuscatedName("bi.i")
    public boolean field1099;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1103 = arg0;
        this.field1100 = arg1;
        this.field1101 = arg2;
        this.field1102 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1103 = arg0;
        this.field1100 = arg1;
        this.field1101 = arg2;
        this.field1102 = arg3;
        this.field1099 = arg4;
    }

    @ObfuscatedName("bi.z(Lba;)Lbi;")
    public class56 method1047(class68 arg0) {
        this.field1100 = arg0.method1312(this.field1100);
        this.field1103 = arg0.method1321(this.field1103);
        if (this.field1102 == this.field1101) {
            this.field1101 = this.field1102 = arg0.method1310(this.field1101);
        } else {
            this.field1101 = arg0.method1310(this.field1101);
            this.field1102 = arg0.method1310(this.field1102);
            if (this.field1102 == this.field1101) {
                this.field1101--;
            }
        }
        return this;
    }
}
