package deob;

@ObfuscatedName("bx")
public class class63 extends class47 {

    @ObfuscatedName("bx.l")
    public int field1236;

    @ObfuscatedName("bx.d")
    public byte[] field1235;

    @ObfuscatedName("bx.x")
    public int field1237;

    @ObfuscatedName("bx.o")
    public int field1238;

    @ObfuscatedName("bx.a")
    public boolean field1239;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1236 = arg0;
        this.field1235 = arg1;
        this.field1237 = arg2;
        this.field1238 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1236 = arg0;
        this.field1235 = arg1;
        this.field1237 = arg2;
        this.field1238 = arg3;
        this.field1239 = arg4;
    }

    @ObfuscatedName("bx.p(Lbw;)Lbx;")
    public class63 method1371(class62 arg0) {
        this.field1235 = arg0.method1359(this.field1235);
        this.field1236 = arg0.method1360(this.field1236);
        if (this.field1238 == this.field1237) {
            this.field1237 = this.field1238 = arg0.method1361(this.field1237);
        } else {
            this.field1237 = arg0.method1361(this.field1237);
            this.field1238 = arg0.method1361(this.field1238);
            if (this.field1238 == this.field1237) {
                this.field1237--;
            }
        }
        return this;
    }
}
