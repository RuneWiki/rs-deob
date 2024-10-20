package deob;

@ObfuscatedName("cm")
public final class class80 extends class199 {

    @ObfuscatedName("cm.v")
    public int field993;

    @ObfuscatedName("cm.n")
    public int field1002;

    @ObfuscatedName("cm.f")
    public int field995;

    @ObfuscatedName("cm.y")
    public class157 field999;

    @ObfuscatedName("cm.p")
    public int field996;

    @ObfuscatedName("cm.j")
    public int field997;

    @ObfuscatedName("cm.r")
    public int field998;

    @ObfuscatedName("cm.b")
    public int field1000 = 0;

    @ObfuscatedName("cm.d")
    public int field1001 = 0;

    @ObfuscatedName("cm.s")
    public boolean field994 = false;

    public class80(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field993 = arg0;
        this.field995 = arg1;
        this.field996 = arg2;
        this.field997 = arg3;
        this.field998 = arg4;
        this.field1002 = arg5 + arg6;
        int var8 = class148.method2427(this.field993).field1690;
        if (var8 == -1) {
            this.field994 = true;
        } else {
            this.field994 = false;
            this.field999 = class157.method2030(var8);
        }
    }

    @ObfuscatedName("cm.v(II)V")
    public final void method1708(int arg0) {
        if (this.field994) {
            return;
        }
        this.field1001 += arg0;
        while (this.field1001 > this.field999.field1881[this.field1000]) {
            this.field1001 -= this.field999.field1881[this.field1000];
            this.field1000++;
            if (this.field1000 >= this.field999.field1879.length) {
                this.field994 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cm.n(B)Lgr;")
    public final class205 method1710() {
        class148 var1 = class148.method2427(this.field993);
        class205 var2;
        if (this.field994) {
            var2 = var1.method2562(-1);
        } else {
            var2 = var1.method2562(this.field1000);
        }
        return var2 == null ? null : var2;
    }
}
