package deob;

@ObfuscatedName("bo")
public class class56 extends class72 {

    @ObfuscatedName("bo.b")
    public int field1032;

    @ObfuscatedName("bo.e")
    public byte[] field1030;

    @ObfuscatedName("bo.c")
    public int field1031;

    @ObfuscatedName("bo.l")
    public int field1029;

    @ObfuscatedName("bo.y")
    public boolean field1033;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1032 = arg0;
        this.field1030 = arg1;
        this.field1031 = arg2;
        this.field1029 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1032 = arg0;
        this.field1030 = arg1;
        this.field1031 = arg2;
        this.field1029 = arg3;
        this.field1033 = arg4;
    }

    @ObfuscatedName("bo.b(Lbp;)Lbo;")
    public class56 method1010(class66 arg0) {
        this.field1030 = arg0.method1159(this.field1030);
        this.field1032 = arg0.method1160(this.field1032);
        if (this.field1031 == this.field1029) {
            this.field1031 = this.field1029 = arg0.method1161(this.field1031);
        } else {
            this.field1031 = arg0.method1161(this.field1031);
            this.field1029 = arg0.method1161(this.field1029);
            if (this.field1031 == this.field1029) {
                this.field1031--;
            }
        }
        return this;
    }
}
