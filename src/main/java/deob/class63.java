package deob;

@ObfuscatedName("bl")
public class class63 extends class47 {

    @ObfuscatedName("bl.c")
    public int field1253;

    @ObfuscatedName("bl.j")
    public byte[] field1250;

    @ObfuscatedName("bl.i")
    public int field1249;

    @ObfuscatedName("bl.k")
    public int field1252;

    @ObfuscatedName("bl.q")
    public boolean field1251;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1253 = arg0;
        this.field1250 = arg1;
        this.field1249 = arg2;
        this.field1252 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1253 = arg0;
        this.field1250 = arg1;
        this.field1249 = arg2;
        this.field1252 = arg3;
        this.field1251 = arg4;
    }

    @ObfuscatedName("bl.b(Lbb;)Lbl;")
    public class63 method1302(class62 arg0) {
        this.field1250 = arg0.method1293(this.field1250);
        this.field1253 = arg0.method1292(this.field1253);
        if (this.field1252 == this.field1249) {
            this.field1249 = this.field1252 = arg0.method1295(this.field1249);
        } else {
            this.field1249 = arg0.method1295(this.field1249);
            this.field1252 = arg0.method1295(this.field1252);
            if (this.field1252 == this.field1249) {
                this.field1249--;
            }
        }
        return this;
    }
}
