package deob;

@ObfuscatedName("ah")
public class class51 extends class69 {

    @ObfuscatedName("ah.f")
    public int field374;

    @ObfuscatedName("ah.o")
    public byte[] field370;

    @ObfuscatedName("ah.u")
    public int field372;

    @ObfuscatedName("ah.p")
    public int field373;

    @ObfuscatedName("ah.b")
    public boolean field371;

    public class51(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field374 = arg0;
        this.field370 = arg1;
        this.field372 = arg2;
        this.field373 = arg3;
    }

    public class51(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field374 = arg0;
        this.field370 = arg1;
        this.field372 = arg2;
        this.field373 = arg3;
        this.field371 = arg4;
    }

    @ObfuscatedName("ah.f(Lby;)Lah;")
    public class51 method606(class66 arg0) {
        this.field370 = arg0.method891(this.field370);
        this.field374 = arg0.method878(this.field374);
        if (this.field373 == this.field372) {
            this.field372 = this.field373 = arg0.method890(this.field372);
        } else {
            this.field372 = arg0.method890(this.field372);
            this.field373 = arg0.method890(this.field373);
            if (this.field373 == this.field372) {
                this.field372--;
            }
        }
        return this;
    }
}
