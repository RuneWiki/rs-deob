package deob;

@ObfuscatedName("bm")
public class class62 extends class46 {

    @ObfuscatedName("bm.j")
    public int field1215;

    @ObfuscatedName("bm.f")
    public byte[] field1214;

    @ObfuscatedName("bm.y")
    public int field1213;

    @ObfuscatedName("bm.x")
    public int field1216;

    @ObfuscatedName("bm.e")
    public boolean field1217;

    public class62(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1215 = arg0;
        this.field1214 = arg1;
        this.field1213 = arg2;
        this.field1216 = arg3;
    }

    public class62(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1215 = arg0;
        this.field1214 = arg1;
        this.field1213 = arg2;
        this.field1216 = arg3;
        this.field1217 = arg4;
    }

    @ObfuscatedName("bm.c(Lbr;)Lbm;")
    public class62 method1278(class61 arg0) {
        this.field1214 = arg0.method1266(this.field1214);
        this.field1215 = arg0.method1276(this.field1215);
        if (this.field1216 == this.field1213) {
            this.field1213 = this.field1216 = arg0.method1268(this.field1213);
        } else {
            this.field1213 = arg0.method1268(this.field1213);
            this.field1216 = arg0.method1268(this.field1216);
            if (this.field1216 == this.field1213) {
                this.field1213--;
            }
        }
        return this;
    }
}
