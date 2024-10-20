package deob;

@ObfuscatedName("br")
public class class57 extends class60 {

    @ObfuscatedName("br.e")
    public int field1154;

    @ObfuscatedName("br.v")
    public byte[] field1153;

    @ObfuscatedName("br.k")
    public int field1155;

    @ObfuscatedName("br.g")
    public int field1156;

    @ObfuscatedName("br.q")
    public boolean field1157;

    public class57(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1154 = arg0;
        this.field1153 = arg1;
        this.field1155 = arg2;
        this.field1156 = arg3;
    }

    public class57(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1154 = arg0;
        this.field1153 = arg1;
        this.field1155 = arg2;
        this.field1156 = arg3;
        this.field1157 = arg4;
    }

    @ObfuscatedName("br.e(Lbh;)Lbr;")
    public class57 method1089(class69 arg0) {
        this.field1153 = arg0.method1346(this.field1153);
        this.field1154 = arg0.method1347(this.field1154);
        if (this.field1156 == this.field1155) {
            this.field1155 = this.field1156 = arg0.method1348(this.field1155);
        } else {
            this.field1155 = arg0.method1348(this.field1155);
            this.field1156 = arg0.method1348(this.field1156);
            if (this.field1156 == this.field1155) {
                this.field1155--;
            }
        }
        return this;
    }
}
