package deob;

@ObfuscatedName("bo")
public class class56 extends class72 {

    @ObfuscatedName("bo.d")
    public int field1012;

    @ObfuscatedName("bo.c")
    public byte[] field1013;

    @ObfuscatedName("bo.n")
    public int field1015;

    @ObfuscatedName("bo.q")
    public int field1014;

    @ObfuscatedName("bo.t")
    public boolean field1016;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1012 = arg0;
        this.field1013 = arg1;
        this.field1015 = arg2;
        this.field1014 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1012 = arg0;
        this.field1013 = arg1;
        this.field1015 = arg2;
        this.field1014 = arg3;
        this.field1016 = arg4;
    }

    @ObfuscatedName("bo.d(Lbb;)Lbo;")
    public class56 method1008(class66 arg0) {
        this.field1013 = arg0.method1140(this.field1013);
        this.field1012 = arg0.method1141(this.field1012);
        if (this.field1015 == this.field1014) {
            this.field1015 = this.field1014 = arg0.method1142(this.field1015);
        } else {
            this.field1015 = arg0.method1142(this.field1015);
            this.field1014 = arg0.method1142(this.field1014);
            if (this.field1015 == this.field1014) {
                this.field1015--;
            }
        }
        return this;
    }
}
