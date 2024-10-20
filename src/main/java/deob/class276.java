package deob;

@ObfuscatedName("kt")
public final class class276 {

    @ObfuscatedName("kt.aj")
    public class439 field3045 = new class439();

    @ObfuscatedName("kt.al")
    public int field3043;

    @ObfuscatedName("kt.ac")
    public int field3044;

    @ObfuscatedName("kt.ab")
    public class454 field3046;

    @ObfuscatedName("kt.an")
    public class364 field3047 = new class364();

    public class276(int arg0) {
        this.field3043 = arg0;
        this.field3044 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3046 = new class454(var2);
    }

    @ObfuscatedName("kt.aj(J)Lqk;")
    public class439 method4921(long arg0) {
        class439 var3 = (class439) this.field3046.method7611(arg0);
        if (var3 != null) {
            this.field3047.method6238(var3);
        }
        return var3;
    }

    @ObfuscatedName("kt.al(J)V")
    public void method4924(long arg0) {
        class439 var3 = (class439) this.field3046.method7611(arg0);
        if (var3 != null) {
            var3.method7335();
            var3.method7331();
            this.field3044++;
        }
    }

    @ObfuscatedName("kt.ac(Lqk;J)V")
    public void method4923(class439 arg0, long arg1) {
        if (this.field3044 == 0) {
            class439 var4 = this.field3047.method6248();
            var4.method7335();
            var4.method7331();
            if (this.field3045 == var4) {
                class439 var5 = this.field3047.method6248();
                var5.method7335();
                var5.method7331();
            }
        } else {
            this.field3044--;
        }
        this.field3046.method7595(arg0, arg1);
        this.field3047.method6238(arg0);
    }

    @ObfuscatedName("kt.ab()V")
    public void method4930() {
        this.field3047.method6244();
        this.field3046.method7596();
        this.field3045 = new class439();
        this.field3044 = this.field3043;
    }
}
