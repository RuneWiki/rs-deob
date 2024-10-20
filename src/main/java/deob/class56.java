package deob;

@ObfuscatedName("bt")
public class class56 extends class72 {

    @ObfuscatedName("bt.x")
    public int field1038;

    @ObfuscatedName("bt.j")
    public byte[] field1036;

    @ObfuscatedName("bt.c")
    public int field1034;

    @ObfuscatedName("bt.d")
    public int field1037;

    @ObfuscatedName("bt.w")
    public boolean field1035;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1038 = arg0;
        this.field1036 = arg1;
        this.field1034 = arg2;
        this.field1037 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1038 = arg0;
        this.field1036 = arg1;
        this.field1034 = arg2;
        this.field1037 = arg3;
        this.field1035 = arg4;
    }

    @ObfuscatedName("bt.x(Lbw;)Lbt;")
    public class56 method1065(class66 arg0) {
        this.field1036 = arg0.method1189(this.field1036);
        this.field1038 = arg0.method1190(this.field1038);
        if (this.field1037 == this.field1034) {
            this.field1034 = this.field1037 = arg0.method1193(this.field1034);
        } else {
            this.field1034 = arg0.method1193(this.field1034);
            this.field1037 = arg0.method1193(this.field1037);
            if (this.field1037 == this.field1034) {
                this.field1034--;
            }
        }
        return this;
    }
}
