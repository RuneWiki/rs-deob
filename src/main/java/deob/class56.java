package deob;

@ObfuscatedName("bi")
public class class56 extends class59 {

    @ObfuscatedName("bi.g")
    public int field1129;

    @ObfuscatedName("bi.s")
    public byte[] field1128;

    @ObfuscatedName("bi.h")
    public int field1127;

    @ObfuscatedName("bi.m")
    public int field1130;

    @ObfuscatedName("bi.u")
    public boolean field1131;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1129 = arg0;
        this.field1128 = arg1;
        this.field1127 = arg2;
        this.field1130 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1129 = arg0;
        this.field1128 = arg1;
        this.field1127 = arg2;
        this.field1130 = arg3;
        this.field1131 = arg4;
    }

    @ObfuscatedName("bi.g(Lbp;)Lbi;")
    public class56 method1073(class68 arg0) {
        this.field1128 = arg0.method1322(this.field1128);
        this.field1129 = arg0.method1325(this.field1129);
        if (this.field1130 == this.field1127) {
            this.field1127 = this.field1130 = arg0.method1324(this.field1127);
        } else {
            this.field1127 = arg0.method1324(this.field1127);
            this.field1130 = arg0.method1324(this.field1130);
            if (this.field1130 == this.field1127) {
                this.field1127--;
            }
        }
        return this;
    }
}
