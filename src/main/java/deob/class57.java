package deob;

@ObfuscatedName("bu")
public class class57 extends class60 {

    @ObfuscatedName("bu.f")
    public int field1146;

    @ObfuscatedName("bu.k")
    public byte[] field1147;

    @ObfuscatedName("bu.y")
    public int field1148;

    @ObfuscatedName("bu.e")
    public int field1149;

    @ObfuscatedName("bu.r")
    public boolean field1150;

    public class57(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1146 = arg0;
        this.field1147 = arg1;
        this.field1148 = arg2;
        this.field1149 = arg3;
    }

    public class57(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1146 = arg0;
        this.field1147 = arg1;
        this.field1148 = arg2;
        this.field1149 = arg3;
        this.field1150 = arg4;
    }

    @ObfuscatedName("bu.f(Lbl;)Lbu;")
    public class57 method1110(class69 arg0) {
        this.field1147 = arg0.method1371(this.field1147);
        this.field1146 = arg0.method1385(this.field1146);
        if (this.field1149 == this.field1148) {
            this.field1148 = this.field1149 = arg0.method1375(this.field1148);
        } else {
            this.field1148 = arg0.method1375(this.field1148);
            this.field1149 = arg0.method1375(this.field1149);
            if (this.field1149 == this.field1148) {
                this.field1148--;
            }
        }
        return this;
    }
}
