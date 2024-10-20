package deob;

@ObfuscatedName("bb")
public class class58 extends class61 {

    @ObfuscatedName("bb.n")
    public int field1165;

    @ObfuscatedName("bb.w")
    public byte[] field1162;

    @ObfuscatedName("bb.i")
    public int field1163;

    @ObfuscatedName("bb.e")
    public int field1164;

    @ObfuscatedName("bb.h")
    public boolean field1161;

    public class58(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1165 = arg0;
        this.field1162 = arg1;
        this.field1163 = arg2;
        this.field1164 = arg3;
    }

    public class58(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1165 = arg0;
        this.field1162 = arg1;
        this.field1163 = arg2;
        this.field1164 = arg3;
        this.field1161 = arg4;
    }

    @ObfuscatedName("bb.n(Lbo;)Lbb;")
    public class58 method1117(class70 arg0) {
        this.field1162 = arg0.method1354(this.field1162);
        this.field1165 = arg0.method1355(this.field1165);
        if (this.field1164 == this.field1163) {
            this.field1163 = this.field1164 = arg0.method1364(this.field1163);
        } else {
            this.field1163 = arg0.method1364(this.field1163);
            this.field1164 = arg0.method1364(this.field1164);
            if (this.field1164 == this.field1163) {
                this.field1163--;
            }
        }
        return this;
    }
}
