package deob;

@ObfuscatedName("bd")
public class class56 extends class72 {

    @ObfuscatedName("bd.n")
    public int field1016;

    @ObfuscatedName("bd.d")
    public byte[] field1015;

    @ObfuscatedName("bd.m")
    public int field1014;

    @ObfuscatedName("bd.h")
    public int field1017;

    @ObfuscatedName("bd.w")
    public boolean field1018;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1016 = arg0;
        this.field1015 = arg1;
        this.field1014 = arg2;
        this.field1017 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1016 = arg0;
        this.field1015 = arg1;
        this.field1014 = arg2;
        this.field1017 = arg3;
        this.field1018 = arg4;
    }

    @ObfuscatedName("bd.n(Lbu;)Lbd;")
    public class56 method987(class66 arg0) {
        this.field1015 = arg0.method1106(this.field1015);
        this.field1016 = arg0.method1107(this.field1016);
        if (this.field1017 == this.field1014) {
            this.field1014 = this.field1017 = arg0.method1105(this.field1014);
        } else {
            this.field1014 = arg0.method1105(this.field1014);
            this.field1017 = arg0.method1105(this.field1017);
            if (this.field1017 == this.field1014) {
                this.field1014--;
            }
        }
        return this;
    }
}
