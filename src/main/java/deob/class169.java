package deob;

@ObfuscatedName("av")
public class class169 extends class177 {

    @ObfuscatedName("av.o")
    public int field2575 = 0;

    @ObfuscatedName("av.j")
    public class13 field2574 = new class13();

    @ObfuscatedName("av.t")
    public int field2573 = -1;

    @ObfuscatedName("av.p")
    public class13 field2576 = new class13();

    @ObfuscatedName("av.a([III)V")
    public final synchronized void method1274(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field2573 < 0) {
                this.method3242(arg0, arg1, arg2);
                return;
            }
            if (this.field2575 + arg2 < this.field2573) {
                this.field2575 += arg2;
                this.method3242(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field2573 - this.field2575;
            this.method3242(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field2575 += var4;
            this.method3247();
            class130 var5 = (class130) this.field2576.method253();
            synchronized (var5) {
                int var7 = var5.method2195(this);
                if (var7 < 0) {
                    var5.field1967 = 0;
                    this.method3245(var5);
                } else {
                    var5.field1967 = var7;
                    this.method3239(var5.field9, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("av.p(Lam;)V")
    public final synchronized void method3238(class177 arg0) {
        arg0.method44();
    }

    @ObfuscatedName("av.h(Lfx;Lbc;)V")
    public void method3239(class4 arg0, class130 arg1) {
        while (this.field2576.field63 != arg0 && ((class130) arg0).field1967 <= arg1.field1967) {
            arg0 = arg0.field9;
        }
        class13.method270(arg1, arg0);
        this.field2573 = ((class130) this.field2576.field63.field9).field1967;
    }

    @ObfuscatedName("av.k()Lam;")
    public class177 method1218() {
        return (class177) this.field2574.method253();
    }

    @ObfuscatedName("av.j(Lam;)V")
    public final synchronized void method3240(class177 arg0) {
        this.field2574.method249(arg0);
    }

    @ObfuscatedName("av.n([III)V")
    public void method3242(int[] arg0, int arg1, int arg2) {
        for (class177 var4 = (class177) this.field2574.method253(); var4 != null; var4 = (class177) this.field2574.method255()) {
            var4.method3375(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("av.g(I)V")
    public void method3244(int arg0) {
        for (class177 var2 = (class177) this.field2574.method253(); var2 != null; var2 = (class177) this.field2574.method255()) {
            var2.method1221(arg0);
        }
    }

    @ObfuscatedName("av.r(Lbc;)V")
    public void method3245(class130 arg0) {
        arg0.method44();
        arg0.method2193();
        class4 var2 = this.field2576.field63.field9;
        if (this.field2576.field63 == var2) {
            this.field2573 = -1;
        } else {
            this.field2573 = ((class130) var2).field1967;
        }
    }

    @ObfuscatedName("av.t()V")
    public void method3247() {
        if (this.field2575 <= 0) {
            return;
        }
        for (class130 var1 = (class130) this.field2576.method253(); var1 != null; var1 = (class130) this.field2576.method255()) {
            var1.field1967 -= this.field2575;
        }
        this.field2573 -= this.field2575;
        this.field2575 = 0;
    }

    @ObfuscatedName("av.aa(I)V")
    public final synchronized void method1221(int arg0) {
        do {
            if (this.field2573 < 0) {
                this.method3244(arg0);
                return;
            }
            if (this.field2575 + arg0 < this.field2573) {
                this.field2575 += arg0;
                this.method3244(arg0);
                return;
            }
            int var2 = this.field2573 - this.field2575;
            this.method3244(var2);
            arg0 -= var2;
            this.field2575 += var2;
            this.method3247();
            class130 var3 = (class130) this.field2576.method253();
            synchronized (var3) {
                int var5 = var3.method2195(this);
                if (var5 < 0) {
                    var3.field1967 = 0;
                    this.method3245(var3);
                } else {
                    var3.field1967 = var5;
                    this.method3239(var3.field9, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("av.d()I")
    public int method1220() {
        return 0;
    }

    @ObfuscatedName("av.q()Lam;")
    public class177 method1289() {
        return (class177) this.field2574.method255();
    }
}
