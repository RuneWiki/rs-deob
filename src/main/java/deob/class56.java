package deob;

@ObfuscatedName("bm")
public class class56 extends class67 {

    @ObfuscatedName("bm.a")
    public class200 field1183 = new class200();

    @ObfuscatedName("bm.d")
    public class200 field1181 = new class200();

    @ObfuscatedName("bm.c")
    public int field1182 = 0;

    @ObfuscatedName("bm.y")
    public int field1180 = -1;

    @ObfuscatedName("bm.a(Lbn;)V")
    public final synchronized void method1231(class67 arg0) {
        this.field1183.method3640(arg0);
    }

    @ObfuscatedName("bm.w(Lbn;)V")
    public final synchronized void method1213(class67 arg0) {
        arg0.method3737();
    }

    @ObfuscatedName("bm.d()V")
    public void method1214() {
        if (this.field1182 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1181.method3665(); var1 != null; var1 = (class62) this.field1181.method3641()) {
            var1.field1238 -= this.field1182;
        }
        this.field1180 -= this.field1182;
        this.field1182 = 0;
    }

    @ObfuscatedName("bm.c(Lha;Lbu;)V")
    public void method1222(class209 arg0, class62 arg1) {
        while (this.field1181.field3109 != arg0 && ((class62) arg0).field1238 <= arg1.field1238) {
            arg0 = arg0.field3125;
        }
        class200.method3672(arg1, arg0);
        this.field1180 = ((class62) this.field1181.field3109.field3125).field1238;
    }

    @ObfuscatedName("bm.y(Lbu;)V")
    public void method1215(class62 arg0) {
        arg0.method3737();
        arg0.method1325();
        class209 var2 = this.field1181.field3109.field3125;
        if (this.field1181.field3109 == var2) {
            this.field1180 = -1;
        } else {
            this.field1180 = ((class62) var2).field1238;
        }
    }

    @ObfuscatedName("bm.k()Lbn;")
    public class67 method1216() {
        return (class67) this.field1183.method3665();
    }

    @ObfuscatedName("bm.r()Lbn;")
    public class67 method1243() {
        return (class67) this.field1183.method3641();
    }

    @ObfuscatedName("bm.p()I")
    public int method1211() {
        return 0;
    }

    @ObfuscatedName("bm.q([III)V")
    public final synchronized void method1219(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1180 < 0) {
                this.method1248(arg0, arg1, arg2);
                return;
            }
            if (this.field1182 + arg2 < this.field1180) {
                this.field1182 += arg2;
                this.method1248(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1180 - this.field1182;
            this.method1248(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1182 += var4;
            this.method1214();
            class62 var5 = (class62) this.field1181.method3665();
            synchronized (var5) {
                int var7 = var5.method1326(this);
                if (var7 < 0) {
                    var5.field1238 = 0;
                    this.method1215(var5);
                } else {
                    var5.field1238 = var7;
                    this.method1222(var5.field3125, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bm.m([III)V")
    public void method1248(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1183.method3665(); var4 != null; var4 = (class67) this.field1183.method3641()) {
            var4.method1504(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bm.e(I)V")
    public final synchronized void method1221(int arg0) {
        do {
            if (this.field1180 < 0) {
                this.method1218(arg0);
                return;
            }
            if (this.field1182 + arg0 < this.field1180) {
                this.field1182 += arg0;
                this.method1218(arg0);
                return;
            }
            int var2 = this.field1180 - this.field1182;
            this.method1218(var2);
            arg0 -= var2;
            this.field1182 += var2;
            this.method1214();
            class62 var3 = (class62) this.field1181.method3665();
            synchronized (var3) {
                int var5 = var3.method1326(this);
                if (var5 < 0) {
                    var3.field1238 = 0;
                    this.method1215(var3);
                } else {
                    var3.field1238 = var5;
                    this.method1222(var3.field3125, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bm.x(I)V")
    public void method1218(int arg0) {
        for (class67 var2 = (class67) this.field1183.method3665(); var2 != null; var2 = (class67) this.field1183.method3641()) {
            var2.method1221(arg0);
        }
    }
}
