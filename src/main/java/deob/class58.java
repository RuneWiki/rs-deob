package deob;

@ObfuscatedName("bz")
public class class58 extends class61 {

    @ObfuscatedName("bz.o")
    public int field1158;

    @ObfuscatedName("bz.l")
    public byte[] field1155;

    @ObfuscatedName("bz.g")
    public int field1157;

    @ObfuscatedName("bz.u")
    public int field1154;

    @ObfuscatedName("bz.q")
    public boolean field1156;

    public class58(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1158 = arg0;
        this.field1155 = arg1;
        this.field1157 = arg2;
        this.field1154 = arg3;
    }

    public class58(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1158 = arg0;
        this.field1155 = arg1;
        this.field1157 = arg2;
        this.field1154 = arg3;
        this.field1156 = arg4;
    }

    @ObfuscatedName("bz.o(Lbq;)Lbz;")
    public class58 method1162(class70 arg0) {
        this.field1155 = arg0.method1387(this.field1155);
        this.field1158 = arg0.method1388(this.field1158);
        if (this.field1157 == this.field1154) {
            this.field1157 = this.field1154 = arg0.method1391(this.field1157);
        } else {
            this.field1157 = arg0.method1391(this.field1157);
            this.field1154 = arg0.method1391(this.field1154);
            if (this.field1157 == this.field1154) {
                this.field1157--;
            }
        }
        return this;
    }
}
