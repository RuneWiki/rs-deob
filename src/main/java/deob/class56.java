package deob;

@ObfuscatedName("bi")
public class class56 extends class72 {

    @ObfuscatedName("bi.x")
    public int field1036;

    @ObfuscatedName("bi.n")
    public byte[] field1035;

    @ObfuscatedName("bi.g")
    public int field1037;

    @ObfuscatedName("bi.v")
    public int field1034;

    @ObfuscatedName("bi.y")
    public boolean field1038;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1036 = arg0;
        this.field1035 = arg1;
        this.field1037 = arg2;
        this.field1034 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1036 = arg0;
        this.field1035 = arg1;
        this.field1037 = arg2;
        this.field1034 = arg3;
        this.field1038 = arg4;
    }

    @ObfuscatedName("bi.x(Lbm;)Lbi;")
    public class56 method1075(class66 arg0) {
        this.field1035 = arg0.method1207(this.field1035);
        this.field1036 = arg0.method1202(this.field1036);
        if (this.field1037 == this.field1034) {
            this.field1037 = this.field1034 = arg0.method1204(this.field1037);
        } else {
            this.field1037 = arg0.method1204(this.field1037);
            this.field1034 = arg0.method1204(this.field1034);
            if (this.field1037 == this.field1034) {
                this.field1037--;
            }
        }
        return this;
    }
}
