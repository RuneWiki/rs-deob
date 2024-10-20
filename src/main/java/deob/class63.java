package deob;

@ObfuscatedName("by")
public class class63 extends class66 {

    @ObfuscatedName("by.h")
    public int field1243;

    @ObfuscatedName("by.m")
    public byte[] field1241;

    @ObfuscatedName("by.i")
    public int field1244;

    @ObfuscatedName("by.q")
    public int field1242;

    @ObfuscatedName("by.p")
    public boolean field1245;

    public class63(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1243 = arg0;
        this.field1241 = arg1;
        this.field1244 = arg2;
        this.field1242 = arg3;
    }

    public class63(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1243 = arg0;
        this.field1241 = arg1;
        this.field1244 = arg2;
        this.field1242 = arg3;
        this.field1245 = arg4;
    }

    @ObfuscatedName("by.h(Lbk;)Lby;")
    public class63 method1232(class75 arg0) {
        this.field1241 = arg0.method1486(this.field1241);
        this.field1243 = arg0.method1477(this.field1243);
        if (this.field1244 == this.field1242) {
            this.field1244 = this.field1242 = arg0.method1480(this.field1244);
        } else {
            this.field1244 = arg0.method1480(this.field1244);
            this.field1242 = arg0.method1480(this.field1242);
            if (this.field1244 == this.field1242) {
                this.field1244--;
            }
        }
        return this;
    }
}
