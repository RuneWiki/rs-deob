package deob;

@ObfuscatedName("av")
public class class46 extends class48 {

    @ObfuscatedName("av.c")
    public class177 field1081 = new class177();

    @ObfuscatedName("av.q")
    public class177 field1080 = new class177();

    @ObfuscatedName("av.y")
    public int field1082 = 0;

    @ObfuscatedName("av.v")
    public int field1083 = -1;

    @ObfuscatedName("av.c(Lab;)V")
    public final synchronized void method1057(class48 arg0) {
        this.field1081.method3159(arg0);
    }

    @ObfuscatedName("av.q(Lab;)V")
    public final synchronized void method1063(class48 arg0) {
        arg0.method3196();
    }

    @ObfuscatedName("av.v()V")
    public void method1061() {
        if (this.field1082 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1080.method3163(); var1 != null; var1 = (class61) this.field1080.method3165()) {
            var1.field1238 -= this.field1082;
        }
        this.field1083 -= this.field1082;
        this.field1082 = 0;
    }

    @ObfuscatedName("av.g(Lfr;Lbb;)V")
    public void method1058(class179 arg0, class61 arg1) {
        while (this.field1080.field2820 != arg0 && ((class61) arg0).field1238 <= arg1.field1238) {
            arg0 = arg0.field2825;
        }
        class177.method3160(arg1, arg0);
        this.field1083 = ((class61) this.field1080.field2820.field2825).field1238;
    }

    @ObfuscatedName("av.x(Lbb;)V")
    public void method1059(class61 arg0) {
        arg0.method3196();
        arg0.method1255();
        class179 var2 = this.field1080.field2820.field2825;
        if (this.field1080.field2820 == var2) {
            this.field1083 = -1;
        } else {
            this.field1083 = ((class61) var2).field1238;
        }
    }

    @ObfuscatedName("av.w()Lab;")
    public class48 method933() {
        return (class48) this.field1081.method3163();
    }

    @ObfuscatedName("av.e()Lab;")
    public class48 method974() {
        return (class48) this.field1081.method3165();
    }

    @ObfuscatedName("av.p()I")
    public int method935() {
        return 0;
    }

    @ObfuscatedName("av.i([III)V")
    public final synchronized void method976(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1083 < 0) {
                this.method1060(arg0, arg1, arg2);
                return;
            }
            if (this.field1082 + arg2 < this.field1083) {
                this.field1082 += arg2;
                this.method1060(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1083 - this.field1082;
            this.method1060(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1082 += var4;
            this.method1061();
            class61 var5 = (class61) this.field1080.method3163();
            synchronized (var5) {
                int var7 = var5.method1256(this);
                if (var7 < 0) {
                    var5.field1238 = 0;
                    this.method1059(var5);
                } else {
                    var5.field1238 = var7;
                    this.method1058(var5.field2825, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("av.u([III)V")
    public void method1060(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1081.method3163(); var4 != null; var4 = (class48) this.field1081.method3165()) {
            var4.method1079(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("av.ap(I)V")
    public final synchronized void method937(int arg0) {
        do {
            if (this.field1083 < 0) {
                this.method1062(arg0);
                return;
            }
            if (this.field1082 + arg0 < this.field1083) {
                this.field1082 += arg0;
                this.method1062(arg0);
                return;
            }
            int var2 = this.field1083 - this.field1082;
            this.method1062(var2);
            arg0 -= var2;
            this.field1082 += var2;
            this.method1061();
            class61 var3 = (class61) this.field1080.method3163();
            synchronized (var3) {
                int var5 = var3.method1256(this);
                if (var5 < 0) {
                    var3.field1238 = 0;
                    this.method1059(var3);
                } else {
                    var3.field1238 = var5;
                    this.method1058(var3.field2825, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("av.l(I)V")
    public void method1062(int arg0) {
        for (class48 var2 = (class48) this.field1081.method3163(); var2 != null; var2 = (class48) this.field1081.method3165()) {
            var2.method937(arg0);
        }
    }
}
