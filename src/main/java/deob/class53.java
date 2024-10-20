package deob;

@ObfuscatedName("bp")
public class class53 extends class56 {

    @ObfuscatedName("bp.z")
    public int field1103;

    @ObfuscatedName("bp.n")
    public byte[] field1101;

    @ObfuscatedName("bp.u")
    public int field1105;

    @ObfuscatedName("bp.t")
    public int field1104;

    @ObfuscatedName("bp.e")
    public boolean field1102;

    public class53(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1103 = arg0;
        this.field1101 = arg1;
        this.field1105 = arg2;
        this.field1104 = arg3;
    }

    public class53(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1103 = arg0;
        this.field1101 = arg1;
        this.field1105 = arg2;
        this.field1104 = arg3;
        this.field1102 = arg4;
    }

    @ObfuscatedName("bp.z(Lbl;)Lbp;")
    public class53 method1077(class65 arg0) {
        this.field1101 = arg0.method1334(this.field1101);
        this.field1103 = arg0.method1335(this.field1103);
        if (this.field1105 == this.field1104) {
            this.field1105 = this.field1104 = arg0.method1332(this.field1105);
        } else {
            this.field1105 = arg0.method1332(this.field1105);
            this.field1104 = arg0.method1332(this.field1104);
            if (this.field1105 == this.field1104) {
                this.field1105--;
            }
        }
        return this;
    }
}
