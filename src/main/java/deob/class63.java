package deob;

@ObfuscatedName("be")
public class class63 extends class66 {

    @ObfuscatedName("be.n")
    public int field1221;

    @ObfuscatedName("be.d")
    public byte[] field1217;

    @ObfuscatedName("be.s")
    public int field1218;

    @ObfuscatedName("be.q")
    public int field1220;

    @ObfuscatedName("be.j")
    public boolean field1219;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1221 = arg0;
        this.field1217 = arg1;
        this.field1218 = arg2;
        this.field1220 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1221 = arg0;
        this.field1217 = arg1;
        this.field1218 = arg2;
        this.field1220 = arg3;
        this.field1219 = arg4;
    }

    @ObfuscatedName("be.n(Lbk;)Lbe;")
    public class63 method1216(class75 arg0) {
        this.field1217 = arg0.method1464(this.field1217);
        this.field1221 = arg0.method1465(this.field1221);
        if (this.field1220 == this.field1218) {
            this.field1218 = this.field1220 = arg0.method1466(this.field1218);
        } else {
            this.field1218 = arg0.method1466(this.field1218);
            this.field1220 = arg0.method1466(this.field1220);
            if (this.field1220 == this.field1218) {
                this.field1218--;
            }
        }
        return this;
    }
}
