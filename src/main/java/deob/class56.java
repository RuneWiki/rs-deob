package deob;

@ObfuscatedName("bq")
public class class56 extends class59 {

    @ObfuscatedName("bq.g")
    public int field1132;

    @ObfuscatedName("bq.i")
    public byte[] field1131;

    @ObfuscatedName("bq.k")
    public int field1130;

    @ObfuscatedName("bq.e")
    public int field1133;

    @ObfuscatedName("bq.w")
    public boolean field1134;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1132 = arg0;
        this.field1131 = arg1;
        this.field1130 = arg2;
        this.field1133 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1132 = arg0;
        this.field1131 = arg1;
        this.field1130 = arg2;
        this.field1133 = arg3;
        this.field1134 = arg4;
    }

    @ObfuscatedName("bq.g(Lbv;)Lbq;")
    public class56 method1055(class68 arg0) {
        this.field1131 = arg0.method1308(this.field1131);
        this.field1132 = arg0.method1296(this.field1132);
        if (this.field1133 == this.field1130) {
            this.field1130 = this.field1133 = arg0.method1306(this.field1130);
        } else {
            this.field1130 = arg0.method1306(this.field1130);
            this.field1133 = arg0.method1306(this.field1133);
            if (this.field1133 == this.field1130) {
                this.field1130--;
            }
        }
        return this;
    }
}
