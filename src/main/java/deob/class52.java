package deob;

@ObfuscatedName("au")
public class class52 extends class69 {

    @ObfuscatedName("au.u")
    public class129 field970 = new class129();

    @ObfuscatedName("au.x")
    public class129 field968 = new class129();

    @ObfuscatedName("au.i")
    public int field969 = 0;

    @ObfuscatedName("au.a")
    public int field967 = -1;

    @ObfuscatedName("au.u(Lbx;)V")
    public final synchronized void method874(class69 arg0) {
        this.field970.method2238(arg0);
    }

    @ObfuscatedName("au.x(Lbx;)V")
    public final synchronized void method888(class69 arg0) {
        arg0.method2228();
    }

    @ObfuscatedName("au.i()V")
    public void method876() {
        if (this.field969 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field968.method2242(); var1 != null; var1 = (class62) this.field968.method2244()) {
            var1.field1085 -= this.field969;
        }
        this.field967 -= this.field969;
        this.field969 = 0;
    }

    @ObfuscatedName("au.a(Ldv;Lby;)V")
    public void method877(class128 arg0, class62 arg1) {
        while (this.field968.field1870 != arg0 && ((class62) arg0).field1085 <= arg1.field1085) {
            arg0 = arg0.field1868;
        }
        class129.method2258(arg1, arg0);
        this.field967 = ((class62) this.field968.field1870.field1868).field1085;
    }

    @ObfuscatedName("au.c(Lby;)V")
    public void method878(class62 arg0) {
        arg0.method2228();
        arg0.method1076();
        class128 var2 = this.field968.field1870.field1868;
        if (this.field968.field1870 == var2) {
            this.field967 = -1;
        } else {
            this.field967 = ((class62) var2).field1085;
        }
    }

    @ObfuscatedName("au.g()Lbx;")
    public class69 method879() {
        return (class69) this.field970.method2242();
    }

    @ObfuscatedName("au.z()Lbx;")
    public class69 method896() {
        return (class69) this.field970.method2244();
    }

    @ObfuscatedName("au.t()I")
    public int method889() {
        return 0;
    }

    @ObfuscatedName("au.m([III)V")
    public final synchronized void method912(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field967 < 0) {
                this.method883(arg0, arg1, arg2);
                return;
            }
            if (this.field969 + arg2 < this.field967) {
                this.field969 += arg2;
                this.method883(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field967 - this.field969;
            this.method883(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field969 += var4;
            this.method876();
            class62 var5 = (class62) this.field968.method2242();
            synchronized (var5) {
                int var7 = var5.method1071(this);
                if (var7 < 0) {
                    var5.field1085 = 0;
                    this.method878(var5);
                } else {
                    var5.field1085 = var7;
                    this.method877(var5.field1868, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("au.q([III)V")
    public void method883(int[] arg0, int arg1, int arg2) {
        for (class69 var4 = (class69) this.field970.method2242(); var4 != null; var4 = (class69) this.field970.method2244()) {
            var4.method1251(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("au.e(I)V")
    public final synchronized void method887(int arg0) {
        do {
            if (this.field967 < 0) {
                this.method885(arg0);
                return;
            }
            if (this.field969 + arg0 < this.field967) {
                this.field969 += arg0;
                this.method885(arg0);
                return;
            }
            int var2 = this.field967 - this.field969;
            this.method885(var2);
            arg0 -= var2;
            this.field969 += var2;
            this.method876();
            class62 var3 = (class62) this.field968.method2242();
            synchronized (var3) {
                int var5 = var3.method1071(this);
                if (var5 < 0) {
                    var3.field1085 = 0;
                    this.method878(var3);
                } else {
                    var3.field1085 = var5;
                    this.method877(var3.field1868, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("au.v(I)V")
    public void method885(int arg0) {
        for (class69 var2 = (class69) this.field970.method2242(); var2 != null; var2 = (class69) this.field970.method2244()) {
            var2.method887(arg0);
        }
    }
}
