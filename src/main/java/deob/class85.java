package deob;

@ObfuscatedName("ca")
public final class class85 extends class142 {

    @ObfuscatedName("ca.i")
    public int field1337;

    @ObfuscatedName("ca.h")
    public int field1329;

    @ObfuscatedName("ca.u")
    public int field1331;

    @ObfuscatedName("ca.q")
    public int field1332;

    @ObfuscatedName("ca.g")
    public int field1330;

    @ObfuscatedName("ca.v")
    public int field1334;

    @ObfuscatedName("ca.t")
    public class261 field1335;

    @ObfuscatedName("ca.p")
    public int field1339 = 0;

    @ObfuscatedName("ca.l")
    public int field1336 = 0;

    @ObfuscatedName("ca.a")
    public boolean field1338 = false;

    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1337 = arg0;
        this.field1331 = arg1;
        this.field1332 = arg2;
        this.field1330 = arg3;
        this.field1334 = arg4;
        this.field1329 = arg5 + arg6;
        int var8 = class246.method3468(this.field1337).field3320;
        if (var8 == -1) {
            this.field1338 = true;
        } else {
            this.field1338 = false;
            this.field1335 = class261.method2856(var8);
        }
    }

    @ObfuscatedName("ca.i(IB)V")
    public final void method1566(int arg0) {
        if (this.field1338) {
            return;
        }
        this.field1336 += arg0;
        while (this.field1336 > this.field1335.field3596[this.field1339]) {
            this.field1336 -= this.field1335.field3596[this.field1339];
            this.field1339++;
            if (this.field1339 >= this.field1335.field3607.length) {
                this.field1338 = true;
                break;
            }
        }
    }

    @ObfuscatedName("ca.u(I)Lew;")
    public final class134 method1053() {
        class246 var1 = class246.method3468(this.field1337);
        class134 var2;
        if (this.field1338) {
            var2 = var1.method4051(-1);
        } else {
            var2 = var1.method4051(this.field1339);
        }
        return var2 == null ? null : var2;
    }
}
