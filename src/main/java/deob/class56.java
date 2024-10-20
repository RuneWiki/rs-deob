package deob;

@ObfuscatedName("bp")
public class class56 extends class59 {

    @ObfuscatedName("bp.p")
    public int field1124;

    @ObfuscatedName("bp.g")
    public byte[] field1122;

    @ObfuscatedName("bp.x")
    public int field1123;

    @ObfuscatedName("bp.c")
    public int field1121;

    @ObfuscatedName("bp.n")
    public boolean field1125;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1124 = arg0;
        this.field1122 = arg1;
        this.field1123 = arg2;
        this.field1121 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1124 = arg0;
        this.field1122 = arg1;
        this.field1123 = arg2;
        this.field1121 = arg3;
        this.field1125 = arg4;
    }

    @ObfuscatedName("bp.p(Lbq;)Lbp;")
    public class56 method1127(class68 arg0) {
        this.field1122 = arg0.method1384(this.field1122);
        this.field1124 = arg0.method1385(this.field1124);
        if (this.field1123 == this.field1121) {
            this.field1123 = this.field1121 = arg0.method1391(this.field1123);
        } else {
            this.field1123 = arg0.method1391(this.field1123);
            this.field1121 = arg0.method1391(this.field1121);
            if (this.field1123 == this.field1121) {
                this.field1123--;
            }
        }
        return this;
    }
}
