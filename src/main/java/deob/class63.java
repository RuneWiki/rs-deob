package deob;

@ObfuscatedName("bc")
public class class63 extends class66 {

    @ObfuscatedName("bc.j")
    public int field1215;

    @ObfuscatedName("bc.h")
    public byte[] field1214;

    @ObfuscatedName("bc.m")
    public int field1216;

    @ObfuscatedName("bc.z")
    public int field1217;

    @ObfuscatedName("bc.x")
    public boolean field1218;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1215 = arg0;
        this.field1214 = arg1;
        this.field1216 = arg2;
        this.field1217 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1215 = arg0;
        this.field1214 = arg1;
        this.field1216 = arg2;
        this.field1217 = arg3;
        this.field1218 = arg4;
    }

    @ObfuscatedName("bc.j(Lbu;)Lbc;")
    public class63 method1241(class75 arg0) {
        this.field1214 = arg0.method1499(this.field1214);
        this.field1215 = arg0.method1494(this.field1215);
        if (this.field1217 == this.field1216) {
            this.field1216 = this.field1217 = arg0.method1495(this.field1216);
        } else {
            this.field1216 = arg0.method1495(this.field1216);
            this.field1217 = arg0.method1495(this.field1217);
            if (this.field1217 == this.field1216) {
                this.field1216--;
            }
        }
        return this;
    }
}
