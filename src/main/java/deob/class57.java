package deob;

@ObfuscatedName("be")
public class class57 extends class60 {

    @ObfuscatedName("be.l")
    public int field1127;

    @ObfuscatedName("be.y")
    public byte[] field1129;

    @ObfuscatedName("be.g")
    public int field1128;

    @ObfuscatedName("be.j")
    public int field1126;

    @ObfuscatedName("be.w")
    public boolean field1130;

    public class57(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1127 = arg0;
        this.field1129 = arg1;
        this.field1128 = arg2;
        this.field1126 = arg3;
    }

    public class57(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1127 = arg0;
        this.field1129 = arg1;
        this.field1128 = arg2;
        this.field1126 = arg3;
        this.field1130 = arg4;
    }

    @ObfuscatedName("be.l(Lbs;)Lbe;")
    public class57 method1068(class69 arg0) {
        this.field1129 = arg0.method1344(this.field1129);
        this.field1127 = arg0.method1333(this.field1127);
        if (this.field1128 == this.field1126) {
            this.field1128 = this.field1126 = arg0.method1330(this.field1128);
        } else {
            this.field1128 = arg0.method1330(this.field1128);
            this.field1126 = arg0.method1330(this.field1126);
            if (this.field1128 == this.field1126) {
                this.field1128--;
            }
        }
        return this;
    }
}
