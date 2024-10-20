package deob;

@ObfuscatedName("cp")
public final class class86 extends class143 {

    @ObfuscatedName("cp.j")
    public int field1366;

    @ObfuscatedName("cp.h")
    public int field1361;

    @ObfuscatedName("cp.f")
    public int field1362;

    @ObfuscatedName("cp.p")
    public int field1363;

    @ObfuscatedName("cp.x")
    public int field1364;

    @ObfuscatedName("cp.g")
    public int field1365;

    @ObfuscatedName("cp.c")
    public class262 field1367;

    @ObfuscatedName("cp.l")
    public int field1360 = 0;

    @ObfuscatedName("cp.w")
    public int field1368 = 0;

    @ObfuscatedName("cp.b")
    public boolean field1370 = false;

    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1366 = arg0;
        this.field1362 = arg1;
        this.field1363 = arg2;
        this.field1364 = arg3;
        this.field1365 = arg4;
        this.field1361 = arg5 + arg6;
        int var8 = class247.method473(this.field1366).field3317;
        if (var8 == -1) {
            this.field1370 = true;
        } else {
            this.field1370 = false;
            this.field1367 = class262.method1389(var8);
        }
    }

    @ObfuscatedName("cp.j(II)V")
    public final void method1533(int arg0) {
        if (this.field1370) {
            return;
        }
        this.field1368 += arg0;
        while (this.field1368 > this.field1367.field3596[this.field1360]) {
            this.field1368 -= this.field1367.field3596[this.field1360];
            this.field1360++;
            if (this.field1360 >= this.field1367.field3595.length) {
                this.field1370 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cp.f(I)Leo;")
    public final class135 method1077() {
        class247 var1 = class247.method473(this.field1366);
        class135 var2;
        if (this.field1370) {
            var2 = var1.method4012(-1);
        } else {
            var2 = var1.method4012(this.field1360);
        }
        return var2 == null ? null : var2;
    }
}
