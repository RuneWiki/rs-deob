package deob;

@ObfuscatedName("ar")
public class class51 extends class69 {

    @ObfuscatedName("ar.f")
    public int field383;

    @ObfuscatedName("ar.e")
    public byte[] field380;

    @ObfuscatedName("ar.v")
    public int field382;

    @ObfuscatedName("ar.y")
    public int field384;

    @ObfuscatedName("ar.j")
    public boolean field381;

    public class51(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field383 = arg0;
        this.field380 = arg1;
        this.field382 = arg2;
        this.field384 = arg3;
    }

    public class51(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field383 = arg0;
        this.field380 = arg1;
        this.field382 = arg2;
        this.field384 = arg3;
        this.field381 = arg4;
    }

    @ObfuscatedName("ar.f(Lbt;)Lar;")
    public class51 method644(class66 arg0) {
        this.field380 = arg0.method935(this.field380);
        this.field383 = arg0.method932(this.field383);
        if (this.field384 == this.field382) {
            this.field382 = this.field384 = arg0.method934(this.field382);
        } else {
            this.field382 = arg0.method934(this.field382);
            this.field384 = arg0.method934(this.field384);
            if (this.field384 == this.field382) {
                this.field382--;
            }
        }
        return this;
    }
}
