package deob;

@ObfuscatedName("be")
public class class58 extends class61 {

    @ObfuscatedName("be.e")
    public int field1110;

    @ObfuscatedName("be.a")
    public byte[] field1111;

    @ObfuscatedName("be.l")
    public int field1112;

    @ObfuscatedName("be.c")
    public int field1113;

    @ObfuscatedName("be.u")
    public boolean field1114;

    public class58(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1110 = arg0;
        this.field1111 = arg1;
        this.field1112 = arg2;
        this.field1113 = arg3;
    }

    public class58(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1110 = arg0;
        this.field1111 = arg1;
        this.field1112 = arg2;
        this.field1113 = arg3;
        this.field1114 = arg4;
    }

    @ObfuscatedName("be.e(Lbn;)Lbe;")
    public class58 method1128(class70 arg0) {
        this.field1111 = arg0.method1380(this.field1111);
        this.field1110 = arg0.method1381(this.field1110);
        if (this.field1113 == this.field1112) {
            this.field1112 = this.field1113 = arg0.method1382(this.field1112);
        } else {
            this.field1112 = arg0.method1382(this.field1112);
            this.field1113 = arg0.method1382(this.field1113);
            if (this.field1113 == this.field1112) {
                this.field1112--;
            }
        }
        return this;
    }
}
