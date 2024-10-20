package deob;

@ObfuscatedName("bl")
public class class56 extends class72 {

    @ObfuscatedName("bl.b")
    public int field1012;

    @ObfuscatedName("bl.l")
    public byte[] field1010;

    @ObfuscatedName("bl.i")
    public int field1011;

    @ObfuscatedName("bl.t")
    public int field1009;

    @ObfuscatedName("bl.k")
    public boolean field1013;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1012 = arg0;
        this.field1010 = arg1;
        this.field1011 = arg2;
        this.field1009 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1012 = arg0;
        this.field1010 = arg1;
        this.field1011 = arg2;
        this.field1009 = arg3;
        this.field1013 = arg4;
    }

    @ObfuscatedName("bl.b(Lbb;)Lbl;")
    public class56 method1058(class66 arg0) {
        this.field1010 = arg0.method1178(this.field1010);
        this.field1012 = arg0.method1179(this.field1012);
        if (this.field1011 == this.field1009) {
            this.field1011 = this.field1009 = arg0.method1185(this.field1011);
        } else {
            this.field1011 = arg0.method1185(this.field1011);
            this.field1009 = arg0.method1185(this.field1009);
            if (this.field1011 == this.field1009) {
                this.field1011--;
            }
        }
        return this;
    }
}
