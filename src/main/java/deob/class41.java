package deob;

@ObfuscatedName("be")
public class class41 extends class59 {

    @ObfuscatedName("be.aj")
    public int field271;

    @ObfuscatedName("be.al")
    public byte[] field268;

    @ObfuscatedName("be.ac")
    public int field269;

    @ObfuscatedName("be.ab")
    public int field267;

    @ObfuscatedName("be.an")
    public boolean field270;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field271 = arg0;
        this.field268 = arg1;
        this.field269 = arg2;
        this.field267 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field271 = arg0;
        this.field268 = arg1;
        this.field269 = arg2;
        this.field267 = arg3;
        this.field270 = arg4;
    }

    @ObfuscatedName("be.aj(Lco;)Lbe;")
    public class41 method728(class56 arg0) {
        this.field268 = arg0.method1042(this.field268);
        this.field271 = arg0.method1043(this.field271);
        if (this.field269 == this.field267) {
            this.field269 = this.field267 = arg0.method1046(this.field269);
        } else {
            this.field269 = arg0.method1046(this.field269);
            this.field267 = arg0.method1046(this.field267);
            if (this.field269 == this.field267) {
                this.field269--;
            }
        }
        return this;
    }
}
