package deob;

@ObfuscatedName("bb")
public class class62 extends class46 {

    @ObfuscatedName("bb.y")
    public int field1213;

    @ObfuscatedName("bb.x")
    public byte[] field1211;

    @ObfuscatedName("bb.z")
    public int field1214;

    @ObfuscatedName("bb.c")
    public int field1212;

    @ObfuscatedName("bb.e")
    public boolean field1215;

    public class62(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1213 = arg0;
        this.field1211 = arg1;
        this.field1214 = arg2;
        this.field1212 = arg3;
    }

    public class62(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1213 = arg0;
        this.field1211 = arg1;
        this.field1214 = arg2;
        this.field1212 = arg3;
        this.field1215 = arg4;
    }

    @ObfuscatedName("bb.j(Lbg;)Lbb;")
    public class62 method1299(class61 arg0) {
        this.field1211 = arg0.method1287(this.field1211);
        this.field1213 = arg0.method1288(this.field1213);
        if (this.field1214 == this.field1212) {
            this.field1214 = this.field1212 = arg0.method1289(this.field1214);
        } else {
            this.field1214 = arg0.method1289(this.field1214);
            this.field1212 = arg0.method1289(this.field1212);
            if (this.field1214 == this.field1212) {
                this.field1214--;
            }
        }
        return this;
    }
}
