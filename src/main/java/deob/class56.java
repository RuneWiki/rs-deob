package deob;

@ObfuscatedName("bd")
public class class56 extends class67 {

    @ObfuscatedName("bd.t")
    public class200 field1181 = new class200();

    @ObfuscatedName("bd.i")
    public class200 field1180 = new class200();

    @ObfuscatedName("bd.g")
    public int field1182 = 0;

    @ObfuscatedName("bd.h")
    public int field1183 = -1;

    @ObfuscatedName("bd.t(Lby;)V")
    public final synchronized void method1062(class67 arg0) {
        this.field1181.method3525(arg0);
    }

    @ObfuscatedName("bd.i(Lby;)V")
    public final synchronized void method1060(class67 arg0) {
        arg0.method3607();
    }

    @ObfuscatedName("bd.g()V")
    public void method1061() {
        if (this.field1182 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1180.method3534(); var1 != null; var1 = (class62) this.field1180.method3516()) {
            var1.field1234 -= this.field1182;
        }
        this.field1183 -= this.field1182;
        this.field1182 = 0;
    }

    @ObfuscatedName("bd.h(Lhe;Lbw;)V")
    public void method1095(class209 arg0, class62 arg1) {
        while (this.field1180.field3109 != arg0 && ((class62) arg0).field1234 <= arg1.field1234) {
            arg0 = arg0.field3127;
        }
        class200.method3522(arg1, arg0);
        this.field1183 = ((class62) this.field1180.field3109.field3127).field1234;
    }

    @ObfuscatedName("bd.z(Lbw;)V")
    public void method1063(class62 arg0) {
        arg0.method3607();
        arg0.method1181();
        class209 var2 = this.field1180.field3109.field3127;
        if (this.field1180.field3109 == var2) {
            this.field1183 = -1;
        } else {
            this.field1183 = ((class62) var2).field1234;
        }
    }

    @ObfuscatedName("bd.r()Lby;")
    public class67 method1059() {
        return (class67) this.field1181.method3534();
    }

    @ObfuscatedName("bd.f()Lby;")
    public class67 method1065() {
        return (class67) this.field1181.method3516();
    }

    @ObfuscatedName("bd.s()I")
    public int method1066() {
        return 0;
    }

    @ObfuscatedName("bd.d([III)V")
    public final synchronized void method1067(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1183 < 0) {
                this.method1064(arg0, arg1, arg2);
                return;
            }
            if (this.field1182 + arg2 < this.field1183) {
                this.field1182 += arg2;
                this.method1064(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1183 - this.field1182;
            this.method1064(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1182 += var4;
            this.method1061();
            class62 var5 = (class62) this.field1180.method3534();
            synchronized (var5) {
                int var7 = var5.method1182(this);
                if (var7 < 0) {
                    var5.field1234 = 0;
                    this.method1063(var5);
                } else {
                    var5.field1234 = var7;
                    this.method1095(var5.field3127, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bd.l([III)V")
    public void method1064(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1181.method3534(); var4 != null; var4 = (class67) this.field1181.method3516()) {
            var4.method1352(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bd.y(I)V")
    public final synchronized void method1069(int arg0) {
        do {
            if (this.field1183 < 0) {
                this.method1070(arg0);
                return;
            }
            if (this.field1182 + arg0 < this.field1183) {
                this.field1182 += arg0;
                this.method1070(arg0);
                return;
            }
            int var2 = this.field1183 - this.field1182;
            this.method1070(var2);
            arg0 -= var2;
            this.field1182 += var2;
            this.method1061();
            class62 var3 = (class62) this.field1180.method3534();
            synchronized (var3) {
                int var5 = var3.method1182(this);
                if (var5 < 0) {
                    var3.field1234 = 0;
                    this.method1063(var3);
                } else {
                    var3.field1234 = var5;
                    this.method1095(var3.field3127, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bd.p(I)V")
    public void method1070(int arg0) {
        for (class67 var2 = (class67) this.field1181.method3534(); var2 != null; var2 = (class67) this.field1181.method3516()) {
            var2.method1069(arg0);
        }
    }
}
