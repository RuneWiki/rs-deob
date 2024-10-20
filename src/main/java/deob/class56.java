package deob;

@ObfuscatedName("bl")
public class class56 extends class72 {

    @ObfuscatedName("bl.k")
    public int field1025;

    @ObfuscatedName("bl.y")
    public byte[] field1024;

    @ObfuscatedName("bl.o")
    public int field1026;

    @ObfuscatedName("bl.r")
    public int field1027;

    @ObfuscatedName("bl.w")
    public boolean field1028;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1025 = arg0;
        this.field1024 = arg1;
        this.field1026 = arg2;
        this.field1027 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1025 = arg0;
        this.field1024 = arg1;
        this.field1026 = arg2;
        this.field1027 = arg3;
        this.field1028 = arg4;
    }

    @ObfuscatedName("bl.k(Lbe;)Lbl;")
    public class56 method999(class66 arg0) {
        this.field1024 = arg0.method1136(this.field1024);
        this.field1025 = arg0.method1132(this.field1025);
        if (this.field1027 == this.field1026) {
            this.field1026 = this.field1027 = arg0.method1133(this.field1026);
        } else {
            this.field1026 = arg0.method1133(this.field1026);
            this.field1027 = arg0.method1133(this.field1027);
            if (this.field1027 == this.field1026) {
                this.field1026--;
            }
        }
        return this;
    }
}
