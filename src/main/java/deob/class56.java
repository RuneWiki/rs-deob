package deob;

@ObfuscatedName("bh")
public class class56 extends class59 {

    @ObfuscatedName("bh.y")
    public int field1115;

    @ObfuscatedName("bh.u")
    public byte[] field1116;

    @ObfuscatedName("bh.k")
    public int field1117;

    @ObfuscatedName("bh.v")
    public int field1118;

    @ObfuscatedName("bh.l")
    public boolean field1119;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1115 = arg0;
        this.field1116 = arg1;
        this.field1117 = arg2;
        this.field1118 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1115 = arg0;
        this.field1116 = arg1;
        this.field1117 = arg2;
        this.field1118 = arg3;
        this.field1119 = arg4;
    }

    @ObfuscatedName("bh.y(Lbo;)Lbh;")
    public class56 method1063(class68 arg0) {
        this.field1116 = arg0.method1329(this.field1116);
        this.field1115 = arg0.method1322(this.field1115);
        if (this.field1118 == this.field1117) {
            this.field1117 = this.field1118 = arg0.method1325(this.field1117);
        } else {
            this.field1117 = arg0.method1325(this.field1117);
            this.field1118 = arg0.method1325(this.field1118);
            if (this.field1118 == this.field1117) {
                this.field1117--;
            }
        }
        return this;
    }
}
