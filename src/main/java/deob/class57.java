package deob;

@ObfuscatedName("bk")
public class class57 extends class60 {

    @ObfuscatedName("bk.p")
    public int field1127;

    @ObfuscatedName("bk.y")
    public byte[] field1126;

    @ObfuscatedName("bk.d")
    public int field1125;

    @ObfuscatedName("bk.c")
    public int field1128;

    @ObfuscatedName("bk.r")
    public boolean field1129;

    public class57(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1127 = arg0;
        this.field1126 = arg1;
        this.field1125 = arg2;
        this.field1128 = arg3;
    }

    public class57(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1127 = arg0;
        this.field1126 = arg1;
        this.field1125 = arg2;
        this.field1128 = arg3;
        this.field1129 = arg4;
    }

    @ObfuscatedName("bk.p(Lbs;)Lbk;")
    public class57 method1098(class69 arg0) {
        this.field1126 = arg0.method1370(this.field1126);
        this.field1127 = arg0.method1371(this.field1127);
        if (this.field1128 == this.field1125) {
            this.field1125 = this.field1128 = arg0.method1373(this.field1125);
        } else {
            this.field1125 = arg0.method1373(this.field1125);
            this.field1128 = arg0.method1373(this.field1128);
            if (this.field1128 == this.field1125) {
                this.field1125--;
            }
        }
        return this;
    }
}
