package deob;

@ObfuscatedName("bu")
public class class58 extends class61 {

    @ObfuscatedName("bu.n")
    public int field1184;

    @ObfuscatedName("bu.o")
    public byte[] field1181;

    @ObfuscatedName("bu.a")
    public int field1182;

    @ObfuscatedName("bu.w")
    public int field1183;

    @ObfuscatedName("bu.m")
    public boolean field1180;

    public class58(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1184 = arg0;
        this.field1181 = arg1;
        this.field1182 = arg2;
        this.field1183 = arg3;
    }

    public class58(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1184 = arg0;
        this.field1181 = arg1;
        this.field1182 = arg2;
        this.field1183 = arg3;
        this.field1180 = arg4;
    }

    @ObfuscatedName("bu.n(Lbi;)Lbu;")
    public class58 method1158(class70 arg0) {
        this.field1181 = arg0.method1417(this.field1181);
        this.field1184 = arg0.method1419(this.field1184);
        if (this.field1183 == this.field1182) {
            this.field1182 = this.field1183 = arg0.method1420(this.field1182);
        } else {
            this.field1182 = arg0.method1420(this.field1182);
            this.field1183 = arg0.method1420(this.field1183);
            if (this.field1183 == this.field1182) {
                this.field1182--;
            }
        }
        return this;
    }
}
