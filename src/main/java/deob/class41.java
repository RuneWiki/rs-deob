package deob;

@ObfuscatedName("bg")
public class class41 extends class63 {

    @ObfuscatedName("bg.ac")
    public int field249;

    @ObfuscatedName("bg.ae")
    public byte[] field248;

    @ObfuscatedName("bg.ag")
    public int field250;

    @ObfuscatedName("bg.am")
    public int field247;

    @ObfuscatedName("bg.ax")
    public boolean field251;

    public class41(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field249 = arg0;
        this.field248 = arg1;
        this.field250 = arg2;
        this.field247 = arg3;
    }

    public class41(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field249 = arg0;
        this.field248 = arg1;
        this.field250 = arg2;
        this.field247 = arg3;
        this.field251 = arg4;
    }

    @ObfuscatedName("bg.ac(Lcj;)Lbg;")
    public class41 method762(class58 arg0) {
        this.field248 = arg0.method1083(this.field248);
        this.field249 = arg0.method1086(this.field249);
        if (this.field250 == this.field247) {
            this.field250 = this.field247 = arg0.method1076(this.field250);
        } else {
            this.field250 = arg0.method1076(this.field250);
            this.field247 = arg0.method1076(this.field247);
            if (this.field250 == this.field247) {
                this.field250--;
            }
        }
        return this;
    }
}
