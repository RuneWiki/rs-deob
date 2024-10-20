package deob;

@ObfuscatedName("eg")
public class class146 extends class129 {

    @ObfuscatedName("eg.c")
    public int field2203;

    @ObfuscatedName("eg.h")
    public byte[] field2200;

    @ObfuscatedName("eg.r")
    public int field2201;

    @ObfuscatedName("eg.d")
    public int field2202;

    @ObfuscatedName("eg.k")
    public boolean field2199;

    public class146(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field2203 = arg0;
        this.field2200 = arg1;
        this.field2201 = arg2;
        this.field2202 = arg3;
    }

    public class146(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field2203 = arg0;
        this.field2200 = arg1;
        this.field2201 = arg2;
        this.field2202 = arg3;
        this.field2199 = arg4;
    }

    @ObfuscatedName("eg.r(Lm;)Leg;")
    public class146 method2051(class26 arg0) {
        this.field2200 = arg0.method297(this.field2200);
        this.field2203 = arg0.method301(this.field2203);
        if (this.field2202 == this.field2201) {
            this.field2201 = this.field2202 = arg0.method299(this.field2201);
        } else {
            this.field2201 = arg0.method299(this.field2201);
            this.field2202 = arg0.method299(this.field2202);
            if (this.field2202 == this.field2201) {
                this.field2201--;
            }
        }
        return this;
    }
}
