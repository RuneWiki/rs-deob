package deob;

@ObfuscatedName("ap")
public class class36 extends class46 {

    @ObfuscatedName("ap.c")
    public class321 field259 = new class321();

    @ObfuscatedName("ap.b")
    public class321 field257 = new class321();

    @ObfuscatedName("ap.p")
    public int field258 = 0;

    @ObfuscatedName("ap.m")
    public int field256 = -1;

    @ObfuscatedName("ap.c(Lai;)V")
    public final synchronized void method658(class46 arg0) {
        this.field259.method5297(arg0);
    }

    @ObfuscatedName("ap.b(Lai;)V")
    public final synchronized void method659(class46 arg0) {
        arg0.method6163();
    }

    @ObfuscatedName("ap.p()V")
    public void method683() {
        if (this.field258 <= 0) {
            return;
        }
        for (class52 var1 = (class52) this.field257.method5301(); var1 != null; var1 = (class52) this.field257.method5303()) {
            var1.field394 -= this.field258;
        }
        this.field256 -= this.field258;
        this.field258 = 0;
    }

    @ObfuscatedName("ap.m(Lnw;Lad;)V")
    public void method662(class387 arg0, class52 arg1) {
        while (this.field257.field3962 != arg0 && ((class52) arg0).field394 <= arg1.field394) {
            arg0 = arg0.field4258;
        }
        class321.method5298(arg1, arg0);
        this.field256 = ((class52) this.field257.field3962.field4258).field394;
    }

    @ObfuscatedName("ap.t(Lad;)V")
    public void method663(class52 arg0) {
        arg0.method6163();
        arg0.method1000();
        class387 var2 = this.field257.field3962.field4258;
        if (this.field257.field3962 == var2) {
            this.field256 = -1;
        } else {
            this.field256 = ((class52) var2).field394;
        }
    }

    @ObfuscatedName("ap.s()Lai;")
    public class46 method664() {
        return (class46) this.field259.method5301();
    }

    @ObfuscatedName("ap.j()Lai;")
    public class46 method678() {
        return (class46) this.field259.method5303();
    }

    @ObfuscatedName("ap.w()I")
    public int method666() {
        return 0;
    }

    @ObfuscatedName("ap.n([III)V")
    public final synchronized void method667(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field256 < 0) {
                this.method668(arg0, arg1, arg2);
                return;
            }
            if (this.field258 + arg2 < this.field256) {
                this.field258 += arg2;
                this.method668(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field256 - this.field258;
            this.method668(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field258 += var4;
            this.method683();
            class52 var5 = (class52) this.field257.method5301();
            synchronized (var5) {
                int var7 = var5.method1001(this);
                if (var7 < 0) {
                    var5.field394 = 0;
                    this.method663(var5);
                } else {
                    var5.field394 = var7;
                    this.method662(var5.field4258, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ap.r([III)V")
    public void method668(int[] arg0, int arg1, int arg2) {
        for (class46 var4 = (class46) this.field259.method5301(); var4 != null; var4 = (class46) this.field259.method5303()) {
            var4.method945(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ap.o(I)V")
    public final synchronized void method669(int arg0) {
        do {
            if (this.field256 < 0) {
                this.method670(arg0);
                return;
            }
            if (this.field258 + arg0 < this.field256) {
                this.field258 += arg0;
                this.method670(arg0);
                return;
            }
            int var2 = this.field256 - this.field258;
            this.method670(var2);
            arg0 -= var2;
            this.field258 += var2;
            this.method683();
            class52 var3 = (class52) this.field257.method5301();
            synchronized (var3) {
                int var5 = var3.method1001(this);
                if (var5 < 0) {
                    var3.field394 = 0;
                    this.method663(var3);
                } else {
                    var3.field394 = var5;
                    this.method662(var3.field4258, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ap.v(I)V")
    public void method670(int arg0) {
        for (class46 var2 = (class46) this.field259.method5301(); var2 != null; var2 = (class46) this.field259.method5303()) {
            var2.method669(arg0);
        }
    }
}
