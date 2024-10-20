package deob;

@ObfuscatedName("gt")
public final class class190 {

    @ObfuscatedName("gt.i")
    public class195 field2470 = new class195();

    @ObfuscatedName("gt.c")
    public int field2468;

    @ObfuscatedName("gt.e")
    public int field2469;

    @ObfuscatedName("gt.v")
    public class191 field2471;

    @ObfuscatedName("gt.b")
    public class185 field2472 = new class185();

    public class190(int arg0) {
        this.field2468 = arg0;
        this.field2469 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2471 = new class191(var2);
    }

    @ObfuscatedName("gt.i(J)Lgc;")
    public class195 method3220(long arg0) {
        class195 var3 = (class195) this.field2471.method3238(arg0);
        if (var3 != null) {
            this.field2472.method3190(var3);
        }
        return var3;
    }

    @ObfuscatedName("gt.c(J)V")
    public void method3223(long arg0) {
        class195 var3 = (class195) this.field2471.method3238(arg0);
        if (var3 != null) {
            var3.method3278();
            var3.method3318();
            this.field2469++;
        }
    }

    @ObfuscatedName("gt.e(Lgc;J)V")
    public void method3222(class195 arg0, long arg1) {
        if (this.field2469 == 0) {
            class195 var4 = this.field2472.method3181();
            var4.method3278();
            var4.method3318();
            if (this.field2470 == var4) {
                class195 var5 = this.field2472.method3181();
                var5.method3278();
                var5.method3318();
            }
        } else {
            this.field2469--;
        }
        this.field2471.method3234(arg0, arg1);
        this.field2472.method3190(arg0);
    }

    @ObfuscatedName("gt.v()V")
    public void method3221() {
        this.field2472.method3183();
        this.field2471.method3235();
        this.field2470 = new class195();
        this.field2469 = this.field2468;
    }
}
