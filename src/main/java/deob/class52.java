package deob;

@ObfuscatedName("ak")
public class class52 extends class69 {

    @ObfuscatedName("ak.x")
    public class129 field987 = new class129();

    @ObfuscatedName("ak.n")
    public class129 field986 = new class129();

    @ObfuscatedName("ak.g")
    public int field988 = 0;

    @ObfuscatedName("ak.v")
    public int field989 = -1;

    @ObfuscatedName("ak.x(Lbs;)V")
    public final synchronized void method1002(class69 arg0) {
        this.field987.method2349(arg0);
    }

    @ObfuscatedName("ak.n(Lbs;)V")
    public final synchronized void method978(class69 arg0) {
        arg0.method2327();
    }

    @ObfuscatedName("ak.g()V")
    public void method995() {
        if (this.field988 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field986.method2352(); var1 != null; var1 = (class62) this.field986.method2341()) {
            var1.field1099 -= this.field988;
        }
        this.field989 -= this.field988;
        this.field988 = 0;
    }

    @ObfuscatedName("ak.v(Ldn;Lbv;)V")
    public void method980(class128 arg0, class62 arg1) {
        while (this.field986.field1888 != arg0 && ((class62) arg0).field1099 <= arg1.field1099) {
            arg0 = arg0.field1885;
        }
        class129.method2336(arg1, arg0);
        this.field989 = ((class62) this.field986.field1888.field1885).field1099;
    }

    @ObfuscatedName("ak.y(Lbv;)V")
    public void method981(class62 arg0) {
        arg0.method2327();
        arg0.method1190();
        class128 var2 = this.field986.field1888.field1885;
        if (this.field986.field1888 == var2) {
            this.field989 = -1;
        } else {
            this.field989 = ((class62) var2).field1099;
        }
    }

    @ObfuscatedName("ak.p()Lbs;")
    public class69 method982() {
        return (class69) this.field987.method2352();
    }

    @ObfuscatedName("ak.j()Lbs;")
    public class69 method983() {
        return (class69) this.field987.method2341();
    }

    @ObfuscatedName("ak.s()I")
    public int method984() {
        return 0;
    }

    @ObfuscatedName("ak.k([III)V")
    public final synchronized void method985(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field989 < 0) {
                this.method986(arg0, arg1, arg2);
                return;
            }
            if (this.field988 + arg2 < this.field989) {
                this.field988 += arg2;
                this.method986(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field989 - this.field988;
            this.method986(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field988 += var4;
            this.method995();
            class62 var5 = (class62) this.field986.method2352();
            synchronized (var5) {
                int var7 = var5.method1191(this);
                if (var7 < 0) {
                    var5.field1099 = 0;
                    this.method981(var5);
                } else {
                    var5.field1099 = var7;
                    this.method980(var5.field1885, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ak.f([III)V")
    public void method986(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field987.method2352(); var4 != null; var4 = (class69) this.field987.method2341()) {
            var4.method1372(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ak.o(I)V")
    public final synchronized void method987(int arg0) {
        do {
            if (this.field989 < 0) {
                this.method990(arg0);
                return;
            }
            if (this.field988 + arg0 < this.field989) {
                this.field988 += arg0;
                this.method990(arg0);
                return;
            }
            int var2 = this.field989 - this.field988;
            this.method990(var2);
            arg0 -= var2;
            this.field988 += var2;
            this.method995();
            class62 var3 = (class62) this.field986.method2352();
            synchronized (var3) {
                int var5 = var3.method1191(this);
                if (var5 < 0) {
                    var3.field1099 = 0;
                    this.method981(var3);
                } else {
                    var3.field1099 = var5;
                    this.method980(var3.field1885, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ak.q(I)V")
    public void method990(int arg0) {
        for (class69 var2 = (class69) this.field987.method2352(); var2 != null; var2 = (class69) this.field987.method2341()) {
            var2.method987(arg0);
        }
    }
}
