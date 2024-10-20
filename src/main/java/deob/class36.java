package deob;

@ObfuscatedName("aa")
public class class36 extends class54 {

    @ObfuscatedName("aa.l")
    public int field248;

    @ObfuscatedName("aa.q")
    public byte[] field246;

    @ObfuscatedName("aa.f")
    public int field247;

    @ObfuscatedName("aa.j")
    public int field249;

    @ObfuscatedName("aa.m")
    public boolean field250;

    public class36(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field248 = arg0;
        this.field246 = arg1;
        this.field247 = arg2;
        this.field249 = arg3;
    }

    public class36(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field248 = arg0;
        this.field246 = arg1;
        this.field247 = arg2;
        this.field249 = arg3;
        this.field250 = arg4;
    }

    @ObfuscatedName("aa.l(Lai;)Laa;")
    public class36 method657(class51 arg0) {
        this.field246 = arg0.method962(this.field246);
        this.field248 = arg0.method955(this.field248);
        if (this.field249 == this.field247) {
            this.field247 = this.field249 = arg0.method956(this.field247);
        } else {
            this.field247 = arg0.method956(this.field247);
            this.field249 = arg0.method956(this.field249);
            if (this.field249 == this.field247) {
                this.field247--;
            }
        }
        return this;
    }
}
