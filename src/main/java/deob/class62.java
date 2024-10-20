package deob;

@ObfuscatedName("be")
public class class62 extends class46 {

    @ObfuscatedName("be.h")
    public int field1235;

    @ObfuscatedName("be.c")
    public byte[] field1236;

    @ObfuscatedName("be.p")
    public int field1237;

    @ObfuscatedName("be.i")
    public int field1239;

    @ObfuscatedName("be.v")
    public boolean field1238;

    public class62(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1235 = arg0;
        this.field1236 = arg1;
        this.field1237 = arg2;
        this.field1239 = arg3;
    }

    public class62(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1235 = arg0;
        this.field1236 = arg1;
        this.field1237 = arg2;
        this.field1239 = arg3;
        this.field1238 = arg4;
    }

    @ObfuscatedName("be.z(Lbl;)Lbe;")
    public class62 method1308(class61 arg0) {
        this.field1236 = arg0.method1307(this.field1236);
        this.field1235 = arg0.method1296(this.field1235);
        if (this.field1239 == this.field1237) {
            this.field1237 = this.field1239 = arg0.method1306(this.field1237);
        } else {
            this.field1237 = arg0.method1306(this.field1237);
            this.field1239 = arg0.method1306(this.field1239);
            if (this.field1239 == this.field1237) {
                this.field1237--;
            }
        }
        return this;
    }
}
