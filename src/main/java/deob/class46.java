package deob;

@ObfuscatedName("av")
public class class46 extends class57 {

    @ObfuscatedName("av.z")
    public class171 field1040 = new class171();

    @ObfuscatedName("av.n")
    public class171 field1041 = new class171();

    @ObfuscatedName("av.u")
    public int field1042 = 0;

    @ObfuscatedName("av.t")
    public int field1039 = -1;

    @ObfuscatedName("av.z(Lbt;)V")
    public final synchronized void method967(class57 arg0) {
        this.field1040.method3237(arg0);
    }

    @ObfuscatedName("av.n(Lbt;)V")
    public final synchronized void method951(class57 arg0) {
        arg0.method3288();
    }

    @ObfuscatedName("av.u()V")
    public void method953() {
        if (this.field1042 <= 0) {
            return;
        }
        for (class52 var1 = (class52) this.field1041.method3236(); var1 != null; var1 = (class52) this.field1041.method3228()) {
            var1.field1100 -= this.field1042;
        }
        this.field1039 -= this.field1042;
        this.field1042 = 0;
    }

    @ObfuscatedName("av.t(Lfs;Laf;)V")
    public void method954(class176 arg0, class52 arg1) {
        while (this.field1041.field2809 != arg0 && ((class52) arg0).field1100 <= arg1.field1100) {
            arg0 = arg0.field2818;
        }
        class171.method3223(arg1, arg0);
        this.field1039 = ((class52) this.field1041.field2809.field2818).field1100;
    }

    @ObfuscatedName("av.e(Laf;)V")
    public void method950(class52 arg0) {
        arg0.method3288();
        arg0.method1069();
        class176 var2 = this.field1041.field2809.field2818;
        if (this.field1041.field2809 == var2) {
            this.field1039 = -1;
        } else {
            this.field1039 = ((class52) var2).field1100;
        }
    }

    @ObfuscatedName("av.a()Lbt;")
    public class57 method956() {
        return (class57) this.field1040.method3236();
    }

    @ObfuscatedName("av.l()Lbt;")
    public class57 method957() {
        return (class57) this.field1040.method3228();
    }

    @ObfuscatedName("av.v()I")
    public int method958() {
        return 0;
    }

    @ObfuscatedName("av.j([III)V")
    public final synchronized void method973(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1039 < 0) {
                this.method960(arg0, arg1, arg2);
                return;
            }
            if (this.field1042 + arg2 < this.field1039) {
                this.field1042 += arg2;
                this.method960(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1039 - this.field1042;
            this.method960(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1042 += var4;
            this.method953();
            class52 var5 = (class52) this.field1041.method3236();
            synchronized (var5) {
                int var7 = var5.method1072(this);
                if (var7 < 0) {
                    var5.field1100 = 0;
                    this.method950(var5);
                } else {
                    var5.field1100 = var7;
                    this.method954(var5.field2818, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("av.k([III)V")
    public void method960(int[] arg0, int arg1, int arg2) {
        for (class57 var4 = (class57) this.field1040.method3236(); var4 != null; var4 = (class57) this.field1040.method3228()) {
            var4.method1233(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("av.g(I)V")
    public final synchronized void method961(int arg0) {
        do {
            if (this.field1039 < 0) {
                this.method962(arg0);
                return;
            }
            if (this.field1042 + arg0 < this.field1039) {
                this.field1042 += arg0;
                this.method962(arg0);
                return;
            }
            int var2 = this.field1039 - this.field1042;
            this.method962(var2);
            arg0 -= var2;
            this.field1042 += var2;
            this.method953();
            class52 var3 = (class52) this.field1041.method3236();
            synchronized (var3) {
                int var5 = var3.method1072(this);
                if (var5 < 0) {
                    var3.field1100 = 0;
                    this.method950(var3);
                } else {
                    var3.field1100 = var5;
                    this.method954(var3.field2818, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("av.d(I)V")
    public void method962(int arg0) {
        for (class57 var2 = (class57) this.field1040.method3236(); var2 != null; var2 = (class57) this.field1040.method3228()) {
            var2.method961(arg0);
        }
    }
}
