package deob;

@ObfuscatedName("el")
public class class141 extends class347 {

    @ObfuscatedName("el.y")
    public static class221 field1580 = new class221(64);

    @ObfuscatedName("el.p")
    public int field1582 = -1;

    @ObfuscatedName("el.j")
    public int[] field1589;

    @ObfuscatedName("el.r")
    public short[] field1584;

    @ObfuscatedName("el.b")
    public short[] field1585;

    @ObfuscatedName("el.d")
    public short[] field1591;

    @ObfuscatedName("el.s")
    public short[] field1587;

    @ObfuscatedName("el.u")
    public int[] field1588 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("el.l")
    public boolean field1581 = false;

    @ObfuscatedName("cs.v(Ljv;Ljv;I)V")
    public static void method1821(class275 arg0, class275 arg1) {
        Statics.field4289 = arg0;
        Statics.field1592 = arg1;
        Statics.field2521 = Statics.field4289.method4478(3);
    }

    @ObfuscatedName("fe.n(IB)Lel;")
    public static class141 method2994(int arg0) {
        class141 var1 = (class141) field1580.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4289.method4468(3, arg0);
        class141 var3 = new class141();
        if (var2 != null) {
            var3.method2440(new class383(var2));
        }
        field1580.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("el.f(Lnd;I)V")
    public void method2440(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2453(arg0, var2);
        }
    }

    @ObfuscatedName("el.y(Lnd;II)V")
    public void method2453(class383 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1582 = arg0.method5965();
        } else if (arg1 == 2) {
            int var3 = arg0.method5965();
            this.field1589 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1589[var4] = arg0.method5967();
            }
        } else if (arg1 == 3) {
            this.field1581 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5965();
            this.field1584 = new short[var5];
            this.field1585 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1584[var6] = (short) arg0.method5967();
                this.field1585[var6] = (short) arg0.method5967();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5965();
            this.field1591 = new short[var7];
            this.field1587 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1591[var8] = (short) arg0.method5967();
                this.field1587[var8] = (short) arg0.method5967();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1588[arg1 - 60] = arg0.method5967();
        }
    }

    @ObfuscatedName("el.p(I)Z")
    public boolean method2441() {
        if (this.field1589 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1589.length; var2++) {
            if (!Statics.field1592.method4470(this.field1589[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("el.j(I)Lgm;")
    public class191 method2443() {
        if (this.field1589 == null) {
            return null;
        }
        class191[] var1 = new class191[this.field1589.length];
        for (int var2 = 0; var2 < this.field1589.length; var2++) {
            var1[var2] = class191.method3418(Statics.field1592, this.field1589[var2], 0);
        }
        class191 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class191(var1, var1.length);
        }
        if (this.field1584 != null) {
            for (int var4 = 0; var4 < this.field1584.length; var4++) {
                var3.method3414(this.field1584[var4], this.field1585[var4]);
            }
        }
        if (this.field1591 != null) {
            for (int var5 = 0; var5 < this.field1591.length; var5++) {
                var3.method3412(this.field1591[var5], this.field1587[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("el.r(I)Z")
    public boolean method2449() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1588[var2] != -1 && !Statics.field1592.method4470(this.field1588[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("el.b(I)Lgm;")
    public class191 method2445() {
        class191[] var1 = new class191[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1588[var3] != -1) {
                var1[var2++] = class191.method3418(Statics.field1592, this.field1588[var3], 0);
            }
        }
        class191 var4 = new class191(var1, var2);
        if (this.field1584 != null) {
            for (int var5 = 0; var5 < this.field1584.length; var5++) {
                var4.method3414(this.field1584[var5], this.field1585[var5]);
            }
        }
        if (this.field1591 != null) {
            for (int var6 = 0; var6 < this.field1591.length; var6++) {
                var4.method3412(this.field1591[var6], this.field1587[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ed.d(I)V")
    public static void method2366() {
        field1580.method3957();
    }
}
