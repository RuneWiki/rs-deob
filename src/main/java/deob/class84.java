package deob;

@ObfuscatedName("u")
public final class class84 extends class145 {

    @ObfuscatedName("u.f")
    public int field979 = 0;

    @ObfuscatedName("u.d")
    public int field970;

    @ObfuscatedName("u.b")
    public int field976;

    @ObfuscatedName("u.l")
    public class173 field977;

    @ObfuscatedName("u.j")
    public boolean field974 = false;

    @ObfuscatedName("u.k")
    public int field967;

    @ObfuscatedName("u.h")
    public int field966;

    @ObfuscatedName("u.w")
    public int field965;

    @ObfuscatedName("u.t")
    public int field969;

    @ObfuscatedName("u.s")
    public int field973 = 0;

    @ObfuscatedName("u.b(II)V")
    public final void method1210(int arg0) {
        if (this.field974) {
            return;
        }
        this.field973 += arg0;
        while (this.field973 > this.field977.field2588[this.field979]) {
            this.field973 -= this.field977.field2588[this.field979];
            this.field979++;
            if (this.field979 >= this.field977.field2584.length) {
                this.field974 = true;
                break;
            }
        }
    }

    @ObfuscatedName("u.h(I)Ldu;")
    public final class27 method1087() {
        class184 var1 = class184.method1375(this.field976);
        class27 var2;
        if (this.field974) {
            var2 = var1.method3339(-1);
        } else {
            var2 = var1.method3339(this.field979);
        }
        return var2 == null ? null : var2;
    }

    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field976 = arg0;
        this.field967 = arg1;
        this.field965 = arg2;
        this.field969 = arg3;
        this.field970 = arg4;
        this.field966 = arg5 + arg6;
        int var8 = class184.method1375(this.field976).field2814;
        if (var8 == -1) {
            this.field974 = true;
        } else {
            this.field974 = false;
            this.field977 = class173.method3098(var8);
        }
    }
}
