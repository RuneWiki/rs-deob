package deob;

@ObfuscatedName("bj")
public class class75 implements class94 {

    @ObfuscatedName("bj.o")
    public class80[] field1205;

    @ObfuscatedName("bj.m")
    public class129 field1208 = new class129();

    @ObfuscatedName("bj.b")
    public int field1203;

    @ObfuscatedName("bj.g")
    public int field1204 = 0;

    @ObfuscatedName("bj.h")
    public double field1209 = 1.0D;

    @ObfuscatedName("bj.v")
    public int field1202 = 128;

    @ObfuscatedName("bj.l")
    public class183 field1207;

    public class75(class183 arg0, class183 arg1, int arg2, double arg3, int arg4) {
        this.field1207 = arg1;
        this.field1203 = arg2;
        this.field1204 = this.field1203;
        this.field1209 = arg3;
        this.field1202 = arg4;
        int[] var7 = arg0.method3021(0);
        int var8 = var7.length;
        this.field1205 = new class80[arg0.method3054(0)];
        for (int var9 = 0; var9 < var8; var9++) {
            class154 var10 = new class154(arg0.method3012(0, var7[var9]));
            this.field1205[var7[var9]] = new class80(var10);
        }
    }

    @ObfuscatedName("bj.o(D)V")
    public void method1330(double arg0) {
        this.field1209 = arg0;
        this.method1335();
    }

    @ObfuscatedName("bj.m(II)[I")
    public int[] method1331(int arg0) {
        class80 var2 = this.field1205[arg0];
        if (var2 != null) {
            if (var2.field1310 != null) {
                this.field1208.method2197(var2);
                var2.field1305 = true;
                return var2.field1310;
            }
            boolean var3 = var2.method1433(this.field1209, this.field1202, this.field1207);
            if (var3) {
                if (this.field1204 == 0) {
                    class80 var4 = (class80) this.field1208.method2225();
                    var4.method1440();
                } else {
                    this.field1204--;
                }
                this.field1208.method2197(var2);
                var2.field1305 = true;
                return var2.field1310;
            }
        }
        return null;
    }

    @ObfuscatedName("bj.b(IB)I")
    public int method1332(int arg0) {
        return this.field1205[arg0] == null ? 0 : this.field1205[arg0].field1302;
    }

    @ObfuscatedName("bj.g(IB)Z")
    public boolean method1333(int arg0) {
        return this.field1205[arg0].field1303;
    }

    @ObfuscatedName("bj.l(II)Z")
    public boolean method1336(int arg0) {
        return this.field1202 == 64;
    }

    @ObfuscatedName("bj.c(I)V")
    public void method1335() {
        for (int var1 = 0; var1 < this.field1205.length; var1++) {
            if (this.field1205[var1] != null) {
                this.field1205[var1].method1440();
            }
        }
        this.field1208 = new class129();
        this.field1204 = this.field1203;
    }

    @ObfuscatedName("bj.u(IB)V")
    public void method1334(int arg0) {
        for (int var2 = 0; var2 < this.field1205.length; var2++) {
            class80 var3 = this.field1205[var2];
            if (var3 != null && var3.field1308 != 0 && var3.field1305) {
                var3.method1435(arg0);
                var3.field1305 = false;
            }
        }
    }
}
