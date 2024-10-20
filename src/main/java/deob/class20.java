package deob;

@ObfuscatedName("s")
public final class class20 extends class95 {

    @ObfuscatedName("s.e")
    public int field303;

    @ObfuscatedName("s.i")
    public int field314;

    @ObfuscatedName("s.k")
    public int field299;

    @ObfuscatedName("s.q")
    public int field309;

    @ObfuscatedName("s.j")
    public int field301;

    @ObfuscatedName("s.z")
    public int field302;

    @ObfuscatedName("s.m")
    public class35 field312;

    @ObfuscatedName("s.w")
    public int field304 = 0;

    @ObfuscatedName("s.a")
    public int field305 = 0;

    @ObfuscatedName("s.d")
    public boolean field306 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field303 = arg0;
        this.field299 = arg1;
        this.field309 = arg2;
        this.field301 = arg3;
        this.field302 = arg4;
        this.field314 = arg5 + arg6;
        int var8 = class36.method867(this.field303).field926;
        if (var8 == -1) {
            this.field306 = true;
        } else {
            this.field306 = false;
            this.field312 = class35.method28(var8);
        }
    }

    @ObfuscatedName("s.e(II)V")
    public final void method193(int arg0) {
        if (this.field306) {
            return;
        }
        this.field305 += arg0;
        while (this.field305 > this.field312.field902[this.field304]) {
            this.field305 -= this.field312.field902[this.field304];
            this.field304++;
            if (this.field304 >= this.field312.field900.length) {
                this.field306 = true;
                break;
            }
        }
    }

    @ObfuscatedName("s.i(B)Ldo;")
    public final class113 method16() {
        class36 var1 = class36.method867(this.field303);
        class113 var2;
        if (this.field306) {
            var2 = var1.method795(-1);
        } else {
            var2 = var1.method795(this.field304);
        }
        return var2 == null ? null : var2;
    }
}
