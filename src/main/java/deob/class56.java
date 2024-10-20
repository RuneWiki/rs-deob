package deob;

@ObfuscatedName("bg")
public class class56 extends class59 {

    @ObfuscatedName("bg.e")
    public int field1128;

    @ObfuscatedName("bg.v")
    public byte[] field1125;

    @ObfuscatedName("bg.i")
    public int field1127;

    @ObfuscatedName("bg.g")
    public int field1124;

    @ObfuscatedName("bg.x")
    public boolean field1126;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1128 = arg0;
        this.field1125 = arg1;
        this.field1127 = arg2;
        this.field1124 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1128 = arg0;
        this.field1125 = arg1;
        this.field1127 = arg2;
        this.field1124 = arg3;
        this.field1126 = arg4;
    }

    @ObfuscatedName("bg.e(Lbq;)Lbg;")
    public class56 method1064(class68 arg0) {
        this.field1125 = arg0.method1323(this.field1125);
        this.field1128 = arg0.method1319(this.field1128);
        if (this.field1127 == this.field1124) {
            this.field1127 = this.field1124 = arg0.method1320(this.field1127);
        } else {
            this.field1127 = arg0.method1320(this.field1127);
            this.field1124 = arg0.method1320(this.field1124);
            if (this.field1127 == this.field1124) {
                this.field1127--;
            }
        }
        return this;
    }
}
