package deob;

@ObfuscatedName("bc")
public class class39 extends class49 {

    @ObfuscatedName("bc.aj")
    public class359 field261 = new class359();

    @ObfuscatedName("bc.al")
    public class359 field260 = new class359();

    @ObfuscatedName("bc.ac")
    public int field259 = 0;

    @ObfuscatedName("bc.ab")
    public int field262 = -1;

    @ObfuscatedName("bc.aj(Lbj;)V")
    public final synchronized void method676(class49 arg0) {
        this.field261.method6092(arg0);
    }

    @ObfuscatedName("bc.al(Lbj;)V")
    public final synchronized void method677(class49 arg0) {
        arg0.method7335();
    }

    @ObfuscatedName("bc.ac()V")
    public void method678() {
        if (this.field259 <= 0) {
            return;
        }
        for (class55 var1 = (class55) this.field260.method6089(); var1 != null; var1 = (class55) this.field260.method6098()) {
            var1.field398 -= this.field259;
        }
        this.field262 -= this.field259;
        this.field259 = 0;
    }

    @ObfuscatedName("bc.ab(Lru;Lcb;)V")
    public void method695(class444 arg0, class55 arg1) {
        while (this.field260.field4318 != arg0 && ((class55) arg0).field398 <= arg1.field398) {
            arg0 = arg0.field4672;
        }
        class359.method6115(arg1, arg0);
        this.field262 = ((class55) this.field260.field4318.field4672).field398;
    }

    @ObfuscatedName("bc.an(Lcb;)V")
    public void method701(class55 arg0) {
        arg0.method7335();
        arg0.method1032();
        class444 var2 = this.field260.field4318.field4672;
        if (this.field260.field4318 == var2) {
            this.field262 = -1;
        } else {
            this.field262 = ((class55) var2).field398;
        }
    }

    @ObfuscatedName("bc.ao()Lbj;")
    public class49 method681() {
        return (class49) this.field261.method6089();
    }

    @ObfuscatedName("bc.av()Lbj;")
    public class49 method688() {
        return (class49) this.field261.method6098();
    }

    @ObfuscatedName("bc.aq()I")
    public int method683() {
        return 0;
    }

    @ObfuscatedName("bc.ap([III)V")
    public final synchronized void method705(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field262 < 0) {
                this.method702(arg0, arg1, arg2);
                return;
            }
            if (this.field259 + arg2 < this.field262) {
                this.field259 += arg2;
                this.method702(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field262 - this.field259;
            this.method702(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field259 += var4;
            this.method678();
            class55 var5 = (class55) this.field260.method6089();
            synchronized (var5) {
                int var7 = var5.method1033(this);
                if (var7 < 0) {
                    var5.field398 = 0;
                    this.method701(var5);
                } else {
                    var5.field398 = var7;
                    this.method695(var5.field4672, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bc.ar([III)V")
    public void method702(int[] arg0, int arg1, int arg2) {
        for (class49 var4 = (class49) this.field261.method6089(); var4 != null; var4 = (class49) this.field261.method6098()) {
            var4.method975(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bc.ak(I)V")
    public final synchronized void method686(int arg0) {
        do {
            if (this.field262 < 0) {
                this.method687(arg0);
                return;
            }
            if (this.field259 + arg0 < this.field262) {
                this.field259 += arg0;
                this.method687(arg0);
                return;
            }
            int var2 = this.field262 - this.field259;
            this.method687(var2);
            arg0 -= var2;
            this.field259 += var2;
            this.method678();
            class55 var3 = (class55) this.field260.method6089();
            synchronized (var3) {
                int var5 = var3.method1033(this);
                if (var5 < 0) {
                    var3.field398 = 0;
                    this.method701(var3);
                } else {
                    var3.field398 = var5;
                    this.method695(var3.field4672, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bc.ax(I)V")
    public void method687(int arg0) {
        for (class49 var2 = (class49) this.field261.method6089(); var2 != null; var2 = (class49) this.field261.method6098()) {
            var2.method686(arg0);
        }
    }
}
