package deob;

@ObfuscatedName("u")
public final class class84 extends class144 {

    @ObfuscatedName("u.f")
    public boolean field977 = false;

    @ObfuscatedName("u.g")
    public int field984 = 0;

    @ObfuscatedName("u.e")
    public int field976 = 0;

    @ObfuscatedName("u.n")
    public class166 field974;

    @ObfuscatedName("u.o")
    public int field970;

    @ObfuscatedName("u.j")
    public int field978;

    @ObfuscatedName("u.h")
    public int field972;

    @ObfuscatedName("u.t")
    public int field971;

    @ObfuscatedName("u.r")
    public int field969;

    @ObfuscatedName("u.p")
    public int field975;

    @ObfuscatedName("u.j(II)V")
    public final void method1174(int arg0) {
        if (this.field977) {
            return;
        }
        this.field976 += arg0;
        while (this.field976 > this.field974.field2531[this.field984]) {
            this.field976 -= this.field974.field2531[this.field984];
            this.field984++;
            if (this.field984 >= this.field974.field2529.length) {
                this.field977 = true;
                break;
            }
        }
    }

    @ObfuscatedName("u.p(B)Ldi;")
    public final class41 method784() {
        class173 var1 = class173.method2209(this.field978);
        class41 var2;
        if (this.field977) {
            var2 = var1.method3335(-1);
        } else {
            var2 = var1.method3335(this.field984);
        }
        return var2 == null ? null : var2;
    }

    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field978 = arg0;
        this.field970 = arg1;
        this.field971 = arg2;
        this.field972 = arg3;
        this.field969 = arg4;
        this.field975 = arg5 + arg6;
        int var8 = class173.method2209(this.field978).field2605;
        if (var8 == -1) {
            this.field977 = true;
        } else {
            this.field977 = false;
            this.field974 = class166.method274(var8);
        }
    }
}
