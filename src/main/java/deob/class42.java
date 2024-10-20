package deob;

@ObfuscatedName("am")
public class class42 extends class60 {

    @ObfuscatedName("am.a")
    public int field281;

    @ObfuscatedName("am.f")
    public byte[] field282;

    @ObfuscatedName("am.c")
    public int field283;

    @ObfuscatedName("am.x")
    public int field284;

    @ObfuscatedName("am.h")
    public boolean field285;

    public class42(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field281 = arg0;
        this.field282 = arg1;
        this.field283 = arg2;
        this.field284 = arg3;
    }

    public class42(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field281 = arg0;
        this.field282 = arg1;
        this.field283 = arg2;
        this.field284 = arg3;
        this.field285 = arg4;
    }

    @ObfuscatedName("am.a(Lbl;)Lam;")
    public class42 method757(class57 arg0) {
        this.field282 = arg0.method1040(this.field282);
        this.field281 = arg0.method1042(this.field281);
        if (this.field284 == this.field283) {
            this.field283 = this.field284 = arg0.method1044(this.field283);
        } else {
            this.field283 = arg0.method1044(this.field283);
            this.field284 = arg0.method1044(this.field284);
            if (this.field284 == this.field283) {
                this.field283--;
            }
        }
        return this;
    }
}
