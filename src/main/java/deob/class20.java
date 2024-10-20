package deob;

@ObfuscatedName("n")
public final class class20 extends class94 {

    @ObfuscatedName("n.i")
    public int field303;

    @ObfuscatedName("n.v")
    public int field300;

    @ObfuscatedName("n.m")
    public int field301;

    @ObfuscatedName("n.j")
    public int field302;

    @ObfuscatedName("n.o")
    public int field312;

    @ObfuscatedName("n.l")
    public int field299;

    @ObfuscatedName("n.g")
    public class34 field305;

    @ObfuscatedName("n.w")
    public int field306 = 0;

    @ObfuscatedName("n.c")
    public int field315 = 0;

    @ObfuscatedName("n.z")
    public boolean field308 = false;

    public class20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field303 = arg0;
        this.field301 = arg1;
        this.field302 = arg2;
        this.field312 = arg3;
        this.field299 = arg4;
        this.field300 = arg5 + arg6;
        int var8 = class35.method713(this.field303).field919;
        if (var8 == -1) {
            this.field308 = true;
        } else {
            this.field308 = false;
            this.field305 = class34.method1443(var8);
        }
    }

    @ObfuscatedName("n.i(II)V")
    public final void method170(int arg0) {
        if (this.field308) {
            return;
        }
        this.field315 += arg0;
        while (this.field315 > this.field305.field895[this.field306]) {
            this.field315 -= this.field305.field895[this.field306];
            this.field306++;
            if (this.field306 >= this.field305.field893.length) {
                this.field308 = true;
                break;
            }
        }
    }

    @ObfuscatedName("n.v(I)Ldl;")
    public final class112 method15() {
        class35 var1 = class35.method713(this.field303);
        class112 var2;
        if (this.field308) {
            var2 = var1.method766(-1);
        } else {
            var2 = var1.method766(this.field306);
        }
        return var2 == null ? null : var2;
    }
}
