package deob;

@ObfuscatedName("bl")
public class class63 extends class47 {

    @ObfuscatedName("bl.b")
    public int field1231;

    @ObfuscatedName("bl.o")
    public byte[] field1228;

    @ObfuscatedName("bl.w")
    public int field1230;

    @ObfuscatedName("bl.r")
    public int field1232;

    @ObfuscatedName("bl.k")
    public boolean field1229;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1231 = arg0;
        this.field1228 = arg1;
        this.field1230 = arg2;
        this.field1232 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1231 = arg0;
        this.field1228 = arg1;
        this.field1230 = arg2;
        this.field1232 = arg3;
        this.field1229 = arg4;
    }

    @ObfuscatedName("bl.l(Lbe;)Lbl;")
    public class63 method1337(class62 arg0) {
        this.field1228 = arg0.method1325(this.field1228);
        this.field1231 = arg0.method1326(this.field1231);
        if (this.field1232 == this.field1230) {
            this.field1230 = this.field1232 = arg0.method1322(this.field1230);
        } else {
            this.field1230 = arg0.method1322(this.field1230);
            this.field1232 = arg0.method1322(this.field1232);
            if (this.field1232 == this.field1230) {
                this.field1230--;
            }
        }
        return this;
    }
}
