package deob;

@ObfuscatedName("bw")
public class class53 extends class56 {

    @ObfuscatedName("bw.m")
    public int field1103;

    @ObfuscatedName("bw.k")
    public byte[] field1102;

    @ObfuscatedName("bw.y")
    public int field1105;

    @ObfuscatedName("bw.g")
    public int field1104;

    @ObfuscatedName("bw.r")
    public boolean field1101;

    public class53(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1103 = arg0;
        this.field1102 = arg1;
        this.field1105 = arg2;
        this.field1104 = arg3;
    }

    public class53(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1103 = arg0;
        this.field1102 = arg1;
        this.field1105 = arg2;
        this.field1104 = arg3;
        this.field1101 = arg4;
    }

    @ObfuscatedName("bw.m(Lbe;)Lbw;")
    public class53 method1063(class65 arg0) {
        this.field1102 = arg0.method1308(this.field1102);
        this.field1103 = arg0.method1314(this.field1103);
        if (this.field1105 == this.field1104) {
            this.field1105 = this.field1104 = arg0.method1310(this.field1105);
        } else {
            this.field1105 = arg0.method1310(this.field1105);
            this.field1104 = arg0.method1310(this.field1104);
            if (this.field1105 == this.field1104) {
                this.field1105--;
            }
        }
        return this;
    }
}
