package deob;

@ObfuscatedName("cb")
public final class class74 extends class286 {

    @ObfuscatedName("cb.aq")
    public int field882;

    @ObfuscatedName("cb.ad")
    public int field876;

    @ObfuscatedName("cb.ag")
    public int field877;

    @ObfuscatedName("cb.ak")
    public int field883;

    @ObfuscatedName("cb.ap")
    public int field879;

    @ObfuscatedName("cb.an")
    public int field880;

    @ObfuscatedName("cb.aj")
    public class210 field881;

    @ObfuscatedName("cb.av")
    public int field878 = 0;

    @ObfuscatedName("cb.ab")
    public int field884 = 0;

    @ObfuscatedName("cb.ai")
    public boolean field875 = false;

    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field882 = arg0;
        this.field877 = arg1;
        this.field883 = arg2;
        this.field879 = arg3;
        this.field880 = arg4;
        this.field876 = arg5 + arg6;
        int var8 = class198.method3271(this.field882).field2081;
        if (var8 == -1) {
            this.field875 = true;
        } else {
            this.field875 = false;
            this.field881 = class210.method5910(var8);
        }
    }

    @ObfuscatedName("cb.aq(II)V")
    public final void method2049(int arg0) {
        if (this.field875) {
            return;
        }
        this.field884 += arg0;
        if (this.field881.method3748()) {
            this.field878 += arg0;
            if (this.field878 >= this.field881.method3757()) {
                this.field875 = true;
            }
            return;
        }
        while (this.field884 > this.field881.field2285[this.field878]) {
            this.field884 -= this.field881.field2285[this.field878];
            this.field878++;
            if (this.field878 >= this.field881.field2291.length) {
                this.field875 = true;
                break;
            }
        }
    }

    @ObfuscatedName("cb.ah(I)Llv;")
    public final class294 method2050() {
        class198 var1 = class198.method3271(this.field882);
        class294 var2;
        if (this.field875) {
            var2 = var1.method3467(-1);
        } else {
            var2 = var1.method3467(this.field878);
        }
        return var2 == null ? null : var2;
    }
}
