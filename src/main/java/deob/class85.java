package deob;

@ObfuscatedName("cl")
public final class class85 extends class142 {

    @ObfuscatedName("cl.n")
    public int field1357;

    @ObfuscatedName("cl.p")
    public int field1366;

    @ObfuscatedName("cl.i")
    public int field1359;

    @ObfuscatedName("cl.j")
    public int field1368;

    @ObfuscatedName("cl.f")
    public int field1361;

    @ObfuscatedName("cl.m")
    public int field1360;

    @ObfuscatedName("cl.c")
    public class261 field1363;

    @ObfuscatedName("cl.z")
    public int field1364 = 0;

    @ObfuscatedName("cl.h")
    public int field1365 = 0;

    @ObfuscatedName("cl.g")
    public boolean field1362 = false;

    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1357 = arg0;
        this.field1359 = arg1;
        this.field1368 = arg2;
        this.field1361 = arg3;
        this.field1360 = arg4;
        this.field1366 = arg5 + arg6;
        int var8 = class246.method1711(this.field1357).field3341;
        if (var8 == -1) {
            this.field1362 = true;
        } else {
            this.field1362 = false;
            this.field1363 = class261.method2887(var8);
        }
    }

    @ObfuscatedName("cl.n(II)V")
    public final void method1542(int arg0) {
        if (this.field1362) {
            return;
        }
        this.field1365 += arg0;
        while (this.field1365 > this.field1363.field3615[this.field1364]) {
            this.field1365 -= this.field1363.field3615[this.field1364];
            this.field1364++;
            if (this.field1364 >= this.field1363.field3617.length) {
                this.field1362 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cl.i(S)Lek;")
    public final class134 method1012() {
        class246 var1 = class246.method1711(this.field1357);
        class134 var2;
        if (this.field1362) {
            var2 = var1.method4048(-1);
        } else {
            var2 = var1.method4048(this.field1364);
        }
        return var2 == null ? null : var2;
    }
}
