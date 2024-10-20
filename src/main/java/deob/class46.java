package deob;

@ObfuscatedName("an")
public class class46 extends class48 {

    @ObfuscatedName("an.g")
    public class177 field1065 = new class177();

    @ObfuscatedName("an.h")
    public class177 field1063 = new class177();

    @ObfuscatedName("an.s")
    public int field1064 = 0;

    @ObfuscatedName("an.o")
    public int field1062 = -1;

    @ObfuscatedName("an.g(Lao;)V")
    public final synchronized void method1137(class48 arg0) {
        this.field1065.method3369(arg0);
    }

    @ObfuscatedName("an.h(Lao;)V")
    public final synchronized void method1123(class48 arg0) {
        arg0.method3404();
    }

    @ObfuscatedName("an.o()V")
    public void method1124() {
        if (this.field1064 <= 0) {
            return;
        }
        for (class61 var1 = (class61) this.field1063.method3373(); var1 != null; var1 = (class61) this.field1063.method3375()) {
            var1.field1224 -= this.field1064;
        }
        this.field1062 -= this.field1064;
        this.field1064 = 0;
    }

    @ObfuscatedName("an.p(Lfz;Lbo;)V")
    public void method1125(class179 arg0, class61 arg1) {
        while (this.field1063.field2818 != arg0 && ((class61) arg0).field1224 <= arg1.field1224) {
            arg0 = arg0.field2822;
        }
        class177.method3370(arg1, arg0);
        this.field1062 = ((class61) this.field1063.field2818.field2822).field1224;
    }

    @ObfuscatedName("an.x(Lbo;)V")
    public void method1126(class61 arg0) {
        arg0.method3404();
        arg0.method1315();
        class179 var2 = this.field1063.field2818.field2822;
        if (this.field1063.field2818 == var2) {
            this.field1062 = -1;
        } else {
            this.field1062 = ((class61) var2).field1224;
        }
    }

    @ObfuscatedName("an.w()Lao;")
    public class48 method983() {
        return (class48) this.field1065.method3373();
    }

    @ObfuscatedName("an.d()Lao;")
    public class48 method982() {
        return (class48) this.field1065.method3375();
    }

    @ObfuscatedName("an.i()I")
    public int method985() {
        return 0;
    }

    @ObfuscatedName("an.c([III)V")
    public final synchronized void method986(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1062 < 0) {
                this.method1130(arg0, arg1, arg2);
                return;
            }
            if (this.field1064 + arg2 < this.field1062) {
                this.field1064 += arg2;
                this.method1130(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1062 - this.field1064;
            this.method1130(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1064 += var4;
            this.method1124();
            class61 var5 = (class61) this.field1063.method3373();
            synchronized (var5) {
                int var7 = var5.method1317(this);
                if (var7 < 0) {
                    var5.field1224 = 0;
                    this.method1126(var5);
                } else {
                    var5.field1224 = var7;
                    this.method1125(var5.field2822, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("an.k([III)V")
    public void method1130(int[] arg0, int arg1, int arg2) {
        for (class48 var4 = (class48) this.field1065.method3373(); var4 != null; var4 = (class48) this.field1065.method3375()) {
            var4.method1152(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("an.af(I)V")
    public final synchronized void method991(int arg0) {
        do {
            if (this.field1062 < 0) {
                this.method1127(arg0);
                return;
            }
            if (this.field1064 + arg0 < this.field1062) {
                this.field1064 += arg0;
                this.method1127(arg0);
                return;
            }
            int var2 = this.field1062 - this.field1064;
            this.method1127(var2);
            arg0 -= var2;
            this.field1064 += var2;
            this.method1124();
            class61 var3 = (class61) this.field1063.method3373();
            synchronized (var3) {
                int var5 = var3.method1317(this);
                if (var5 < 0) {
                    var3.field1224 = 0;
                    this.method1126(var3);
                } else {
                    var3.field1224 = var5;
                    this.method1125(var3.field2822, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("an.r(I)V")
    public void method1127(int arg0) {
        for (class48 var2 = (class48) this.field1065.method3373(); var2 != null; var2 = (class48) this.field1065.method3375()) {
            var2.method991(arg0);
        }
    }
}
