package deob;

@ObfuscatedName("bn")
public class class57 extends class60 {

    @ObfuscatedName("bn.x")
    public int field1146;

    @ObfuscatedName("bn.v")
    public byte[] field1145;

    @ObfuscatedName("bn.m")
    public int field1148;

    @ObfuscatedName("bn.e")
    public int field1147;

    @ObfuscatedName("bn.h")
    public boolean field1144;

    public class57(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1146 = arg0;
        this.field1145 = arg1;
        this.field1148 = arg2;
        this.field1147 = arg3;
    }

    public class57(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1146 = arg0;
        this.field1145 = arg1;
        this.field1148 = arg2;
        this.field1147 = arg3;
        this.field1144 = arg4;
    }

    @ObfuscatedName("bn.x(Lbr;)Lbn;")
    public class57 method1110(class69 arg0) {
        this.field1145 = arg0.method1363(this.field1145);
        this.field1146 = arg0.method1350(this.field1146);
        if (this.field1148 == this.field1147) {
            this.field1148 = this.field1147 = arg0.method1351(this.field1148);
        } else {
            this.field1148 = arg0.method1351(this.field1148);
            this.field1147 = arg0.method1351(this.field1147);
            if (this.field1148 == this.field1147) {
                this.field1148--;
            }
        }
        return this;
    }
}
