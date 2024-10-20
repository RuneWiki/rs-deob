package deob;

@ObfuscatedName("gu")
public final class class201 {

    @ObfuscatedName("gu.a")
    public class206 field2579 = new class206();

    @ObfuscatedName("gu.w")
    public int field2578;

    @ObfuscatedName("gu.e")
    public int field2581;

    @ObfuscatedName("gu.k")
    public class202 field2580;

    @ObfuscatedName("gu.u")
    public class196 field2577 = new class196();

    public class201(int arg0) {
        this.field2578 = arg0;
        this.field2581 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2580 = new class202(var2);
    }

    @ObfuscatedName("gu.a(J)Lgi;")
    public class206 method3373(long arg0) {
        class206 var3 = (class206) this.field2580.method3387(arg0);
        if (var3 != null) {
            this.field2577.method3326(var3);
        }
        return var3;
    }

    @ObfuscatedName("gu.w(J)V")
    public void method3368(long arg0) {
        class206 var3 = (class206) this.field2580.method3387(arg0);
        if (var3 != null) {
            var3.method3427();
            var3.method3474();
            this.field2581++;
        }
    }

    @ObfuscatedName("gu.e(Lgi;J)V")
    public void method3375(class206 arg0, long arg1) {
        if (this.field2581 == 0) {
            class206 var4 = this.field2577.method3329();
            var4.method3427();
            var4.method3474();
            if (this.field2579 == var4) {
                class206 var5 = this.field2577.method3329();
                var5.method3427();
                var5.method3474();
            }
        } else {
            this.field2581--;
        }
        this.field2580.method3381(arg0, arg1);
        this.field2577.method3326(arg0);
    }

    @ObfuscatedName("gu.k()V")
    public void method3370() {
        this.field2577.method3330();
        this.field2580.method3382();
        this.field2579 = new class206();
        this.field2581 = this.field2578;
    }
}
