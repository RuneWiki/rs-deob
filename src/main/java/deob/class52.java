package deob;

@ObfuscatedName("al")
public class class52 extends class69 {

    @ObfuscatedName("al.b")
    public class129 field983 = new class129();

    @ObfuscatedName("al.e")
    public class129 field982 = new class129();

    @ObfuscatedName("al.c")
    public int field981 = 0;

    @ObfuscatedName("al.l")
    public int field984 = -1;

    @ObfuscatedName("al.b(Lbm;)V")
    public final synchronized void method930(class69 arg0) {
        this.field983.method2309(arg0);
    }

    @ObfuscatedName("al.e(Lbm;)V")
    public final synchronized void method921(class69 arg0) {
        arg0.method2298();
    }

    @ObfuscatedName("al.c()V")
    public void method922() {
        if (this.field981 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field982.method2315(); var1 != null; var1 = (class62) this.field982.method2332()) {
            var1.field1095 -= this.field981;
        }
        this.field984 -= this.field981;
        this.field981 = 0;
    }

    @ObfuscatedName("al.l(Ldz;Lbc;)V")
    public void method923(class128 arg0, class62 arg1) {
        while (this.field982.field1868 != arg0 && ((class62) arg0).field1095 <= arg1.field1095) {
            arg0 = arg0.field1865;
        }
        class129.method2312(arg1, arg0);
        this.field984 = ((class62) this.field982.field1868.field1865).field1095;
    }

    @ObfuscatedName("al.y(Lbc;)V")
    public void method924(class62 arg0) {
        arg0.method2298();
        arg0.method1142();
        class128 var2 = this.field982.field1868.field1865;
        if (this.field982.field1868 == var2) {
            this.field984 = -1;
        } else {
            this.field984 = ((class62) var2).field1095;
        }
    }

    @ObfuscatedName("al.j()Lbm;")
    public class69 method944() {
        return (class69) this.field983.method2315();
    }

    @ObfuscatedName("al.t()Lbm;")
    public class69 method926() {
        return (class69) this.field983.method2332();
    }

    @ObfuscatedName("al.k()I")
    public int method927() {
        return 0;
    }

    @ObfuscatedName("al.f([III)V")
    public final synchronized void method942(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field984 < 0) {
                this.method938(arg0, arg1, arg2);
                return;
            }
            if (this.field981 + arg2 < this.field984) {
                this.field981 += arg2;
                this.method938(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field984 - this.field981;
            this.method938(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field981 += var4;
            this.method922();
            class62 var5 = (class62) this.field982.method2315();
            synchronized (var5) {
                int var7 = var5.method1141(this);
                if (var7 < 0) {
                    var5.field1095 = 0;
                    this.method924(var5);
                } else {
                    var5.field1095 = var7;
                    this.method923(var5.field1865, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("al.a([III)V")
    public void method938(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field983.method2315(); var4 != null; var4 = (class69) this.field983.method2332()) {
            var4.method1317(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("al.v(I)V")
    public final synchronized void method950(int arg0) {
        do {
            if (this.field984 < 0) {
                this.method931(arg0);
                return;
            }
            if (this.field981 + arg0 < this.field984) {
                this.field981 += arg0;
                this.method931(arg0);
                return;
            }
            int var2 = this.field984 - this.field981;
            this.method931(var2);
            arg0 -= var2;
            this.field981 += var2;
            this.method922();
            class62 var3 = (class62) this.field982.method2315();
            synchronized (var3) {
                int var5 = var3.method1141(this);
                if (var5 < 0) {
                    var3.field1095 = 0;
                    this.method924(var3);
                } else {
                    var3.field1095 = var5;
                    this.method923(var3.field1865, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("al.d(I)V")
    public void method931(int arg0) {
        for (class69 var2 = (class69) this.field983.method2315(); var2 != null; var2 = (class69) this.field983.method2332()) {
            var2.method950(arg0);
        }
    }
}
