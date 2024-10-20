package deob;

@ObfuscatedName("be")
public class class56 extends class67 {

    @ObfuscatedName("be.b")
    public class200 field1142 = new class200();

    @ObfuscatedName("be.g")
    public class200 field1143 = new class200();

    @ObfuscatedName("be.j")
    public int field1144 = 0;

    @ObfuscatedName("be.d")
    public int field1145 = -1;

    @ObfuscatedName("be.b(Lbn;)V")
    public final synchronized void method1148(class67 arg0) {
        this.field1142.method3551(arg0);
    }

    @ObfuscatedName("be.g(Lbn;)V")
    public final synchronized void method1113(class67 arg0) {
        arg0.method3647();
    }

    @ObfuscatedName("be.j()V")
    public void method1127() {
        if (this.field1144 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1143.method3575(); var1 != null; var1 = (class62) this.field1143.method3565()) {
            var1.field1198 -= this.field1144;
        }
        this.field1145 -= this.field1144;
        this.field1144 = 0;
    }

    @ObfuscatedName("be.d(Lhk;Lbl;)V")
    public void method1143(class209 arg0, class62 arg1) {
        while (this.field1143.field3099 != arg0 && ((class62) arg0).field1198 <= arg1.field1198) {
            arg0 = arg0.field3115;
        }
        class200.method3552(arg1, arg0);
        this.field1145 = ((class62) this.field1143.field3099.field3115).field1198;
    }

    @ObfuscatedName("be.x(Lbl;)V")
    public void method1128(class62 arg0) {
        arg0.method3647();
        arg0.method1234();
        class209 var2 = this.field1143.field3099.field3115;
        if (this.field1143.field3099 == var2) {
            this.field1145 = -1;
        } else {
            this.field1145 = ((class62) var2).field1198;
        }
    }

    @ObfuscatedName("be.y()Lbn;")
    public class67 method1117() {
        return (class67) this.field1142.method3575();
    }

    @ObfuscatedName("be.r()Lbn;")
    public class67 method1118() {
        return (class67) this.field1142.method3565();
    }

    @ObfuscatedName("be.c()I")
    public int method1115() {
        return 0;
    }

    @ObfuscatedName("be.l([III)V")
    public final synchronized void method1120(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1145 < 0) {
                this.method1121(arg0, arg1, arg2);
                return;
            }
            if (this.field1144 + arg2 < this.field1145) {
                this.field1144 += arg2;
                this.method1121(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1145 - this.field1144;
            this.method1121(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1144 += var4;
            this.method1127();
            class62 var5 = (class62) this.field1143.method3575();
            synchronized (var5) {
                int var7 = var5.method1235(this);
                if (var7 < 0) {
                    var5.field1198 = 0;
                    this.method1128(var5);
                } else {
                    var5.field1198 = var7;
                    this.method1143(var5.field3115, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("be.u([III)V")
    public void method1121(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1142.method3575(); var4 != null; var4 = (class67) this.field1142.method3565()) {
            var4.method1402(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("be.p(I)V")
    public final synchronized void method1122(int arg0) {
        do {
            if (this.field1145 < 0) {
                this.method1123(arg0);
                return;
            }
            if (this.field1144 + arg0 < this.field1145) {
                this.field1144 += arg0;
                this.method1123(arg0);
                return;
            }
            int var2 = this.field1145 - this.field1144;
            this.method1123(var2);
            arg0 -= var2;
            this.field1144 += var2;
            this.method1127();
            class62 var3 = (class62) this.field1143.method3575();
            synchronized (var3) {
                int var5 = var3.method1235(this);
                if (var5 < 0) {
                    var3.field1198 = 0;
                    this.method1128(var3);
                } else {
                    var3.field1198 = var5;
                    this.method1143(var3.field3115, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("be.n(I)V")
    public void method1123(int arg0) {
        for (class67 var2 = (class67) this.field1142.method3575(); var2 != null; var2 = (class67) this.field1142.method3565()) {
            var2.method1122(arg0);
        }
    }
}
