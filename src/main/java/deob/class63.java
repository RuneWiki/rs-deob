package deob;

@ObfuscatedName("bx")
public class class63 extends class47 {

    @ObfuscatedName("bx.r")
    public int field1235;

    @ObfuscatedName("bx.v")
    public byte[] field1234;

    @ObfuscatedName("bx.p")
    public int field1236;

    @ObfuscatedName("bx.e")
    public int field1237;

    @ObfuscatedName("bx.d")
    public boolean field1238;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1235 = arg0;
        this.field1234 = arg1;
        this.field1236 = arg2;
        this.field1237 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1235 = arg0;
        this.field1234 = arg1;
        this.field1236 = arg2;
        this.field1237 = arg3;
        this.field1238 = arg4;
    }

    @ObfuscatedName("bx.j(Lbl;)Lbx;")
    public class63 method1319(class62 arg0) {
        this.field1234 = arg0.method1309(this.field1234);
        this.field1235 = arg0.method1308(this.field1235);
        if (this.field1237 == this.field1236) {
            this.field1236 = this.field1237 = arg0.method1310(this.field1236);
        } else {
            this.field1236 = arg0.method1310(this.field1236);
            this.field1237 = arg0.method1310(this.field1237);
            if (this.field1237 == this.field1236) {
                this.field1236--;
            }
        }
        return this;
    }
}
