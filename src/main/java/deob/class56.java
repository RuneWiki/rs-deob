package deob;

@ObfuscatedName("bh")
public class class56 extends class72 {

    @ObfuscatedName("bh.o")
    public int field1022;

    @ObfuscatedName("bh.m")
    public byte[] field1023;

    @ObfuscatedName("bh.b")
    public int field1026;

    @ObfuscatedName("bh.g")
    public int field1025;

    @ObfuscatedName("bh.h")
    public boolean field1024;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1022 = arg0;
        this.field1023 = arg1;
        this.field1026 = arg2;
        this.field1025 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1022 = arg0;
        this.field1023 = arg1;
        this.field1026 = arg2;
        this.field1025 = arg3;
        this.field1024 = arg4;
    }

    @ObfuscatedName("bh.o(Lbq;)Lbh;")
    public class56 method972(class66 arg0) {
        this.field1023 = arg0.method1110(this.field1023);
        this.field1022 = arg0.method1105(this.field1022);
        if (this.field1026 == this.field1025) {
            this.field1026 = this.field1025 = arg0.method1106(this.field1026);
        } else {
            this.field1026 = arg0.method1106(this.field1026);
            this.field1025 = arg0.method1106(this.field1025);
            if (this.field1026 == this.field1025) {
                this.field1026--;
            }
        }
        return this;
    }
}
