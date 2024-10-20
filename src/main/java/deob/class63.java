package deob;

@ObfuscatedName("bl")
public class class63 extends class66 {

    @ObfuscatedName("bl.l")
    public int field1219;

    @ObfuscatedName("bl.e")
    public byte[] field1217;

    @ObfuscatedName("bl.q")
    public int field1220;

    @ObfuscatedName("bl.o")
    public int field1218;

    @ObfuscatedName("bl.g")
    public boolean field1216;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1219 = arg0;
        this.field1217 = arg1;
        this.field1220 = arg2;
        this.field1218 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1219 = arg0;
        this.field1217 = arg1;
        this.field1220 = arg2;
        this.field1218 = arg3;
        this.field1216 = arg4;
    }

    @ObfuscatedName("bl.l(Lbo;)Lbl;")
    public class63 method1270(class75 arg0) {
        this.field1217 = arg0.method1522(this.field1217);
        this.field1219 = arg0.method1523(this.field1219);
        if (this.field1220 == this.field1218) {
            this.field1220 = this.field1218 = arg0.method1524(this.field1220);
        } else {
            this.field1220 = arg0.method1524(this.field1220);
            this.field1218 = arg0.method1524(this.field1218);
            if (this.field1220 == this.field1218) {
                this.field1220--;
            }
        }
        return this;
    }
}
