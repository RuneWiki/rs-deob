package deob;

@ObfuscatedName("br")
public class class56 extends class72 {

    @ObfuscatedName("br.p")
    public int field1026;

    @ObfuscatedName("br.g")
    public byte[] field1025;

    @ObfuscatedName("br.x")
    public int field1024;

    @ObfuscatedName("br.q")
    public int field1027;

    @ObfuscatedName("br.d")
    public boolean field1028;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1026 = arg0;
        this.field1025 = arg1;
        this.field1024 = arg2;
        this.field1027 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1026 = arg0;
        this.field1025 = arg1;
        this.field1024 = arg2;
        this.field1027 = arg3;
        this.field1028 = arg4;
    }

    @ObfuscatedName("br.p(Lba;)Lbr;")
    public class56 method967(class66 arg0) {
        this.field1025 = arg0.method1093(this.field1025);
        this.field1026 = arg0.method1092(this.field1026);
        if (this.field1027 == this.field1024) {
            this.field1024 = this.field1027 = arg0.method1097(this.field1024);
        } else {
            this.field1024 = arg0.method1097(this.field1024);
            this.field1027 = arg0.method1097(this.field1027);
            if (this.field1027 == this.field1024) {
                this.field1024--;
            }
        }
        return this;
    }
}
