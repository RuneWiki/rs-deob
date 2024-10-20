package deob;

@ObfuscatedName("bo")
public class class56 extends class59 {

    @ObfuscatedName("bo.e")
    public int field1126;

    @ObfuscatedName("bo.p")
    public byte[] field1123;

    @ObfuscatedName("bo.a")
    public int field1125;

    @ObfuscatedName("bo.g")
    public int field1124;

    @ObfuscatedName("bo.u")
    public boolean field1127;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1126 = arg0;
        this.field1123 = arg1;
        this.field1125 = arg2;
        this.field1124 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1126 = arg0;
        this.field1123 = arg1;
        this.field1125 = arg2;
        this.field1124 = arg3;
        this.field1127 = arg4;
    }

    @ObfuscatedName("bo.e(Lbw;)Lbo;")
    public class56 method1102(class68 arg0) {
        this.field1123 = arg0.method1344(this.field1123);
        this.field1126 = arg0.method1342(this.field1126);
        if (this.field1125 == this.field1124) {
            this.field1125 = this.field1124 = arg0.method1347(this.field1125);
        } else {
            this.field1125 = arg0.method1347(this.field1125);
            this.field1124 = arg0.method1347(this.field1124);
            if (this.field1125 == this.field1124) {
                this.field1125--;
            }
        }
        return this;
    }
}
