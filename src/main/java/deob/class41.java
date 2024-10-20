package deob;

@ObfuscatedName("bs")
public class class41 extends class63 {

    @ObfuscatedName("bs.ac")
    public int field278;

    @ObfuscatedName("bs.al")
    public byte[] field279;

    @ObfuscatedName("bs.ak")
    public int field277;

    @ObfuscatedName("bs.ax")
    public int field276;

    @ObfuscatedName("bs.ao")
    public boolean field280;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field278 = arg0;
        this.field279 = arg1;
        this.field277 = arg2;
        this.field276 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field278 = arg0;
        this.field279 = arg1;
        this.field277 = arg2;
        this.field276 = arg3;
        this.field280 = arg4;
    }

    @ObfuscatedName("bs.ac(Lcg;)Lbs;")
    public class41 method741(class58 arg0) {
        this.field279 = arg0.method1056(this.field279);
        this.field278 = arg0.method1057(this.field278);
        if (this.field277 == this.field276) {
            this.field277 = this.field276 = arg0.method1065(this.field277);
        } else {
            this.field277 = arg0.method1065(this.field277);
            this.field276 = arg0.method1065(this.field276);
            if (this.field277 == this.field276) {
                this.field277--;
            }
        }
        return this;
    }
}
