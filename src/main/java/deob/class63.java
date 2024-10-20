package deob;

@ObfuscatedName("be")
public class class63 extends class66 {

    @ObfuscatedName("be.j")
    public int field1222;

    @ObfuscatedName("be.m")
    public byte[] field1220;

    @ObfuscatedName("be.f")
    public int field1221;

    @ObfuscatedName("be.l")
    public int field1219;

    @ObfuscatedName("be.u")
    public boolean field1223;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1222 = arg0;
        this.field1220 = arg1;
        this.field1221 = arg2;
        this.field1219 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1222 = arg0;
        this.field1220 = arg1;
        this.field1221 = arg2;
        this.field1219 = arg3;
        this.field1223 = arg4;
    }

    @ObfuscatedName("be.j(Lby;)Lbe;")
    public class63 method1262(class75 arg0) {
        this.field1220 = arg0.method1502(this.field1220);
        this.field1222 = arg0.method1503(this.field1222);
        if (this.field1221 == this.field1219) {
            this.field1221 = this.field1219 = arg0.method1504(this.field1221);
        } else {
            this.field1221 = arg0.method1504(this.field1221);
            this.field1219 = arg0.method1504(this.field1219);
            if (this.field1221 == this.field1219) {
                this.field1221--;
            }
        }
        return this;
    }
}
