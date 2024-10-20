package deob;

@ObfuscatedName("ac")
public class class46 extends class48 {

    @ObfuscatedName("ac.p")
    public class177 field1061 = new class177();

    @ObfuscatedName("ac.l")
    public class177 field1063 = new class177();

    @ObfuscatedName("ac.d")
    public int field1062 = 0;

    @ObfuscatedName("ac.x")
    public int field1064 = -1;

    @ObfuscatedName("ac.p(Lax;)V")
    public final synchronized void method1143(class48 arg0) {
        this.field1061.method3433(arg0);
    }

    @ObfuscatedName("ac.l(Lax;)V")
    public final synchronized void method1158(class48 arg0) {
        arg0.method3455();
    }

    @ObfuscatedName("ac.x()V")
    public void method1145() {
        if (this.field1062 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1063.method3446(); var1 != null; var1 = (class61) this.field1063.method3428()) {
            var1.field1222 -= this.field1062;
        }
        this.field1064 -= this.field1062;
        this.field1062 = 0;
    }

    @ObfuscatedName("ac.o(Lfn;Lbl;)V")
    public void method1146(class179 arg0, class61 arg1) {
        while (this.field1063.field2816 != arg0 && ((class61) arg0).field1222 <= arg1.field1222) {
            arg0 = arg0.field2820;
        }
        class177.method3436(arg1, arg0);
        this.field1064 = ((class61) this.field1063.field2816.field2820).field1222;
    }

    @ObfuscatedName("ac.a(Lbl;)V")
    public void method1144(class61 arg0) {
        arg0.method3455();
        arg0.method1351();
        class179 var2 = this.field1063.field2816.field2820;
        if (this.field1063.field2816 == var2) {
            this.field1064 = -1;
        } else {
            this.field1064 = ((class61) var2).field1222;
        }
    }

    @ObfuscatedName("ac.h()Lax;")
    public class48 method1009() {
        return (class48) this.field1061.method3446();
    }

    @ObfuscatedName("ac.j()Lax;")
    public class48 method987() {
        return (class48) this.field1061.method3428();
    }

    @ObfuscatedName("ac.q()I")
    public int method1123() {
        return 0;
    }

    @ObfuscatedName("ac.z([III)V")
    public final synchronized void method978(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1064 < 0) {
                this.method1147(arg0, arg1, arg2);
                return;
            }
            if (this.field1062 + arg2 < this.field1064) {
                this.field1062 += arg2;
                this.method1147(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1064 - this.field1062;
            this.method1147(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1062 += var4;
            this.method1145();
            class61 var5 = (class61) this.field1063.method3446();
            synchronized (var5) {
                int var7 = var5.method1350(this);
                if (var7 < 0) {
                    var5.field1222 = 0;
                    this.method1144(var5);
                } else {
                    var5.field1222 = var7;
                    this.method1146(var5.field2820, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("ac.w([III)V")
    public void method1147(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1061.method3446(); var4 != null; var4 = (class48) this.field1061.method3428()) {
            var4.method1167(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ac.af(I)V")
    public final synchronized void method990(int arg0) {
        do {
            if (this.field1064 < 0) {
                this.method1148(arg0);
                return;
            }
            if (this.field1062 + arg0 < this.field1064) {
                this.field1062 += arg0;
                this.method1148(arg0);
                return;
            }
            int var2 = this.field1064 - this.field1062;
            this.method1148(var2);
            arg0 -= var2;
            this.field1062 += var2;
            this.method1145();
            class61 var3 = (class61) this.field1063.method3446();
            synchronized (var3) {
                int var5 = var3.method1350(this);
                if (var5 < 0) {
                    var3.field1222 = 0;
                    this.method1144(var3);
                } else {
                    var3.field1222 = var5;
                    this.method1146(var3.field2820, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("ac.i(I)V")
    public void method1148(int arg0) {
        for (class48 var2 = (class48) this.field1061.method3446(); var2 != null; var2 = (class48) this.field1061.method3428()) {
            var2.method990(arg0);
        }
    }
}
