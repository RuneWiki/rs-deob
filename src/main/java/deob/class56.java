package deob;

@ObfuscatedName("bo")
public class class56 extends class59 {

    @ObfuscatedName("bo.k")
    public int field1111;

    @ObfuscatedName("bo.y")
    public byte[] field1112;

    @ObfuscatedName("bo.s")
    public int field1110;

    @ObfuscatedName("bo.g")
    public int field1109;

    @ObfuscatedName("bo.h")
    public boolean field1113;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1111 = arg0;
        this.field1112 = arg1;
        this.field1110 = arg2;
        this.field1109 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1111 = arg0;
        this.field1112 = arg1;
        this.field1110 = arg2;
        this.field1109 = arg3;
        this.field1113 = arg4;
    }

    @ObfuscatedName("bo.k(Lba;)Lbo;")
    public class56 method1084(class68 arg0) {
        this.field1112 = arg0.method1329(this.field1112);
        this.field1111 = arg0.method1323(this.field1111);
        if (this.field1110 == this.field1109) {
            this.field1110 = this.field1109 = arg0.method1327(this.field1110);
        } else {
            this.field1110 = arg0.method1327(this.field1110);
            this.field1109 = arg0.method1327(this.field1109);
            if (this.field1110 == this.field1109) {
                this.field1110--;
            }
        }
        return this;
    }
}
