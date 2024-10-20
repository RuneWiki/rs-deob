package deob;

@ObfuscatedName("ba")
public class class56 extends class72 {

    @ObfuscatedName("ba.i")
    public int field1027;

    @ObfuscatedName("ba.e")
    public byte[] field1023;

    @ObfuscatedName("ba.f")
    public int field1024;

    @ObfuscatedName("ba.k")
    public int field1026;

    @ObfuscatedName("ba.g")
    public boolean field1025;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1027 = arg0;
        this.field1023 = arg1;
        this.field1024 = arg2;
        this.field1026 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1027 = arg0;
        this.field1023 = arg1;
        this.field1024 = arg2;
        this.field1026 = arg3;
        this.field1025 = arg4;
    }

    @ObfuscatedName("ba.i(Lbn;)Lba;")
    public class56 method972(class66 arg0) {
        this.field1023 = arg0.method1113(this.field1023);
        this.field1027 = arg0.method1108(this.field1027);
        if (this.field1026 == this.field1024) {
            this.field1024 = this.field1026 = arg0.method1109(this.field1024);
        } else {
            this.field1024 = arg0.method1109(this.field1024);
            this.field1026 = arg0.method1109(this.field1026);
            if (this.field1026 == this.field1024) {
                this.field1024--;
            }
        }
        return this;
    }
}
