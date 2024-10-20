package deob;

@ObfuscatedName("bw")
public class class56 extends class59 {

    @ObfuscatedName("bw.k")
    public int field1130;

    @ObfuscatedName("bw.r")
    public byte[] field1131;

    @ObfuscatedName("bw.y")
    public int field1132;

    @ObfuscatedName("bw.w")
    public int field1129;

    @ObfuscatedName("bw.m")
    public boolean field1133;

    public class56(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1130 = arg0;
        this.field1131 = arg1;
        this.field1132 = arg2;
        this.field1129 = arg3;
    }

    public class56(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1130 = arg0;
        this.field1131 = arg1;
        this.field1132 = arg2;
        this.field1129 = arg3;
        this.field1133 = arg4;
    }

    @ObfuscatedName("bw.k(Lbl;)Lbw;")
    public class56 method1089(class68 arg0) {
        this.field1131 = arg0.method1354(this.field1131);
        this.field1130 = arg0.method1357(this.field1130);
        if (this.field1132 == this.field1129) {
            this.field1132 = this.field1129 = arg0.method1356(this.field1132);
        } else {
            this.field1132 = arg0.method1356(this.field1132);
            this.field1129 = arg0.method1356(this.field1129);
            if (this.field1132 == this.field1129) {
                this.field1132--;
            }
        }
        return this;
    }
}
