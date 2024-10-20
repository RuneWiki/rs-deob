package deob;

@ObfuscatedName("gs")
public final class class191 {

    @ObfuscatedName("gs.j")
    public class196 field2458 = new class196();

    @ObfuscatedName("gs.h")
    public int field2457;

    @ObfuscatedName("gs.f")
    public int field2456;

    @ObfuscatedName("gs.p")
    public class192 field2459;

    @ObfuscatedName("gs.x")
    public class186 field2460 = new class186();

    public class191(int arg0) {
        this.field2457 = arg0;
        this.field2456 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2459 = new class192(var2);
    }

    @ObfuscatedName("gs.j(J)Lge;")
    public class196 method3271(long arg0) {
        class196 var3 = (class196) this.field2459.method3281(arg0);
        if (var3 != null) {
            this.field2460.method3220(var3);
        }
        return var3;
    }

    @ObfuscatedName("gs.h(J)V")
    public void method3261(long arg0) {
        class196 var3 = (class196) this.field2459.method3281(arg0);
        if (var3 != null) {
            var3.method3314();
            var3.method3350();
            this.field2456++;
        }
    }

    @ObfuscatedName("gs.f(Lge;J)V")
    public void method3270(class196 arg0, long arg1) {
        if (this.field2456 == 0) {
            class196 var4 = this.field2460.method3229();
            var4.method3314();
            var4.method3350();
            if (this.field2458 == var4) {
                class196 var5 = this.field2460.method3229();
                var5.method3314();
                var5.method3350();
            }
        } else {
            this.field2456--;
        }
        this.field2459.method3274(arg0, arg1);
        this.field2460.method3220(arg0);
    }

    @ObfuscatedName("gs.p()V")
    public void method3259() {
        this.field2460.method3224();
        this.field2459.method3275();
        this.field2458 = new class196();
        this.field2456 = this.field2457;
    }
}
