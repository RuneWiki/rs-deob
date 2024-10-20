package deob;

@ObfuscatedName("hp")
public final class class213 {

    @ObfuscatedName("hp.d")
    public class219 field2640 = new class219();

    @ObfuscatedName("hp.z")
    public int field2638;

    @ObfuscatedName("hp.n")
    public int field2637;

    @ObfuscatedName("hp.r")
    public class215 field2639;

    @ObfuscatedName("hp.e")
    public class207 field2641 = new class207();

    public class213(int arg0) {
        this.field2638 = arg0;
        this.field2637 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2639 = new class215(var2);
    }

    @ObfuscatedName("hp.d(J)Lhu;")
    public class219 method3707(long arg0) {
        class219 var3 = (class219) this.field2639.method3736(arg0);
        if (var3 != null) {
            this.field2641.method3637(var3);
        }
        return var3;
    }

    @ObfuscatedName("hp.z(J)V")
    public void method3698(long arg0) {
        class219 var3 = (class219) this.field2639.method3736(arg0);
        if (var3 != null) {
            var3.method3785();
            var3.method3828();
            this.field2637++;
        }
    }

    @ObfuscatedName("hp.n(Lhu;J)V")
    public void method3697(class219 arg0, long arg1) {
        if (this.field2637 == 0) {
            class219 var4 = this.field2641.method3650();
            var4.method3785();
            var4.method3828();
            if (this.field2640 == var4) {
                class219 var5 = this.field2641.method3650();
                var5.method3785();
                var5.method3828();
            }
        } else {
            this.field2637--;
        }
        this.field2639.method3745(arg0, arg1);
        this.field2641.method3637(arg0);
    }

    @ObfuscatedName("hp.r()V")
    public void method3700() {
        this.field2641.method3641();
        this.field2639.method3738();
        this.field2640 = new class219();
        this.field2637 = this.field2638;
    }
}
