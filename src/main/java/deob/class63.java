package deob;

@ObfuscatedName("bl")
public class class63 extends class66 {

    @ObfuscatedName("bl.h")
    public int field1239;

    @ObfuscatedName("bl.q")
    public byte[] field1237;

    @ObfuscatedName("bl.v")
    public int field1236;

    @ObfuscatedName("bl.n")
    public int field1238;

    @ObfuscatedName("bl.f")
    public boolean field1240;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1239 = arg0;
        this.field1237 = arg1;
        this.field1236 = arg2;
        this.field1238 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1239 = arg0;
        this.field1237 = arg1;
        this.field1236 = arg2;
        this.field1238 = arg3;
        this.field1240 = arg4;
    }

    @ObfuscatedName("bl.h(Lbw;)Lbl;")
    public class63 method1261(class75 arg0) {
        this.field1237 = arg0.method1505(this.field1237);
        this.field1239 = arg0.method1514(this.field1239);
        if (this.field1238 == this.field1236) {
            this.field1236 = this.field1238 = arg0.method1507(this.field1236);
        } else {
            this.field1236 = arg0.method1507(this.field1236);
            this.field1238 = arg0.method1507(this.field1238);
            if (this.field1238 == this.field1236) {
                this.field1236--;
            }
        }
        return this;
    }
}
