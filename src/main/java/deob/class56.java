package deob;

@ObfuscatedName("bf")
public class class56 extends class67 {

    @ObfuscatedName("bf.x")
    public class200 field1181 = new class200();

    @ObfuscatedName("bf.t")
    public class200 field1179 = new class200();

    @ObfuscatedName("bf.p")
    public int field1180 = 0;

    @ObfuscatedName("bf.e")
    public int field1178 = -1;

    @ObfuscatedName("bf.w(Lbj;)V")
    public final synchronized void method1169(class67 arg0) {
        this.field1181.method3584(arg0);
    }

    @ObfuscatedName("bf.x(Lbj;)V")
    public final synchronized void method1134(class67 arg0) {
        arg0.method3684();
    }

    @ObfuscatedName("bf.t()V")
    public void method1135() {
        if (this.field1180 <= 0) {
            return;
        }
        for (class62 var1 = (class62) this.field1179.method3585(); var1 != null; var1 = (class62) this.field1179.method3590()) {
            var1.field1236 -= this.field1180;
        }
        this.field1178 -= this.field1180;
        this.field1180 = 0;
    }

    @ObfuscatedName("bf.p(Lhl;Lbw;)V")
    public void method1136(class209 arg0, class62 arg1) {
        while (this.field1179.field3109 != arg0 && ((class62) arg0).field1236 <= arg1.field1236) {
            arg0 = arg0.field3125;
        }
        class200.method3608(arg1, arg0);
        this.field1178 = ((class62) this.field1179.field3109.field3125).field1236;
    }

    @ObfuscatedName("bf.e(Lbw;)V")
    public void method1158(class62 arg0) {
        arg0.method3684();
        arg0.method1255();
        class209 var2 = this.field1179.field3109.field3125;
        if (this.field1179.field3109 == var2) {
            this.field1178 = -1;
        } else {
            this.field1178 = ((class62) var2).field1236;
        }
    }

    @ObfuscatedName("bf.y()Lbj;")
    public class67 method1147() {
        return (class67) this.field1181.method3585();
    }

    @ObfuscatedName("bf.m()Lbj;")
    public class67 method1138() {
        return (class67) this.field1181.method3590();
    }

    @ObfuscatedName("bf.c()I")
    public int method1148() {
        return 0;
    }

    @ObfuscatedName("bf.v([III)V")
    public final synchronized void method1140(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1178 < 0) {
                this.method1141(arg0, arg1, arg2);
                return;
            }
            if (this.field1180 + arg2 < this.field1178) {
                this.field1180 += arg2;
                this.method1141(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1178 - this.field1180;
            this.method1141(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1180 += var4;
            this.method1135();
            class62 var5 = (class62) this.field1179.method3585();
            synchronized (var5) {
                int var7 = var5.method1249(this);
                if (var7 < 0) {
                    var5.field1236 = 0;
                    this.method1158(var5);
                } else {
                    var5.field1236 = var7;
                    this.method1136(var5.field3125, var5);
                }
            }
        } while (arg2 != 0);
    }

    @ObfuscatedName("bf.l([III)V")
    public void method1141(int[] arg0, int arg1, int arg2) {
        for (class67 var4 = (class67) this.field1181.method3585(); var4 != null; var4 = (class67) this.field1181.method3590()) {
            var4.method1406(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("bf.z(I)V")
    public final synchronized void method1139(int arg0) {
        do {
            if (this.field1178 < 0) {
                this.method1162(arg0);
                return;
            }
            if (this.field1180 + arg0 < this.field1178) {
                this.field1180 += arg0;
                this.method1162(arg0);
                return;
            }
            int var2 = this.field1178 - this.field1180;
            this.method1162(var2);
            arg0 -= var2;
            this.field1180 += var2;
            this.method1135();
            class62 var3 = (class62) this.field1179.method3585();
            synchronized (var3) {
                int var5 = var3.method1249(this);
                if (var5 < 0) {
                    var3.field1236 = 0;
                    this.method1158(var3);
                } else {
                    var3.field1236 = var5;
                    this.method1136(var3.field3125, var3);
                }
            }
        } while (arg0 != 0);
    }

    @ObfuscatedName("bf.s(I)V")
    public void method1162(int arg0) {
        for (class67 var2 = (class67) this.field1181.method3585(); var2 != null; var2 = (class67) this.field1181.method3590()) {
            var2.method1139(arg0);
        }
    }
}
